package com.capriberry.inject;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ValueinjectApp {
	private String name;
	private int age;
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "ValueinjectApp [name=" + name + ", age=" + age + "]";
	}
	
	public static void main(String[] args){
//		ValueinjectApp app = new ValueinjectApp();
//		app.setAge(10);
//		app.setName("구본희");
//		
//		System.out.println(app);
		
		System.out.println(new ClassPathXmlApplicationContext("app-context.xml").getBean("app"));
	}
}
