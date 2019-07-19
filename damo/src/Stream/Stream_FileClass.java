package Stream;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/*
 * FIle 클래스 
 * 파일 및 폴더를 관리 할수 있게 기능을 제공 
 * 파일의 복사 또는 변경등을 조작할수 없는 기능을 제공합니다. 
 * 내용을 입출력하기위한 메소드는 제공하지 않습니다.  
 *  
 */

public class Stream_FileClass {

	public static void main(String[] args) throws IOException {
	
		File f = new File("d:\\doc\\test.txt");
		
		System.out.println("파일 정보 ... ");
		System.out.println("파일명 : " +f.getName());
		System.out.println("파일 길이 " +f.length());
		System.out.println("파일 절대 경로 "+ f.getAbsolutePath());
		System.out.println("파일 표준 경로 "+ f.getCanonicalPath());
		System.out.println("만든날 : " + new Date(f.lastModified()));
		System.out.println("파일 상위경로 " + f.getParent());
		System.out.println("읽기 속성 : "+ f.canRead());
		System.out.println("쓰기 속성 : "+ f.canWrite());
		
		//현재 프로그램의 경로 
		String p = System.getProperty("user.dir"); //현재 사용자가 사용하는 디렉토리 정보가 담겨있음 
		System.out.println("현재 경로 : " + p);
	}
}
