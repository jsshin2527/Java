/*
 *�߻�Ŭ���� 
 *�޸��� ������� Ŭ������ �̸� ���� 
 *�޼ҵ带 ������ �ؼ� ��� 
 *
 */

package Abstract_UpCasting_DownCasting;

//�߻� Ŭ�������� �ݵ�� �߻� �޼ҵ�1�� �̻��� �־�� �մϴ�. 

abstract class ShapeClass{
	abstract void draw();
}
class Circ extends ShapeClass{

	@Override
	public void draw() {
		System.out.println("���� �׸��ϴ�");
	}
	
}
class Rect extends ShapeClass{

	@Override
	public void draw() {
		System.out.println("�簢���� �׸��ϴ�. ");	
	}
}
class Tri extends ShapeClass{
	
	@Override
	public void draw() {
		System.out.println("�ﰢ���� �׸��ϴ�.");
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
