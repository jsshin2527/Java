package Stream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * DataInputStream 
 * 자바의 자료형을 직접 읽을수 있고 플랫폼과는 무관하게 동작한다 
 * Liunx 시스템에서 읽어드릴수도 있고 window시스템에서도 읽어 드릴수있습니다. 
 * 
 */

public class Stream_DataInpuStream {

	public static void main(String[] args) {
		
		try {
			
			FileOutputStream fos = new FileOutputStream("d:\\doc\\out7.txt");
			DataOutputStream dos = new DataOutputStream(fos);
			
		
			//이것만 사용하면 깨져서 출력됨 
			dos.writeUTF("대한민국");
			dos.writeByte(10);
			dos.writeChar('A');
			dos.writeInt(20);
			
			fos.close();
			
			FileInputStream fis = new FileInputStream("d:\\doc\\out7.txt");
			DataInputStream dis = new DataInputStream(fis);
			
			System.out.println(dis.readUTF());
			System.out.println(dis.readByte());
			System.out.println(dis.readChar());
			System.out.println(dis.readInt());
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
