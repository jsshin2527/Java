package Class_Object;

import java.util.Scanner;

//this : Ŭ����, me, �ڱ��ڽ� 

class Circle{
	
	private int r;//������ ����ȭ(ĸ��ȭ)
	
	public void setData(int r) {//setData(int r,Circle this)
		
		this.r = r;//Ŭ������ �ν��Ͻ������� ��Ī�� 
		
	}
	
	public double area() {//area(Circle this)
		
		return r*r*3.14;
	}
	
	
	public void write(double a) {//write(double a,Circle this)
		
		System.out.println("������:" + r);
		System.out.println("����:" + a);
		
	}
		
	
}

public class Class_Example_Circle {

	public static void main(String[] args) {
		
		Circle ob = new Circle();//object ����
		
		Scanner sc = new Scanner(System.in);
		
		int su;
		
		System.out.print("������?");
		su = sc.nextInt();
		
		//ob.r = 10;
		ob.setData(su);//ob.setData(su,ob);//�ּҹ���
		double a = ob.area();//area(ob);
		ob.write(a);//write(a,ob);
		
	//-------------------------------------
		
		Circle ob1 = new Circle();
		ob.setData(30);//ob.setData(su,ob(=this));
		double b = ob.area();//area(ob);
		ob.write(b);//write(b,ob);
		
		

	}

}
