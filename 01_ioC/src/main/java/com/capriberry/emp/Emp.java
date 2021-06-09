package com.capriberry.emp;

public abstract class Emp {
	private String name;
	private String work;
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setWork(String work) {
		this.work = work;
	}
	public void work() {
		
		System.out.println(getEmp()+"객체의" + name + "이(가) " + work + "을(를)합니다.");
		 
	}
	
	public abstract Emp getEmp();
}
