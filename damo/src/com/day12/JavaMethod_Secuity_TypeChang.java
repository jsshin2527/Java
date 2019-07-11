package com.day12;


class SuperClass{
	protected int a=10,b=20;
	
	public void write() {
		System.out.println("Super Class write () ... ");
		System.out.println("a : "+a+", b "+b);
		
	}
}

class SubClass extends SuperClass{
	
	protected int b = 30,c=40;
	//기본생성자가 제일마지막에 실행이 된다 
	//기본생성자에는  super 가 숨어있습니다. 
	
	@Override
	public void write() {
		System.out.println("Sub Class write() ...");
		System.out.println("a : "+a+", b "+b+", c "+c);
		System.out.println("super.b : " + super.b); //부모의 변수를 찍는다 
		// a 상속  b 는 자식 클래스 변수 사용 c는 자식 클래스 변수 사용 
		super.write();
	}
	
	public void print1() {
		System.out.println("sub class print1() : write 호출 ");
		write();
	}
	public void print2() {
		System.out.println("sub class print2() : write 호출 ");
		super.write();;
	}
}

public class JavaMethod_Secuity_TypeChang {
	
	public static void main(String[] args) {
		
		SubClass ob = new SubClass();
		//ob.write();
		//ob.print1();
		ob.print2();
		// main의 부모 클래스는 Object 이므로 super.write() 사용할수 없다 
		// 부모도 가지고 있고 나도 가지고 있다면 내것을 사용합니다. 
		System.out.println("ob.b : "+ob.b);
		
		//UPCAST를 적용 
		System.out.println("((SuperClass)ob).b : " + ((SuperClass)ob).b);
		//부모는 자기것을 쓸수가 없습니다. 
		//System.out.println("((SuperClass)ob).b : " + ((SuperClass)ob).c);
		
		System.out.println("-----------------------------------------");
		((SuperClass)ob).write();
	}
}
