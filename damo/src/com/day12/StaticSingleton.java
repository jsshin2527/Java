//Singleten ���α׷� 
//Static��   �ѹ��� ��������� 
//call by reference 
package com.day12;

class Sing{
	
	private static Sing ob; //Sing Ŭ���� �ʱⰪ�� null 
	
	
	public static Sing getInstance() {
		
		System.out.println(ob); //null
		
		if(ob==null) {
			ob = new Sing();
			
		}		
		return ob;
	}
}

public class StaticSingleton {

	public static void main(String[] args) {

		Sing ob1 = Sing.getInstance();
		Sing ob2 = Sing.getInstance();
		
		System.out.println("Object Class Reference Value ob1 : "+ob1);
		System.out.println("Object Class Reference Value ob2 : "+ob2);
		
		if(ob1 == ob2 ) {
			System.out.println("���� ��ü ");
			
		}else {
			System.out.println("�� ���� ��ü ");
		}
	}	

}
