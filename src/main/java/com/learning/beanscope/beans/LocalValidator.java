/**
 * 
 */
package com.learning.beanscope.beans;

import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author shivaak on 30-Dec-2018
 *
 */
@Component("a")
@Scope("prototype")
//@Profile({"local","default"})
public class LocalValidator implements Validator {

	public LocalValidator() {
		super();
		System.out.println("New Local Validator (Prototype) Object Created !!!");
	}

	@Override
	public void validate() {
		System.out.println("Request Validated");
	}

}
