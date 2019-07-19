/*
 * FileInputStream 
 * FileOutputStream 
 * 
 */
package Stream;

import java.io.FileInputStream;

public class Stream_FileInputStream {

	public static void main(String[] args) {
	
		try {
			
			FileInputStream fis = new FileInputStream("d:\\doc\\test.txt");
			
			int data;
			
			while((data=fis.read())!=-1) {
				
				System.out.write(((char)data));			
				System.out.flush();	
			}	
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
