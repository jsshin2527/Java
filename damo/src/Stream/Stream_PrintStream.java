package Stream;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class Stream_PrintStream {

	public static void main(String[] args) {

			try {
				FileOutputStream fos;
				PrintStream ps;
				
				fos = new FileOutputStream("d:\\doc\\out5.txt");
				ps = new PrintStream(fos);				
				ps.println("�̼���");
				ps.println("ȫ�浿");
				ps.println("�����");
				ps.println("��ȿ��");
				
		
				ps.close();
				fos.close();
				
				//true : append 
				fos = new FileOutputStream("d:\\doc\\out5.txt",true);
				//new�� �״�� ����� ���Դϴ�. true�� ���ڰ��� �شٸ� �״�� 
				//���� �����Ͽ� �����Ҽ��� �ֽ��ϴ�. 
				ps = new PrintStream(fos);
				
				ps.println("A");
				ps.println("B");
				ps.println("C");
				ps.println("D");
				
				ps.close();
				fos.close();
			} catch (Exception e) {
				System.out.println(e.toString());
			}
	}

}
