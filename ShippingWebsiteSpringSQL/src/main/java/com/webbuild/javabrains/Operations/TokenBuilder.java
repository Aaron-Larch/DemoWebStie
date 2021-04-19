package com.webbuild.javabrains.Operations;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Properties;
import java.util.StringTokenizer;

import javax.mail.MessagingException;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import com.webbuild.javabrains.model.User;
import com.webbuild.javabrains.service.MailGunService;

public class TokenBuilder {
	//Dynamically create a password recovery message with a web address linking to the password recovery page.
	public static void constructResetTokenEmail(String contextPath, Locale locale, String token, User user) {
		try {
			Resource resource = new ClassPathResource("/validation.properties");//create a resource object
			Properties props = PropertiesLoaderUtils.loadProperties(resource);//load object with the correct properties file
			String url = contextPath + "/Account/user/changePassword?token=" + token; //Dynamically create custom Url
			String message = props.getProperty("message.resetPassword");//Generate Email body message from resource object
			System.out.println(message + " \r\n" + url);//print line for testing purposes
			String body ="Hello "+user.getUsername()+" Sorry to hear about your account.\n"+
					message + " \r\n" + url;
			try {
				MailGunService mail = new MailGunService();
				
				//Send the user a custom welcome email
				mail.send(
						"smtp.mailgun.org", //Email host
						"Resipeant@email.com", //should be user.getEmail()
						null, //cc list
						"Sender@domain.com", //Domain name
						"Resetting Your password", //subject line
						body, //message body
						null, //optional attachment
						false, false, true); //system flags for newsletter, debug, and Alias 
			} catch (MessagingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
