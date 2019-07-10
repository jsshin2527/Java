package com.day11;

import java.util.Calendar;
import java.util.Scanner;

class CalenderPrint{
	
}


public class A_lunar_Calendar {

	public static void main(String[] args) {

		int year=0;
		int month=0;
		int day=0;
		int week = 0;
		int weekblank;
		Calendar now = Calendar.getInstance();
		int months[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		Scanner sc = new Scanner(System.in);
		
		do {
		System.out.print("년도를 입력하세요 : 년도는 1이상의 숫자이여야합니다. : ");
		year = sc.nextInt();
		
		}while(year<1);
		
		do {	
			System.out.print("월도를 입력하세요 : 월은 1~12 사이의 숫자입니다. : ");
			month = sc.nextInt();
		}while(month>12 || month<1);
		
		//now.set(year,month-1,1);
		now.set(year,month-1,1);
		
		year  = now.get(Calendar.YEAR);
		month = now.get(Calendar.MONTH)+1;
		day   = now.get(Calendar.DATE);
		week  = now.get(Calendar.DAY_OF_WEEK);//week 주의수 (1~7)
		
		weekblank = week-1; //??
		
		//System.out.println("week :"+week);
		//System.out.println("weekblank :"+weekblank);
		
		int startDay = now.getActualMinimum(Calendar.DATE);
		int endDay = now.getActualMaximum(Calendar.DATE);
		
		System.out.println(year+"년도"+month+"월 첫번째 일 :"+startDay);
		System.out.println(year+"년도"+month+"월 마지막 일 :"+endDay);
		
		String[] weekDay = {"일","월","화","수","목","금","토"};			
		System.out.println("선택 년도 :"+year);
		System.out.println("선택 월 :"  +month);
		System.out.println("선택 일 :"  +day);
		System.out.println("요일 : "+weekDay[(week-1)]+"요일");
		System.out.println("\n  일  월  화  수  목  금  토");
		System.out.println("------------------------------");
	
		/*
		if(year%4==0 && year%100!=0||year%400==0) {
			months[1]=29;
		}
		*/
		
		//요일 공백 생성
		for (int i=0; i<weekblank;i++) {
			System.out.print("    ");
		}
		//일자출력 
		for (int i=1; i<=endDay;i++) {
			System.out.printf("%4d",i);
			weekblank++;
			if(weekblank%7==0) {
				System.out.println();	
			}
		}
		System.out.println();
		System.out.println("------------------------------");	
	}
}
