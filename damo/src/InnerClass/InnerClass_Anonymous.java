/*
 * ���� �߿� �̹� ��������ִ� �� 
 * �޸𸮿� �̹� �÷������ �ϴµ� ã������ ���ٴ°��� Ư¡ 
 */

package InnerClass;

public class InnerClass_Anonymous {

	public Object getTitle() { //UpCasting  -> Object �� ���Դٸ� UpCasting �� ������ �մϴ�. 
		
		
		//coding
	
		return new Object() {
			//anonymous �� �������� �׻� ; �־�� �Ѵ� 
			//anonymous �� �ּҰ��� ���� ������ �׳� ������ �ȴ� 
			@Override
			public String toString() {
				return "�͸��� Ŭ����"; //������ �������� ���� ���� Object �Դϴ�. 			
			}
		};
	}
	
	public static void main(String[] args) {
		
		InnerClass_Anonymous ob = new InnerClass_Anonymous();
		
		//String str = (String)ob.getTitle(); // DownCasting 
		
		//System.out.println(str);
		System.out.println(ob.getTitle());
		

	}

}
