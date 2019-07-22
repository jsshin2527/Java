package Stream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

/*
 * RandomAccessFile
 * �Ϲ����� ������ ���������� Data�� ����(ī��Ʈ ����) 
 * RandomAccessFile �� ���ϴ� ������ �̵��ؼ� ���� (CD -> ���ϴ� ������ �̵��Ͽ� �����͸� ���� ) 
 */

public class Stream_RandomAceess {

	public static void main(String[] args) throws IOException {
	
		File f = File.createTempFile("imsi", "temp"); //� �����͸� �ӽ÷� ������ �Ҷ� createTemp���� �� �����մϴ� 
		f.deleteOnExit(); // ���α׷��� �����Ҷ� �����͸� ��� �����ϰ� ���α׷��� ������ ������ �����˴ϴ�. 
		
		FileOutputStream fos = new FileOutputStream(f);
		for (int i = 0; i < 100; i++) {
			fos.write(i);
		}
		fos.close();
		
		RandomAccessFile raf = new RandomAccessFile(f,"rw"); //�б� ���Ⱑ �����մϴ�. 
		//��Ȯ�ϰ� 30��° �����͸� �о� �ɴϴ�. 
		
		raf.seek(30); 
		System.out.println("seek(30) " + raf.readByte());
		for (int i = 0; i < 100; i++) {
			raf.seek(i);
			System.out.println(raf.readByte());
		}
		
		raf.close();
	}
}
