/*
 * interface example Fruit 
 * (new Class())  중요 
 * interface 는 추상클래스와 같이 생각을 해야한다 
 * 다중 상속에서 어디 클래스를 참조하는지 중요하지 가 않습니다. 
 * 그 이유는 인터페이스를 상속 받은 메소드를 Override 하기 때문입니다. 
 * Override 는 부모 클래스나 인터페이스 상관없이 자식 클래스의 메소드를 사용하기 때문입니다. 
 *  
 */

package InnerClass;

import java.util.Scanner;

interface Fruit{
	
		String Won = "원"; //public static final 생략 	
		//인터페이스에서는 보통 메소드를 먼저 생각을 한다 
		public int getPrice();
		public String getName();	
}

interface ItemFruit extends Fruit{
	
	public String getItems();
	
}

class Orange implements ItemFruit{

	@Override
	public int getPrice() {
		return 1500;
	}
	
	@Override
	public String getName() {
		return "오렌지";
	}
	
	@Override
	public String getItems() {
		return "과일";
	}
}
class Apple implements ItemFruit{

	@Override
	public int getPrice() {
		return 1000;
	}
	
	@Override
	public String getName() {
		return "사과";
	}
	
	@Override
	public String getItems() {
		return "과일";
	}
}
public class Interface_Fruit_Exmaple {
	
	public void packing(ItemFruit o /*= new Orange*/) {
		
		System.out.println(o.getItems());
		System.out.println(o.getName());
		System.out.println(o.getPrice() + Fruit.Won);
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		Interface_Fruit_Exmaple t = new Interface_Fruit_Exmaple();	
		System.out.print("1.오렌지, 2.사과");
		
		int number = sc.nextInt();
		
		if(number==1) {
			t.packing(new Orange());
		}else if(number ==2) {
			t.packing(new Apple());
		}
		
		//Orange o = new Orange();
		//Fruit  o = new Orange(); //upcasting 
		
		//ItemFruit o;
		
		//o = new Orange();
	
		//System.out.println(o.getItems());
		//System.out.println(o.getPrice() + Fruit.Won);
		
		//Apple a= new Apple();
		
		//o = new Apple();

		//System.out.println(o.getItems());
		//System.out.println(o.getName());
		//System.out.println(o.getPrice() + Fruit.Won);

		//int c = 10;
		//System.out.println(c);
		//int b = 20;
		//System.out.println(b);	
	}
}
