package com.day11;

public class String_toString {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer();
		
		sb.append("����");
		sb.append("�λ�");
		sb.append("�뱸");
		sb.append("����");

		System.out.println(sb);
		
		String str = sb.toString();
		
		System.out.println(str);
		
		//Integer
		int a = 24;
		System.out.println(a);
		System.out.println(Integer.toString(a)); //24      ���ڷ� ��� 
		System.out.println(Integer.toString(a,2));//11000 2���� 
		System.out.println(Integer.toString(a,16));//18   16���� 
 
	}	

}
