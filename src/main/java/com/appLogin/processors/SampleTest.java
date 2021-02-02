package com.appLogin.processors;

import java.util.Arrays;

import com.appLogin.enums.RequestResponseMappings;

public class SampleTest {

	public static void main(String[] args) {

		Class servletClass = (Class) RequestResponseMappings.getServlet("/login");
		System.out.println("Servlet Class :: "+ servletClass);
		Arrays.asList(servletClass.getMethods()).forEach(method -> System.out.println(method.getName()));
	}

}
