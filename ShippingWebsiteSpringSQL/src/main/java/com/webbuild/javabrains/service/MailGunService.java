package com.webbuild.javabrains.service;

import java.io.UnsupportedEncodingException;
import java.util.*;

import javax.activation.*;
import javax.mail.*;
import javax.mail.internet.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sun.mail.smtp.*;

@Component
public class MailGunService {
	@Autowired
	DownloadUtil downloadutil;
	
	//Declare model Section
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
	protected boolean newsletter; //flag for newsletter format
	
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
		if (from == null || from.length( )==0) {
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
	public synchronized void doSend(List<String> Attachment) throws MessagingException {
		if (!isComplete( ))throw new IllegalArgumentException("doSend called before message was complete");
		
		/** Properties object used to pass props into the MAIL API */
		Properties props = new Properties( );
		props.put("mail.smtp.host", mailHost);// Create the Session object
		props.put("mail.smtp.port", "587"); //TLS Port
		props.put("mail.smtp.auth", "true"); //enable authentication
        
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
		InternetAddress[] addresses;
		
		 //TO Address list
		addresses = new InternetAddress[toList.size( )];
		for (int i=0; i<addresses.length; i++) {addresses[i] = new InternetAddress((String)toList.get(i));}
		mesg.setRecipients(Message.RecipientType.TO, addresses);
		
		//From Address
		if(isUseAlias()) {
			//set a true/false state to alternate between alias and real sender.
			try {
				//Enable aliasing to hide email address.
				mesg.setFrom(new InternetAddress(from, "no_reply@mailgun.org"));
				mesg.setReplyTo(InternetAddress.parse("no_reply@mailgun.org", false)); //set false to hide real name
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
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
		
		// Create a multipart message for attachment
        Multipart multipart = new MimeMultipart();
        
        // Second part is attachment
        for(String i: Attachment) {
        	BodyPart messageBodyPart2 = new MimeBodyPart(); // Create the message body part
        	DataSource source = new FileDataSource(i);
        	messageBodyPart2.setDataHandler(new DataHandler(source));
        	messageBodyPart2.setFileName(i);
        	messageBodyPart2.setHeader("Content-ID", "Package for you");
        	multipart.addBodyPart(messageBodyPart2);
        }
        
        BodyPart messageBodyPart1 = new MimeBodyPart(); // Create the message body part
        if(isUseFont()) {
        	System.out.println("This Email is a news letter.");
        	messageBodyPart1.setContent(body, "text/html"); //for html pages
        }else {
        	System.out.println("This Email is a block of text.");
        	messageBodyPart1.setText(body); //run a normal text solution
        }
        
    	multipart.addBodyPart(messageBodyPart1); //Set text message part
        mesg.setContent(multipart); // Send the complete message parts
		mesg.setSentDate(new Date());
		
		// Finally, send the message! (use SMTPTransport Transport method)
		SMTPTransport t = (SMTPTransport) session.getTransport("smtps");
		t.connect(mailHost, "username", "password");
		t.sendMessage(mesg, mesg.getAllRecipients());
		System.out.println("Response: " + t.getLastServerResponse());
		t.close();
		}
	
	/** Convenience method that does it all with one call. */
	public void send(String mailhost, String recipient, ArrayList<String> cc,
			String sender, String subject, String message, List<String> inputPath, 
			boolean Newsletter, boolean Debug, boolean Alias
			) throws MessagingException {
		MailGunService m = new MailGunService( );
		//Need to set True/false flags first before email execution
		m.setVerbose(Debug);
		m.setUseAlias(Alias);
		m.setUseFont(Newsletter);
		
		//Main email Components
		m.setServer(mailhost);
		m.addTo(recipient);
		m.setFrom(sender);
		if(cc!=null) {m.setCcList(cc);} //if statement to add optional cc/bcc lists 
		m.setSubject(subject);
		m.setBody(message);
		
		//Check statement to include attachments 
		if(inputPath!=null) {
			//important note all variables must be set before this point
			m.doSend(inputPath);
		}else {
			List<String> tempPath=new ArrayList<String>();
			m.doSend(tempPath);
		}
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
}
