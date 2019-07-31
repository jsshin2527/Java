/*
 * interface example Fruit 
 * (new Class())  �߿� 
 * interface �� �߻�Ŭ������ ���� ������ �ؾ��Ѵ� 
 * ���� ��ӿ��� ��� Ŭ������ �����ϴ��� �߿����� �� �ʽ��ϴ�. 
 * �� ������ �������̽��� ��� ���� �޼ҵ带 Override �ϱ� �����Դϴ�. 
 * Override �� �θ� Ŭ������ �������̽� ������� �ڽ� Ŭ������ �޼ҵ带 ����ϱ� �����Դϴ�. 
 *  
 */

package InnerClass;

import java.util.Scanner;

interface Fruit{
	
		String Won = "��"; //public static final ���� 	
		//�������̽������� ���� �޼ҵ带 ���� ������ �Ѵ� 
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
		return "������";
	}
	
	@Override
	public String getItems() {
		return "����";
	}
}
class Apple implements ItemFruit{

	@Override
	public int getPrice() {
		return 1000;
	}
	
	@Override
	public String getName() {
		return "���";
	}
	
	@Override
	public String getItems() {
		return "����";
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
		System.out.print("1.������, 2.���");
		
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
