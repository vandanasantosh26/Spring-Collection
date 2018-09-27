package com.springcollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClassForQuestions {
	public static void main(String args[])
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("spring_application.xml");
		Questions obj= (Questions)context.getBean("q1");
		System.out.println(obj);
		obj.displayAnswers();
	}

}
