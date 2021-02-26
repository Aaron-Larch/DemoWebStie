package com.pdf.demo.util;

import java.util.Properties;
import java.util.Date;
import javax.mail.*;
import javax.mail.internet.*;
import com.sun.mail.smtp.*;

public class MailgunDemo {
	protected String message_recip = "person@place.com"; //The message recipient.
	protected String message_subject = "This is a test email"; // Subject line of the email
	protected String message_cc = "person@otherplace.com"; //The message CC recipient.
	protected Session session; // The JavaMail session object
	protected Message mesg; // The JavaMail message object
	/** The message body put last due to size and temporary nature soon to be replaced */
	protected String message_body = "This is a dest Email Sent From Aaron Larch via a java program " +
			"useing My private web Domain. This Is not a spam Email! I  " +
			"know it probibly looks like spam because I did not buy a domain " +
			"name. So please Don't delete this Email befor reading it. And if you can please reply back";
	
	/** Do the work: send the mail to the SMTP server.  */
	public void doSend( ) {
		// We need to pass info to the mail server as a Properties, since
		// JavaMail (wisely) allows room for LOTS of properties...
		Properties props = new Properties();
		// Your LAN must define the local SMTP server as "mailhost"
		// for this simple-minded version to be able to send mail...
        props.put("mail.smtps.host", "smtp.mailgun.org");
        props.put("mail.smtps.auth", "true");
        props.put("mail.smtp.port", "587");
		
		// Create the Session object
		session = Session.getDefaultInstance(props, null);
		session.setDebug(true); // Verbose!
		try {
			// create a message 
			mesg = new MimeMessage(session);
			// From Address - this should come from a Properties...
			mesg.setFrom(new InternetAddress("Email account name"));
			// TO Address
			InternetAddress toAddress = new InternetAddress(message_recip);
			mesg.addRecipient(Message.RecipientType.TO, toAddress);
			// CC Address
			InternetAddress ccAddress = new InternetAddress(message_cc);
			mesg.addRecipient(Message.RecipientType.CC, ccAddress);
			// The Subject
			mesg.setSubject(message_subject);
			// Now the message body.
			mesg.setText(message_body);
			mesg.setSentDate(new Date());
			// TODO I18N: use setText(msgText.getText( ), charset)
			// Finally, send the message!
			SMTPTransport t = (SMTPTransport) session.getTransport("smtps");
	        t.connect("smtp.mailgun.org", "username", "password");
	        t.sendMessage(mesg, mesg.getAllRecipients());

	        System.out.println("Response: " + t.getLastServerResponse());

	        t.close();
			} catch (MessagingException ex) {
				while ((ex = (MessagingException)ex.getNextException( )) != null) {
					ex.printStackTrace( );
					}
				}
		
	}
	
	public static void main(String args[]) throws Exception {
		MailgunDemo sm = new MailgunDemo( );
		sm.doSend();
       /* Properties props = System.getProperties();
        props.put("mail.smtps.host", "smtp.mailgun.org");
        props.put("mail.smtps.auth", "true");

        Session session = Session.getInstance(props, null);
        session.setDebug(true); // Verbose!
        Message msg = new MimeMessage(session);
        msg.setFrom(new InternetAddress("test name"));

        InternetAddress[] addrs = InternetAddress.parse("person@place.com", false);
        msg.setRecipients(Message.RecipientType.TO, addrs);

        msg.setSubject("Hello");
        msg.setText("Testing some Mailgun awesomness");
        msg.setSentDate(new Date());

        SMTPTransport t =
            (SMTPTransport) session.getTransport("smtps");
        t.connect("smtp.mailgun.org", "username", "password");
        t.sendMessage(msg, msg.getAllRecipients());

        System.out.println("Response: " + t.getLastServerResponse());

        t.close();*/
    }
}
