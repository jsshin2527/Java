/*
 * String 의 메소드 
 * 
 */
package com.day11;

public class Sting_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String s1 = new String();
		String s1 = "서울,부산,대구"; // String 의 배열 자동 생성 
		//String[] sarr = new String[3]; // String의 데이터 3개를 만들겠다  
		String[] ss =s1.split(",");
		
		for (String s : ss) {
			System.out.println(s +" " );
		}
		String s2 = "seoul";
		String s3 = "Seoul";
		System.out.println(s2.equals(s3)); //대문자 소문자 구분하기 때문에 같지 않습니다. 
		System.out.println(s2.equalsIgnoreCase(s3)); //String의 equalsIgnoreCase() 메소드는 대문자 소문자 상관없이 비교합니다. 
		
		String s4 = "abc.def.hij";
		//index 0123456789 
		//IndexOf 특정문자에 인덱스 번호 를 찾아라
		System.out.println(s4.indexOf(".")); //3 
		System.out.println(s4.lastIndexOf(".")); //7
		System.out.println(s4.indexOf("def")); //4
		System.out.println(s4.indexOf("x")); // -1 (양수값 중에는 없다 -> 데이터를 무엇가 찾다가 없다면 표시 : -1
		
		String s5 = "우리나라 대한민국 좋은나라 대한민국";
		//문자열 치환 -> web 에서 많이 쓰임 
		String s6 = s5.replaceAll("대한","大韓");
		System.out.println(s5);
		System.out.println(s6);
		String s7 = " a b c ";
		//공백을 없애다 
		System.out.println(s7);
		System.out.println(s7.trim());
		//공백을 다 지워라 
		System.out.println(s7.replaceAll(" ",""));
		//공백을 찾아서 다 지워라 
		System.out.println(s7.replaceAll("\\s",""));
		
		//ab(c)에 있는 값을 출력을 하세요 
		char ch = "abcdefg".charAt(2);
		//""은 String으로 인식을 합니다. 
		System.out.println(ch);
		//abc에 있는 값이 String 으로 시작을 하니 ?? 
		System.out.println("abcdefg".startsWith("abc")); //true 
		System.out.println("abcd efg".length()); // 8
		String s8 = "abcdefg";
		String s9 = "abceeeg";
		//사전식 정렬을 사용을 할때 정렬 
		System.out.println(s8.compareTo(s9)); // s8 < s9 -1
		System.out.println(s9.compareTo(s8)); // s8 > s9  1
		// a 97 b 98 c 99 d 100 e 101 
		
		
	}
}
