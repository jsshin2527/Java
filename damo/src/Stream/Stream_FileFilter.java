package Stream;

import java.io.File;
import java.io.FileFilter;

//FileFilter 인터페이스 
//해당 코딩은 객체를 2개 생성하는것으로 
//객체를 생성함과 동시에 초기화를 했습니다. 
//File 클래스를 사용하면서 파일의 객체를 생성했습니다. 
class MyFileList implements FileFilter{
	
	private File f;
	
	//나는 파일 경로를 줄것인데 객체를 불러울때 경로를 지정해주고 싶다 
	//****** 매우 중요 *******
	public MyFileList(String filepath) {
		f = new File(filepath);
	}
	
	public void result() {
		
		try {
			
			if(!f.exists()) {
				System.out.println("파일이 없습니다");
				return;
			}
			System.out.println("절대 경로 : "+f.getAbsolutePath());
			System.out.println("파일 크기 : "+f.length());
			//내가 읽어올 파일이 디렉토리일경우 	
			if(f.isDirectory()) {
			
				File[] lists = f.listFiles(this/*알아서 경로에 저장을 합니다 Accept에서 넘어 옵니다. */);
				
				System.out.println("\n폴더 출력 .....");
				for (int i = 0; i < lists.length; i++) {
					//File file = lists[i];
					System.out.print(lists[i].getName());
					System.out.println("\t "+lists[i].length());
				}
			}
			System.out.println("\n 루트 디렉터토리 구조");
			
			File[] root = File.listRoots();
			
			for (int i = 0; i < root.length; i++) {
				System.out.println(root[i].getPath());
			}
			
			//C:
			//D:
			
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}
	@Override
	public boolean accept(File pathname) {
		
		return pathname.isFile() || pathname.isDirectory();
		//return pathname.isFile();
		//return pathname.isDirectory(); 
	}
	
}

public class Stream_FileFilter {

	public static void main(String[] args) {
		
		MyFileList nf = new MyFileList("d:\\java\\eclipse");		
		nf.result();
	}
}
