package com.day5;

import java.util.*;
public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//만년 달력 
		Scanner sc = new Scanner(System.in);
		
		//월별 날수를 배열에 저장 
		int months[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		int y,m,nalsu,i,week;
		
		do {
			System.out.print("년도 : "); // 2019
			y = sc.nextInt();
		}while(y<1);
		
		do {
			System.out.print("월   : "); // 2019
			m = sc.nextInt();
		}while(m<1 || m>12);
		
		//윤년에 따른 2월의 날수 
		if(y%4==0 && y%100 != 0 || y%400 == 0) {
			months[1] = 29;
			
		}
		//1월1일 부터 현재년의 전월 12월31일까지 날수 
		nalsu = (y-1)*365+(y-1)/4 - (y-1)/100 + (y-1)/400;
		
		int year = (y-1)/4 - (y-1)/100 + (y-1)/400;
		//System.out.println(nalsu);
		//System.out.println(year);
		
		//index : { 0  1 2 3 4 5 6 7 8 9 10 11 12 }
		//nalsu : {31 28,31,30,31,30,31,31,30,31,30,31}
		for(i=0;i<m-1;i++) {
			
		}

	}

}
