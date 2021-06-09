package com.capriberry.loc3;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class OrderManagerApp {
	public static void main(String[] args) {
//		OrderManager manager = new OrderManager();
//		manager.order();
		
		// DL : Dependency Lookup 으로 객체생성
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("ioc3.xml");
		OrderManager manager = ctx.getBean("orderManager", OrderManager.class);
		manager.order();
	}
}
