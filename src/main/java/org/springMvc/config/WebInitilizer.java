package org.springMvc.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration;

public class WebInitilizer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		
	AnnotationConfigWebApplicationContext cn=new AnnotationConfigWebApplicationContext();
	 cn.register(WebConfig.class, DbConfig.class);
     servletContext.addListener(new ContextLoaderListener(cn));
     
	DispatcherServlet ds=new DispatcherServlet(cn);  
	ServletRegistration.Dynamic reg=servletContext.addServlet("dispatcher",ds);
	 reg.setLoadOnStartup(1);
     reg.addMapping("/");
     
	}
}
