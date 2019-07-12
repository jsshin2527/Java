/*
 * Interface 
 * �߻�Ŭ������ �����̰� ���� �ְ� ���ǰ� ���� 
 * final ������ �����Ҽ� �ִ� 
 * �������̽��� �����ϱ� ���ؼ� implements ��� 
 * �ϳ��̻��� �������̽��� �����ϸ� �������̽��� ��� �޼ҵ带 Override�� �ؾ��Ѵ� 
 * �������̽��� �ٸ� �������̽��� ��� ������ �ֽ��ϴ�. 
 * �̶��� extends�� ����Ѵ� 
 * Ŭ������ �ٸ��� ���� ����� �����մϴ�. 
 * 
 */

package com.day12;

import java.util.GregorianCalendar;
import java.util.Calendar;

interface Fruit{
	String Won = "��"; //public static final�� �����Ǿ� �ֽ��ϴ�. 	
	int getPrice();    //public abstract �� ������ �Ǿ� �ֽ��ϴ�. 
	public String getTest();
	
}

// ��ӹ޴� �������̽��� ������ �ִ� �޼ҵ尡 ��� Override �մϴ�. 
// Ŭ������ �ϳ��� ������ �����մϴ�. extends
// 
class FruitImpl implements Fruit{
	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 1000;
	}

	public String getName() {
		return "���";
	}	
	public String getItems() {
		return "����";
	}
	@Override
	public String getTest() {
		// TODO Auto-generated method stub
		return null;
	}
}
//�θ�� �ڽİ��� ����� ���������� �θ� �� ũ���� 
//�ɷ��� �ڽ��� �� �����ϴ�. 
//upcasting �� �� ū Ŭ������ ��Ű��°������� �ɷ��� �پ��� 
//downcasing �� �Ѵٸ� ����� ����ȯ�� ����� �ϸ� �ɷ��� ���� ���ϴ� 
public class JavaInterface {

	public static void main(String[] args) {
	
		FruitImpl ob1 = new FruitImpl();
		
		// ��ǥ���� ���� Calendar now = new GregorianCalendar();
			
			System.out.println(ob1.getItems() + " : " + ob1.getName()+" "+ob1.getPrice()+Fruit.Won);
			
			Fruit ob2 = ob1; //UPCAST
			
			System.out.println(ob2.getTest());
			
			//System.out.println(ob2.getName());
			
			//System.out.println(ob2.getItem);
	}
}
