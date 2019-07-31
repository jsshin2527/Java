/*생성자  = 생성된 객체에 메모리를 할당하면서 변수를 초기화 하는 역활 담당 
1.메모리 할당 
2.변수 초기화 목적 
3.원본을 복사해서 메모리를 할당하는 작업을 담당 
4.생성자에서 생성자를 호출할수 있다.
5.코딩의 맨 첫줄에서만 호출 가능 (두번째 줄에서는 호출 불가) -> 상속의 개념 
6.메소드로 초기화 하는것보다 생성자로 초기화 하는것이 한발 더 빠르고 코드의 가독성이 좋아진다 

초기화 
회사에 출근해서 업무를 시작하기 전에 제일 먼저 하는 일이 아마 책상 정리일 것이다. 커피를 내리는 경우도 있을 것이고, 
컴퓨터 부팅을 시작하기도 할 것이다. 즉 어떤 일을 시작하기 전에 준비를 하게 되는데 이것을 다른 말로 초기화라고 한다.

생성자는 
생성자는 class 이름과 통일 
return 값이 없기 때문에 property가 없다
public int (property) method name (parameter) 

wiki -> property

객체, 요소, 또는 파일의 성질을 정의하는 명세이다. 속성은 또한 이들의 인스턴스에 주어진 특정 값을 지정하거나 나타내는 데에도 쓰인다. 
속성은 메타데이터로 간주하는 것이 더 정확하다. 속성은 일반적으로 성질의 성질이다
중복 정의 

*/ 

package Class_Object2;

import java.util.Scanner;

public class ConstructorExample {

	//직접적으로 접근 불가 
	private int x;
	
	//기본 생성자는 숨겨져있다 
	public  ConstructorExample() { //기본 생성자  -> 안써도 가능하다 다만 생성자를 오버로딩을 한다면 해당 클래스를 사용할때 생각을 해야한다. 
		
		//기본 생성자에서 오버로드된 생성자를 호출을 하려면 this 를 사용해야합니다. 
		this(100);
		System.out.println("기본 생성자");
		x = 10;	
		System.out.println("x = " + x);
	}
	public ConstructorExample(int x) { //오버로딩이 된 생성자 
		//this();
		System.out.println("오버로딩이 된 생성자 ");
		this.x = x;
		System.out.println(this.x);
	}
	public void set(int x) { //메소드 
		this.x = x; //x의 값을 초기화 
	}
	
	
	public static void main(String[] args) {
	
		
		ConstructorExample ob = new ConstructorExample();
		ConstructorExample ob1 = new ConstructorExample(100);
		
		//Scanner 는 기본 생성자를 명시하지 않은 클래스 이다 . API에 명시된 파리미터를 명시해야 Scanner 클래스를 사용할수 있습니다.  
		Scanner sc = new Scanner(System.in);
		

	}

}
