/*
	5.�ܰ� 15,800��¥�� ��ǰ�� ���� ���� �̻� ���Խ� ������ ���ݴϴ�.
	�������� ������ �����ϴ�.
	10�� �̻� -> 10%
	20�� �̻� -> 15%
	30�� �̻� -> 20%
	�Ǹűݾ��� ����غ��ϴ�.
	��) ���Լ��� 15���� ��� -> ���Լ���: 15��, �Ǹ��ѱݾ�: 213300��
 */

package Scanner;

import java.util.Scanner;

public class Discount_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int number;
		double sum =0;
		System.out.println("�ܰ� 15,800��¥�� ��ǰ�� ���� ���� �̻� ���Խ� ������ ���ݴϴ�");
		System.out.print("��ǰ�� ������ ������ �Է��ϼ��� : ");
		number = sc.nextInt();
		
		if(number >=30) {
			sum = (15800*number)-(15800*number)*0.2;	
			//sum = (15800*number)*(1-0.2); ���� �ڵ嵵 ���� 	
			
		}else if(number>=20) {
			sum = (15800*number)-(15800*number)*0.15;
			//sum = (15800*number)*(1-0.15); ���� �ڵ嵵 ���� 	
			
		}else if(number>=10) {
			sum = (15800*number)-(15800*number)*0.10;	
			//sum = (15800*number)*(1-0.1); ���� �ڵ嵵 ���� 	
		}else{
			sum = 15800*number;
		}
	System.out.println("�� ������ "+number+"�̰� �ݾ��� "+sum+"�Դϴ�.");
	}
}
