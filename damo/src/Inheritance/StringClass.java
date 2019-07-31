package Inheritance;

//String : class�̴� (�ڷ����� �ƴϴ�)
//����ϴ� �󵵴� ���� ���� �����ϴ� �����ʹ� ���� ũ��; 
//�Һ��� ��Ģ 

public class StringClass {

	public static void main(String[] args) {

		String ob1 = "Seoul";
		String ob2 = "Seoul";
		
		String ob3 = new String("Seoul");
		
		System.out.println("ob1 == ob2 :" + (ob1==ob2));//true() ��ȣ�� �� �ٿ��� �մϴ�.
		System.out.println("ob1 == ob3 :" + (ob1==ob3));//false
		System.out.println("ob2 == ob3 :" + (ob2==ob3));//false

		//equals --> String  Override 
		//String ���� �ݵ�� equals �޼ҵ�� �񱳸� �ؾ��մϴ�. 
		System.out.println("ob1.equals(ob3) :"+ob1.equals(ob3));	
		
		
		//String �Һ��� ��Ģ 
		ob2 = "korea";
		System.out.println("ob1 == ob2 :" + (ob1==ob2)); //false
		
		//String �� ���� �ѹ� ����� �������� ������ ���մϴ�. �޸� ������ ��� ���� �ְ� �˴ϴ�. 
		ob2 = "japan";
		System.out.println("ob1 == ob2 :" + (ob1==ob2)); //false
		
		//String �� �Һ��� ��Ģ : �ѹ� ����� �������� ������ ���մϴ�.
		ob2 = "Seoul";
		System.out.println("ob1 == ob2 :" + (ob1==ob2)); //true 
		
		
		//Gargabar Collector 
		
	}
}
