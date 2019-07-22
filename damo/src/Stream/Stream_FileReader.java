package Stream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/*
 * FileReader
 * 파일에서 바이트 단위로 읽고 문자/바이트 스트림으로 전환 
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
