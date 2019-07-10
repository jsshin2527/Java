package com.day11;

public class String_toString {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer();
		
		sb.append("서울");
		sb.append("부산");
		sb.append("대구");
		sb.append("대전");

		System.out.println(sb);
		
		String str = sb.toString();
		
		System.out.println(str);
		
		//Integer
		int a = 24;
		System.out.println(a);
		System.out.println(Integer.toString(a)); //24      문자로 출력 
		System.out.println(Integer.toString(a,2));//11000 2진수 
		System.out.println(Integer.toString(a,16));//18   16진수 
 
	}	

}
