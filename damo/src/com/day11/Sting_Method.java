/*
 * String �� �޼ҵ� 
 * 
 */
package com.day11;

public class Sting_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String s1 = new String();
		String s1 = "����,�λ�,�뱸"; // String �� �迭 �ڵ� ���� 
		//String[] sarr = new String[3]; // String�� ������ 3���� ����ڴ�  
		String[] ss =s1.split(",");
		
		for (String s : ss) {
			System.out.println(s +" " );
		}
		String s2 = "seoul";
		String s3 = "Seoul";
		System.out.println(s2.equals(s3)); //�빮�� �ҹ��� �����ϱ� ������ ���� �ʽ��ϴ�. 
		System.out.println(s2.equalsIgnoreCase(s3)); //String�� equalsIgnoreCase() �޼ҵ�� �빮�� �ҹ��� ������� ���մϴ�. 
		
		String s4 = "abc.def.hij";
		//index 0123456789 
		//IndexOf Ư�����ڿ� �ε��� ��ȣ �� ã�ƶ�
		System.out.println(s4.indexOf(".")); //3 
		System.out.println(s4.lastIndexOf(".")); //7
		System.out.println(s4.indexOf("def")); //4
		System.out.println(s4.indexOf("x")); // -1 (����� �߿��� ���� -> �����͸� ������ ã�ٰ� ���ٸ� ǥ�� : -1
		
		String s5 = "�츮���� ���ѹα� �������� ���ѹα�";
		//���ڿ� ġȯ -> web ���� ���� ���� 
		String s6 = s5.replaceAll("����","����");
		System.out.println(s5);
		System.out.println(s6);
		String s7 = " a b c ";
		//������ ���ִ� 
		System.out.println(s7);
		System.out.println(s7.trim());
		//������ �� ������ 
		System.out.println(s7.replaceAll(" ",""));
		//������ ã�Ƽ� �� ������ 
		System.out.println(s7.replaceAll("\\s",""));
		
		//ab(c)�� �ִ� ���� ����� �ϼ��� 
		char ch = "abcdefg".charAt(2);
		//""�� String���� �ν��� �մϴ�. 
		System.out.println(ch);
		//abc�� �ִ� ���� String ���� ������ �ϴ� ?? 
		System.out.println("abcdefg".startsWith("abc")); //true 
		System.out.println("abcd efg".length()); // 8
		String s8 = "abcdefg";
		String s9 = "abceeeg";
		//������ ������ ����� �Ҷ� ���� 
		System.out.println(s8.compareTo(s9)); // s8 < s9 -1
		System.out.println(s9.compareTo(s8)); // s8 > s9  1
		// a 97 b 98 c 99 d 100 e 101 
		
		
	}
}
