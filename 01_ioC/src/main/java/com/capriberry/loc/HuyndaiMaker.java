package com.capriberry.loc;

public class HuyndaiMaker {
	public Car sell(Money money){
		Car car = new Car("소나타");
		System.out.println(money.getAmount() + "받고 차를 팔았음 :: " +car.getName());
		return car;
	}
}
