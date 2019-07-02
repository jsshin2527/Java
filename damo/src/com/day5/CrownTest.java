package com.day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//왕관 별찍기 


public class CrownTest {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		int n;
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		System.out.print("*의 개수를 입력하세요 : ");
		//System.out.println("");
		
		n = Integer.parseInt(br.readLine());
		
		for(int i =0;i<n;i++) {
			for(int j =0;j<n;j++) {
				System.out.print(" ");
			}
			for(int j =0;j<n-1;j++) {
				System.out.print(" ");
			}
			for(int j =0;j<n-i-1;j++) {
				System.out.print(" ");
			}
			for(int j =0;j<i+1;j++) {
				System.out.print("*");
			}
			for(int j =0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i =0;i<n;i++) {
			for(int j =0;j<i;j++) {
				System.out.print("*");
			}
			for(int j =0;j<n-i-1;j++) {
				System.out.print(" ");
			}
			for(int j =0;j<n-i-1;j++) {
				System.out.print(" ");
			}
			for(int j =0;j<n;j++) {
				System.out.print("*");
			}
			for(int j =0;j<n;j++) {
				System.out.print("*");
			}
			for(int j =0;j<i;j++) {
				System.out.print("*");
			}
			for(int j =0;j<i+1;j++) {
				System.out.print("*");
			}
			for(int j =0;j<n-i-1;j++) {
				System.out.print(" ");
			}
			for(int j =0;j<n-i-1;j++) {
				System.out.print(" ");
			}
			for(int j =0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
