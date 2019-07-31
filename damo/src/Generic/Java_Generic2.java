//실무에서 많이 사용하지는 않지만 Collections이 다음과 같이 만들어져 있기 때문에 이해를 해야합니다. 

package Generic;

class Box2<T>{
	private T t; //한번 제너릭으로 정의를 하면 변경을 못한다
	public void set(T t) {
		this.t=t;
	}
	public T get() {
		return t;
	}
	public <U> void print(U u) { //호출할때메다 제너릭 변환 가능 
		System.out.println(u);
		System.out.println("t 클래스 : "+t.getClass().getName()/*누구나 쓸수 있는 메소드 Object -> Class */);
		System.out.println("u 메소드 : "+u.getClass().getName()/*누구나 쓸수 있는 메소드 Object -> Class */);
	}
	
}

public class Java_Generic2 {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub

		Box2<Integer> b = new Box2<Integer>(); //t의 자료형이 결정 
		b.set(new Integer(100));
		b.print("test"); //u의 자료형 
		b.print(50); //t의 자료형 

		
		
	}

}
