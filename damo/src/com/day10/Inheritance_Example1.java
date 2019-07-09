package com.day10;
/* 장애처리 -> run 버튼 클릭하여 해결 
 * inheritance -> 상속 -> 부모가 자식한테 무엇가를 줌 
 * 1. 부모클래스에있는 정보는 자식 클래스에게 언젠가 줄수 있다.
 * 2. private 선언된 변수나 메서드는 상속을 받지 못합니다. 
 * 3. protected로 선언한것은 사용가능 앞으로는 private변수로만 선언 -> 그렇다면 상속을 허용하는 타입은 protected 밖에 없습니다. ( 자바는 다른 패키지에 있는 값까지 상속가능)
 * 4. 상속받은 자식클래스는의 소스는 자식클래스만 소요합니다.
 * 5. 부모와 같은 객체는 (변수/메소드) 가지고 있으면 자식의 객체를 사용합니다. 
 */

//Inheritance_test1 VS Inheritance_Example1 는 공간만 같이쓰는 전혀 관련이 없는 클래스입니다. 처음에는 ** 

class Inheritance_Super{
	
	//상속을 할경우 private는 상속을 받을수가 없습니다. 
	private String title;
	private int area;
	
	public void set(String title,int area) { //method inititalize 
		this.title = title;
		this.area = area;
	}
	public void print() {
		System.out.println(title+" : "+area);
		//System.out.println("1");
	}
}
public class Inheritance_Example1 extends Inheritance_Super{

	private int w,h;
	
	public Inheritance_Example1(int w,int h){
		this.w = w;
		this.h = h;
	}
	public void rectArea(){
		int a = w*h;
		set("사각형",a);
		// int b = area;  error 부모의 접근제어자 protected로 변경을 하라고 출력 		
	}

	public static void main(String[] args) {
		
		Inheritance_Example1 ob = new Inheritance_Example1(10,20);
		
		ob.rectArea();
		ob.print();		
	}
}
