//������� day6 ����

package com.day6;

import java.util.Scanner;

public class ScoreInput_GradeOutput {
	
	public static void main(String[] args) {
		//10�� �̳��� �̸��� ������ �Է¹޾� �������ϱ�
		Scanner sc = new Scanner(System.in);
		String[] name;
		int[] score;
		int[] rank;
		
		int inwon,i,j,temp1,temp2;
		
		do {
			System.out.print("�ο���?");
			inwon = sc.nextInt();
	
		}while(inwon<1||inwon>10);
		
		//�迭�� �޸� �Ҵ�. ��ü����
		name = new String[inwon];
		score = new int[inwon];
		rank = new int[inwon];
		
		for(i=0;i<inwon;i++) {
			
			System.out.print((i+1) + "��° �̸�?");
			name[i] = sc.next();
			
			System.out.print("����?");
			score[i] = sc.nextInt();
		}
		//�ʱ�ȭ
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
			//�̸�,����,���� ���
			for(i=0;i<inwon;i++) {
				System.out.printf("%10s &4d %4d%n",
						name[i],score[i],rank[i]);
			}
		}
	}
	


