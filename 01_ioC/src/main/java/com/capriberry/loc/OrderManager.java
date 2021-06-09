package com.capriberry.loc;

public class OrderManager {
	private HuyndaiMaker maker = new HuyndaiMaker();
	
	public void order(){
		maker.sell(new Money(1000));
	}
}
