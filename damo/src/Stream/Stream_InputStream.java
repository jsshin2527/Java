package Stream;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

import javax.swing.InputMap;

//InputStreamReader : BrigeStream 
//1byte Stream �� 2byte�� Stream���� ��ȯ 
//system.in�� �о�帰 1byte�� 2byte(����)�� ��ȯ 

public class Stream_InputStream {

	public static void main(String[] args) throws IOException {
	
		int data;
		System.out.print("���ڿ� �Է� : ");

		Reader rd = new InputStreamReader(System.in);
		
		while((data=rd.read())!= -1) {
			
			char ch= (char)data;
			System.out.print(ch);
			
		}
		
		//Reader //����������  �о����� �� �׸� 
		
		//Writer //���������� ����ؾ��� �׸� 

	}

}
