package com.day10;

//모든 클래스의 최고 상위 클래스는 Object클래스입니다. 

class Shape{
	
	private String title;
	protected double area;
	public Shape() {}
	public Shape(String title) {
		this.title = title;  // 변수 값을 통일 시키리다 보니 구분이 안가 this 를 사용합니다. 
	}
	public void write() {
		System.out.println(title + " : "+ area);
	}
}
class Circle extends Shape{
	private int r;
	protected static final double P1 = 3.14;
	public Circle(int r) {
		//Shape ob = new Shape("원"); -> super("원")
		super("원");
		this.r = r;
	}
	public void circleArea() {
		area = r*r*P1;	
	}
}
class Rect extends Shape{
	
	private int w,h;
	
	public void rectArea(int w,int h) {
		this.w = w;
		this.h = h;		
		area = w*h;
	}
	/*
	 * method OverRide : 부모가 가지고 있는 메소드가 자식 클래스에 똑같은 이름을 가지고 있다면 
	 *자식 클래스의 메소드가 작성이 됩니다. 부모 클래스 사라짐 (method 재정의-다형성)
	 *왜 사용을 하냐 : 부모 클래스에서 선언된 method가 마음에 들지않아 다른 내용을 출력하고 싶을때 사용합니다.  
	 *인터페이스에서 많이 사용합니다.  
	 *Overloading vs Override 
	 * Overloading : 같은 클래스의 동일한 메소드 이름 다른 파라미터 
	 * Override    : 다른 클래스의 동일한 메소드 이름 같은 파라미터  
	*/
	//@Override //-> 해당 메소드 이름 + Contrl + Space
	/*
	public void write() {
		super.write();
	}
	*/
	@Override
	public void write() {
		System.out.println("밑변 : " + w);
		System.out.println("높이 : " + h);
		System.out.println("면적 : " + area);
	}
}
public class Inheritance_Override {
	public static void main(String[] args) {	
		Circle c = new Circle(10);
		c.circleArea();
		c.write();	
		Rect r = new Rect();
		r.rectArea(10,20);	
		r.write(); //부모가 아우디와 자식의 아우디  
	}
}
