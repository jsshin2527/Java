/* 
	Scanner 
	�ܶ������� ������ ����ؼ� �����͸� �з� 
	�⺻ ���� : ���� 
	Scanner�� Ȱ���Ͽ� �̸� ���� ���� ���� �Է°��� ������ �̸��� ����� ���ϴ� ���α׷� 
*/
package com.day;
import java.util.*;

class Scanner_Example1_ScoreAverage 
{
	public static void main(String[] args) 
	
	{
		Scanner sc = new Scanner(System.in);
		String name; 
		int kor,eng,mat;
		System.out.println("�̸� ���� ���� ���� " ); //suzi,10,30,20 Scanner�� �⺻�� �����̴� 
		sc = new Scanner(sc.next()).useDelimiter("\\s*,\\s*"); //�̰� �����ǹ� ?? ScannnerŬ������ ������ �ִ� ����ǥ���� 
		name = sc.next();    //���ڿ��� �о 
		kor  = sc.nextInt(); //���ڿ��� �о 
		eng  = sc.nextInt();
		mat  = sc.nextInt();
		System.out.println(name+":"+(kor+eng+mat));
	}
}
