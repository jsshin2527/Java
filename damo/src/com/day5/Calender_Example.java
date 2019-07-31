package com.day5;

import java.util.Scanner;

public class Calender_Example {

	public static void main(String[] args) {
		//만년달력
		Scanner sc = new Scanner(System.in);
		//월별 날수를 배열에 저장
		int months[] = {31,28,31,30,31,30,31,31,30,31,30,31};//배열을 만들며 초기화 시키는 방법
		int y,m,nalsu,i,week;
		do {
			System.out.print("년도?");//2019
			y = sc.nextInt();
		}while(y<1);
		do {
			System.out.print("월?");//7
			m = sc.nextInt();			
		}while(m<1||m>12);
		//윤년에 따른 2월의 날수
		if(y%4==0&&y%100!=0||y%400==0) {
			months[1] = 29;
		}
		//1년1월1일부터 전년도 12월31일까지의 날수
		nalsu = (y-1)*365 + (y-1)/4 - (y-1)/100 + (y-1)/400;//&&는+, ||는-
		/*		
		int yun = (y-1)/4 - (y-1)/100 + (y-1)/400;
		System.out.println(nalsu);
		System.out.println(yun);
		 */		
		//index : 0  1  2  3  4  5  6  7  8  9  10 11 배열
		//날수 :  31,28,31,30,31,30,31,31,30,31,30,31
		//월 :    1  2  3  4  5  6  7  8  9  10 11 12
		//m-1월 말일까지의 날수 (7월이면 6월 30일 까지)
		for(i=0;i<m-1;i++) {
			nalsu+=months[i]; //nalsu=nalsu+months[i];
		}
		nalsu+=1;//y년m월 까지의 날수
		//주의 수
		week = nalsu%7;
		//System.out.println(week);
		System.out.println("\n  일  월  화  수  목  금  토");
		System.out.println("------------------------------");
		//공백출력
		for(i=0;i<week;i++) {
			System.out.print("    ");//공백4칸
		}	
		//해당 월 출력
		for(i=1;i<=months[m-1];i++) {
			System.out.printf("%4d",i);//공백(2byte)+한글(2byte) = 4d
			week++;
			if(week%7==0) {
				System.out.println();
			}
		}
		if(week%7!=0) {
			System.out.println();
		}
		System.out.println("------------------------------");
	}
}

//오피스의 엑셀 2019-07-01 셀서식 일반 43647(1900년부터 날수를 셌음) 1년1월 부터는 737225
//엑셀 역시 날수로 표시한다
