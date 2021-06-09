package com.capriberry.loc2;

public class KiaMaker implements CarMaker{

	@Override
	public Car sell(Money money) {
		Car car = new Car("K5");
		System.out.println(money.getAmount() + "받고 차를 팔았음 :: " +car.getName());
		return car;
	}
	
}
