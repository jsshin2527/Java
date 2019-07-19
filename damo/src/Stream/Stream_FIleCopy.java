package Stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

//파일 복사 
//test.txt -> out2.txt
//원본파일 ? d:\\doc\\test.txt
//대상 파일 ? d:\\doc\\out2.txt

public class Stream_FIleCopy {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	
		try {
		
		System.out.print("복사할 파일명을 입력하세요 : ");
		String inputtxt = sc.next();
		System.out.print("출력할 파일 명을 입력하세요  ");
		String outputtxt = sc.next();	
		String defaultpath = "d:\\doc\\";
		FileInputStream fis = new FileInputStream(defaultpath+inputtxt);
		FileOutputStream fos = new FileOutputStream(defaultpath+outputtxt);
				
		int data;
	
		 while((data=fis.read()) != -1  /*파일을 읽어 드림 */) { 
			fos.write(data); //읽어드린 데이터 내용을 write로 내보냄 
		}
		 System.out.println("복사 성공 ");
		 fis.close();
		 fos.close();
 
		}catch (Exception e) {
			System.out.println(e.toString());
		}finally {
		
		}
	}

}
