//ScannerŬ������ �̿��Ͽ� �Է¹��� ���ڰ� Ȧ������ ¦������ �Ǻ��ϴ� ���α׷� �Դϴ�. 
package Scanner;

import java.util.Scanner;

public class Scanner_Odd_Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int number;	
		System.out.println("�ش� ���α׷��� ¦���� Ȧ���� ���ϴ� ���α׷��Դϴ�.");
		System.out.print("������ �Է��ϼ��� : ");
		number = sc.nextInt();
		String str;
		
		if (number%2 == 0) {
			str ="�Է��Ͻ� ���ڴ� ¦���Դϴ�.";
		}else if (number%2 == 1) {
			str ="�Է��Ͻ� ���ڴ� Ȧ���Դϴ�.";
		}else {
			str ="���ڰ� �ƴմϴ�.";
		}
		System.out.println(str);
	}
}
