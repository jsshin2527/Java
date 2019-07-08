package com.day6;

import java.util.Scanner;

public class YearMonthDayInput_OutputWeek {
	
	//년도,월,일을 입력받아 요일을 구해보자
	
	public static void main(String[] args) {	//1일때 월요일 2일때 화요일
		Scanner sc = new Scanner(System.in);
		//월별 날수를 배열에 저장
		int months[] = {31,28,31,30,31,30,31,31,30,31,30,31};//배열을 만들며 초기화 시키는 방법

		int y,m,d,nalsu,i,week;

		do {
			System.out.print("년도?");//2019
			y = sc.nextInt();
		}while(y<1);

		do {
			System.out.print("월?");//7
			m = sc.nextInt();			
		}while(m<1||m>12);

		if(y%4==0&&y%100!=0||y%400==0) {
			months[1] = 29;	
		}
		do {
			System.out.print("일?");//16
			d = sc.nextInt();			
		}while(m<1||m>months[m-1]);

		//윤년에 따른 2월의 날수
		//1년1월1일부터 전년도 12월31일까지의 날수
		nalsu = (y-1)*365 + (y-1)/4 - (y-1)/100 + (y-1)/400;//&&는+, ||는-
		for(i=0;i<m-1;i++) {
			nalsu+=months[i]; //nalsu=nalsu+months[i];
		}
		nalsu+=d;//y년m월 까지의 날수.
		week = nalsu%7;
		
		char yoil[] = {'일','월','화','수','목','금','토'};//배열로 바꿀 수 있다
		//String으로 {일요일, 월요일~ 
		System.out.printf("%d년 %d월 %d일 %c요일",y,m,d,yoil[week]);
		
		}	
	}
	

		


