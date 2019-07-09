package com.day10;

public class StringMemoryManagement {

	public void stringTime() {
		//long start = System.currentTimeMillis();�ý����� ������ �ִ� �ð��� �۵� 
		long start = System.nanoTime();	
		String str = "A";
		
		//A�� 50000�� ���� 
		for(int i = 1;i<=50000;i++) {
			str += 'A';
		}
		long end  = System.nanoTime();
		System.out.println("String ���� �ð� : "+(end-start)+" nanosecond");
	}
	//String�� �����ִ� Ŭ���� 
	//StringBuffer
	//StringBuilder
	public void stringBufferTime() {
		//long start = System.currentTimeMillis();�ý����� ������ �ִ� �ð��� �۵� 
		long start = System.nanoTime();	
		
		StringBuffer str = new StringBuffer("A");
		
		//A�� 50000�� ���� 
		for(int i = 1;i<=50000;i++) {
			//���� ������ +=
			//���� ������ append 
			str.append("A");
		}
		long end  = System.nanoTime();
		System.out.println("stringBufferTime ���� �ð� : "+(end-start)+" nanosecond");
	}
	public void stringBuilderTime() {
		//long start = System.currentTimeMillis();�ý����� ������ �ִ� �ð��� �۵� 
		long start = System.nanoTime();	
		
		StringBuilder str = new StringBuilder("A");
		
		//A�� 50000�� ���� 
		for(int i = 1;i<=50000;i++) {
			//���� ������ +=
			//���� ������ append 
			str.append("A");
		}
		long end  = System.nanoTime();
		System.out.println("stringBufferTime ���� �ð� : "+(end-start)+" nanosecond");
	}
	public static void main(String[] args) {
		
		StringMemoryManagement ob = new StringMemoryManagement();
		
		ob.stringTime();
		ob.stringBufferTime();
		ob.stringBuilderTime();
		
		//string �ӵ� ���� 
		//stringBuilderTime > stringBufferTime > stringTime
		//�ϴ����� ����� ���ѵ� �ٸ� �̸��� �ֿ��ش� 
		//����ȭ �񵿱�ȭ 
		//StingBuffer : ����ȭ ����
		//StringBuilder : ����ȭ ���� ���� ����
	}

}
