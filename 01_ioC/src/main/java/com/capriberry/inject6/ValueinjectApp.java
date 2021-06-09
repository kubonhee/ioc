package com.capriberry.inject6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Service;

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
		
		GenericXmlApplicationContext parent = new GenericXmlApplicationContext();
		parent.load("app-context6-parent.xml");
		parent.refresh();
		String p1 =	parent.getBean("parent1", String.class);
		String p2 =	parent.getBean("parent2", String.class);
		
		System.out.println(p1);
		System.out.println(p2);
		
		GenericXmlApplicationContext child = new GenericXmlApplicationContext();
		parent.load("app-context6.xml");
		child.setParent(parent);
		parent.refresh();
		
		Person person1 = child.getBean("person1", Person.class);
		Person person2 = child.getBean("person2", Person.class);
		
		System.out.println(person1);
		System.out.println(person2);
	}
}
