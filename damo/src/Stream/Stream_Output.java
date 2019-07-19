package Stream;

import java.io.IOException;
import java.io.OutputStream;

public class Stream_Output {

	public static void main(String[] args) throws IOException {
		
		OutputStream os = System.out;// 단순하게 무언가를 내볼낼때 사용하는 스트림 
		
		byte[] b = new byte[3]; //byte형 배열 선언 Buffer라고도한다  
		
		b[0] = 65;
		b[1] = 97;
		b[2] = 122;
		
		os.write(b); // 배열을 넣을수가 있습니다. 
		
		os.close(); // 
		System.out.println("나 보이냐 "); // 안 보임 
		
	}

}
