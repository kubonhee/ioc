package com.capriberry.emp;

import java.util.ArrayList;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("emp.xml");
		
//		Emp[] emps = new Emp[3];
//		emps[0] = ctx.getBean("programmer1", Emp.class);
//		emps[1] = ctx.getBean("programmer2", Emp.class);
//		emps[2] = ctx.getBean("designer", Emp.class);
		
		ArrayList<Emp> emps = ctx.getBean("emps", ArrayList.class);
		
		
//		emps[1] = new Programmer();
//		emps[1].setName("구본희 개발자");
//		emps[1].setWork("자바 프로그래밍");
//		
//		emps[2] = new Designer();
//		emps[2].setName("박종민 디자이너");
//		emps[2].setWork("포토샵");
		
		for(Emp e : emps){
			e.work();
		}
//		System.out.println(emps[0] instanceof Emp);
//		System.out.println(emps[0] instanceof Programmer);
//		System.out.println(emps[0] instanceof Designer);
	}

}
