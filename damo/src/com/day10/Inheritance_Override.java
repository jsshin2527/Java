package com.day10;

//��� Ŭ������ �ְ� ���� Ŭ������ ObjectŬ�����Դϴ�. 
class Shape{
	private String title;
	protected double area;
	public Shape() {}
	public Shape(String title) {
		this.title = title;  // ���� ���� ���� ��Ű���� ���� ������ �Ȱ� this �� ����մϴ�. 
	}
	public void write() {
		System.out.println(title + " : "+ area);
	}
}
class Circle extends Shape{
	private int r;
	protected static final double P1 = 3.14;
	public Circle(int r) {
		super("��");
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
	 * method OverRide : �θ� ������ �ִ� �޼ҵ尡 �ڽ� Ŭ������ �Ȱ��� �̸��� ������ �ִٸ� 
	 *�ڽ� Ŭ������ �޼ҵ尡 �ۼ��� �˴ϴ�. �θ� Ŭ���� ����� (method ������-������)
	 *�� ����� �ϳ� : �θ� Ŭ�������� ����� method�� ������ �����ʾ� ����� ���� �������� �Ҷ� 
	 *�������̽����� ���� ����մϴ�.  
	*/
	@Override //-> �ش� �޼ҵ� �̸� + Contrl + Space
	public void write() {
		super.write();
	}
}
public class Inheritance_Override {
	public static void main(String[] args) {	
		Circle c = new Circle(10);
		c.circleArea();
		c.write();
		
		Rect r = new Rect();
		r.rectArea(10,20);	
		r.write(); //�θ� �ƿ��� �ڽ��� �ƿ��  
	}
}
