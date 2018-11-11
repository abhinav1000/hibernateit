package com.practice.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Springapp {

	public static void main(String[] args) {
	
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("2");
	Coach object= context.getBean("mybean",Coach.class);
	System.out.println("3");
	System.out.println(object.GetInstructions());
	context.close();
	}

}
