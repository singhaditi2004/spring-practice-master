package com.springcore.master.master.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Doctor staff = context.getBean(Doctor.class);
		System.out.println(staff.getQual() + " " + staff.getNurse().getNurName());
		staff.assist();
	}
}
