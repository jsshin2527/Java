package com.day9;

//되 부름 함수 
//소스가 간단해짐 
//처리 속도는 느림 
//stack 영억에 저장을 합니다. 

public class Test5 {

	public void print(int n) {
		
		if(n != 1) {
			print(n-1);
		}
		System.out.printf("%5d\n",n);
	}
	//메소드를 선언할때 property를 데이터 타입을 주게된다면 return 값을 주기 전까지 빨간줄이 표시가 된다.
	public int sum (int n) {
		// 1-10 까지의 합을 구하는 예제 
		return n>1 ? n+sum(n-1) : n;
	}
	public int pow(int a , int b) {
	
		return b>=1 ? a*pow(a,b-1) : 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test5 ob = new Test5();
		
		ob.print(5);
		System.out.println("\n====================");
		int s = ob.sum(10);
		System.out.println(s);
		System.out.println("======================");
		System.out.println("pow(2,31) : "+ob.pow(2, 31));
		//2^31은 int 형의 범위에 담지를 못한다 . 
		
	}

}
