package com.capriberry.inject4;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service("app")
public class ValueinjectApp {
	private Person person;
	
	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "ValueinjectApp [name=" + person.getName() + ", age=" + person.getAge() + "]";
	}
	
	public static void main(String[] args){
//		ValueinjectApp app = new ValueinjectApp();
//		app.setAge(10);
//		app.setName("구본희");
//		System.out.println(app);
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("app-context4.xml");
		ValueinjectApp app= ctx.getBean("app", ValueinjectApp.class);
		System.out.println(app);
	}
}
