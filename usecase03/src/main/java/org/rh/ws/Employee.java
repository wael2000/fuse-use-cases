package org.rh.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

//@WebService()
public class Employee {

	//@WebMethod()
	public String list(String name) {
	    System.out.println("Hello: " + name);
	    return "Hello " + name + "!";
	}
}
