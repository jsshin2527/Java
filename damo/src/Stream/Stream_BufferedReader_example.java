package Stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Stream_BufferedReader_example {

	public final static int BUFFER_SIZE = 512;
	
	public static void main(String[] args) {
		
		//Buffer�� ���� �ٲ��� ���ϰ� ��� 
		
		byte[] buffer = new byte[BUFFER_SIZE];
		
		try {
			
			/*
			 * Stream ���μ� ����ϱ� 
			 * 
			 */
			FileInputStream fis = new FileInputStream("d:\\doc\\test.txt");
			FileOutputStream fos = new FileOutputStream("d:\\doc\\out6.txt");
			
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			int n,len =0;
			
			while((n=bis.read(buffer)) != -1){
				System.out.println("���� ���� ���� : " + n);
				len += n;
				bos.write(buffer,0,len);
				bos.flush();
			}
			System.out.println("�о� �帰 ��ü ���� : "+len);
			
			fos.close();
			fis.close();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
