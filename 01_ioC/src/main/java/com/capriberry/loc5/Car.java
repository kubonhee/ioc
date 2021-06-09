package com.capriberry.loc5;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Named("myCar")
public class Car {

	@Value("r8")

	private String name;

	public Car() {
	}

	public Car(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
