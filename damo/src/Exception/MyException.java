package Exception;
//������ Ŭ���� 

public class MyException extends Exception{ //�θ��� Exception�� ��� �����Ƿ� 

	private static final long serialVersionUID = 1l; // ��Ŭ���� �ڵ� ��� �Ǵµ� ����� ���ַ��� ��� 
	
	public MyException(String msg) {
		super(msg); //�����ε��� �����ڸ� ������ �ֽ��ϴ�. 
	}
}
