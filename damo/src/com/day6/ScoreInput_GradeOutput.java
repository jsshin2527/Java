//여기까지 day6 진도

package com.day6;

import java.util.Scanner;

public class ScoreInput_GradeOutput {
	
	public static void main(String[] args) {
		//10명 이내의 이름과 점수를 입력받아 석차구하기
		Scanner sc = new Scanner(System.in);
		String[] name;
		int[] score;
		int[] rank;
		
		int inwon,i,j,temp1,temp2;
		
		do {
			System.out.print("인원수?");
			inwon = sc.nextInt();
	
		}while(inwon<1||inwon>10);
		
		//배열의 메모리 할당. 객체생성
		name = new String[inwon];
		score = new int[inwon];
		rank = new int[inwon];
		
		for(i=0;i<inwon;i++) {
			
			System.out.print((i+1) + "번째 이름?");
			name[i] = sc.next();
			
			System.out.print("점수?");
			score[i] = sc.nextInt();
		}
		//초기화
		for(i=0;i<inwon-1;i++) {
			rank[i]=1;//rank[i]++
		}
		for(i=0;i<inwon;i++) {
			
			for(j=i+1;j<inwon;j++) {
				if(score[j]>score[j])
					rank[j]++;
				else if(score[i]<score[i])
					rank[i]++;
			}
		}
			//이름,점수,석차 출력
			for(i=0;i<inwon;i++) {
				System.out.printf("%10s &4d %4d%n",
						name[i],score[i],rank[i]);
			}
		}
	}
	


