package Stream;

import java.io.FileOutputStream;

public class Stream_FileOutputStream {

	public static void main(String[] args) {
		
		try {
			
			FileOutputStream fos = new FileOutputStream("d:\\doc\\.out.txt");
			
			int data;
			System.out.println("���ڿ� �Է� : ");
		
			while((data=System.in.read())!= -1) {
				
				fos.write(data);
				fos.flush(); // ���� �Ұ� 
			}
			fos.close();
		} catch (Exception e) {
			
		}
	}
}

