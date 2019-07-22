package Object_Serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
/*
 * 일반 클래스를 직렬화를 하려면 Serializable 을 해야합니다. 
 * Hash는 이미 인터페이스를 상속 받고 있습니다. 
 */

public class Object_Serializable_General_Class_Define implements Serializable {



	public static void main(String[] args) {

		try {
			
			FileOutputStream fos  = new FileOutputStream("d:\\doc\\out9.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			//파일로 가져다 써라
			//직렬화로 데이터를 저장한 코드 
			
			oos.writeObject(new MyData("홍길도",70,"111"));
			oos.writeObject(new MyData("이순신",55,"222"));
			oos.writeObject(new MyData("김유신",30,"333"));
			oos.writeObject(new MyData("배수지",20,"555"));
			
			fos.close();
			oos.close();
			
		    System.out.println("직렬화 성공 !!");
		  
		  
		    FileInputStream fis = new FileInputStream("d:\\doc\\out9.txt");	 
		    ObjectInputStream ois = new ObjectInputStream(fis);
		  
		    MyData ob = null;
		  
		    while(true) {
			  
		      ob = (MyData)ois.readObject();
			  
			  if(ob == null) {
				  break;
			  }
			  System.out.println(ob.toString());
		  }
		  
		}catch (Exception e) {
			
			System.out.println(e.toString());
		}
	}
}