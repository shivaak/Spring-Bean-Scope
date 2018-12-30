/**
 * 
 */
package com.learning.beanscope.beans;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

/**
 * @author shivaak on 30-Dec-2018
 *
 */
@Component
public abstract class RequestProcessor {
	
	public RequestProcessor() {
		System.out.println("Request Processor (Singleton) object created");
	}

	public void process() {
		generateValidator().validate();
	}
	
	@Lookup("b")
	public abstract Validator generateValidator();

}
