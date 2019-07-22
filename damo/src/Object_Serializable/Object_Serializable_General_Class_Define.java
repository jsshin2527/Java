package Object_Serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
/*
 * �Ϲ� Ŭ������ ����ȭ�� �Ϸ��� Serializable �� �ؾ��մϴ�. 
 * Hash�� �̹� �������̽��� ��� �ް� �ֽ��ϴ�. 
 */

public class Object_Serializable_General_Class_Define implements Serializable {



	public static void main(String[] args) {

		try {
			
			FileOutputStream fos  = new FileOutputStream("d:\\doc\\out9.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			//���Ϸ� ������ ���
			//����ȭ�� �����͸� ������ �ڵ� 
			
			oos.writeObject(new MyData("ȫ�浵",70,"111"));
			oos.writeObject(new MyData("�̼���",55,"222"));
			oos.writeObject(new MyData("������",30,"333"));
			oos.writeObject(new MyData("�����",20,"555"));
			
			fos.close();
			oos.close();
			
		    System.out.println("����ȭ ���� !!");
		  
		  
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