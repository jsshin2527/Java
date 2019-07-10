/*
 * Wrapper Class - �⺻ �ڷ����� ��ü�� ��� �ɼ��ְ��� 
 * �ڹ� �ڷ���
 * boolean,byte,short,int,long,float,long     // String �� Ŭ�����Դϴ�. 
 * 
 * ���۷��� �ڷ��� 
 * Boolean,Byte,Character,Short,Integer,Long,Float,Double
 * Auto-Boxing : stack -> heap
 * 
 * Auto-UnBoxing : heap -> stack 
 * 
 */

package com.day11;

public class WrapperClass {

	public static void main(String[] args) {
		// Wrapper�� �� ����ұ� ? 	
		int n1 = 10;
		int n2;
		
		Integer num1;
		Integer num2 = new Integer(20);
		
		num1 = n1; // Auto-Boxing;
		n2 = num2; // Auto-UnBoxing
		
		System.out.println(" stack "+n1+" :  heap " +num1);	
		System.out.println(" stack "+n1+" :  heap " +num2);		
	}
}

/* �߿� 
 * 
 * int a;    4byte
 * double b; 8byte
 * a=10;
 * b=a;  	 	�Ͻ��� ����ȯ 
 * b=(double) a ����� ����ȯ 
 * b=15.56;
 * a=(int) b;	����� ����ȯ(15)
 *
 * -----------------------------------------------
 * 
 * *��Ӱ��� ǥ��  
 *
 * �θ�(D)
 * �ڽ�(I)
 * 
 * �θ� = �ڽ�;       - �ڽ��� �θ�� �ٲپ� ���´�  UPCAST
 * �θ� = (�θ�)�ڽ�  - UPCAST 
 * �ڽ� = �θ�; 	  - X (�ȵ�)
 * �ڽ� = (�ڽ�)�θ�; - DOWNCAST
 * 
*/