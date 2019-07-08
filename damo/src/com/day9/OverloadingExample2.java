package com.day9;

class RectA{
	
	private int w,h;
	
	public RectA(){//�⺻ ������ 
		
		
	}
	public RectA(int w, int h) {//������ �����ε� 
		this.w = w;
		this.h = h;
	}
	public void set(int w,int h) {//�ʱ�ȭ �޼ҵ� 
		this.w = w;
		this.h = h;
	}
	public int area() {
		return (w*h);
	}
	public int length() {
		return (w+h)*2;
	}
	public void print(int a) {
		System.out.println("���� : "+w+",���� : "+h);
	}
	public void print(int a,int l) { //�޼ҵ� �����ε� 
		System.out.println("���� : "+w+",���� : "+h);
		System.out.println("���� : "+a);
		System.out.println("�ѷ� : "+l);
	}
}
public class OverloadingExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RectA ob = new RectA(); 
		ob.set(10,20);
		
		int a = ob.area();
		int l = ob.length();
		
		ob.print(a);
		ob.print(a,l);
		
		RectA ob1 = new RectA(100,200);
		
		a = ob1.area();
		l = ob1.length();
		ob1.print(a);
		ob1.print(a, l);
		
		ob1.set(1000,2000);
		a = ob1.area();
		l = ob1.length();
		ob1.print(a);
		ob1.print(a, l);
	}
}
