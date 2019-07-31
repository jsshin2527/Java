package Control_Array;

import java.io.IOException;
import java.util.Scanner;

import Scanner.Scanner_Odd_Even;

public class Switch_Example_Calcultor {

	public static void main(String[] args) throws IOException {
		
		Scanner_Odd_Even ex1 = new Scanner_Odd_Even();
		
		
		
		Scanner sc = new Scanner(System.in);
		
		int num1,num2;
		char oper;
		
		System.out.print("첫번째 수 입력 : ");
		num1 = sc.nextInt();
		System.out.print("두번째 수 입력 : ");
		num2 = sc.nextInt();
		System.out.print("연산자[+,/,-,*] ? : ");
		oper = (char) System.in.read();
		System.in.skip(2);
		
		int result =0;
		switch(oper) {
		case '+' : 
			result = num1+num2;
			System.out.println(num1+"+"+num2+"="+(num1+num2));
			System.out.printf("%d%c%d=%d",num1,oper,num2,(num1+num2));
			break;
							
		case '-' : 
			result = num1-num2;
			System.out.println(num1+"-"+num2+"="+(num1-num2));
			System.out.printf("%d%c%d=%d",num1,oper,num2,(num1-num2));
			break;
		
		case '*' :
			result = num1*num2;
			System.out.println(num1+"*"+num2+"="+(num1*num2));
			System.out.printf("%d%c%d=%d",num1,oper,num2,(num1*num2));
			break;
		
		case '/' : 
			result = num1/num2;
			System.out.println(num1+"/"+num2+"="+(num1/num2));
			System.out.printf("%d%c%d=%d",num1,oper,num2,(num1/num2));
			break;
		default :
			System.out.println("연산자[+,/,-,*]를 잘못 입력하였습니다 .");
		}
			System.out.printf("\n%d%c%d=%d",num1,oper,num2,result);
	}

}
