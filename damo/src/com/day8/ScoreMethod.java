//[문제2]//스코어 만든것 + 수우미양가 옆에다 찍음 (랭킹자리 - 프라이빗)
//인원수를 입력 받아 인원수만큼 과목별 점수를 입력하고 각 과목별 판정을 하시오

package com.day8;

import java.util.Scanner;

public class ScoreMethod {
	
	int inwon;
	
	Record[] rec;
	
	Scanner sc = new Scanner(System.in);
	
	int i,j;
	
	String[] title = {"국어?","영어?","수학?"};
	
	public void set() {
		
		do {
			System.out.print("인원수?");
			inwon = sc.nextInt();
		}while(inwon<1||inwon>10);
		
		rec = new Record[inwon];
		
	}
	
	public void input() {
		
		for(i=0;i<inwon;i++) {
			rec[i] = new Record();
					
			System.out.print((i+1) + "번째 이름?");
			
			rec[i].name = sc.next();
		
			
			for(j=0;j<3;j++) {//국영수
				
				System.out.print(title[j]);
				rec[i].score[j] = sc.nextInt();
				
				rec[i].tot += rec[i].score[j];
				
			}
			
			rec[i].avg = rec[i].tot/3;
			
		}
		
		
	}
	
	private void evaluation() {//평가


		
		for(i=0;i<inwon;i++) {
			
			for(j=0;j<3;j++) {

				if(rec[i].score[j]>=90){
					rec[i].eva[j] ="수";
				}else if(rec[i].score[j]>=80){
					rec[i].eva[j]  ="우";
				}else if(rec[i].score[j]>=70){
					rec[i].eva[j]  ="미";
				}else if(rec[i].score[j]>=60){
					rec[i].eva[j]  ="양";
				}else {
					rec[i].eva[j]  ="가";
				}
			}
		}

	}

	public void print() {
		
		evaluation();
		
		for(int i=0;i<inwon;i++) {
			
			System.out.printf("%10s",rec[i].name);
			
			
			
			for(int j=0;j<3;j++) {
	//전지현 100(수) 100(수) 100(수) 300 100			
				System.out.printf("%4d (%s)",rec[i].score[j],rec[i].eva[j]);
			}
			System.out.printf("%4d",rec[i].tot);
			System.out.printf("%4d\n",rec[i].avg);
		}
		
		
	}
	

}
