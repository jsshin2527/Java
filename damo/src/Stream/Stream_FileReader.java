package Stream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/*
 * FileReader
 * ���Ͽ��� ����Ʈ ������ �а� ����/����Ʈ ��Ʈ������ ��ȯ 
 * 
 */

public class Stream_FileReader {

	public static void main(String[] args) throws FileNotFoundException {

		FileReader fr = new FileReader("d:\\doc\\test.txt");
		BufferedReader br = new BufferedReader(fr);
		
		try {
			String str;
			while((str=br.readLine())!= null) {
				System.out.println(str);
			}
			fr.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
