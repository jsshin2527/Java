package com.day6;

import java.util.Scanner;

public class Selection_Sort_Example {
	
	public static void main(String[] args) {
		
		//10�� �̳��� �̸��� ������ �Է� �޾� 
		//������ ������� ������ ���
		Scanner sc = new Scanner(System.in);	
		//���� �Ѱ� ����
		String[] name;
		int[] score;
		//�ʿ��� ��������
		int inwon,i,j,temp1;
		String temp2;	
		do {
			System.out.print("�ο���?[1~10] ");//3
			inwon = sc.nextInt();			
		}while(inwon<1|inwon>10);
		//�迭�� ��ü ����(�迭�� �޸𸮸� �Ҵ�) //�����Ѱ��� ������
		name = new String[inwon];
		score = new int[inwon];
		for(i=0;i<inwon;i++) {
		System.out.print((i+1) + "��° �̸�?");
		name[i] = sc.next();
		System.out.print("����?");
		score[i] = sc.nextInt();
		
		}
		//����
		//Selection sort
		for(i=0;i<inwon-1;i++) {
			for(j=i+1;j<inwon;j++) {
				
				if(score[i]<score[j]) {
					
					temp1=score[i];
					score[i]=score[j];
					score[j]=temp1;
					
					temp2 = name[i];
					name[i] = name[j];
					name[j] = temp2;			
				}
			}		
		}
		//���
		for(i=0;i<inwon;i++) {
			System.out.printf("%10s %4d\n",name[i],score[i]);		
		}
	}
}
