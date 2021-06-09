package com.capriberry.magic;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MagicTest {
	public static void main(String[] args){
//		Magician magician = new Magician(); // DL
//		magician.setMagicWord("얍!");
//		magician.setMagicBox(new MagicBoximpl()); // DI
//		magician.magic();
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("magic.xml");
		ctx.getBean("magician", Magician.class).magic();
		ctx.close();
		
	}
}
