package Class;

/*
 * Class Ŭ���� 
 * Ư�� Ŭ������ �������̽� ���� ������ �˻��ϴ� �޼ҵ� 
 *  
 */
class Test{
	public void write() {
		System.out.println("�׽�Ʈ ....");
	}
}


public class Class_NameClass {

	public static void main(String[] args) {
		
		try {
			
			Class c = Class.forName("Class.Test"); //�޸� �� �����մϴ�  
			Object o = c.newInstance(); //Test�� ��ü�� ���� 
			Test t = (Test)o;
			t.write();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
}
