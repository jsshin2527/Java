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
		
		System.out.print("ù��° �� �Է� : ");
		num1 = sc.nextInt();
		System.out.print("�ι�° �� �Է� : ");
		num2 = sc.nextInt();
		System.out.print("������[+,/,-,*] ? : ");
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
			System.out.println("������[+,/,-,*]�� �߸� �Է��Ͽ����ϴ� .");
		}
			System.out.printf("\n%d%c%d=%d",num1,oper,num2,result);
	}

}
