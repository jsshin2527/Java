package Object_Serializable;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
/*
 * externalizable 인터 페이스 
 * Serializable의 하위 인터페이스로 Serializable 과 동일한 기능을 하되 
 * 조금 더 완벽한 제어가 가능하다 
 * writeExternal().readExternal() 메소드를 정의 한다 
 * 
 * 
 */

class DataTest implements Externalizable{

	String name;
	int age;
	
	public DataTest() {}
	
	public DataTest(String name,int age) {
		
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		
		return name + " : " + age;
	}
	
	@Override // 직렬화 할때(저장) 호출
	public void writeExternal(ObjectOutput out) throws IOException {
		
		out.writeObject(name);
		out.writeInt(age);
		
	}
	
	@Override //직렬화된 데이터를 꺼낼때 복원시 호출 
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
	
		name = (String)in.readObject();
		age = in.readInt();	
		System.out.println("writeExternal () 호출  ");
	}
}

public class Object_Serializable_Externalizable {

	public static void main(String[] args) {
	
		DataTest ob = new DataTest("배수지",25);
		
		try {
			FileOutputStream fos = new FileOutputStream("d:\\doc\\out10.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(ob);
			
			fos.close();
			oos.close();
			
			FileInputStream fis = new FileInputStream("d:\\doc\\out10.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			
			DataTest dt = (DataTest)ois.readObject();
			System.out.println(dt.toString());
			
		} catch (Exception e) {
			
		}
	}
}
