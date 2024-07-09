package com.javaex.ex02;

public abstract class Bird {
	
	//com.javaex. ex02 의 클래스를 이용하여 콘솔에 출력되는 결과가 아래와 같도록 클래스 Bird(추상클래스), Duck, Sparrow 를 작성하세요.
	//(BirdApp클래스는 수정하지 않습니다.)
	
	//필드
    private String name;

    //생성자
    public Bird() {
		super();
	}

	public Bird(String name) {
		super();
		this.name = name;
	}

	//메소드 gs
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//메소드 일반
	public abstract void sing();
	public abstract void fly();
	public abstract void showName();
    	
  
    
}
