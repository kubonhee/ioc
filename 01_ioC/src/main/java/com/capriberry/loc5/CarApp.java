package com.capriberry.loc5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarApp {
	public static void main(String[] arg){
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("ioc5.xml");
		Audi audi = ctx.getBean("audi", Audi.class);
		System.out.println(audi.getCar().getName());
		audi.sell(ctx.getBean("money", Money.class));
		ctx.close();

//		Car car = new Car();
//		car.setName("r8");
//		Audi audi = new Audi();
//		audi.setCar(car);
//		
//		System.out.println(audi.getCar().getName());
	}
}
