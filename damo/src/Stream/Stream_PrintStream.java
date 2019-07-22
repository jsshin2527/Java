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
				ps.println("이순신");
				ps.println("홍길동");
				ps.println("배수지");
				ps.println("이효리");
				
		
				ps.close();
				fos.close();
				
				//true : append 
				fos = new FileOutputStream("d:\\doc\\out5.txt",true);
				//new는 그대로 만드는 것입니다. true의 인자값을 준다면 그대로 
				//값을 누적하여 저장할수가 있습니다. 
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
