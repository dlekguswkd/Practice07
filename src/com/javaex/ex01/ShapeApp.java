package com.javaex.ex01;

public class ShapeApp {

	public static void main(String[] args) {

		//Shape s = new Shape("빨강");  //Shape이 abstract이기 때문에 객체화를 할수가 없다
		//따라서 이문장을 아예 제거하거나 Shape 클래스에 있는 abstract 두개를 지워줘야한다
		Circle c1 = new Circle("녹색", 10);
		Ractangle r1 = new Ractangle("빨강", 4, 4);
		Shape sr1 = new Ractangle("빨강", 4, 4);
		
		//sr1을 그리는 메소드 호출
		sr1.draw();
		
		//sr1의 가로크기 출력
		System.out.println("sr1의 가로는 "+((Ractangle)sr1).getWidth()+"입니다.");
		
	}
}

	
	