package com.score2;

import java.util.Scanner;

public class ScoreImpl implements Score{

	private int inwon;
	
	private Record[] rec;
	
	Scanner sc = new Scanner(System.in);
	@Override
	public void set() {
	
		do {		
			System.out.print("인원수 ");
			inwon = sc.nextInt();
			
		}while(inwon<1||inwon>10);
		
		rec = new Record[inwon];
	}
	
	@Override
	public void input() {
	
		for (int i=0; i<inwon; i++) {
			
			rec[i] = new Record(); //Record의 객체 생성 
			System.out.print("학번 :");
			rec[i].hak  = sc.next();
			
			System.out.print("이름 :");
			rec[i].name = sc.next();
			
			System.out.print("국어 :");
			rec[i].kor = sc.nextInt();
			
			System.out.print("영어 :");
			rec[i].eng = sc.nextInt();
			
			System.out.print("수학:");
			rec[i].mat = sc.nextInt();
			
			rec[i].tot = (rec[i].kor+rec[i].eng+rec[i].mat);
			rec[i].avg = rec[i].tot/3;
		}
	}	
	private String panjung(int score) {
		
		String pan = "";
		
		switch(score/10) {
		
		case (10) :
		case (9) :
			pan = "수"; break;
		case (8) :
			pan = "우"; break;
		case (7) :
			pan = "미"; break;
		case (6) :
			pan = "양"; break;
		default : 
			pan = "가"; break;
		}
		return pan;
	}
	@Override
	public void print() {	
		// 111 suzi  10  10  30  10 
		//          (가)(가)(가)(가) 
		
		for (int i = 0; i < inwon; i++) {	
			System.out.printf("%s %s %d(%s) %d(%s) %d(%s) \n",rec[i].hak,rec[i].name
														,rec[i].kor,panjung(rec[i].kor)
														,rec[i].eng,panjung(rec[i].eng)
														,rec[i].mat,panjung(rec[i].mat)
														,rec[i].tot,rec[i].avg);			
		}
	}
}
