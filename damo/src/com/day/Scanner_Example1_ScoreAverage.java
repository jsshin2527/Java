/* 
	Scanner 
	단락문자의 패턴을 사용해서 데이터를 분류 
	기본 패턴 : 공백 
	Scanner를 활용하여 이름 국어 영어 수학 입력값을 받은후 이름과 평균을 구하는 프로그램 
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
		System.out.println("이름 국어 영어 수학 " ); //suzi,10,30,20 Scanner의 기본은 공백이다 
		sc = new Scanner(sc.next()).useDelimiter("\\s*,\\s*"); //이게 무슨의미 ?? Scannner클래스가 가지고 있는 정규표현식 
		name = sc.next();    //문자열을 읽어냄 
		kor  = sc.nextInt(); //숫자열을 읽어냄 
		eng  = sc.nextInt();
		mat  = sc.nextInt();
		System.out.println(name+":"+(kor+eng+mat));
	}
}
