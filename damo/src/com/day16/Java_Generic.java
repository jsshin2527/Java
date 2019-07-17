package com.day16;

class Box<T/*자료형이 결정되지 않음*/>{
	
	private T t;
	
	public void set(T t) {
		this.t =t;
	}
	public T get() {
		return t;
	}
	
}

public class Java_Generic {

	public static void main(String[] args) {

		Box<Integer> b1 = new Box<Integer>();
		b1.set(new Integer(10)); 
		//Integer는 클래스니까 객체를 생성하는것이 정석입니다.
		Integer i = b1.get();
		System.out.println(i);
		
		Box<String> b2 = new Box<String>();
		b2.set("서울");
		String s = b2.get();
		System.out.println(s);
	
		Box b3 = new Box(); //제너릭을 명시 안할경우 Object 클래스를 받습니다. 
		b3.set(30); //Upcasting 
		Integer ii = (Integer)b3.get(); //DownCasting
		System.out.println(ii);
		
	}
}
