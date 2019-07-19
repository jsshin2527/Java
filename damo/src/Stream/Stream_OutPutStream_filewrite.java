package Stream;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Stream_OutPutStream_filewrite {

	public static void main(String[] args) {
		try {
			
			FileOutputStream fos = new FileOutputStream("d:\\doc\\out4.txt");
			
			PrintStream ps = new PrintStream(fos);
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			String str;
			System.out.println("문자열 입력 : ");
			
			while((str = br.readLine())!=null) {
				ps.print(str); // ln을 지우면 일렬로 정보값이 입력이 됩니다. 
			}
			
			ps.close();
			fos.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

}
