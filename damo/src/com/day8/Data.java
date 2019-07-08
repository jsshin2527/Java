package com.day8;

import java.util.Calendar;

public class Data {

	static String  name = "수지";
	static int age = 25;
	
	//String  name = "수지";
	//int age = 25;
	
	/*
	public void print() {
		System.out.println(name+ "의 나이는 " + age+"입니다.");
	}
	*/
	
	
	//static 은 메모리상에 미리 올라감 
	//변수에 static 를 붙이고 안붙이고 차이를 아는것이 중요합니다.
	//static의 메소드를 만들때는 get을 붙이는것이 구분하기 좋다 
	public static void getPrint() {
		System.out.println(name+ "의 나이는 " + age+"입니다.");
	}
	
	Calendar now1 = Calendar.getInstance();
	Calendar now2 = Calendar.getInstance();
	Calendar now3 = Calendar.getInstance();
	
}
