package com.day10;
/* ���ó�� -> run ��ư Ŭ���Ͽ� �ذ� 
 * inheritance -> ��� -> �θ� �ڽ����� �������� �� 
 * 1. �θ�Ŭ�������ִ� ������ �ڽ� Ŭ�������� ������ �ټ� �ִ�.
 * 2. private ����� ������ �޼���� ����� ���� ���մϴ�. 
 * 3. protected�� �����Ѱ��� ��밡�� �����δ� private�����θ� ���� -> �׷��ٸ� ����� ����ϴ� Ÿ���� protected �ۿ� �����ϴ�. ( �ڹٴ� �ٸ� ��Ű���� �ִ� ������ ��Ӱ���)
 * 4. ��ӹ��� �ڽ�Ŭ�������� �ҽ��� �ڽ�Ŭ������ �ҿ��մϴ�.
 * 5. �θ�� ���� ��ü�� (����/�޼ҵ�) ������ ������ �ڽ��� ��ü�� ����մϴ�. 
 */

//Inheritance_test1 VS Inheritance_Example1 �� ������ ���̾��� ���� ������ ���� Ŭ�����Դϴ�. ó������ ** 

class Inheritance_Super{
	
	//����� �Ұ�� private�� ����� �������� �����ϴ�. 
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
		set("�簢��",a);
		// int b = area;  error �θ��� ���������� protected�� ������ �϶�� ��� 		
	}

	public static void main(String[] args) {
		
		Inheritance_Example1 ob = new Inheritance_Example1(10,20);
		
		ob.rectArea();
		ob.print();		
	}
}
