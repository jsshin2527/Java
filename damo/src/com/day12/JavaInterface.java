/*
 * Interface 
 * 추상클래스의 일종이고 선언만 있고 정의가 없다 
 * final 변수만 정의할수 있다 
 * 인터페이스를 구현하기 위해서 implements 사용 
 * 하나이상의 인터페이스를 구현하면 인터페이스의 모든 메소드를 Override를 해야한다 
 * 인터페이스가 다른 인터페이스를 상속 받을수 있습니다. 
 * 이때는 extends를 사용한다 
 * 클래스와 다르게 다중 상속이 가능합니다. 
 * 
 */

package com.day12;

interface Fruit{
	String Won = "원"; //public static final이 생략되어 있습니다. 	
	int getPrice();    //public abstract 가 생략이 되어 있습니다. 
	public String getName();
	
}

// 상속받는 인터페이스가 가지고 있는 메소드가 모드 Override 합니다. 

class FruitImpl implements Fruit{
	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 1000;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "사과";
	}	
	public String getItems() {

		return "과일";
	}
}

public class JavaInterface {

	public static void main(String[] args) {
	
		FruitImpl ob1 = new FruitImpl();
			
			System.out.println(ob1.getItems() + " : " + ob1.getName()+" "+ob1.getPrice()+Fruit.Won);
			
			Fruit ob2 = ob1; //UPCAST
			
			System.out.println(ob2.getName());
			
			//System.out.println(ob2.getItem);
	}
}
