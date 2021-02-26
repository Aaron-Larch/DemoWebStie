package com.pdf.demo.util;

import java.io.UnsupportedEncodingException;
import java.util.*;

import javax.activation.*;
import javax.mail.*;
import javax.mail.internet.*;
import com.sun.mail.smtp.*;

public class improvedMailgunDemo {
	
	protected Session session; //The javamail session object.
	protected String from; //The sender's email address
	protected String subject; //The subject of the message.
	protected List<String>  toList =  new ArrayList<String>(); //The recipient ("To:"), as Strings.
	protected List<String>  ccList =  new ArrayList<String>(); //The CC list, as Strings.
	protected List<String> bccList = new ArrayList<String>(); //The BCC list, as Strings.
	protected String body; //The text of the message.
	protected String mailHost; //The SMTP relay host
	protected boolean verbose; //The verbosity setting
	protected boolean useAlias; //Set up alias
	protected boolean newsletter;
	
	// SETTER/GETTER FOR General Variables 
	public void setServer(String s) {mailHost = s;}
	
	public String getFrom() {return from;} //Get from
	public void setFrom(String fm) {from = fm;} //Set from
	
	public String getSubject() {return subject;} //Get subject
	public void setSubject(String subj) {subject = subj;} //Set subject
	
	// SETTERS/GETTERS FOR TO: LIST
	public List<String> getToList() {return toList;} //Get tolist, as an array of Strings
	public void setToList(ArrayList<String> to) {toList = to;} //Set to list to an ArrayList of Strings
	public void setToList(String s) {toList = Arrays.asList(s.split(",\\s+"));} //Set to as a string like "tom, mary, robin@host". Loses any previously set values.
	public void addTo(String to) {toList.add(to);} //Add one "to" recipient
	
	// SETTERS/GETTERS FOR CC: LIST
	public List<String> getCcList() {return ccList;} //Get cclist, as an array of Strings
	public void setCcList(ArrayList<String> cc) {ccList = cc;} //Set cc list to an ArrayList of Strings
	
	//Set cc as a string like "tom, mary, robin@host". Loses any previously set values.
	public void setCcList(String s) {ccList = Arrays.asList(s.split(",\\s+"));}
	public void addCc(String cc) {ccList.add(cc);} //Add one "cc" recipient
	
	// SETTERS/GETTERS FOR BCC: LIST
	public List<String> getBccList() {return bccList;} //Get bcclist, as an array of Strings
	public void setBccList(List<String> bcc) {bccList = bcc;} //Set bcc list to an ArrayList of Strings
	
	//Set bcc as a string like "tom, mary, robin@host". Loses any previously set values.
	public void setBccList(String s) {bccList = Arrays.asList(s.split(",\\s+"));}
	public void addBcc(String bcc) {bccList.add(bcc);} //Add one "bcc" recipient
	
	// SETTER/GETTER FOR MESSAGE BODY
	public String getBody() {return body;} //Get message
	public void setBody(String text) {body = text;} //Set message
	
	// SETTER/GETTER FOR FLAG VALUES
	public boolean isVerbose() {return verbose;} //Get verbose Flag
	public void setVerbose(boolean v) {verbose = v;} //Set verbose
	
	public boolean isUseAlias() {return useAlias;} // Get alias Flag
	public void setUseAlias(boolean a) {useAlias = a;} // Set alias Flag
	
	public boolean isUseFont() {return newsletter;} // Get alias Flag
	public void setUseFont(boolean a) {newsletter = a;} // Set alias Flag

	/** Check if all required fields have been set before sending.
	 * Normally called e.g., by a JSP before calling doSend.
	 * Is also called by doSend for verification.     */
	public boolean isComplete( ) {
		if (from == null    || from.length( )==0) {
			System.err.println("doSend: no FROM");
			return false;
			}
		if (subject == null || subject.length( )==0) {
			System.err.println("doSend: no SUBJECT");
			return false;
			}
		if (toList.size( )==0) {
			System.err.println("doSend: no recipients");
			return false;
		}
		if (body == null || body.length( )==0) {
			System.err.println("doSend: no body");
			return false;
			}
		if (mailHost == null || mailHost.length( )==0) {
			System.err.println("doSend: no server host");
			return false;
			}
		return true;
		}
	
