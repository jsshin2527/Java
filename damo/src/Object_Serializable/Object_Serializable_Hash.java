package Object_Serializable;
/*
 * 객체의 직렬화 
 * 메모리에 생성된 클래스 객체의 인스턴스변수의 현재 상태를 그래로 보존해서 
 * 파일에 저장하거나 네트워크를 통해 전달할수 있는 기능 
 * 오직 바이트 단위로만 데이터를 송수신 할수가 있습니다. 
 * 장점 : 객체 자체의 내용을 입출력 형식에 상관없이 객체를 파일에 저장함으로써 영속성을 제공할수가 있고
 *        네트워크를를 통해 손쉽게 데이터를 교환을 할수 있습니다  
 * 
 * 메모리에 있는 내용을 그대로 하드디스크에 저장하는 작업을 객체의 직렬화 라고 합니다. 
 * implements :Serizlizable로 구현  
 */

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Hashtable;
import java.util.Map;

public class Object_Serializable_Hash {

	public static void main(String[] args) throws IOException {
		//직렬화 객체 
		//이미 Serialzlizable 로 구현이 되어 있습니다. 
		Map<String, String> hMap = new Hashtable<>();
		
		hMap.put("1","배수지");
		hMap.put("2","이수지");
		hMap.put("3", "안젤리나 졸리");
		FileOutputStream fos = new FileOutputStream("d:\\doc\\out8.txt");	
		//ObjectOutputStream
		//직렬화를 하는 도구 
		//직렬화를 시킬수는 없습니다. 
		//메모리 상의 데이터를 그대로 옮겨놓은거기 때문에 실제로는 깨진것은 아닙니다. 
		//UpCast 를 합니다. 
		ObjectOutputStream oos = new ObjectOutputStream(fos);	
		oos.writeObject(hMap);
		oos.close();
		fos.close();
		
		System.out.println("파일 직렬화 성공 ");
	}
}
