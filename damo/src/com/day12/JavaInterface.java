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

import java.util.GregorianCalendar;
import java.util.Calendar;

interface Fruit{
	String Won = "원"; //public static final이 생략되어 있습니다. 	
	int getPrice();    //public abstract 가 생략이 되어 있습니다. 
	public String getTest();
	
}

// 상속받는 인터페이스가 가지고 있는 메소드가 모드 Override 합니다. 
// 클래스는 하나만 선언이 가능합니다. extends
// 
class FruitImpl implements Fruit{
	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 1000;
	}

	public String getName() {
		return "사과";
	}	
	public String getItems() {
		return "과일";
	}
	@Override
	public String getTest() {
		// TODO Auto-generated method stub
		return null;
	}
}
//부모와 자식간의 관계는 개념적으로 부모가 더 크지만 
//능력은 자식이 더 많습니다. 
//upcasting 은 더 큰 클래스에 들거가는것이지만 능력은 줄어든다 
//downcasing 을 한다면 명시적 형변환을 해줘야 하면 능력은 많아 집니다 
public class JavaInterface {

	public static void main(String[] args) {
	
		FruitImpl ob1 = new FruitImpl();
		
		// 대표적인 예제 Calendar now = new GregorianCalendar();
			
			System.out.println(ob1.getItems() + " : " + ob1.getName()+" "+ob1.getPrice()+Fruit.Won);
			
			Fruit ob2 = ob1; //UPCAST
			
			System.out.println(ob2.getTest());
			
			//System.out.println(ob2.getName());
			
			//System.out.println(ob2.getItem);
	}
}
