/**
 * 
 */
package com.webbuild.javabrains;

import org.apache.catalina.Context;
import org.apache.catalina.connector.Connector;
import org.apache.tomcat.util.descriptor.web.SecurityCollection;
import org.apache.tomcat.util.descriptor.web.SecurityConstraint;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;
import org.thymeleaf.templateresolver.ITemplateResolver;


/**
 * @author gce
 *
 */
@SpringBootApplication
public class BeanFactory {
	//.\keytool –genkey –alias ShippingWebsiteSpringSQL –storetype PKCS12 –keyalg RSA –keysize 2048 –keystore bootsecurity.p12 –validity 3650
	
	@Bean
    public ServletWebServerFactory servletContainer() {
        // Enable SSL Trafic
        TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory() {
            @Override
            protected void postProcessContext(Context context) {
                SecurityConstraint securityConstraint = new SecurityConstraint();
                securityConstraint.setUserConstraint("CONFIDENTIAL");
                SecurityCollection collection = new SecurityCollection();
                collection.addPattern("/*");
                securityConstraint.addCollection(collection); 
                context.addConstraint(securityConstraint);
            }
        };

        // Add HTTP to HTTPS redirect
        tomcat.addAdditionalTomcatConnectors(httpToHttpsRedirectConnector());

        return tomcat;
    }

    /*To redirect from HTTP to HTTPS. Without SSL, this application used
    port 8084. With SSL it will use port 8443. So, any request for 8084 needs to be
    redirected to HTTPS on 8443.*/
    private Connector httpToHttpsRedirectConnector() {
        Connector connector = new Connector(TomcatServletWebServerFactory.DEFAULT_PROTOCOL);
        connector.setScheme("http");
        connector.setPort(8084);
        connector.setSecure(false);
        connector.setRedirectPort(8443);
        return connector;
    }
    
    @Bean //Create a special viewer for jsp files
    InternalResourceViewResolver jspViewResolver() {
        final InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/jsp/"); //select file location
        viewResolver.setSuffix(".jsp"); //declare file type
        viewResolver.setViewClass(JstlView.class); //declare media type
        viewResolver.setOrder(1);
        return viewResolver;
    }
	
	@Bean
	 public SpringTemplateEngine textTemplateEngine() {
		 SpringTemplateEngine templateEngine = new SpringTemplateEngine();
		 //load templates into a deployabule template engine
		 templateEngine.addTemplateResolver(htmlTemplateResolver());
		 return templateEngine;
	 }

	 private ITemplateResolver htmlTemplateResolver() {
		 ClassLoaderTemplateResolver templateResolver = new ClassLoaderTemplateResolver();
		 templateResolver.setOrder(2); //select order for running multiple media types
		 templateResolver.setPrefix("templates/"); //select file location, note will always run from resource folder unless told otherwise
		 templateResolver.setSuffix(".html"); //declare file type
		 templateResolver.setTemplateMode(TemplateMode.HTML); //declare media type
		 templateResolver.setCharacterEncoding("UTF-8"); //set encoding, optional
		 templateResolver.setCacheable(false);
		 templateResolver.setCheckExistence(true);// check for other template resolvers
		 return templateResolver;
	 }
}
