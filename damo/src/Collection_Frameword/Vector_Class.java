package Collection_Frameword;

import java.util.ArrayList;
import java.util.List;

class Test{
	String name;
	int age;
}
// ���͵� Ŭ������ ������ �ִ� 

public class Vector_Class{
	
	public static void main(String[] args) {
		
		ArrayList<Test> lists = new ArrayList<Test>();
		//List<Test> lists = new ArrayList<Test>(); error �� ���� �ʽ��ϴ�. 
		
		Test ob;
		ob = new Test();
		ob.name = "���ؼ�";
		
		ob.age = 27;
		/* �߸��� �ڵ� Override 
		lists.add(ob);
		ob.name = "�̼���";
		ob.age = 55;	
		*/
		ob = new Test(); //
		ob.name = "jsshin";
		ob.age = 27;
		lists.add(ob);
		
		ob = new Test();
		ob.name = "everbody";
		ob.age = 20;
		lists.add(ob);
		
		//������ �ڷ����� Test�̱⶧���� �����Ҷ��� Test�̾�� �Ѵ� 
		for (Test t : lists) {
			System.out.println(t.name + " :" + t.age);
		}
		
		/*
		 * ��ü�� �����Ҷ����� �ٸ� �ּҰ��� ���� ��ü�� ������ �˴ϴ�. 
		 * 
		for (int i = 0; i < 5; i++) {
			ob = new Test();
			System.out.println(ob);
		}
		*/
		
	}
}