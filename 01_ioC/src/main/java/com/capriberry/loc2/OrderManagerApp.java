package com.capriberry.loc2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OrderManagerApp {
	public static void main(String[] args) {
//		OrderManager manager = new OrderManager();
//		manager.order();
		
		// DL : Dependency Lookup 으로 객체생성
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ioc2.xml");
		OrderManager manager = ctx.getBean("orderManager", OrderManager.class);
		OrderManager manager2 = ctx.getBean("orderManager", OrderManager.class);
		OrderManager manager3 = ctx.getBean("orderManager", OrderManager.class);
//		manager.order();
		
		manager.order();
	}
}
