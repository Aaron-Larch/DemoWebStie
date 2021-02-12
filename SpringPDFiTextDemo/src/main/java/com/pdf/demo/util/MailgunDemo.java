package com.pdf.demo.util;

import java.util.Properties;
import java.util.Date;
import javax.mail.*;
import javax.mail.internet.*;
import com.sun.mail.smtp.*;

public class MailgunDemo {
	protected String message_recip = "a.larch@yahoo.com"; //The message recipient.
	protected String message_subject = "This is a test email"; // Subject line of the email
	protected String message_cc = "ben.gibbs13@gmail.com"; //The message CC recipient.
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
			mesg.setFrom(new InternetAddress("Heroku@sandboxfb130d48c13c4e6593291983e52a9dbc.mailgun.org"));
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
	        t.connect("smtp.mailgun.org", "postmaster@sandboxfb130d48c13c4e6593291983e52a9dbc.mailgun.org", "130cb669624f29b481af78a18f5ee961-07bc7b05-2c3fa8ec");
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
        msg.setFrom(new InternetAddress("Heroku@sandboxfb130d48c13c4e6593291983e52a9dbc.mailgun.org"));

        InternetAddress[] addrs = InternetAddress.parse("a.larch@yahoo.com", false);
        msg.setRecipients(Message.RecipientType.TO, addrs);

        msg.setSubject("Hello");
        msg.setText("Testing some Mailgun awesomness");
        msg.setSentDate(new Date());

        SMTPTransport t =
            (SMTPTransport) session.getTransport("smtps");
        t.connect("smtp.mailgun.org", "postmaster@sandboxfb130d48c13c4e6593291983e52a9dbc.mailgun.org", "130cb669624f29b481af78a18f5ee961-07bc7b05-2c3fa8ec");
        t.sendMessage(msg, msg.getAllRecipients());

        System.out.println("Response: " + t.getLastServerResponse());

        t.close();*/
    }
}
