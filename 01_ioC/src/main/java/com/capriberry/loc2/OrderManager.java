package com.capriberry.loc2;

public class OrderManager {
	private CarMaker maker;
	
	public void setMaker(CarMaker maker) {
		this.maker = maker;
	}
	public void order(){
		maker.sell(new Money(1000));
	}
}
