package com.day5;

import java.util.*;
public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//���� �޷� 
		Scanner sc = new Scanner(System.in);
		
		//���� ������ �迭�� ���� 
		int months[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		int y,m,nalsu,i,week;
		
		do {
			System.out.print("�⵵ : "); // 2019
			y = sc.nextInt();
		}while(y<1);
		
		do {
			System.out.print("��   : "); // 2019
			m = sc.nextInt();
		}while(m<1 || m>12);
		
		//���⿡ ���� 2���� ���� 
		if(y%4==0 && y%100 != 0 || y%400 == 0) {
			months[1] = 29;
			
		}
		//1��1�� ���� ������� ���� 12��31�ϱ��� ���� 
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
