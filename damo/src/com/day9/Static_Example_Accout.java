package com.day9;

public class Static_Example_Accout {
	
	private String name;
	private int amount;
	//private float iyul;
	static float iyul;
/*
 
생성자  = 생성된 객체에 메모리를 할당하면서 변수를 초기화 하는 역활 담당 
		1.메모리 할당 
		2.변수 초기화 목적 
		3.원본을 복사해서 메모리를 할당하는 작업을 담당 
		4.생성자에서 생성자를 호출할수 있다.
		5.코딩의 맨 첫줄에서만 호출 가능 (두번째 줄에서는 호출 불가) -> 상속의 개념 
		6.메소드로 초기화 하는것보다 생성자로 초기화 하는것이 한발 더 빠르고 코드의 가독성이 좋아진다 
*/
	public Static_Example_Accout(String name,int amount) {
		this.name = name;
		this.amount = amount;
		this.iyul = iyul;
	}
	
	public void disp() {
		System.out.println("이름 " +name+ ",돈 "+amount+"이율"+iyul);
	}
	
	public static void main(String[] args) {
	
		Static_Example_Accout.iyul = 0.7f;
		Static_Example_Accout p1 = new Static_Example_Accout("AAA",10000);
		
		p1.disp();	
		System.out.println();
		
		//5년뒤 BBB 신설 
		//StaticAccout p2  = new StaticAccout("BBB",20000,0.05f);
		//p1 = new StaticAccout("AAA",10000,0.05f);
		Static_Example_Accout.iyul = 0.5f;
		
		Static_Example_Accout p2 = new Static_Example_Accout("BBB",10000);
		
		p1.disp();
		p2.disp();
		System.out.println();
		
		Static_Example_Accout.iyul = 0.3f;
		//p1 = new StaticAccout("AAA", 10000, 0.03f);
		//p2 = new StaticAccout("BBB", 10000, 0.03f);
		p1.disp();
		p1.disp();
	}

}
