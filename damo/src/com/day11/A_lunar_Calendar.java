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
		System.out.print("�⵵�� �Է��ϼ��� : �⵵�� 1�̻��� �����̿����մϴ�. : ");
		year = sc.nextInt();
		
		}while(year<1);
		
		do {	
			System.out.print("������ �Է��ϼ��� : ���� 1~12 ������ �����Դϴ�. : ");
			month = sc.nextInt();
		}while(month>12 || month<1);
		
		//now.set(year,month-1,1);
		now.set(year,month-1,1);
		
		year  = now.get(Calendar.YEAR);
		month = now.get(Calendar.MONTH)+1;
		day   = now.get(Calendar.DATE);
		week  = now.get(Calendar.DAY_OF_WEEK);//week ���Ǽ� (1~7)
		
		weekblank = week-1; //??
		
		//System.out.println("week :"+week);
		//System.out.println("weekblank :"+weekblank);
		
		int startDay = now.getActualMinimum(Calendar.DATE);
		int endDay = now.getActualMaximum(Calendar.DATE);
		
		System.out.println(year+"�⵵"+month+"�� ù��° �� :"+startDay);
		System.out.println(year+"�⵵"+month+"�� ������ �� :"+endDay);
		
		String[] weekDay = {"��","��","ȭ","��","��","��","��"};			
		System.out.println("���� �⵵ :"+year);
		System.out.println("���� �� :"  +month);
		System.out.println("���� �� :"  +day);
		System.out.println("���� : "+weekDay[(week-1)]+"����");
		System.out.println("\n  ��  ��  ȭ  ��  ��  ��  ��");
		System.out.println("------------------------------");
	
		/*
		if(year%4==0 && year%100!=0||year%400==0) {
			months[1]=29;
		}
		*/
		
		//���� ���� ����
		for (int i=0; i<weekblank;i++) {
			System.out.print("    ");
		}
		//������� 
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
