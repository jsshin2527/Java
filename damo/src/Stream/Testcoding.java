
package Stream;

import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
/*
 * FileFilter �������̽� 
 * �ش� �ڵ��� ��ü�� 2�� �����ϴ°����� 
 * ��ü�� �����԰� ���ÿ� �ʱ�ȭ�� �߽��ϴ� 
 * FileŬ������ ����ϸ鼭 ������ ��ü�� �����߽��ϴ�. 
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
