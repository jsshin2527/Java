//Singleten ���α׷� 
//Static��   �ѹ��� ��������� 
package com.day12;

class Sing{
	
	private static Sing ob; //Sing Ŭ���� �ʱⰪ�� null 
	
	public static Sing getInstance() {
		
		if(ob==null) {
			 ob = new Sing();
		}
		
		return ob;
	}
}

public class StaticSingleton {

	public static void main(String[] args) {

		Sing ob1 = Sing.getInstance();
		Sing ob2= Sing.getInstance();
		
		if(ob1 == ob2 ) {
			System.out.println("���� ��ü ");
			
		}else {
			System.out.println("�� ���� ��ü ");
		}
	}	

}
