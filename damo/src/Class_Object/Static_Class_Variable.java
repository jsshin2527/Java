package Class_Object;

//static������
//1. ���� Ŭ������ ��ü�� 1000�� �����ǵ� �޸� ������ 1���� ����
//ex)������->������, ������ ����� a
//2. ������ �޸𸮿� �ö�

public class Static_Class_Variable {
	
	public static int a=10;//class����
	//Ŭ���� ���� �Ǵ� Ŭ���� �޼ҵ�� Ŭ������ �ε� �Ǵ� ����
	//�޸� �Ҵ��� �̷������ ���ٹ���� [Ŭ������ �̸�.�����̸�]�� ����
	//��, new�� ���ؼ� �޸� �Ҵ��� ���� �ʾƵ� ��� ����
	
	private int b=20; //instance ����
	//�ν��Ͻ� ������ ������ Ŭ�������� �ٷ� ������ ����������
	//Ŭ���� �޼ҵ忡���� ������ �Ұ����ϴ�
	//Ŭ���� �޼ҵ忡�� �����ϱ� ���ؼ��� new�� ���� ��ü�� �����ϰ� 
	//��ü�� ���ؼ��� ���� �����ϴ�(ob.)
	
	public void write() {//instance method
		
		System.out.println("class����:" + a);
		System.out.println("intance����:" + b);
		
	}
	
	public static void print() {//static �޼ҵ� class �޼ҵ�
		
		System.out.println("class����:" + a);
		//System.out.println("intance����:" + b);	
		
	}
	
	public static void main(String[] args) {
		
		//Test3 ob = new Test3();
		
		System.out.println("class ����:" + a);
		System.out.println("class ����:" + Static_Class_Variable.a);
		
		//write;
		print();
		Static_Class_Variable.print();  //class�޼ҵ�
		
		Static_Class_Variable ob = new Static_Class_Variable();
	
		System.out.println(ob.a);
		
		ob.print();
		ob.write();
		
		Static_Class_Variable ob2 = new Static_Class_Variable();
		Static_Class_Variable ob3 = new Static_Class_Variable();
		
		ob3.a = 100;
		ob2.b = 5;
		
		System.out.println("ob.a:" + ob.a);
		System.out.println("ob.b:" + ob.b);
		
		System.out.println("ob2.a:" + ob2.a);
		System.out.println("ob2.b:" + ob2.b);
		
		System.out.println("ob3.a:" + ob3.a);
		System.out.println("ob3.b:" + ob3.b);
	
		

	}

}
