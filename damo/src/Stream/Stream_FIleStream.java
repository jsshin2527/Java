package Stream;

import java.io.File;
import java.io.FileOutputStream;

public class Stream_FIleStream {

	public static void main(String[] args) {

		String str = "d:\\doc\\java\\test.txt";
				 //  123  4567 89012 345678910
		/*
		//방법1
		String path = str.substring(0,str.lastIndexOf("\\"));
		System.out.println(path);
		
		File f = new File(path);//d:\doc\java;
		
		if(!f.exists()) {
			f.mkdirs(); //지정된 디렉토리가 없으면 디렉토리를 생성하라
		}
		*/
		
		//방법2 121
		File f = new File(str);
		
		if(!f.getParentFile().exists()) {
			f.getParentFile().mkdirs();
		}
		
		try {
			FileOutputStream fos = new FileOutputStream(str);
			
			System.out.println("문자열 입력 : ");
			int data;
			while((data=System.in.read())!= -1) {
				fos.write(data);
				fos.flush();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
