package com.day9;

public class Static_Example_Accout {
	
	private String name;
	private int amount;
	//private float iyul;
	static float iyul;
/*
 
������  = ������ ��ü�� �޸𸮸� �Ҵ��ϸ鼭 ������ �ʱ�ȭ �ϴ� ��Ȱ ��� 
		1.�޸� �Ҵ� 
		2.���� �ʱ�ȭ ���� 
		3.������ �����ؼ� �޸𸮸� �Ҵ��ϴ� �۾��� ��� 
		4.�����ڿ��� �����ڸ� ȣ���Ҽ� �ִ�.
		5.�ڵ��� �� ù�ٿ����� ȣ�� ���� (�ι�° �ٿ����� ȣ�� �Ұ�) -> ����� ���� 
		6.�޼ҵ�� �ʱ�ȭ �ϴ°ͺ��� �����ڷ� �ʱ�ȭ �ϴ°��� �ѹ� �� ������ �ڵ��� �������� �������� 
*/
	public Static_Example_Accout(String name,int amount) {
		this.name = name;
		this.amount = amount;
		this.iyul = iyul;
	}
	
	public void disp() {
		System.out.println("�̸� " +name+ ",�� "+amount+"����"+iyul);
	}
	
	public static void main(String[] args) {
	
		Static_Example_Accout.iyul = 0.7f;
		Static_Example_Accout p1 = new Static_Example_Accout("AAA",10000);
		
		p1.disp();	
		System.out.println();
		
		//5��� BBB �ż� 
		//StaticAccout p2  = new StaticAccout("BBB",20000,0.05f);
		//p1 = new StaticAccout("AAA",10000,0.05f);
		Static_Example_Accout.iyul = 0.5f;
		
		Static_Example_Accout p2 = new Static_Example_Accout("BBB",10000);
		
		p1.disp();
		p2.disp();
		System.out.println();
		
		Static_Example_Accout.iyul = 0.3f;
		//p1 = new StaticAccout("AAA", 10000, 0.03f);
		//p2 = new StaticAccout("BBB", 10000, 0.03f);
		p1.disp();
		p1.disp();
	}

}
