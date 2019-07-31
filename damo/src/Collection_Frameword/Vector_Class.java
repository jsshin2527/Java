package Collection_Frameword;

import java.util.ArrayList;
import java.util.List;

class Test{
	String name;
	int age;
}
// 백터도 클래스를 넣을수 있다 

public class Vector_Class{
	
	public static void main(String[] args) {
		
		ArrayList<Test> lists = new ArrayList<Test>();
		//List<Test> lists = new ArrayList<Test>(); error 가 나지 않습니다. 
		
		Test ob;
		ob = new Test();
		ob.name = "신준석";
		
		ob.age = 27;
		/* 잘못된 코딩 Override 
		lists.add(ob);
		ob.name = "이순신";
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
		
		//넣을때 자료형이 Test이기때문에 선언할때도 Test이어야 한다 
		for (Test t : lists) {
			System.out.println(t.name + " :" + t.age);
		}
		
		/*
		 * 객체를 생성할때마다 다른 주소값를 가진 객체가 생성이 됩니다. 
		 * 
		for (int i = 0; i < 5; i++) {
			ob = new Test();
			System.out.println(ob);
		}
		*/
		
	}
}