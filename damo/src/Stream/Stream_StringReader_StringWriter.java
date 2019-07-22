package Stream;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class Stream_StringReader_StringWriter {

	public static void main(String[] args) throws IOException {
	
		int ch;
		String str = "hello ! Monday ... ";
		
		StringReader sr = new StringReader(str);
		StringWriter sw = new StringWriter();
		
		while((ch= sr.read())!= -1) {
			sw.write(ch);
		}
		System.out.println(sw.toString());
		
		StringBuffer sb = sw.getBuffer();
		System.out.println(sb.toString());
	}

}
