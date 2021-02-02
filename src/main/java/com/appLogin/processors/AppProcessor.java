package com.appLogin.processors;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.appLogin.enums.RequestResponseMappings;

public class AppProcessor {
	
	public static void forwardRequest(HttpServletRequest request, HttpServletResponse response ) throws IOException  {
		Class servletClass = (Class) RequestResponseMappings.getServlet(request.getServletPath());
		try {
			servletClass.getMethod("service", servletClass).invoke(servletClass, request, response);
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException
				| SecurityException e) {
			response.sendError(500, "Invalid Request");
		}
	}

}
