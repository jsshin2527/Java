package Inheritance;

//String : class이다 (자료형이 아니다)
//사용하는 빈도는 아주 많고 저장하는 데이터는 아주 크다; 
//불변의 법칙 

public class StringClass {

	public static void main(String[] args) {

		String ob1 = "Seoul";
		String ob2 = "Seoul";
		
		String ob3 = new String("Seoul");
		
		System.out.println("ob1 == ob2 :" + (ob1==ob2));//true() 괄호를 꼭 붙여야 합니다.
		System.out.println("ob1 == ob3 :" + (ob1==ob3));//false
		System.out.println("ob2 == ob3 :" + (ob2==ob3));//false

		//equals --> String  Override 
		//String 값은 반드시 equals 메소드로 비교를 해야합니다. 
		System.out.println("ob1.equals(ob3) :"+ob1.equals(ob3));	
		
		
		//String 불변의 법칙 
		ob2 = "korea";
		System.out.println("ob1 == ob2 :" + (ob1==ob2)); //false
		
		//String 은 값을 한번 만들어 좋은것은 지우지 못합니다. 메모리 공간에 계속 남아 있게 됩니다. 
		ob2 = "japan";
		System.out.println("ob1 == ob2 :" + (ob1==ob2)); //false
		
		//String 의 불변의 법칙 : 한번 만들어 좋은것은 지우지 못합니다.
		ob2 = "Seoul";
		System.out.println("ob1 == ob2 :" + (ob1==ob2)); //true 
		
		
		//Gargabar Collector 
		
	}
}
