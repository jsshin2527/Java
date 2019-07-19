package Stream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;


public class Stream_BufferedReader {

	public static void main(String[] args) {
		
		try {
			
			FileInputStream fis = new FileInputStream("d:\\doc\\test.txt");
			
			BufferedReader br = new BufferedReader(new InputStreamReader(fis));
			
			String str;
			
			//readLine�� String ������ ��ȯ�� �ϱ� ������ char���� ��ȯ�� -1�� �ƴ� null ���� �����մϴ�. 
			while((str=br.readLine())!=null) {
			
				System.out.println(str);

			}
			
			fis.close();
			
		}catch(Exception e) {
			//System.out.println(e.getStackTrace());
			System.out.println(e.toString());
		}
	}

}
