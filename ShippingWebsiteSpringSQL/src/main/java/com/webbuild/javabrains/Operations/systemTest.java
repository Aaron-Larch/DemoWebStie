package com.webbuild.javabrains.Operations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.mail.MessagingException;

import com.webbuild.javabrains.model.Reports;
import com.webbuild.javabrains.service.MailGunService;

/**
 * @author gce
 *
 */
public class systemTest {
	/**
	 * @param args
	 * @throws IOException 
	 */
	
	//Java testing location Holds an execute method for purposes of development
	public static void main(String[] args){
		//Export();
		systemTest placeholder = new systemTest();
		placeholder.testbuild();
	}
	
	public void testbuild(){
		try {
			MailGunService mail = new MailGunService();
			Map<String,String> data = new HashMap<String,String>();
			data.put("name","James");
			//String UseFormat = downloadutil.createPdf("WelcomeUser", data);
			
			List<String> inputPath=new ArrayList<String>();
			//inputPath.add("C:/Users/GCE/Desktop/Web Disine/Build the server.docx");
			
			ArrayList<String> ccEmail=new ArrayList<String>();
			//ccEmail.add("celesteholz@gmail.com");
			//ccEmail.add("ben.gibbs13@gmail.com");
			
			mail.send(
					"smtp.mailgun.org",
					"Resipeant@email.com",
					ccEmail,
					"Sender@domain.com",
					"New Spring Email test",
					"This test is to test a standard blank email to see if all the null value readers work.",
					inputPath,
					false, true, false);
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//run project as a method
	public static void Export(){
		//raw data
		int[] length = {26,35,20,15,25};
		int[] random = {50,45,40,35,30};
		BuildPath Build = new BuildPath();
		Reports[][] box = Build.JavaInterFaceBuildArray(length, random); //use the data to populate the objects
		System.out.println("The titles of the files stroed and the number of records in each file are:");
		for(int j=0; j < box.length; j++) {
			int count=0;
			if(box[j] != null) {
				for(int i=0; i<box[j].length; i++) {if(box[j][i]!=null) {count++;}}
				int a = box[j][0].getreportId().indexOf('-');
				System.out.println(box[j][0].getreportId().substring(0, a)+": "+count);
				}
		}
		SimpleSerch.JavaInterFaceSearch(box);
	}
}
