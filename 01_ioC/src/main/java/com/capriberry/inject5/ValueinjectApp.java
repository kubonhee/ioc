package com.capriberry.inject5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service("app")
public class ValueinjectApp {
//	@Autowired
	
	@Value("#{person}")
	private Person person;
	
	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "ValueinjectApp [name=" + person.getName() + ", age=" + person.getAge() + "]";
	}
	
	public static void main(String[] args){
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("app-context5.xml");
		ValueinjectApp app= ctx.getBean("app", ValueinjectApp.class);
		System.out.println(app);
	}
}
