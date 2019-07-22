package Object_Serializable;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Hashtable;
import java.util.Iterator;

public class Object_Serializable_Deserializable_Hash {

	public static void main(String[] args) {

		try {
		//������ȭ 
		FileInputStream fis = new FileInputStream("d:\\doc\\out8.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		
		//HashMap�� ����ϸ� �����ϰ� ���ɴϴ�. 
		//Hashtable�� ����ߴٸ� ���ĵ� ���·� ���Խ��ϴ�. 
		//hashtable �� upcast �Ǿ����ϴ� 
		//�Ʒ� �ش� �ڵ�� downcast�� �Ǿ����ϴ�. 
		
		Hashtable<String, String > hMap = (Hashtable<String,String>)ois.readObject();
		
		Iterator<String> it = hMap.keySet().iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			String value = hMap.get(key);
			System.out.println(key+ " : "+value);
		}
		}catch(Exception e) {
			
		}
		
	}

}
