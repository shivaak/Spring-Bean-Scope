package com.learning.beanscope;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.learning.beanscope.beans.RequestProcessor;

@SpringBootApplication
public class SpringBeanScopesApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBeanScopesApplication.class, args);
		
		RequestProcessor rp = context.getBean(RequestProcessor.class);
		rp.process();
		
		rp.process();
	}

}

