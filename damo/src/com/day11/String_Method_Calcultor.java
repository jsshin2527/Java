package com.day11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String_Method_Calcultor {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// InputStream �� ����Ʈ 2byte �� �ٲ� 
		// br�� ������ ���� 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//new InputStreamReader() �޸𸮿� �÷��� ������ �˾Ƽ� ������ �˴ϴ�. 
		//event : � ����� �߻��Ҷ����� �ൿ�� �� 
		System.out.print("����[3+5] ? "); //25+10, 2 5 + 1 0 
		String str = br.readLine();
		
		str = str.replaceAll("\\s","");//25+10
		/* new Ű���� ���� ���� 
		 * Ȯ�� for �� -> �迭�� ���̴� for�� format : for( ���� : �迭 )
		 * String[] op = {"+","-","*","/"};
		 * for (String oper : op) {}
		 * 
		 */
		
		
		for(String oper : new String[] {"+","-","*","/"}){
			//index ���� ��ȯ 
			int pos = str.indexOf(oper); // * inpute 2 �Է°��� ���ٸ� ���� ���� -1 �� ��ȯ�� �մϴ�. 
			// -1 : �����Ͱ� ������ ���� �˻��� �غ��� 
			if(pos > -1) {
				//substring = String���� �Ǿ� �ִ� ���ڿ��� �ɰ��ش� 
				int num1 = Integer.parseInt(str.substring(0,pos));
				int num2 = Integer.parseInt(str.substring(pos+1));
				int result = 0;				
				char operator = str.charAt(pos);
				// ���ϱ� ���� 
				
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

