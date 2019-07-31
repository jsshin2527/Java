package Class_Object;

//static어려운내용
//1. 같은 클래스의 객체가 1000개 생성되도 메모리 공간은 1개만 생성
//ex)역삼초->강남초, 선생님 모니터 a
//2. 스스로 메모리에 올라감

public class Static_Class_Variable {
	
	public static int a=10;//class변수
	//클래스 변수 또는 클래스 메소드는 클래스가 로딩 되는 순간
	//메모리 할당이 이루어지며 접근방법은 [클래스의 이름.변수이름]로 접근
	//즉, new를 통해서 메모리 할당을 하지 않아도 사용 가능
	
	private int b=20; //instance 변수
	//인스턴스 변수는 동일한 클래스에서 바로 접근이 가능하지만
	//클래스 메소드에서는 접근이 불가능하다
	//클래스 메소드에서 접근하기 위해서는 new를 통해 객체를 생성하고 
	//객체를 통해서만 접근 가능하다(ob.)
	
	public void write() {//instance method
		
		System.out.println("class변수:" + a);
		System.out.println("intance변수:" + b);
		
	}
	
	public static void print() {//static 메소드 class 메소드
		
		System.out.println("class변수:" + a);
		//System.out.println("intance변수:" + b);	
		
	}
	
	public static void main(String[] args) {
		
		//Test3 ob = new Test3();
		
		System.out.println("class 변수:" + a);
		System.out.println("class 변수:" + Static_Class_Variable.a);
		
		//write;
		print();
		Static_Class_Variable.print();  //class메소드
		
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
