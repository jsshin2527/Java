package com.day5;
/*
 * 1���� 100���� ���� Ȧ���� ��, ¦���� ��, ��ü�� ���� ���ϴ� ���α׷� 
 */
public class OddSum_EvenSum_TotalSum {

	public static void main(String[] args) {
	
		int i;
		int totalsum=0; // ��ü ���� 
		int evensum=0; 	// ¦�� ����
		int oddsum=0;   // Ȧ�� ���� 
		
		int sum;
		totalsum = 0;
		
		//1~100 ���� ��ü ������ ���ϴ� for��
		for(i=0;i<=100;i++) {
			
			totalsum += i;
		}
		//1~100 ���� ¦�� ������ ���ϴ� for��
		for(i=0;i<=100;i+=2) {
			
			evensum += i;
		}
		//1~100 ���� Ȧ�� ������ ���ϴ� for��
		for(i=1;i<=100;i=i+2) {
			
			oddsum += i;
		}
		System.out.println("��ü�� �� " +totalsum);
		System.out.println("Ȧ���� �� " +oddsum);
		System.out.println("¦���� �� " +evensum);
		
	}
}
