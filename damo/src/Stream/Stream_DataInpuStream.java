package Stream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * DataInputStream 
 * �ڹ��� �ڷ����� ���� ������ �ְ� �÷������� �����ϰ� �����Ѵ� 
 * Liunx �ý��ۿ��� �о�帱���� �ְ� window�ý��ۿ����� �о� �帱���ֽ��ϴ�. 
 * 
 */

public class Stream_DataInpuStream {

	public static void main(String[] args) {
		
		try {
			
			FileOutputStream fos = new FileOutputStream("d:\\doc\\out7.txt");
			DataOutputStream dos = new DataOutputStream(fos);
			
		
			//�̰͸� ����ϸ� ������ ��µ� 
			dos.writeUTF("���ѹα�");
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
