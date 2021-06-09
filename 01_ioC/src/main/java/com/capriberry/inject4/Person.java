package com.capriberry.inject4;

import org.springframework.beans.factory.annotation.Value;

public class Person {
	@Value("구본희")
	private String name;
	@Value("40")
	private int age;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
