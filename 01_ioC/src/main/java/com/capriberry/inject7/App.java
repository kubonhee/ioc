package com.capriberry.inject7;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
	private Map<String, Object> map;
	private Set<Object> set;
	private Properties properties;
	public void setMap(Map<String, Object> map) {
		this.map = map;
	}
	public void setSet(Set<Object> set) {
		this.set = set;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	
	void display() {
		System.out.println("======= map =======");
		map.forEach((k, v) -> { System.out.println(k + "::" + v);});
		System.out.println("======= set ========");
		set.forEach(System.out::println);
		System.out.println("======= props ========");
		properties.forEach((k, v) -> { System.out.println(k + "::" + v); });
		
	}
	
	public static void main(String[] args){
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("app-context7.xml");
		App app = ctx.getBean("app", App.class);
		app.display();
	}
	
}
