package Stream;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

import javax.swing.InputMap;

//InputStreamReader : BrigeStream 
//1byte Stream 을 2byte의 Stream으로 변환 
//system.in이 읽어드린 1byte를 2byte(문자)로 변환 

public class Stream_InputStream {

	public static void main(String[] args) throws IOException {
	
		int data;
		System.out.print("문자열 입력 : ");

		Reader rd = new InputStreamReader(System.in);
		
		while((data=rd.read())!= -1) {
			
			char ch= (char)data;
			System.out.print(ch);
			
		}
		
		//Reader //보급형으로  읽어드려야 할 그릇 
		
		//Writer //보급형으로 출력해야할 그릇 

	}

}
