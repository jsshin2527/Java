package Inheritance;

/*
 * inheritance -> ��� -> �θ� �ڽ����� �������� �� 
 * 1. �θ�Ŭ�������ִ� ������ �ڽ� Ŭ�������� ������ �ټ� �ִ�.
 * 2. private ����� ������ �޼���� ����� ���� ���մϴ�. 
 * 3. protected�� �����Ѱ��� ��밡�� �����δ� private�����θ� ���� -> �׷��ٸ� ����� ����ϴ� Ÿ���� protected �ۿ� �����ϴ�. ( �ڹٴ� �ٸ� ��Ű���� �ִ� ������ ��Ӱ���)
 * 4. ��ӹ��� �ڽ�Ŭ�������� �ҽ��� �ڽ�Ŭ������ �ҿ��մϴ�.
 * 5. �θ�� ���� ��ü�� (����/�޼ҵ�) ������ ������ �ڽ��� ��ü�� ����մϴ�. 
 */

//Inheritance_test1 VS Inheritance_Example1 �� ������ ���̾��� ���� ������ ���� Ŭ�����Դϴ�. ó������ ** 

class Inheritance_Super2{
	
	private String title;
	
	//private int area;
	//protected�� ����/�޼ҵ带 ����Ҽ� �ְ� ����� �������Դϴ�. 
	protected int area;
	
	//��� �⺻ �����ڴ� ������ �ִ� 
	//public Inheritance_Super2() {}
	
	public Inheritance_Super2(String title) {
		this.title = title;
	}
	public void set(String title) { //method inititalize 
		this.title = title;
		//this.area = area;
	}
	public void print() {
		System.out.println(title+" : "+ area);
	}
}

public class Inheritance_Example2 extends Inheritance_Super2{
	private int w,h;
	int area = 20;
	public Inheritance_Example2(int w,int h) {
		
		super("�簢��"); // super �θ� ã�ư���  -> �����ڿ��� �⺻������ super�� ������ �ֽ��ϴ�. ������ ������ ���� �ڵ带 �ۼ��ϸ� set�� ���� �ȹ޾Ƶ� ����� �����մϴ�. 
		
		this.w = w;
		this.h = h;
		//supter ketword Ȯ�� 
		System.out.println(area); 
		System.out.println(this.area); 
		System.out.println(super.area); 
		
		//super Ű���带 �Է��Ѵٸ� �θ� Ŭ������ 
	}
	public void rectArea() {
		
		int a = w*h;
		area = a; //������ ������ �� �ʿ䰡 �����ϴ�. 
		//set("�簢��");
		// int b = area;  error �θ��� ���������� protected�� ������ �϶�� ��� 		
	}	
	public static void main(String[] args) {
		
		Inheritance_Example2 ob = new Inheritance_Example2(10,5);
		
		ob.rectArea();
		ob.print();		
	}
}
