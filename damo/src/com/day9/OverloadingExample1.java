package com.day9;

//���ǻ� Ŭ������ ���� ������ ����� 

class Rect{
	//�簢���� ������ ���ϴ� Ŭ���� 
	//���̷�Ʈ�� ���� �Ұ� 
	private int w,h;
	
	
	//�� ������ ��� ���ϴ� �������� ����� Ȯ�� 
	public void set(int w,int h) {
		this.w =  w;
		this.h =  h;	
	}	
	public int area(){
		return w*h;
	}
	public int length(){
		return (w+h)*2;
	}
	
	/*
	public void getPrint(int a, int l) {
		System.out.println("���� : " + w);
		System.out.println("���� : " + h);
		System.out.println("���� : " +length());
		System.out.println("�ѷ� : " + area());
	}
	
	//���μ��θ� ����ϰ� 
	public void write() {
		System.out.println("���� : " + w);
		System.out.println("���� : " + h);
	}
	//���μ��γ��� ����ϱ�
	public void chul(int a) {
		System.out.println("���� : " + w);
		System.out.println("���� : " + h);
		System.out.println("���� : " +length());
	}
	//���μ��εѷ� ����ϱ� 
	public void jjik(int l) {
		System.out.println("���� : " + w);
		System.out.println("���� : " + h);
		System.out.println("�ѷ� : " + area());
		
	}
	*/
	public void getPrint(int a, int l) {
		System.out.println("���� : " + w);
		System.out.println("���� : " + h);
		System.out.println("���� : " +length());
		System.out.println("�ѷ� : " + area());
	}	
	//���μ��θ� ����ϰ� 
	public void getPrint() {
		System.out.println("���� : " + w);
		System.out.println("���� : " + h);
	}
	//�Ʒ��ִ� �޼ҵ�� ���� �޼ҵ�� �ν� 
	//�Ķ���Ͱ��� ���������� �����ϸ� �ٸ� �޼ҵ�� �ν��� �մϴ�. 
	
	//���μ��γ��� ����ϱ�
	public void getPrint(int a) {
		System.out.println("���� : " + w);
		System.out.println("���� : " + h);
		System.out.println("���� : " +length());
	}
	
	//���μ��εѷ� ����ϱ� 
	public void getPrint(double l) {
		System.out.println("���� : " + w);
		System.out.println("���� : " + h);
		System.out.println("�ѷ� : " + area());
	}
}
//*���� Ŭ���� �ȿ���* ���� ��Ȱ�� �ϴ� �޼ҵ��� �̸��� ���Ͻ�Ű�� �۾� : �޼ҵ� ���� �ε�(overloading) vs override( *�ٸ� Ŭ���� ����*) 
//�ڹٴ� �̸��� ���Ͻ�Ű�� �Ű������� ������ �ٸ��ų� ������ Ÿ���� �ٸ��� �ٸ� �޼ҵ�� �ν��ϴ� 

public class OverloadingExample1 {

	public static void main(String[] args) {
		Rect ob = new Rect();
		
		//�ٸ� �޼ҵ忡�� �ִ� ��ȯ���� �־��ټ��� �ִ� 
		//Scanner�� �Է°��� �޾��ټ��� �ִ� 
		ob.set(10, 20);
		int a = ob.area();
		int l = ob.length();
		/*
		ob.getPrint(a,l);
		System.out.println();
		ob.chul(a);
		System.out.println();
		ob.write();
		System.out.println();
		ob.jjik(l);
		*/
		ob.getPrint((double)l);
		ob.getPrint(a);
		ob.getPrint(a, l);
		//���� double������ �������� �ʾƵ� �ȴ�.

	}
}
