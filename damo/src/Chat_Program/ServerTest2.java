package Chat_Program;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ServerTest2 {

	//������ ArrayList �� ��� �˴ϴ�. 
	private ArrayList<Socket> clients = new ArrayList<>();
	
	private void serverStart() {
		try {
			ServerSocket ss = new ServerSocket(7777);
			System.out.println("���� ����");
			
			while(true) {
				//Ŭ���̾�Ʈ�� ���ö����� ������ ���� 
				Socket sc = ss.accept();
				WorkerThread wt = new WorkerThread(sc);					
				wt.start();
			}	
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	//����Ŭ���� ServerTest2Ŭ�����ȿ����� ����ϴ� Ŭ����
	//���Ϻ� ������ ���� 
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
				//�ٸ� Ŭ���̾�Ʈ���� ���ӻ���� �˸� 
				msg = "["+ip+"]�� �����߽��ϴ�.";
				for(Socket s : clients/*ArrayList*/) {			
					if(s == sc) {
						continue; //�̹��� ��� ( �̰͸� �۾��������� �ٽ� �ö� 
					}
					PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
					pw.println(msg);
				}
				//����� ����ϴ��� �������� ���� 
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
				msg = "["+ip+ "]�� �����߽��ϴ�.";	
				//�ڱ� �ڽ��� ������ �ٸ������ ���� �޽����� ��� 
				try {
					for(Socket s : clients/*ArrayList*/) {
						if(s == sc) {
							continue; //�̹��� ��� ( �̰͸� �۾��������� �ٽ� �ö� 
						}
						PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
						pw.println(msg);
					}
					//����� ����ϴ��� �������� ���� 
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
