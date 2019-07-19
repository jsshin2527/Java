package Stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

//���� ���� 
//test.txt -> out2.txt
//�������� ? d:\\doc\\test.txt
//��� ���� ? d:\\doc\\out2.txt

public class Stream_FIleCopy {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	
		try {
		
		System.out.print("������ ���ϸ��� �Է��ϼ��� : ");
		String inputtxt = sc.next();
		System.out.print("����� ���� ���� �Է��ϼ���  ");
		String outputtxt = sc.next();	
		String defaultpath = "d:\\doc\\";
		FileInputStream fis = new FileInputStream(defaultpath+inputtxt);
		FileOutputStream fos = new FileOutputStream(defaultpath+outputtxt);
				
		int data;
	
		 while((data=fis.read()) != -1  /*������ �о� �帲 */) { 
			fos.write(data); //�о�帰 ������ ������ write�� ������ 
		}
		 System.out.println("���� ���� ");
		 fis.close();
		 fos.close();
 
		}catch (Exception e) {
			System.out.println(e.toString());
		}finally {
		
		}
	}

}
