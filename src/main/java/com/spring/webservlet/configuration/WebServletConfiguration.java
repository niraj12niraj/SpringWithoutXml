package com.spring.webservlet.configuration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import com.spring.without.xml.SpringApplicationConfiguration;

public class WebServletConfiguration  implements WebApplicationInitializer{

	public void onStartup(ServletContext arg0) throws ServletException {
		// TODO Auto-generated method stub
		AnnotationConfigWebApplicationContext acc=new AnnotationConfigWebApplicationContext();
		acc.register(SpringApplicationConfiguration.class);
		acc.setServletContext(arg0);
		ServletRegistration.Dynamic servlet=arg0.addServlet("dispatcher", new DispatcherServlet(acc));
		servlet.setLoadOnStartup(1);
		servlet.addMapping("/");
	}

}
