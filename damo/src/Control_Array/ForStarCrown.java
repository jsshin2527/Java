//이중 For문을 활용하여 왕관 모양의 별찍기 프로그램 

package Control_Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForStarCrown {

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
