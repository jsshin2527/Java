package Inheritance;

/*
 * inheritance -> 상속 -> 부모가 자식한테 무엇가를 줌 
 * 1. 부모클래스에있는 정보는 자식 클래스에게 언젠가 줄수 있다.
 * 2. private 선언된 변수나 메서드는 상속을 받지 못합니다. 
 * 3. protected로 선언한것은 사용가능 앞으로는 private변수로만 선언 -> 그렇다면 상속을 허용하는 타입은 protected 밖에 없습니다. ( 자바는 다른 패키지에 있는 값까지 상속가능)
 * 4. 상속받은 자식클래스는의 소스는 자식클래스만 소요합니다.
 * 5. 부모와 같은 객체는 (변수/메소드) 가지고 있으면 자식의 객체를 사용합니다. 
 */

//Inheritance_test1 VS Inheritance_Example1 는 공간만 같이쓰는 전혀 관련이 없는 클래스입니다. 처음에는 ** 

class Inheritance_Super2{
	
	private String title;
	
	//private int area;
	//protected는 변수/메소드를 사용할수 있게 허락을 받은것입니다. 
	protected int area;
	
	//모든 기본 생성자는 숨겨저 있다 
	//public Inheritance_Super2() {}
	
	public Inheritance_Super2(String title) {
		this.title = title;
	}
	public void set(String title) { //method inititalize 
		this.title = title;
		//this.area = area;
	}
	public void print() {
		System.out.println(title+" : "+ area);
	}
}

public class Inheritance_Example2 extends Inheritance_Super2{
	private int w,h;
	int area = 20;
	public Inheritance_Example2(int w,int h) {
		
		super("사각형"); // super 부모를 찾아가라  -> 생성자에는 기본적으로 super가 숨겨저 있습니다. 따리서 다음과 같이 코드를 작성하면 set의 값을 안받아도 출력이 가능합니다. 
		
		this.w = w;
		this.h = h;
		//supter ketword 확인 
		System.out.println(area); 
		System.out.println(this.area); 
		System.out.println(super.area); 
		
		//super 키워드를 입력한다면 부모 클래스의 
	}
	public void rectArea() {
		
		int a = w*h;
		area = a; //변수를 선언을 할 필요가 없습니다. 
		//set("사각형");
		// int b = area;  error 부모의 접근제어자 protected로 변경을 하라고 출력 		
	}	
	public static void main(String[] args) {
		
		Inheritance_Example2 ob = new Inheritance_Example2(10,5);
		
		ob.rectArea();
		ob.print();		
	}
}
