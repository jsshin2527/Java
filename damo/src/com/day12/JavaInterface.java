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

interface Fruit{
	String Won = "��"; //public static final�� �����Ǿ� �ֽ��ϴ�. 	
	int getPrice();    //public abstract �� ������ �Ǿ� �ֽ��ϴ�. 
	public String getName();
	
}

// ��ӹ޴� �������̽��� ������ �ִ� �޼ҵ尡 ��� Override �մϴ�. 

class FruitImpl implements Fruit{
	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 1000;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "���";
	}	
	public String getItems() {

		return "����";
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
