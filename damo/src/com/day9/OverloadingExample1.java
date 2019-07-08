package com.day9;

//편의상 클래스를 같은 공간에 만든다 

class Rect{
	//사각형의 면적을 구하는 클래스 
	//다이렉트로 접근 불가 
	private int w,h;
	
	
	//각 변수가 어디에 속하는 변수인지 색깔로 확인 
	public void set(int w,int h) {
		this.w =  w;
		this.h =  h;	
	}	
	public int area(){
		return w*h;
	}
	public int length(){
		return (w+h)*2;
	}
	
	/*
	public void getPrint(int a, int l) {
		System.out.println("가로 : " + w);
		System.out.println("세로 : " + h);
		System.out.println("넓이 : " +length());
		System.out.println("둘레 : " + area());
	}
	
	//가로세로만 출력하게 
	public void write() {
		System.out.println("가로 : " + w);
		System.out.println("세로 : " + h);
	}
	//가로세로넓이 출력하기
	public void chul(int a) {
		System.out.println("가로 : " + w);
		System.out.println("세로 : " + h);
		System.out.println("넓이 : " +length());
	}
	//가로세로둘레 출력하기 
	public void jjik(int l) {
		System.out.println("가로 : " + w);
		System.out.println("세로 : " + h);
		System.out.println("둘레 : " + area());
		
	}
	*/
	public void getPrint(int a, int l) {
		System.out.println("가로 : " + w);
		System.out.println("세로 : " + h);
		System.out.println("넓이 : " +length());
		System.out.println("둘레 : " + area());
	}	
	//가로세로만 출력하게 
	public void getPrint() {
		System.out.println("가로 : " + w);
		System.out.println("세로 : " + h);
	}
	//아래있는 메소드와 같은 메소드로 인식 
	//파라미터값의 데이터형을 변경하면 다른 메소드로 인식을 합니다. 
	
	//가로세로넓이 출력하기
	public void getPrint(int a) {
		System.out.println("가로 : " + w);
		System.out.println("세로 : " + h);
		System.out.println("넓이 : " +length());
	}
	
	//가로세로둘레 출력하기 
	public void getPrint(double l) {
		System.out.println("가로 : " + w);
		System.out.println("세로 : " + h);
		System.out.println("둘레 : " + area());
	}
}
//*같은 클래스 안에서* 같은 역활을 하는 메소드의 이름을 통일시키는 작업 : 메소드 오버 로딩(overloading) vs override( *다른 클래스 에서*) 
//자바는 이름은 통일시키고 매개변수의 갯수가 다르거나 데이터 타입이 다르면 다른 메소드로 인식하다 

public class OverloadingExample1 {

	public static void main(String[] args) {
		Rect ob = new Rect();
		
		//다른 메소드에서 주는 반환값을 넣어줄수도 있다 
		//Scanner로 입력값을 받아줄수도 있다 
		ob.set(10, 20);
		int a = ob.area();
		int l = ob.length();
		/*
		ob.getPrint(a,l);
		System.out.println();
		ob.chul(a);
		System.out.println();
		ob.write();
		System.out.println();
		ob.jjik(l);
		*/
		ob.getPrint((double)l);
		ob.getPrint(a);
		ob.getPrint(a, l);
		//굳이 double형으로 변경하지 않아도 된다.

	}
}
