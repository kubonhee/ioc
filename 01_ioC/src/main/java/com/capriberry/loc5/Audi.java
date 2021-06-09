package com.capriberry.loc5;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class Audi implements CarMaker{
	@Autowired
	private Car car;
	
	public Audi() { } // 기본 생성자
	
	public Audi(Car car) {
		this.car = car;
	}

	public Car getCar() {
		return car;
	}
	
	@Override
	public Car sell(Money money) {
		System.out.println(car.getName() + "의 차를" + money.getAmount() + "의 가격으로 판매");
		return car;
	}
	
}
