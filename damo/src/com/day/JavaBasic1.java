/*
2019.06.27 ù��° �ڹ� �ҽ��ڵ� 
���� Test1 Ŭ������ �������� �� �ڵ带 ������ �� �Դϴ�. 
���� ���� 
1. class �� �ǹ� ���� �� public static void method main String[] args ���� ���� 
2. �ڹ� ����� ���α׷� (for ���� Ȱ���Ͽ� ������� �� ��� 
// �ּ� ��� 
/* ������ �ּ� 
Class �� ���α׷��� ���� ��Ű�� ���� 
Class name : Test1 
Class �� �̸� �ձ��ڴ� �빮�ڷ� �����Ѵ� 
Class �����̸��� Class ��� ���ƾ� �Ѵ� 
*public : ���� ������ : ���� ������ �����ϳ� ?? 
*static : ���� ���� 
*void : return ���� ���� ���� �����ϴ�  
*main : �޼ҵ� �̸� (ù���ڴ� �ҹ���)
String[] args : �Ű�����  : �⺻���� �޼ҵ� �Ű����� [] �迭 ���߿� ��� 
�� �ܿ��� �͹̳� â���� javac ���α׷��� �̿��Ͽ� java �ҽ������� Ŭ���� ���Ϸ� ����� (binarny file) java �ڹ� ���α׷����� class ������ �����Ͽ� ��������� ����մϴ�. 
ȯ�� ���� ������ �͹̳� â�� ����� ���� ��ɾ�� ������ �����մϴ�.
javac .java -> java ���� Ŭ���� ���Ϸ� ��ȯ 
java classfile -> �ڹ� Ŭ���� ���� ���� 
== ���� ������ 
*/
package com.day;
class JavaBasic1 

{
	public static void main(String[] args) 
	
	{
		/*
		
		SystemŬ������ ������ �ִ� println�̶�� �޼ҵ尡 �ְ� ��ȣ �ȿ� ���� �Ű� ������ ���� �޾� ȭ�鿡 ����� �մϴ�. 
		System Ŭ���� �ȿ� �ִ� println �޼ҵ带 �ҷ��� ��� �մϴ�. �׷��ٸ� System Ŭ������ ��� �ҷ��ü� �ִ°��� 
		static ���������� �̿��Ͽ� �⺻ java Ŭ������ �ҷ��ü� �ֽ��ϴ�. 
		*/

		System.out.println("Hello World!");
		System.out.println("�ȳ��ϼ���!! �ڹ� �׽�Ʈ �Դϴ�.");
		System.out.println("�ȳ� �ڹ� ");
		System.out.println("���� ���� ���� ");
		
		char a = 65; // 65�� �ƽ�Ű �ڵ尡 �������� Ȯ�� 
		int  b = 65; // int 65 ���� ����ϱ����� ������ ���� ���� b ��� int ���� ������ 65 ���� ����  
		
		System.out.println(a);
		System.out.println(b);
/*

2. �ڹ� ����� ���α׷� 

	*
   ***
  *****
 *******
*********

*/

		
	for (int i=0; i<=5 ;i++)
	
	{    
		System.out.print(" ");

		for (int j=5; j>i ; j--)
	
		{
			System.out.printf(" ");
		}

		for (int j=0 ; j<=i ; j++ )
		
		{
			System.out.printf("*");
		}
				
		for (int z =0; z < i ; z++ )
		
		{
		System.out.print("*");
		}
		System.out.println("\n");
		}
	}
}