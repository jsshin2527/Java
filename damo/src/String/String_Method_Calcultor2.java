/*
 * 숫자 2개와 연산자를 따로 입력을 받아 결과 값을 반환하는 프로그램 
 * 두수 [5,2] = 5,2
 * 연산자 = +
 * 결과값 값 5+2 =7
 */

package String;

import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

class Input{
	
	protected String r;
	 
	public Input() {}

	public Input(String r) {
		this.r = r;
	}
	//공백 없애기 
	public String blank(String r) {
		return r.replaceAll("\\s","");
	}
	public void println(String r) {
		System.out.println(r);
	}
}
class Calc extends Input{
	
	private int num1;
	private int num2;
	private int comma;
	private char operator;
	
	public Calc() {};
	
	public Calc(char operator,int num1,int num2,String r) {
		this.r = super.r;
		this.num1 = num1;	
		this.num2 = num2;
		this.operator = operator;
	}
	public int numberDivde1(String r,int num1){
		comma = r.indexOf(",");
		
		if(comma > -1) {
			num1 = Integer.parseInt(r.substring(0,comma));	
		}
		return num1;
	}
	public int numberDivde2(String r,int num1){
		comma = r.indexOf(",");
		
		if(comma > -1) {
			num2 = Integer.parseInt(r.substring(comma+1));	
		}
		return num2;
	}
	
	public int Calcultor(int num1,int num2,int operator) {
		
		int result = 0;
		
		switch(operator) {
		
		case '+' :
			result = num1+num2; break;
		case '-' :
			result = num1-num2; break;
		case '*' :
			result = num1*num2; break;
		case '/' :
			result = num1/num2; break;
		default :
			result = -1;
		}
		return result;
	}	
}
public class String_Method_Calcultor2 {

	public static void main(String[] args) throws IOException {
	
		int num1=0,num2=0,result;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("두수를 입력하세요 ex) 5,3 : ");
		
		String r = br.readLine();
		
		System.out.print("연산자를 입력하세요 : ");
		
		int oper = System.in.read();	
		
		Calc calc = new Calc();
		
		String test = calc.blank(r);
		
		num1 =calc.numberDivde1(test,num1);
		
		num2 = calc.numberDivde2(test, num2);
		
		result = calc.Calcultor(num1, num2, oper);
		
		System.out.printf("%d %c %d  = %d \n",num1,oper,num2,result);

	}

}
