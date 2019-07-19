package Stream;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/*
 * FIle Ŭ���� 
 * ���� �� ������ ���� �Ҽ� �ְ� ����� ���� 
 * ������ ���� �Ǵ� ������� �����Ҽ� ���� ����� �����մϴ�. 
 * ������ ������ϱ����� �޼ҵ�� �������� �ʽ��ϴ�.  
 *  
 */

public class Stream_FileClass {

	public static void main(String[] args) throws IOException {
	
		File f = new File("d:\\doc\\test.txt");
		
		System.out.println("���� ���� ... ");
		System.out.println("���ϸ� : " +f.getName());
		System.out.println("���� ���� " +f.length());
		System.out.println("���� ���� ��� "+ f.getAbsolutePath());
		System.out.println("���� ǥ�� ��� "+ f.getCanonicalPath());
		System.out.println("���糯 : " + new Date(f.lastModified()));
		System.out.println("���� ������� " + f.getParent());
		System.out.println("�б� �Ӽ� : "+ f.canRead());
		System.out.println("���� �Ӽ� : "+ f.canWrite());
		
		//���� ���α׷��� ��� 
		String p = System.getProperty("user.dir"); //���� ����ڰ� ����ϴ� ���丮 ������ ������� 
		System.out.println("���� ��� : " + p);
	}
}
