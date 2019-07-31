
package Exception;

import java.util.Scanner;

public class Try_Catch {

	public static void main(String[] args) {

		int num1,num2,result;
		String oper;
		
		Scanner sc = new Scanner(System.in);
		
		try {
			//어디서든 에러가 난다면 catch 로 갑니다. 
			
			System.out.print("두개의 수 ? : "); //30 20 
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			
			System.out.print("연산자 ");
			oper = sc.next();
			
			result = 0;
			
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
		}catch (NumberFormatException e){
			System.out.println("정수를 입력하세요");
		}catch (Exception e) {
			//System.out.println(e.toString());
			//e.printStackTrace();
			System.out.println("숫자를 입력하세요");
		}finally{
			//항상 실행 
			System.out.println("\n난 항상 보인다 ");
		}
	}	
}
