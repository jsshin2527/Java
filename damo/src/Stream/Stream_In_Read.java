/*
 * ����� Stream
 * ������ ����½� ��� �����͸� ���¿ʹ� ������� 
 * �Ϸõ� �帧���� �����ϴ°� 
 * A��� ������ B��� ������ ���𰡸� �������� �Ҷ� 
 * 
 * 
 * Read
 */

package Stream;

import java.io.IOException;

public class Stream_In_Read {
	public static void main(String[] args) throws IOException {
		
		int data;
		System.out.print("���ڿ� �Է� :");
		while((data=System.in.read()) != -1/*1byte ���� ��� �о� ��  -1 : ���� ������ ������ �о� ����� */) {
			char ch  = (char)data;
			System.out.print(ch);
			//���� �⺻���� ��Ʈ�� 	
		}
	}
}
