package com.day4;

import java.util.Scanner;

/*
 * ��
 * boolean  : 1 byte true/false
 * ���� 
 * byte : 1byte  -128~127;
 * short: 2byte
 * int  : 4byte
 * long : 8byte
 * 
 * ����
 * 10���� : 20
 *  8���� : 016
 * 16���� : 0x17
 * 
 * �Ǽ� 
 * float  : 4byte 4.15
 * double : 8byte
 * 
 * 3.14  : double 
 * 3.14f : float 
 * 
 * ���� 
 * char : 2byte(utf-16) 
 * ���� ��� : 'a'; a�ڰ� ����Ǵ°��� �ƴ� �ƽ�Ű �ڵ� ���� ������ �ȴ� 
 * 
 * ������ 
 * ��������� : +,-,*,/,%,++(i=i+1),i--(i=i-1)
 * ���迬���� : >,>=,<,<= : ��� true,false 
 * ������� : ==,!=
 * �������� : &&(and),||(or)
 * ��Ʈ������ : &,|,^,~,>>,<<,>>>
 * 
 * ���׿����� :
 * ���� ? (true�϶� ��) : (false�϶� ��)
 * 
 * ���� ������ 
 * =,+=,-=,*=,/=
 * 
 * ----------------------------------------------------------------------------
 *	
 * int a =10;
 * float b;
 * 
 * b=a //�Ͻ��� ����ȯ int�� ���� float ���� ���ϴ�. 
 * b=(Int) a //����� ����ȯ 
 * 
 * ----------------------------------------------------------------------------
 * if (����){
 * 	�۾�;
 * }
 * 
 * if(����){
 * 	�۾�1;
 * }else{
 * 	�۾�2
 * }
 * 
 *if(����1){
 * �۾� 1
 * }else if(����2){
 * �۾� 2
 * }else if(����3){
 * �۾� 3
 * }else{
 * �۾� 4
 * }
 * �������� ������ �ϳ��� ã�°� if~else
 * ������ �ٺ� ���� if 
 * 
 * while(����){
 * 	�۾�
 * }
 * 
 * do{
 * 	�۾�;
 * }while(����)
 * 
 * while (true){
 * 	�۾� 
 * }
 *   // ���� ���� 
 * ====================================================================================
 */

public class Test1 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		int su = 10;
		
		//while�� ���� ������ �����ϸ� ��� ���� 
		//���� ������ false�� �ȴٸ� while���� ���� ������ �˴ϴ�.
		
		do {
		System.out.print("�� �Է� : ");
		su = sc.nextInt();}while(su<0);

		if (su%3 == 0 && su%4 ==0){
		//str = "3�� 4�� ��� �Դϴ�.";
		//printf("%s",str);
			System.out.println("3�� 4�� ��� �Դϴ�.");
		}else if (su%3==0){
			System.out.println("3�� ����Դϴ�.");	
		}else if (su%4==0){
			System.out.println("4�� ����Դϴ�.");	
		}else{
			System.out.println("3�� 4�� ����� �ƴմϴ�.");
		}
		int a = 10;
		float b ;
		System.out.print(b=a);
	}

}
