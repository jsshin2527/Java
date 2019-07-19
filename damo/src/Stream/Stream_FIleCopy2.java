package Stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Stream_FIleCopy2 {
	
	public boolean fileCopy(String file1,String file2) {
		
		File f = new File(file1);
		
		if(!f.exists()) {
		
			return false;
	
		}
		
		try {
			FileInputStream fis = new FileInputStream(f);
			FileOutputStream fos = new FileOutputStream(file2);
			
			int data = 0;
			
			byte[] buffer = new byte[1024];
			
			while((data=fis.read(buffer,0,1024))!= -1){
				fos.write(buffer,0,data);
			}
			fis.close();
			fos.close();
			
		
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	return true;
	}
	public static void main(String[] args) {
		
		Stream_FIleCopy2 ob = new Stream_FIleCopy2();
		if(ob.fileCopy("d:\\doc\\test.txt","d:\\\\doc\\\\out3.txt")){
			System.out.println("파일 복사 성공 ");
		}else {
			System.out.println("파일 복사 실패 ");
		}
		
	}

}
