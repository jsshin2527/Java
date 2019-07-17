package excep;

public class OperationAuthenticator {

	public void inputFormat(String str) throws MyException {

		String temp[] = str.split(",");
		if(temp.length!=2)
			throw new MyException("�����Է� ���� ����: " + str);

	}

	public void number(String str) throws MyException{

		try {

			if(str.indexOf(",")!=-1) {
				double num = Double.parseDouble(str);
			}else {
				@SuppressWarnings("unused")
				int num = Integer.parseInt(str);
			}
		}catch (Exception e) {
			throw new MyException("���ں�ȯ �Ұ�: " + str);
		}

	}

	public void operator(char ch)  throws MyException {

		switch(ch) {

		case '+' : case '-' : case '*' : case '/' :
			return;
		default:
			throw new MyException("������ ����: " + ch);

		}
	}

}