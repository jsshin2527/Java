package com.day10;

public class StringMemoryManagement {

	public void stringTime() {
		//long start = System.currentTimeMillis();시스템이 가지고 있는 시간을 작동 
		long start = System.nanoTime();	
		String str = "A";
		
		//A를 50000번 찍어라 
		for(int i = 1;i<=50000;i++) {
			str += 'A';
		}
		long end  = System.nanoTime();
		System.out.println("String 실행 시간 : "+(end-start)+" nanosecond");
	}
	//String을 도와주는 클래스 
	//StringBuffer
	//StringBuilder
	public void stringBufferTime() {
		//long start = System.currentTimeMillis();시스템이 가지고 있는 시간을 작동 
		long start = System.nanoTime();	
		
		StringBuffer str = new StringBuffer("A");
		
		//A를 50000번 찍어라 
		for(int i = 1;i<=50000;i++) {
			//숫자 누적은 +=
			//문자 누적은 append 
			str.append("A");
		}
		long end  = System.nanoTime();
		System.out.println("stringBufferTime 실행 시간 : "+(end-start)+" nanosecond");
	}
	public void stringBuilderTime() {
		//long start = System.currentTimeMillis();시스템이 가지고 있는 시간을 작동 
		long start = System.nanoTime();	
		
		StringBuilder str = new StringBuilder("A");
		
		//A를 50000번 찍어라 
		for(int i = 1;i<=50000;i++) {
			//숫자 누적은 +=
			//문자 누적은 append 
			str.append("A");
		}
		long end  = System.nanoTime();
		System.out.println("stringBufferTime 실행 시간 : "+(end-start)+" nanosecond");
	}
	public static void main(String[] args) {
		
		StringMemoryManagement ob = new StringMemoryManagement();
		
		ob.stringTime();
		ob.stringBufferTime();
		ob.stringBuilderTime();
		
		//string 속도 순서 
		//stringBuilderTime > stringBufferTime > stringTime
		//하는일이 비슷한 일한데 다른 이름을 주오준다 
		//동기화 비동기화 
		//StingBuffer : 동기화 지원
		//StringBuilder : 동기화 지원 하지 않음
	}

}
