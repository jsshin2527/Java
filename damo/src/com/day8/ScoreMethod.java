//[����2]//���ھ� ����� + ����̾簡 ������ ���� (��ŷ�ڸ� - �����̺�)
//�ο����� �Է� �޾� �ο�����ŭ ���� ������ �Է��ϰ� �� ���� ������ �Ͻÿ�

package com.day8;

import java.util.Scanner;

public class ScoreMethod {
	
	int inwon;
	
	Record[] rec;
	
	Scanner sc = new Scanner(System.in);
	
	int i,j;
	
	String[] title = {"����?","����?","����?"};
	
	public void set() {
		
		do {
			System.out.print("�ο���?");
			inwon = sc.nextInt();
		}while(inwon<1||inwon>10);
		
		rec = new Record[inwon];
		
	}
	
	public void input() {
		
		for(i=0;i<inwon;i++) {
			rec[i] = new Record();
					
			System.out.print((i+1) + "��° �̸�?");
			
			rec[i].name = sc.next();
		
			
			for(j=0;j<3;j++) {//������
				
				System.out.print(title[j]);
				rec[i].score[j] = sc.nextInt();
				
				rec[i].tot += rec[i].score[j];
				
			}
			
			rec[i].avg = rec[i].tot/3;
			
		}
		
		
	}
	
	private void evaluation() {//��


		
		for(i=0;i<inwon;i++) {
			
			for(j=0;j<3;j++) {

				if(rec[i].score[j]>=90){
					rec[i].eva[j] ="��";
				}else if(rec[i].score[j]>=80){
					rec[i].eva[j]  ="��";
				}else if(rec[i].score[j]>=70){
					rec[i].eva[j]  ="��";
				}else if(rec[i].score[j]>=60){
					rec[i].eva[j]  ="��";
				}else {
					rec[i].eva[j]  ="��";
				}
			}
		}

	}

	public void print() {
		
		evaluation();
		
		for(int i=0;i<inwon;i++) {
			
			System.out.printf("%10s",rec[i].name);
			
			
			
			for(int j=0;j<3;j++) {
	//������ 100(��) 100(��) 100(��) 300 100			
				System.out.printf("%4d (%s)",rec[i].score[j],rec[i].eva[j]);
			}
			System.out.printf("%4d",rec[i].tot);
			System.out.printf("%4d\n",rec[i].avg);
		}
		
		
	}
	

}
