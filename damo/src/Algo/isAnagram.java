package Algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class isAnagram {

	public static boolean isAnagram(String s , String t) {
		
		char[] a = s.toCharArray();
		char[] b = t.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);

		return Arrays.equals(a,b);
	}
	
	public static void main(String[] args) throws IOException {
		
		 
		
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		
		System.out.print("test1 문자열을 입력하세요 :");
		String test1 = br.readLine();
		System.out.print("test2 문자열을 입력하세요 :");
		String test2 = br.readLine();
		
		boolean flag = isAnagram(test1,test2);
		
		if(flag) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}

	}
}
