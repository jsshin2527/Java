//Singleten 프로그램 
//Static형   한번만 만들어진다 
package com.day12;

class Sing{
	
	private static Sing ob; //Sing 클래스 초기값은 null 
	
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
			System.out.println("동일 객체 ");
			
		}else {
			System.out.println("안 동일 객체 ");
		}
	}	

}
