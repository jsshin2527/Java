package com.day9;

/*
 *Call by Value
 *stack �������� heap�������� ������ �� ��ü�� �Ѿ 
 *���� ����     �ڷ��� ���� 
 *Call by Reference
 *���� �ѱ涧 ��ü�� �����ּҰ� �Ѿ ( �ּҸ� ������ �����ϴ�)

*/
 
class Test{
	
	public int x = 10;
	
	public void sub(int a) {
	
		x += a;
	}
	
}

public class Call_by_Value_Call_by_Reference {
	
	public static void main(String[] args) {
		
		Test ob = new Test();
		
		//Call by Value 
		
		int a = 10;
		System.out.println("�޼ҵ� ���� �� x :"+ob.x);
		ob.sub(a);
		System.out.println("�޼ҵ� ���� �� x :"+ob.x);
		
		//call by reference 
		int i = 10;
		int j;
		j = i;
		//stack ������ �ڷ����� ���� �״�� �Ѿ�� 
		
		Test ob1; //class�� ���Ǹ� �صθ� null �� ���ֽ��ϴ�. 
		
		ob1 = ob; 
		
		ob.x =200;
		System.out.println(ob.x);
		System.out.println(ob1.x);
		
		
	}

}