	//Send the message.
	@SuppressWarnings("restriction")
	public synchronized void doSend(List<String> Attachment) throws MessagingException {
		if (!isComplete( ))throw new IllegalArgumentException("doSend called before message was complete");
		
		/** Properties object used to pass props into the MAIL API */
		Properties props = new Properties( );
		props.put("mail.smtp.host", mailHost);// Create the Session object
		props.put("mail.smtp.port", "587"); //TLS Port
		props.put("mail.smtp.auth", "true"); //enable authentication
		props.put("mail.smtp.starttls.enable", "true"); //enable STARTTLS
        props.put("mail.smtp.starttls.required", "true");
        props.put("mail.smtp.ssl.enable", "false");
        props.put("mail.transport.protocol", "smtp");//Declare Mail Protocol
        
        //Create the Session object
        if (session == null) {
        	System.out.println("TLSEmail Start");
        	session = Session.getDefaultInstance(props, null);
        	System.out.println("Session created");
        	if (isVerbose()) {
        		System.out.println("Debug mode Activated");
        		session.setDebug(true);// Set Debug log
        	}else {System.out.println("Running in Normal mode");}
        }
        
		//create a message
		final Message mesg = new MimeMessage(session);
		
		 //TO Address list
		InternetAddress[] addresses;
		addresses = new InternetAddress[toList.size( )];
		for (int i=0; i<addresses.length; i++) {addresses[i] = new InternetAddress((String)toList.get(i));}
		mesg.setRecipients(Message.RecipientType.TO, addresses);
		
		//From Address
		if(isUseAlias()) {
			try {
				//Enable aliasing to hide email address.
				mesg.setFrom(new InternetAddress(from, "no_reply@mailgun.org"));
				mesg.setReplyTo(InternetAddress.parse("no_reply@mailgun.org", false)); //set false to hide real name
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			//set a true/false state to alternate between alias and real sender.
			mesg.setFrom(new InternetAddress(from));
		}
		
		// CC Address list
		addresses = new InternetAddress[ccList.size( )];
		for (int i=0; i<addresses.length; i++) {addresses[i] = new InternetAddress((String)ccList.get(i));}
		mesg.setRecipients(Message.RecipientType.CC, addresses);
		
		// BCC Address list
		addresses = new InternetAddress[bccList.size( )];
		for (int i=0; i<addresses.length; i++) {addresses[i] = new InternetAddress((String)bccList.get(i));}
		mesg.setRecipients(Message.RecipientType.BCC, addresses);
		
		
		mesg.setSubject(subject); // The Subject
		//mesg.setText(body);// Now the message body.
		
		// Create a multipart message for attachment
        Multipart multipart = new MimeMultipart();
        
        // Second part is attachment
        for(String i: Attachment) {
        	BodyPart messageBodyPart2 = new MimeBodyPart(); // Create the message body part
        	DataSource source = new FileDataSource(i);
        	messageBodyPart2.setDataHandler(new DataHandler(source));
        	messageBodyPart2.setFileName(i);
        	multipart.addBodyPart(messageBodyPart2);
        }
        
        BodyPart messageBodyPart1 = new MimeBodyPart(); // Create the message body part
        if(isUseFont()) {
        	messageBodyPart1.setContent(body, "text/html"); //for html pages
        }else {
        	messageBodyPart1.setText(body); //run a normal text solution
        }
        
    	multipart.addBodyPart(messageBodyPart1); //Set text message part
        mesg.setContent(multipart); // Send the complete message parts
		mesg.setSentDate(new Date());
		
		// Finally, send the message! (use static Transport method)
		// Do this in a Thread as it sometimes is too slow for JServ
		SMTPTransport t = (SMTPTransport) session.getTransport("smtps");
		t.connect(mailHost, "username", "password");
		t.sendMessage(mesg, mesg.getAllRecipients());
		System.out.println("Response: " + t.getLastServerResponse());
		t.close();
		}
		/** Convenience method that does it all with one call. */
		public static void send(String mailhost, String recipient, ArrayList<String> cc,
				String sender, String subject, String message, List<String> inputPath)throws MessagingException {
			improvedMailgunDemo m = new improvedMailgunDemo( );
			m.setServer(mailhost);
			m.addTo(recipient);
			m.setFrom(sender);
			m.setCcList(cc);
			m.setSubject(subject);
			m.setBody(message);
			m.setVerbose(true);
			m.setUseAlias(false);
			m.doSend(inputPath);
			m.setUseFont(false);
		}
		/** Convert a list of addresses to an ArrayList. This will work
		 * for simple names like "tom, mary@foo.com, 123.45@c$.com"
		 * but will fail on certain complex (but RFC-valid) names like
		 * "(Darwin, Ian) <ian@darwinsys.com>".
		 * Or even "Ian Darwin <ian@darwinsys.com>".     */
		protected List<String> tokenize(String s) {
			List<String> al = new ArrayList<String>();
			StringTokenizer tf = new StringTokenizer(s, ",");
			// For each word found in the line
			while (tf.hasMoreTokens( )) {
				// trim blanks, and add to list.
				al.add(tf.nextToken( ).trim( ));
				}
			return al;
		}
		
		public static void main(String[] args){
			try {
				Map<String,String> data = new HashMap<String,String>();
				//String UseFormat = DownloadUtil.createPdf("update", data);
				
				List<String> inputPath=new ArrayList<String>();
				inputPath.add("file path");
				
				ArrayList<String> ccEmail=new ArrayList<String>();
				ccEmail.add("person@place.com);
				//ccEmail.add("person@otherplace.com");
				
				improvedMailgunDemo.send(
						"smtp.mailgun.org",
						"Myname@service.org",
						ccEmail,
						"account name",
						"My Third test",
						"I'm sending you this with my cusom dynamic Email server. because this is way more fun than Navigating Cytrix. "+
						" will also be makeing a new update to my Git hub server next week looking forward to that.",
						inputPath);
			} catch (MessagingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
