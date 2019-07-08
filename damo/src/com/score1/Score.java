package com.score1;

import java.util.Scanner;

public class Score {
	
	int inwon;//inwon이라는 변수에 정수값 하나를 넣을 수 있음 //int로 변수를 만들면 하나의+-21억의 정수를 넣을 수 있다
	
	Record[] rec;//rec는 Record 타입 7개의 값 ->// String name;  int[] score = new int[3]; int tot,avg,rank;
	           //클래스는 자료형이다. //rec[0].name=suzi//rec[0].score[1]=60//rec[2].
	           //클래스의 초기값은 null
	Scanner sc = new Scanner(System.in);
	
	String[] title = {"국어?","영어?","수학?"};
	
	public void set() {
		
		do { 
			
			System.out.print("인원수?");
			
			inwon = sc.nextInt();
			
		}while(inwon<1||inwon>10);
		
		//배열의 메모리 할당 
		rec = new Record[inwon];
		
	}

	public void input() { 


		for(int i=0;i<inwon;i++) {
			rec[i] = new Record();//객체생성//레코드의 객체를 생성해서 테이터를 넣어줌

			System.out.print((i+1) + "번째 이름?");
			rec[i].name = sc.next();

			for(int j=0;j<3;j++) {
				
				System.out.print(title[j]);
				rec[i].score[j] = sc.nextInt(); //국영수
				
				rec[i].tot += rec[i].score[j];//총점
			

			}

			rec[i].avg = rec[i].tot / 3;//평균
			
		}

	}
	private void ranking() {
		
		int i,j;
		
		//초기화
		for(i=0;i<inwon;i++) {
			rec[i].rank = 1;
		}
		
		//석차구하기
		for(i=0;i<inwon-1;i++) {
			for(j=i+1;i<inwon;j++) {
				
				if(rec[i].tot>rec[j].tot) {
					
					rec[j].rank++;
					
				}else if(rec[i].tot<rec[j].tot) {
					
					rec[i].rank++;
					
				}
			}
			
		}
		
	}
	
	


	public void print() {
		
		ranking();//메소드에서 메소드를 호출할 수 있다
		
		for(int i=0;i<inwon;i++) {
			
			System.out.printf("%10s",rec[i].name);//이름
			
			 for(int j=0;j<3;j++) {
				 System.out.printf("%4d",rec[i].score[j]);
				
			 }
			 
			 System.out.printf("%4d",rec[i].tot);
			 System.out.printf("%4d",rec[i].avg);
			 System.out.printf("%4d\n",rec[i].rank);
			
		}
		
	}
	

}