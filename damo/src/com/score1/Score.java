package com.score1;

import java.util.Scanner;

public class Score {
	
	int inwon;//inwon�̶�� ������ ������ �ϳ��� ���� �� ���� //int�� ������ ����� �ϳ���+-21���� ������ ���� �� �ִ�
	
	Record[] rec;//rec�� Record Ÿ�� 7���� �� ->// String name;  int[] score = new int[3]; int tot,avg,rank;
	           //Ŭ������ �ڷ����̴�. //rec[0].name=suzi//rec[0].score[1]=60//rec[2].
	           //Ŭ������ �ʱⰪ�� null
	Scanner sc = new Scanner(System.in);
	
	String[] title = {"����?","����?","����?"};
	
	public void set() {
		
		do { 
			
			System.out.print("�ο���?");
			
			inwon = sc.nextInt();
			
		}while(inwon<1||inwon>10);
		
		//�迭�� �޸� �Ҵ� 
		rec = new Record[inwon];
		
	}

	public void input() { 


		for(int i=0;i<inwon;i++) {
			rec[i] = new Record();//��ü����//���ڵ��� ��ü�� �����ؼ� �����͸� �־���

			System.out.print((i+1) + "��° �̸�?");
			rec[i].name = sc.next();

			for(int j=0;j<3;j++) {
				
				System.out.print(title[j]);
				rec[i].score[j] = sc.nextInt(); //������
				
				rec[i].tot += rec[i].score[j];//����
			

			}

			rec[i].avg = rec[i].tot / 3;//���
			
		}

	}
	private void ranking() {
		
		int i,j;
		
		//�ʱ�ȭ
		for(i=0;i<inwon;i++) {
			rec[i].rank = 1;
		}
		
		//�������ϱ�
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
		
		ranking();//�޼ҵ忡�� �޼ҵ带 ȣ���� �� �ִ�
		
		for(int i=0;i<inwon;i++) {
			
			System.out.printf("%10s",rec[i].name);//�̸�
			
			 for(int j=0;j<3;j++) {
				 System.out.printf("%4d",rec[i].score[j]);
				
			 }
			 
			 System.out.printf("%4d",rec[i].tot);
			 System.out.printf("%4d",rec[i].avg);
			 System.out.printf("%4d\n",rec[i].rank);
			
		}
		
	}
	

}