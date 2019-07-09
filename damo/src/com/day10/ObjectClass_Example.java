package com.day10;

/*
 * ��罺ũ���� ��ǻ�͸� ���� �ٽ� Ű�°��̴� 
 * �޸� �浹 : ��罺ũ�� 
 * �ڹ��� ��� Ŭ������ Object�� ����� �޴´� 
 */


class Super{
	private int a = 10;
	
	public void write() {
		System.out.println("a"+a);
	}
}
public class ObjectClass_Example {
	
	public static void main(String[]args) {
		
		Super ob2 = new Super();
		Super ob1 = new Super();
		
		System.out.println("ob1 == ob2 : " + (ob1==ob2)); //false 
		System.out.println("ob1.equals(ob2) : "+ ob1.equals(ob2)); //false
		/*
		 * ��� Ŭ������ �θ�� Object�Դϴ�.
		 * ���� ���� Ŭ������ �θ�� Object�Դϴ�. 
		 */
		//Hashcode 
		System.out.println("ob1 : " + ob1); //:com.day10.Super@2f7a2457
		System.out.println("ob1 : " + ob2); //:com.day10.Super@566776ad
		//toString Object Ŭ������ ���մϴ�. 
		System.out.println("ob1.toString() : " + ob1.toString()); //com.day10.Super@2f7a2457
		System.out.println("ob2.toString() : " + ob2.toString()); //com.day10.Super@566776ad		
	}
}
