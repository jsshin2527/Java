/* 
 2019.06.28 �׹�° �ҽ��ڵ� 


*/
package com.day;
import java.util.*;

//Scanner 

//�ܶ������� ������ ����ؼ� �����͸� �з� 

//�⺻ ���� : ���� 

class Test12 

{
	public static void main(String[] args) 
	
	{
		Scanner sc = new Scanner(System.in);
		String name; 
		int kor,eng,mat;
		System.out.println("�̸� ���� ���� ���� " ); //suzi,10,30,20 Scanner�� �⺻�� �����̴� 
		sc = new Scanner(sc.next()).useDelimiter("\\s*,\\s*"); //�̰� �����ǹ� ?? 
		name = sc.next();    // ���ڿ��� �о 
		kor  = sc.nextInt(); //���ڿ��� �о 
		eng  = sc.nextInt();
		mat  = sc.nextInt();
		System.out.println(name+":"+(kor+eng+mat));
	}
}
