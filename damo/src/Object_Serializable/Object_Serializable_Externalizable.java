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
 * externalizable ���� ���̽� 
 * Serializable�� ���� �������̽��� Serializable �� ������ ����� �ϵ� 
 * ���� �� �Ϻ��� ��� �����ϴ� 
 * writeExternal().readExternal() �޼ҵ带 ���� �Ѵ� 
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
	
	@Override // ����ȭ �Ҷ�(����) ȣ��
	public void writeExternal(ObjectOutput out) throws IOException {
		
		out.writeObject(name);
		out.writeInt(age);
		
	}
	
	@Override //����ȭ�� �����͸� ������ ������ ȣ�� 
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
	
		name = (String)in.readObject();
		age = in.readInt();	
		System.out.println("writeExternal () ȣ��  ");
	}
}

public class Object_Serializable_Externalizable {

	public static void main(String[] args) {
	
		DataTest ob = new DataTest("�����",25);
		
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
