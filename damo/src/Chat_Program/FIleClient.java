package Chat_Program;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class FIleClient {
	
	public static void main(String[] args) {
		int port = 7777;
		String host = "127.0.0.1";
		Socket sc = null;
		ObjectOutputStream oos = null;		
		Scanner scn =new Scanner(System.in);		
		String file;
		try {
			System.out.print("파일명 : "); //d:\\doc\\test.txt
			file = scn.next();
			File f = new File(file);
			
			if(!f.exists()) {
				System.out.println("파일이 없습니다. ");
				System.exit(0);
			}
			//서버 연결 
			sc = new Socket(host,port);
			oos = new ObjectOutputStream(sc.getOutputStream());
			oos.flush();
			//파일 정보 시작 
			FileInfo info;
			//100 파일의 이름을 보냅니다. 
			info = new FileInfo();
			info.setCode(100);
			//byte 단의로만 보낼수 있습니다. 
			info.setData(f.getName().getBytes());
			info.setSize((int)f.length());
			oos.writeObject(info);
			System.out.println(f.getName()+"파일 전송 시작 .. ");
			//데이터를 마구 보내면 네트워크에서 딜레이가 생길수 있습니다. 
			//따라서 쓰레드를 잠시 재웁니다. 
			Thread.sleep(30);
			// 파일 전송 
			FileInputStream fis = new FileInputStream(f);
			int data = 0;
			byte[] buffer = new byte[1024];
			while((data=fis.read(buffer,0,1024))!= -1) {
				info = new FileInfo();
				info.setCode(110);
				info.setSize(data);
				info.setData(buffer);
				
				oos.writeObject(info);
				System.out.println(data+"bytes 전송중 ....");
				
				buffer = new byte[1024];				
				Thread.sleep(300);
			}
			fis.close();
			//파일 전송 종료 
			
			//100 파일의 이름을 보냅니다. 
			info = new FileInfo();
			info.setCode(200);
			
			//byte 단의로만 보낼수 있습니다. 
			info.setData(f.getName().getBytes());
			info.setSize((int)f.length());
			
			oos.writeObject(info);
			System.out.println(f.getName()+"파일 전송 끝 .. ");
			
			//데이터를 마구 보내면 네트워크에서 딜레이가 생길수 있습니다. 
			//따라서 쓰레드를 잠시 재웁니다. 
			Thread.sleep(30);
			oos.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
