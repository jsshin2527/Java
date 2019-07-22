package Stream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

/*
 * RandomAccessFile
 * 일반적인 파일은 순차적으로 Data를 읽음(카세트 테입) 
 * RandomAccessFile 은 원하는 곳으로 이동해서 읽음 (CD -> 원하는 곳으로 이동하여 데이터를 읽음 ) 
 */

public class Stream_RandomAceess {

	public static void main(String[] args) throws IOException {
	
		File f = File.createTempFile("imsi", "temp"); //어떤 데이터를 임시로 저장을 할때 createTemp파일 을 생성합니다 
		f.deleteOnExit(); // 프로그램을 실행할때 데이터를 잠깐 저장하고 프로그램이 끝날때 파일이 삭제됩니다. 
		
		FileOutputStream fos = new FileOutputStream(f);
		for (int i = 0; i < 100; i++) {
			fos.write(i);
		}
		fos.close();
		
		RandomAccessFile raf = new RandomAccessFile(f,"rw"); //읽기 쓰기가 가능합니다. 
		//정확하게 30번째 데이터를 읽어 옵니다. 
		
		raf.seek(30); 
		System.out.println("seek(30) " + raf.readByte());
		for (int i = 0; i < 100; i++) {
			raf.seek(i);
			System.out.println(raf.readByte());
		}
		
		raf.close();
	}
}
