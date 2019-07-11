/*
 * final �� ���ϼ� ���� ��� 
 * ������ final ���̸� : �ѹ��� �ʱ�ȭ�� �˴ϴ�. 
 * �޼ҵ忡 final�� ���̸� : Override�� �Ұ��� 
 * Ŭ������ final�� ���̸� : ����� �Ұ��� �մϴ�. 
 *  
 *
 */
package com.day12;

//class final <class name> : Ŭ������ ����� ���� ���մϴ�. 

class Test{
	public static final double PI;
	
	static {
		PI = 3.14;
		//PI = 3.14 ������ final�� ���̸� 1���� �ʱ�ȭ�� �����ϴ� ���� �Ұ�
	}
	
	public double area; //instance variable new�� ����Ͼ� �޸𸮻� �ö� 
	
	// public final void <method name> �޼ҵ� ��� �Ұ� 
	
	public void write(String title) {

		System.out.println(title + ":"+area);
	
	}
	
}

public class Final_Example extends Test{

	public void circleArea(int r) {
		area = (double)r*r*PI;	
	}
	
	@Override
	public void write(String title) {
		System.out.println(title + ":"+area);
	}
	
	public static void main(String[] args) {

		Final_Example ob = new Final_Example();
	
		ob.circleArea(10);
		ob.write("��");
	}
}
