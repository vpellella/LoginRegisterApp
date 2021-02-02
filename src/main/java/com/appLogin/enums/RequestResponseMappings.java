package com.appLogin.enums;

import java.io.Serializable;

import com.appLogin.controllers.ForgotPasswordServlet;
import com.appLogin.controllers.LoginServlet;
import com.appLogin.controllers.RegistrationServlet;

public enum RequestResponseMappings{
	
	lOGIN(1, "/login", LoginServlet.class), 
	REGISTER(2, "/register", RegistrationServlet.class),
	FORGOTPASSWORD(3, "/forgotPassword", ForgotPasswordServlet.class);
	
	private Object servletClass;
	private int id;
	private String actionURI;
	
	RequestResponseMappings(int id, String url, Object servletClass){
		this.id = id;
		this.actionURI = url; 
		this.servletClass = servletClass;
	}

	public int getId() {
		return id;
	}

	public String getActionURI() {
		return actionURI;
	}

	public Object getServletClass() {
		return servletClass;
	}
	
	public static Object getServlet(String url) {
		for(RequestResponseMappings requestResponseMapping : RequestResponseMappings.values()) {
			if(requestResponseMapping.actionURI.equalsIgnoreCase(url))
				return requestResponseMapping.servletClass;
		}
		return null;
			
	}
	
	

}
