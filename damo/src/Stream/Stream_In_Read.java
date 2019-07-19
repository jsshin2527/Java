/*
 * 입출력 Stream
 * 데이터 입출력시 모든 데이터를 형태와는 관계없이 
 * 일련된 흐름으로 전송하는것 
 * A라는 곳에서 B라는 곳으로 무언가를 보내려고 할때 
 * 
 * 
 * Read
 */

package Stream;

import java.io.IOException;

public class Stream_In_Read {
	public static void main(String[] args) throws IOException {
		
		int data;
		System.out.print("문자열 입력 :");
		while((data=System.in.read()) != -1/*1byte 값을 계속 읽어 냄  -1 : 값이 있을때 까지만 읽어 드려라 */) {
			char ch  = (char)data;
			System.out.print(ch);
			//가장 기본적인 스트림 	
		}
	}
}
