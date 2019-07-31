package Class_Object;

import java.util.Scanner;

//this : 클래스, me, 자기자신 

class Circle{
	
	private int r;//정보의 은닉화(캡슐화)
	
	public void setData(int r) {//setData(int r,Circle this)
		
		this.r = r;//클래스의 인스턴스변수를 지칭함 
		
	}
	
	public double area() {//area(Circle this)
		
		return r*r*3.14;
	}
	
	
	public void write(double a) {//write(double a,Circle this)
		
		System.out.println("반지름:" + r);
		System.out.println("넓이:" + a);
		
	}
		
	
}

public class Class_Example_Circle {

	public static void main(String[] args) {
		
		Circle ob = new Circle();//object 형태
		
		Scanner sc = new Scanner(System.in);
		
		int su;
		
		System.out.print("반지름?");
		su = sc.nextInt();
		
		//ob.r = 10;
		ob.setData(su);//ob.setData(su,ob);//주소번지
		double a = ob.area();//area(ob);
		ob.write(a);//write(a,ob);
		
	//-------------------------------------
		
		Circle ob1 = new Circle();
		ob.setData(30);//ob.setData(su,ob(=this));
		double b = ob.area();//area(ob);
		ob.write(b);//write(b,ob);
		
		

	}

}
