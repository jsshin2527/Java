/* 
	�ڹ��� ������ ������ �˾ƺ��� ���α׷� �Դϴ�.  
	
	JVM�� �ڵ��� ȣ�� 
	1. ������ �����Ѵ�. int �� 
	�ڹٴ� ������ ������ Ȯ���ϰ� ������ ���α׷��� ��� �Դϴ�. 
	int �ڷ��� : ���� ���� ���� 21

*/


package com.day;
class JavaDataType1 

{
	public static void main(String[] args) 
	
	{
		int a = 10000;
		int b = 5 ;
		System.out.println(a);
		int c,d; // garbarg value 
		/* 
		�ش� ���� �ʱ�ȭ ���� �ʴ´� �������̵� ���� ���� 
		������ �����ߴٴ� ���� �ʱ�ȭ�� �ߴٴ°� ���� �ǹ̷� ����� �˴ϴ�.    
		*/ 
		c = a+b;
		d = a-b;
		System.out.println(a); //10000 
		System.out.println(c); //10005
		System.out.println(d); //9995
		//a+b
		System.out.println(a+"+"+b+"="+c);
		//a-b
		System.out.println(a+"-"+b+"="+d);
		//format 
		/* 

		������ Ÿ�� ��� format 
		���� %d 
		�Ǽ� %f 
		double %g 
		*/
		System.out.printf("%d+%d=%d",a,b,c);
		System.out.printf("%d-%d=%d",a,b,d);
	}
}
