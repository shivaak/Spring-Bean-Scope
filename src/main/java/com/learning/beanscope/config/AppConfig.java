/**
 * 
 */
package com.learning.beanscope.config;

import org.springframework.context.annotation.Configuration;

/**
 * @author shivaak on 30-Dec-2018
 *
 */

@Configuration
public class AppConfig {

	//JAVA CONFIG WAY
	/*@Bean
	@Scope(scopeName="singleton")
	public Validator validator() {
		return new LocalValidator();
	}
	
	@Bean
	public RequestProcessor requestProcessor(Validator validator) {
		return new RequestProcessor() {
			@Override
			public Validator generateValidator() {
				return new LocalValidator();
			}
			
		};
	}*/
}
