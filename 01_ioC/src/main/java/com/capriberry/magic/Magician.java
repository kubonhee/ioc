package com.capriberry.magic;

public class Magician {
	private String magicWord;
	private MagicBox magicBox;
	
	public void setMagicWord(String magicWord) {
		this.magicWord = magicWord;
	}
	public void setMagicBox(MagicBox magicBox) {
		this.magicBox = magicBox;
	}
	
	public void magic(){
		System.out.println("마술을 시작합니다.");
		System.out.println(magicWord);
		System.out.println("짜잔 상자안에" + magicBox.getContent());
		
	}
}
