package com.day5;

import java.util.Scanner;

public class Calender_Example {

	public static void main(String[] args) {
		//����޷�
		Scanner sc = new Scanner(System.in);
		//���� ������ �迭�� ����
		int months[] = {31,28,31,30,31,30,31,31,30,31,30,31};//�迭�� ����� �ʱ�ȭ ��Ű�� ���
		int y,m,nalsu,i,week;
		do {
			System.out.print("�⵵?");//2019
			y = sc.nextInt();
		}while(y<1);
		do {
			System.out.print("��?");//7
			m = sc.nextInt();			
		}while(m<1||m>12);
		//���⿡ ���� 2���� ����
		if(y%4==0&&y%100!=0||y%400==0) {
			months[1] = 29;
		}
		//1��1��1�Ϻ��� ���⵵ 12��31�ϱ����� ����
		nalsu = (y-1)*365 + (y-1)/4 - (y-1)/100 + (y-1)/400;//&&��+, ||��-
		/*		
		int yun = (y-1)/4 - (y-1)/100 + (y-1)/400;
		System.out.println(nalsu);
		System.out.println(yun);
		 */		
		//index : 0  1  2  3  4  5  6  7  8  9  10 11 �迭
		//���� :  31,28,31,30,31,30,31,31,30,31,30,31
		//�� :    1  2  3  4  5  6  7  8  9  10 11 12
		//m-1�� ���ϱ����� ���� (7���̸� 6�� 30�� ����)
		for(i=0;i<m-1;i++) {
			nalsu+=months[i]; //nalsu=nalsu+months[i];
		}
		nalsu+=1;//y��m�� ������ ����
		//���� ��
		week = nalsu%7;
		//System.out.println(week);
		System.out.println("\n  ��  ��  ȭ  ��  ��  ��  ��");
		System.out.println("------------------------------");
		//�������
		for(i=0;i<week;i++) {
			System.out.print("    ");//����4ĭ
		}	
		//�ش� �� ���
		for(i=1;i<=months[m-1];i++) {
			System.out.printf("%4d",i);//����(2byte)+�ѱ�(2byte) = 4d
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

//���ǽ��� ���� 2019-07-01 ������ �Ϲ� 43647(1900����� ������ ����) 1��1�� ���ʹ� 737225
//���� ���� ������ ǥ���Ѵ�
