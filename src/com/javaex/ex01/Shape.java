package com.javaex.ex01;

public abstract class Shape {	//abstract은 추상클래스 객체화 불가능
	
	//다음 4개의 파일에는 2개의 에러가 발생합니다. 에러가 발생하는 원인을 찾고 출력결과가 나오도록 코딩하세요.
	
	protected String fillColor;
	
	public Shape(String fillColor){
		this.fillColor=fillColor;
	}
	
	public abstract void draw();
}


