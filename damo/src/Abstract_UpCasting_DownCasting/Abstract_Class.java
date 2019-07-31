/*
 *추상클래스 
 *메모리의 낭비없이 클래스를 미리 설계 
 *메소드를 재정의 해서 사용 
 *
 */

package Abstract_UpCasting_DownCasting;

//추상 클래스에는 반드시 추상 메소드1개 이상이 있어야 합니다. 

abstract class ShapeClass{
	abstract void draw();
}
class Circ extends ShapeClass{

	@Override
	public void draw() {
		System.out.println("원을 그립니다");
	}
	
}
class Rect extends ShapeClass{

	@Override
	public void draw() {
		System.out.println("사각형을 그립니다. ");	
	}
}
class Tri extends ShapeClass{
	
	@Override
	public void draw() {
		System.out.println("삼각형을 그립니다.");
	}
}

public class Abstract_Class {

	public static void main(String[] args) {
		
		Circ c = new Circ();
		Rect r = new Rect();	
		Tri t = new Tri();
		
		c.draw();
		r.draw();
		t.draw();
	}
}
