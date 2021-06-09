package com.capriberry.loc3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HuyndaiMaker implements CarMaker {
	@Autowired
	private Car car;
	
	public void setCar(Car car) {
		this.car = car;
	}

	public Car sell(Money money){
		System.out.println(money.getAmount() + "받고 차를 팔았음 :: " +car.getName());
		return car;
	}
}
