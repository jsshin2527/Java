package Object_Serializable;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Hashtable;
import java.util.Iterator;

public class Object_Serializable_Deserializable_Hash {

	public static void main(String[] args) {

		try {
		//역직렬화 
		FileInputStream fis = new FileInputStream("d:\\doc\\out8.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		
		//HashMap을 사용하면 랜덤하게 나옵니다. 
		//Hashtable을 사용했다면 정렬된 형태로 나왔습니다. 
		//hashtable 이 upcast 되었습니다 
		//아래 해당 코드는 downcast가 되었습니다. 
		
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
