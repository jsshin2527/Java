package Chat_Program;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ServerTest2 {

	//소켓은 ArrayList 에 담게 됩니다. 
	private ArrayList<Socket> clients = new ArrayList<>();
	
	private void serverStart() {
		try {
			ServerSocket ss = new ServerSocket(7777);
			System.out.println("서버 시작");
			
			while(true) {
				//클라이언트가 들어올때마다 소켓을 생성 
				Socket sc = ss.accept();
				WorkerThread wt = new WorkerThread(sc);					
				wt.start();
			}	
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	//내부클래스 ServerTest2클래스안에서만 사용하는 클래스
	//소켓별 스레드 생성 
	class WorkerThread extends Thread{		
		private Socket sc;
		public WorkerThread(Socket sc) {
			this.sc = sc;
		}
		@Override
		public void run() {
			String ip = null;
			String msg = null;		
			try {
				BufferedReader br = new BufferedReader(new InputStreamReader(sc.getInputStream()));
				ip = sc.getInetAddress().getHostAddress();
				clients.add(sc);
				//다른 클라이언트에게 접속사실을 알림 
				msg = "["+ip+"]가 입장했습니다.";
				for(Socket s : clients/*ArrayList*/) {			
					if(s == sc) {
						continue; //이번만 통과 ( 이것만 작업하지말고 다시 올라가 
					}
					PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
					pw.println(msg);
				}
				//제대로 출력하는지 서버에도 가라 
				System.out.println(msg);	
				while((msg=br.readLine())!=null){
					for(Socket s : clients) {
						if(s== sc) {
							continue;
						}
						PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
						pw.println(msg);
					}
				}
			}catch (Exception e) {
				msg = "["+ip+ "]가 퇴장했습니다.";	
				//자기 자신을 제외한 다른사람의 퇴장 메시지를 출력 
				try {
					for(Socket s : clients/*ArrayList*/) {
						if(s == sc) {
							continue; //이번만 통과 ( 이것만 작업하지말고 다시 올라가 
						}
						PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
						pw.println(msg);
					}
					//제대로 출력하는지 서버에도 가라 
					System.out.println(msg);
				} catch (Exception e2) {
				
				}
			}
		}	
	}
	public static void main(String[] args) {
		new ServerTest2().serverStart();
	}
}
