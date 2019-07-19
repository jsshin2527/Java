
package Stream;

import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
/*
 * FileFilter 인터페이스 
 * 해당 코딩은 객체를 2개 생성하는것으로 
 * 객체를 생성함과 동시에 초기화를 했습니다 
 * File클래스를 사용하면서 파일의 객체를 생성했습니다. 
 * 
 */
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;


	

public class Testcoding {

	public static void main(String[] args) throws IOException {
		
		InputStream ni = new FileInputStream("d:\\doc\\test.txt");
		
		byte[] by = new byte[1024];
		
		int data=0;
		
		while((ni.read(by,0,1024))!= -1){
			
			System.out.print());
		};
		
		ni.close();
	}
}
