package Chat_Program;
import java.awt.BorderLayout;
/*
 * 스레드를 상속 받는 방법 
 * extends Thread 
 * implements Runnable (이미 상속받은 클래스가 있다면 사용 자바는 다중상속 허용하지 않습니다.) 
 */
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest1 extends Frame implements ActionListener,Runnable{
	

	private static final long serialVersionUID = 1L;

	private TextArea ta = new TextArea();
	private TextField tf =new TextField();
	
	private ServerSocket ss = null;
	private Socket sc = null;
	
	
	public ServerTest1() {
		
		add(ta,BorderLayout.CENTER);
		add(tf,BorderLayout.SOUTH);
		
		tf.addActionListener(this);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});			
		setTitle("채팅 서버");
		setSize(300,400);
		setVisible(true);
	}
	
	public void serverSocketstart() {
		try {
			
			//서버 소켓을 생성 
			ss = new ServerSocket(7777);
			ta.setText("서버 시작 !!");
			//클라이언트가 접속해 오기를 기다립니다. 
			//서버 소켓과 연결하는 작업이 필요 
			
			sc = ss.accept();
			
			Thread th = new Thread(this);
			//run 메소드를 호출합니다. 
			th.start();
			
		} catch (Exception e) {
			System.out.println("서버와 연결이 이상합니다.");
		}
	}
	
	public static void main(String[] args) {
		new ServerTest1().serverSocketstart();
	}

	//데이터를 보낼때 
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String str = tf.getText();
		
		//공백 제거 양쪽 공백을 없애다 
		if(str.trim().equals(null)) {
			return;
		}
		//소켓이 null 이라는것은 소켓이 죽은겁니다. 
		if(sc == null) {
			return;
		}
		try {
			//데이터를 내보낼때 
			//마지막 버퍼가 차지 않아도 이벤트 발생시 데이터 출력 
			//true : flush 
			PrintWriter pw = new PrintWriter(sc.getOutputStream(),true);
			//클라이언트에게 데이터를 보낼때 
			pw.println("\n\r[서버]"+str);
			//내창에도 데이터를 표시 
			ta.append("\n\r서버]"+str);
			tf.setText("");
			tf.requestFocus();
			
		} catch (Exception e2) {
			ta.append("\n\r 클라이언트와 연결 종료");
			sc = null;
		}
	}
	//데이터를 받을때  
	@Override
	public void run() {
		
		String str; 
		String ip;
		
		try {
			//클라이언트가 접속하지 않았으면 
			if(sc==null) {
				return;
			}
			InputStream is = sc.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader (is));
			
			//클라이언트가 보낸 메시지를 받음 
			ip = sc.getInetAddress().getHostAddress();
			ta.append("\r\n["+ip+"] 가 접속 !!");
			
			//클라이언트가 보낸 데이터를 받음  
			while((str=br.readLine())!= null) {
				ta.append("\n\r"+str);
			}
			
		} catch (Exception e) {
			ta.append("\n\r 클라이언트와 연결 종료 ");
			//Socket 정보 초기화 

			sc = null;
			ss = null;
		}
		
	}

	
}
