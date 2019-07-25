import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Inet4Address;
import java.net.InetAddress;

public class JavaNetwork {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String host;
		
		
		//http://naver.com
		//도메인 :naver.com
		//host   :www
		//URL    :http://www,naver.com
		//hyper Text Transper Protocol(HTTP)
		
		System.out.print("호스트[www.naver.com]? : ");
		host = br.readLine();
		
		try {
			InetAddress ia = InetAddress.getByName(host);
			System.out.println("ip주소 : "+ ia.getHostAddress());
			System.out.println("호스트주소 : "+ ia.getHostName());
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
