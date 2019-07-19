package Stream;

import java.io.FileOutputStream;

public class Stream_FileOutputStream {

	public static void main(String[] args) {
		
		try {
			
			FileOutputStream fos = new FileOutputStream("d:\\doc\\.out.txt");
			
			int data;
			System.out.println("문자열 입력 : ");
		
			while((data=System.in.read())!= -1) {
				
				fos.write(data);
				fos.flush(); // 생략 불가 
			}
			fos.close();
		} catch (Exception e) {
			
		}
	}
}

