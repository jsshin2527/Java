package com.day6;

import java.util.Scanner;

public class YearMonthDayInput_OutputWeek {
	
	//�⵵,��,���� �Է¹޾� ������ ���غ���
	
	public static void main(String[] args) {	//1�϶� ������ 2�϶� ȭ����
		Scanner sc = new Scanner(System.in);
		//���� ������ �迭�� ����
		int months[] = {31,28,31,30,31,30,31,31,30,31,30,31};//�迭�� ����� �ʱ�ȭ ��Ű�� ���

		int y,m,d,nalsu,i,week;

		do {
			System.out.print("�⵵?");//2019
			y = sc.nextInt();
		}while(y<1);

		do {
			System.out.print("��?");//7
			m = sc.nextInt();			
		}while(m<1||m>12);

		if(y%4==0&&y%100!=0||y%400==0) {
			months[1] = 29;	
		}
		do {
			System.out.print("��?");//16
			d = sc.nextInt();			
		}while(m<1||m>months[m-1]);

		//���⿡ ���� 2���� ����
		//1��1��1�Ϻ��� ���⵵ 12��31�ϱ����� ����
		nalsu = (y-1)*365 + (y-1)/4 - (y-1)/100 + (y-1)/400;//&&��+, ||��-
		for(i=0;i<m-1;i++) {
			nalsu+=months[i]; //nalsu=nalsu+months[i];
		}
		nalsu+=d;//y��m�� ������ ����.
		week = nalsu%7;
		
		char yoil[] = {'��','��','ȭ','��','��','��','��'};//�迭�� �ٲ� �� �ִ�
		//String���� {�Ͽ���, ������~ 
		System.out.printf("%d�� %d�� %d�� %c����",y,m,d,yoil[week]);
		
		}	
	}
	

		


