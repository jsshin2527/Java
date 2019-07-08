package com.day6;

import java.util.Scanner;

public class Selection_Sort_Example {
	
	public static void main(String[] args) {
		
		//10명 이내의 이름과 점수를 입력 받아 
		//점수가 높은사람 순으로 출력
		Scanner sc = new Scanner(System.in);	
		//선언 한것 정의
		String[] name;
		int[] score;
		//필요한 변수생성
		int inwon,i,j,temp1;
		String temp2;	
		do {
			System.out.print("인원수?[1~10] ");//3
			inwon = sc.nextInt();			
		}while(inwon<1|inwon>10);
		//배열의 객체 생성(배열의 메모리를 할당) //선언한것을 생성함
		name = new String[inwon];
		score = new int[inwon];
		for(i=0;i<inwon;i++) {
		System.out.print((i+1) + "번째 이름?");
		name[i] = sc.next();
		System.out.print("점수?");
		score[i] = sc.nextInt();
		
		}
		//연산
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
		//출력
		for(i=0;i<inwon;i++) {
			System.out.printf("%10s %4d\n",name[i],score[i]);		
		}
	}
}
