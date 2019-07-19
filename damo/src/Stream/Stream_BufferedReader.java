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
			
			//readLine은 String 값으로 반환을 하기 때문에 char형의 반환값 -1이 아닌 null 값을 선언합니다. 
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
