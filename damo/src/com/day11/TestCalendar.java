package com.day11;

import java.util.Calendar;
import java.util.Scanner;


public class TestCalendar {

	public static void main(String[] args) {
	
		int year,month;
		int startDay,endDay;
		Calendar now = Calendar.getInstance();
		Scanner sc = new Scanner(System.in);
		
		year  = now.get(Calendar.YEAR);
		month = now.get(Calendar.MONTH)+1;
		
		System.out.println(year);
		System.out.println(month);
		
		System.out.print("바꿀 년도를 입력하세요  :");
		year =sc.nextInt();
		//year = Integer.parseInt(sc.nextLine());
		System.out.print("바꿀 월을입력하세요  :");
		month =sc.nextInt();
		//month = Integer.parseInt(sc.nextLine());		
		
		now.set(year,month-1,1);
		
		year  = now.get(Calendar.YEAR);
		month = now.get(Calendar.MONTH)+1;
		
		System.out.println(year);
		System.out.println(month);
		
		startDay = now.getMinimum(Calendar.DATE);
		endDay = now.getMaximum(Calendar.DATE);
		System.out.println(startDay);
		System.out.println(endDay);
		
	}

}
