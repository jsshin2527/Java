//Scanner클래스를 이용하여 입력받은 숫자가 홀수인지 짝수인지 판별하는 프로그램 입니다. 
package Scanner;

import java.util.Scanner;

public class Scanner_Odd_Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int number;	
		System.out.println("해당 프로그램은 짝수와 홀수를 구하는 프로그램입니다.");
		System.out.print("정수를 입력하세요 : ");
		number = sc.nextInt();
		String str;
		
		if (number%2 == 0) {
			str ="입력하신 숫자는 짝수입니다.";
		}else if (number%2 == 1) {
			str ="입력하신 숫자는 홀수입니다.";
		}else {
			str ="숫자가 아닙니다.";
		}
		System.out.println(str);
	}
}
