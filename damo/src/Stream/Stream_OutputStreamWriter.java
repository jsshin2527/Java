package Stream;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

//OutputStreamWriter

public class Stream_OutputStreamWriter {

	public static void main(String[] args) throws IOException {
		
		
		int data;
		
		byte[] bytedata = new byte[1024];
		
		System.out.print("���ڿ� �Է� :");
		
		Reader rd = new InputStreamReader(System.in);
		Writer wr = new OutputStreamWriter(System.out);
		
		while((data=rd.read())!= -1) {
			wr.write(data);//���۰� ������ �ʾƼ� ������ �ʽ��ϴ�. 
			wr.flush(); //������ �Ұ���  
		}
	}

}
