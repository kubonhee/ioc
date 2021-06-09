package com.capriberry.inject2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service("app")
public class ValueinjectApp {
	@Value("#{person.name}")
	private String name;
	@Value("#{person.age}")
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
//		System.out.println(app);
		ApplicationContext ctx = new ClassPathXmlApplicationContext("app-context3.xml");
		ValueinjectApp valueinjectApp = new ValueinjectApp();
		System.out.println(valueinjectApp);
	}
}
