package com.capriberry.loc3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class OrderManager {
	@Autowired	@Qualifier("huyndaiMaker")
	private CarMaker maker;
	
	public void setMaker(CarMaker maker) {
		this.maker = maker;
	}
	public void order(){
		maker.sell(new Money(1000));
	}
}
