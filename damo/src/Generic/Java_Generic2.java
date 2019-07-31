//�ǹ����� ���� ��������� ������ Collections�� ������ ���� ������� �ֱ� ������ ���ظ� �ؾ��մϴ�. 

package Generic;

class Box2<T>{
	private T t; //�ѹ� ���ʸ����� ���Ǹ� �ϸ� ������ ���Ѵ�
	public void set(T t) {
		this.t=t;
	}
	public T get() {
		return t;
	}
	public <U> void print(U u) { //ȣ���Ҷ��޴� ���ʸ� ��ȯ ���� 
		System.out.println(u);
		System.out.println("t Ŭ���� : "+t.getClass().getName()/*������ ���� �ִ� �޼ҵ� Object -> Class */);
		System.out.println("u �޼ҵ� : "+u.getClass().getName()/*������ ���� �ִ� �޼ҵ� Object -> Class */);
	}
	
}

public class Java_Generic2 {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub

		Box2<Integer> b = new Box2<Integer>(); //t�� �ڷ����� ���� 
		b.set(new Integer(100));
		b.print("test"); //u�� �ڷ��� 
		b.print(50); //t�� �ڷ��� 

		
		
	}

}
