package Exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//예외 강제 발생 
//에러를 의도적으로 발생 


public class Exception_IOException {
	
	public static String getOper() throws Exception {
		
		BufferedReader br = new BufferedReader ( new InputStreamReader(System.in));
		
		String oper = null;
		
		try {
			
			System.out.print("연산자 ? ");
			oper = br.readLine();
			
			if(!oper.equals("+") &&!oper.equals("-")&&!oper.equals("/")&&!oper.equals("*")) {
				
				//의도적으로 에러를 발생합니다. 
				throw new Exception("연산자 오류 ");
			}
		
		}catch(IOException e){
			System.out.println("틀린 연산자 !! ");
		}
		
		return oper;
		
	}
	
	
	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader ( new InputStreamReader(System.in));
		
		int num1,num2,result=0;
		
		String oper;
		
		try {
		
		System.out.print("첫번째수 ");
		num1 = Integer.parseInt(br.readLine());
		System.out.print("두번째수 ");
		num2 = Integer.parseInt(br.readLine());
		
		//연산자 
		//자바는 반환값을 안받을수도 있다 
		
		oper = Exception_IOException.getOper();
		
		if(oper.equals("+")) {
			result=num1+num2;
		}else if(oper.equals("-")){
			result=num1-num2;
		}else if(oper.equals("*")){
			result=num1*num2;
		}else if(oper.equals("/")){
			result=num1/num2;
		}
		
		System.out.printf("%d %s %d = %d",num1,oper,num2,result);
		}catch (Exception e){
			System.out.println(e.toString());
			System.out.println("연산자값이 잘못 되었습니다. ");
			
		}
	}

}
