package Object_Serializable;
/*
 * ��ü�� ����ȭ 
 * �޸𸮿� ������ Ŭ���� ��ü�� �ν��Ͻ������� ���� ���¸� �׷��� �����ؼ� 
 * ���Ͽ� �����ϰų� ��Ʈ��ũ�� ���� �����Ҽ� �ִ� ��� 
 * ���� ����Ʈ �����θ� �����͸� �ۼ��� �Ҽ��� �ֽ��ϴ�. 
 * ���� : ��ü ��ü�� ������ ����� ���Ŀ� ������� ��ü�� ���Ͽ� ���������ν� ���Ӽ��� �����Ҽ��� �ְ�
 *        ��Ʈ��ũ���� ���� �ս��� �����͸� ��ȯ�� �Ҽ� �ֽ��ϴ�  
 * 
 * �޸𸮿� �ִ� ������ �״�� �ϵ��ũ�� �����ϴ� �۾��� ��ü�� ����ȭ ��� �մϴ�. 
 * implements :Serizlizable�� ����  
 */

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Hashtable;
import java.util.Map;

public class Object_Serializable_Hash {

	public static void main(String[] args) throws IOException {
		//����ȭ ��ü 
		//�̹� Serialzlizable �� ������ �Ǿ� �ֽ��ϴ�. 
		Map<String, String> hMap = new Hashtable<>();
		
		hMap.put("1","�����");
		hMap.put("2","�̼���");
		hMap.put("3", "�������� ����");
		FileOutputStream fos = new FileOutputStream("d:\\doc\\out8.txt");	
		//ObjectOutputStream
		//����ȭ�� �ϴ� ���� 
		//����ȭ�� ��ų���� �����ϴ�. 
		//�޸� ���� �����͸� �״�� �Űܳ����ű� ������ �����δ� �������� �ƴմϴ�. 
		//UpCast �� �մϴ�. 
		ObjectOutputStream oos = new ObjectOutputStream(fos);	
		oos.writeObject(hMap);
		oos.close();
		fos.close();
		
		System.out.println("���� ����ȭ ���� ");
	}
}
