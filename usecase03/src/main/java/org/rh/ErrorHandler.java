package org.rh;


import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class ErrorHandler implements Processor {

	@Override
	public void process(Exchange arg0) throws Exception {
		System.out.println("handling ex");
	}

}
