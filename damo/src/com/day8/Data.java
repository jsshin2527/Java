package com.day8;

import java.util.Calendar;

public class Data {

	static String  name = "����";
	static int age = 25;
	
	//String  name = "����";
	//int age = 25;
	
	/*
	public void print() {
		System.out.println(name+ "�� ���̴� " + age+"�Դϴ�.");
	}
	*/
	
	
	//static �� �޸𸮻� �̸� �ö� 
	//������ static �� ���̰� �Ⱥ��̰� ���̸� �ƴ°��� �߿��մϴ�.
	//static�� �޼ҵ带 ���鶧�� get�� ���̴°��� �����ϱ� ���� 
	public static void getPrint() {
		System.out.println(name+ "�� ���̴� " + age+"�Դϴ�.");
	}
	
	Calendar now1 = Calendar.getInstance();
	Calendar now2 = Calendar.getInstance();
	Calendar now3 = Calendar.getInstance();
	
}
