/*
	Scanner�� �̿��Ͽ� ������ ���ϴ� ���α׷� 
	4.�⵵�� �Է¹ް�, �������� �ƴ����� ���.
	��) 2010 �Է½� -> 2010 => ���
    2012 �Է½� -> 2012 => ����
*/

package Scanner;

import java.util.Scanner;

public class Scanner_Leaf_Year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int year;
		System.out.print("�⵵�� �Է��� �ϼ��� : ");
		year = sc.nextInt();
		
		if (year%4 ==0 && year%100 != 0 || year%400 == 0) {
			System.out.println(year+"�⵵�� �����Դϴ�.");
		}else {
			System.out.println(year+"�⵵�� ����Դϴ�.");
		}
	}

}
