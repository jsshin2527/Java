package excep;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExMain {

	public static void main(String[] args) {


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		OperationAuthenticator auth = new OperationAuthenticator();
		
		String str;
		double num1,num2,result;
		
		try {
			
			System.out.print("두수[a,b] ? "); //10,20
			str = br.readLine();
			auth.inputFormat(str);
			
			String[] temp = str.split(",");
			
			auth.number(temp[0]); //실수 정수 검증 
			num1 = Double.parseDouble(temp[0]);
			
			auth.number(temp[1]); //실수 정수 검증 
			num2 = Double.parseDouble(temp[0]);
			
			System.out.print("연산자 ? ");
			str =br.readLine();			
			auth.operator(str.charAt(0));
			
			char ch = str.charAt(0);
			result = 0;
			if(ch == '+') {
				result = num1 + num2;
			}else if(ch == '-') {
				result = num1 - num2;
			}else if(ch == '/') {
				result = num1/num2;
			}else if(ch == '*') {
				result = num1*num2;
			}
			System.out.printf("%g %c %g = %g \n" , num1,ch,num2,result);
			
		}catch(Exception e){
			System.out.println(e.toString());
		}
		

	}

}
