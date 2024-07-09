package com.javaex.ex03;

public class SoundApp {		//SoundApp.java (printSound 메소드 구현 할 것)
	
	/*
	Soundable 인터페이스의 sound()메소드는 객체의 소리를 반환합니다.

	문제설명
	- 인터페이스 Soundable를 구현하는 Cat, Dog, Sparrow, Duck 클래스를 작성합니다.
	- SoundApp 클래스에서 printSound 매소드를 구현합니다.
	- 실행결과와 동일하게 출력하세요
	 */

    public static void main(String[] args) {
        printSound( new Cat() );
        printSound( new Dog() );
        printSound( new Sparrow() );
        printSound( new Duck() );
    }

    public static void printSound( Soundable soundable ) {
        //구현
    	System.out.println(soundable.sound());
    }
    
}


