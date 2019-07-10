/*
 * Wrapper Class - 기본 자료형을 객체로 사용 될수있게함 
 * 자바 자료형
 * boolean,byte,short,int,long,float,long     // String 은 클래스입니다. 
 * 
 * 레퍼런스 자료형 
 * Boolean,Byte,Character,Short,Integer,Long,Float,Double
 * Auto-Boxing : stack -> heap
 * 
 * Auto-UnBoxing : heap -> stack 
 * 
 */

package com.day11;

public class WrapperClass {

	public static void main(String[] args) {
		// Wrapper를 왜 사용할까 ? 	
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

/* 중요 
 * 
 * int a;    4byte
 * double b; 8byte
 * a=10;
 * b=a;  	 	암시적 형변환 
 * b=(double) a 명시적 형변환 
 * b=15.56;
 * a=(int) b;	명시적 형변환(15)
 *
 * -----------------------------------------------
 * 
 * *상속관계 표현  
 *
 * 부모(D)
 * 자식(I)
 * 
 * 부모 = 자식;       - 자식을 부모로 바꾸어 놓는다  UPCAST
 * 부모 = (부모)자식  - UPCAST 
 * 자식 = 부모; 	  - X (안됨)
 * 자식 = (자식)부모; - DOWNCAST
 * 
*/