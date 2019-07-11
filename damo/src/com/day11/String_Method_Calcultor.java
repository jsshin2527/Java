package com.day11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String_Method_Calcultor {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// InputStream 는 바이트 2byte 로 바꿈 
		// br은 번지수 저장 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//new InputStreamReader() 메모리에 올려만 놓으면 알아서 실행이 됩니다. 
		//event : 어떤 사건이 발생할때마다 행동을 함 
		System.out.print("수식[3+5] ? "); //25+10, 2 5 + 1 0 
		String str = br.readLine();
		
		str = str.replaceAll("\\s","");//25+10
		/* new 키워드 숨겨 있음 
		 * 확장 for 문 -> 배열에 쓰이는 for문 format : for( 변수 : 배열 )
		 * String[] op = {"+","-","*","/"};
		 * for (String oper : op) {}
		 * 
		 */
		
		
		for(String oper : new String[] {"+","-","*","/"}){
			//index 으로 반환 
			int pos = str.indexOf(oper); // * inpute 2 입력값이 없다면 예외 값은 -1 로 반환을 합니다. 
			// -1 : 데이터가 있을때 까지 검색을 해봐라 
			if(pos > -1) {
				//substring = String으로 되어 있던 문자열을 쪼개준다 
				int num1 = Integer.parseInt(str.substring(0,pos));
				int num2 = Integer.parseInt(str.substring(pos+1));
				int result = 0;				
				char operator = str.charAt(pos);
				// 더하기 연산 
				
				switch(operator) {
				case '+' : 
					result = num1+num2;break;
				case '-' : 
					result = num1-num2;break;
				case '*' : 
					result = num1*num2;break;
				case '/' : 
					result = num1/num2;break;				
				}
				//System.out.printf("%d %c %d = %d",num1,operator,num2,result);
				String s = String.format("%d %c %d = %d",num1,operator,num2,result);
				System.out.println(s);
			}
		}
	}
}

