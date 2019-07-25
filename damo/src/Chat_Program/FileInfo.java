package Chat_Program;

/*
 * 직렬화 하여 데이터를 보냅니다 
 */

import java.io.Serializable;

public class FileInfo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	//code 
	//100  : 파일 전송 시작 (파일명 전송)
	//110  : 파일내용을 전송
	//200  : 파일 전송 종료 
	//size : 데이터 전송 크기 
	//data : 데이터 
	
	private int code;
	private int size;
	private byte[] data= new byte[1024];
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public byte[] getData() {
		return data;
	}
	public void setData(byte[] data) {
		this.data = data;
	}
	
	
	
	

}
