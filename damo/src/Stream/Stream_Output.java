package Stream;

import java.io.IOException;
import java.io.OutputStream;

public class Stream_Output {

	public static void main(String[] args) throws IOException {
		
		OutputStream os = System.out;// �ܼ��ϰ� ���𰡸� �������� ����ϴ� ��Ʈ�� 
		
		byte[] b = new byte[3]; //byte�� �迭 ���� Buffer����Ѵ�  
		
		b[0] = 65;
		b[1] = 97;
		b[2] = 122;
		
		os.write(b); // �迭�� �������� �ֽ��ϴ�. 
		
		os.close(); // 
		System.out.println("�� ���̳� "); // �� ���� 
		
	}

}
