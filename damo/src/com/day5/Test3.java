package com.day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int i,j,n;
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		System.out.print("*�� ������ �Է��ϼ��� : ");
		//System.out.println("");
		
		n = Integer.parseInt(br.readLine());
		
		for(i=1;i<=n;i++) {
			for(j=1;j<=i-1;j++){
				System.out.print(" ");//���� ��ĭ 
			}
			//for(j=1;j<=n-1;j++){
			//	System.out.print("*");//���� ��ĭ 
			//}
			for(j=1;j<=n-i;j++){
				System.out.print("*"); 
			}
			for(j=1;j<=n-i+1;j++){
				System.out.print("*"); 
			}
			System.out.println();
		
		}
		for(i=1;i<=n;i++) {
			for(j=1;j<=n-i;j++){
				System.out.print(" ");//���� ��ĭ 
			}
			//for(j=1;j<=n-1;j++){
			//	System.out.print("*");//���� ��ĭ 
			//}
			for(j=1;j<=i;j++){
				System.out.print("*");//���� ��ĭ 
			}
			for(j=1;j<=i-1;j++){
				System.out.print("*");//���� ��ĭ 
			}
			System.out.println();
		
		}
		/*
		for(i=1;i<n;i++) {
			for(j=1;j<=n-i;j++){
				System.out.print(" ");//���� ��ĭ 
			}
			for(j=1;j<=n-1;j++){
				System.out.print("*");//���� ��ĭ 
			}
			for(j=1;j<i;j++){
				System.out.print("*");//���� ��ĭ 
			}
			System.out.println();
			}
			for(i=1;i<n;i++) {
			for(j=1;j<=n-i;j++){
				System.out.print(" ");//���� ��ĭ 
			}
			for(j=1;j<=n-1;j++){
				System.out.print("*");//���� ��ĭ 
			}
			for(j=1;j<i;j++){
				System.out.print("*");//���� ��ĭ 
			}
			System.out.println();
			}
		*/
		
	//�ﰢ�� 
	//���ﰢ��	
	//�𷡽ð� ����� 
	
	}

}
