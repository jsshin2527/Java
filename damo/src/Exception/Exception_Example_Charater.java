//5~10자 이내의 문자열을 입력받아 출력 
//대소문자 구분 안함 
//문자열 입력해라 ? abc 
//문자열의 길이는 5~10자 자 입니다. 
//문자열 ? abc1, 123 
//영문자만 가능합니다 .

package Exception;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exception_Example_Charater {

	
	public static String getchar() {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		try {
			
			String str = null;
			
			System.out.print("문자열을 입력하세요 : ");
			
			str = br.readLine();
			char ch = 0;
			
			for (int i = 0; i < str.length(); i++) {
				 ch = str.charAt(i);
			}
			
			for (int i = 0; i < str.length(); i++) {
				System.out.println(ch);
			}			
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
		 
		
		try {
			
			System.out.print("문자열을 입력하세요 : ");
			
			
			String str = null;
			for(int i = 0;i<str.length();i++) {
				
				char ch = str.charAt(i);
			
		
			
			if(((ch<65) || (ch>90)) && ((ch<97) || (ch>122))) {
				
				}
			}
			
			//문자열의 길이가 5보다 작고 10보다 크면 error를 표시해 줍니다. 
			
			if(true) {
				throw new Exception("문자열이 5보다 작거나 10보다 큽니다. ");
			
			}
			
	
		
		} catch (Exception e) {
			System.out.println("문자열이 5보다 작거나 10보다 큽니다. ");
		}
		
		return null;
	}
	
	public static void main(String[] args) {

		Exception_Example_Charater ex = new Exception_Example_Charater();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String checkcharter;
		
		try {
		
			//checkcharter = br.readLine();
			
			//checkcharter = Exception_Example_Charater.getchar();
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}
	
}
