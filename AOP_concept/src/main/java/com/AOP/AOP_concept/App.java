package com.AOP.AOP_concept;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.AOP.AOP_concept.Services.PaymentServices;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/AOP/AOP_concept/conf.xml");

		PaymentServices paymentObj = context.getBean("payment", PaymentServices.class);
		
		//autontication
		paymentObj.makePayment();
		
	}
}