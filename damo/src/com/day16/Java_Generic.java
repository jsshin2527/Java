package com.day16;

class Box<T/*�ڷ����� �������� ����*/>{
	
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
		//Integer�� Ŭ�����ϱ� ��ü�� �����ϴ°��� �����Դϴ�.
		Integer i = b1.get();
		System.out.println(i);
		
		Box<String> b2 = new Box<String>();
		b2.set("����");
		String s = b2.get();
		System.out.println(s);
	
		Box b3 = new Box(); //���ʸ��� ��� ���Ұ�� Object Ŭ������ �޽��ϴ�. 
		b3.set(30); //Upcasting 
		Integer ii = (Integer)b3.get(); //DownCasting
		System.out.println(ii);
		
	}
}
