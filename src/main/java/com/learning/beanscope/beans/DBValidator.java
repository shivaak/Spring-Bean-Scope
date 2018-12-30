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
@Component("b")
@Scope("prototype")
//@Profile("db")
public class DBValidator implements Validator {

	public DBValidator() {
		super();
		System.out.println("New DB Validator (Prototype) Object Created !!!");
	}

	@Override
	public void validate() {
		System.out.println("Request Validated");
	}

}
