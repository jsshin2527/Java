package Chat_Program;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Personal_Server_Chat extends Frame implements ActionListener{

	private static final long serialVersionUID = 1L;
	
	private TextField tf1,tf2;
	private TextArea ta;
	
	private Button btn;
	private String user = "Server";
	
	private final int SERVER_PORT = 8880;
	private final String SERVER_IP = "127.0.0.1"; 
	
	private ServerSocket serverSocket;
	private String strnet;
	private Socket socket = null;
	
	public void socketServer() {
		
		try {
			serverSocket = new ServerSocket(SERVER_PORT);	
			//serverSocket.bind(new InetSocketAddress(SERVER_IP, SERVER_PORT));
				
				while(true) {
					strnet = "[클라이언트 연결을 기다림]";
					ta.setText(strnet);
					//System.out.println("[연결을 기다림]");
					socket = serverSocket.accept();	
					//System.out.println(socket.getInetAddress() + "로 부터 연결요청이 들어옴");
					//InetSocketAddress isa = (InetSocketAddress)socket.getRemoteSocketAddress();
					strnet = "로 부터 연결이 들어옴";
					ta.setText(socket.getInetAddress()+ strnet);
					//System.out.println("[연결을 수락함]"+isa.getHostName());
				}
			} catch (Exception e) {
			e.printStackTrace();
		}
		
		if(!serverSocket.isClosed()) {
			try {
				serverSocket.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	public Personal_Server_Chat() {
		
		ta = new TextArea();
		//tf1 = new TextField();
		tf2 = new TextField();
		
		btn = new Button("전송");
		
		setLayout(null);
		setSize(400,300);
		setTitle("채팅 프로그램");
		setVisible(true);
		setResizable(false);
		
		/*
		tf1.setBounds(0,20,400,200);
		tf1.addActionListener(this);
		tf1.addKeyListener(new KeyHandler());
		add(tf1);
		*/
		
		ta.setBounds(10,30,370,200);
		add(ta);
		
		tf2.setBounds(0,240,400,20);
		tf2.addActionListener(this);
		tf2.addKeyListener(new KeyHandler());
		add(tf2);
		
		
		btn.setBounds(5,260,400,40);
		btn.addActionListener(this);
		btn.addKeyListener(new KeyHandler());
		add(btn);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);			
			}	
		});	
		socketServer();
	}	


	public static void main(String[] args) {
		new Personal_Server_Chat();
		
	}
	class KeyHandler extends KeyAdapter{
		
		@Override
		public void keyPressed(KeyEvent e) {
			
			Object ob = e.getSource();
			
			String str=tf2.getText();
			
			if(e.getKeyCode() != KeyEvent.VK_ENTER) {
				return;
			}
			if(ob instanceof TextField) {
				TextField b = (TextField)ob;
			
				if(b==tf2) {
					tf2.setText("");
					tf2.requestFocus();
					
					if(!str.equals(null)) {						
						ta.append(user+" : "+str+"\r\n");
					}
				}
			}
			
		}

	}
	@Override
	public void actionPerformed(ActionEvent e) {		
		Object ob = e.getSource();
		try {			
			if(ob instanceof Button) {
				Button b = (Button)ob;	
				if(b==btn) {
					String str ="";
					str = tf2.getText();
					ta.append(user+" : "+str+"\r\n");
				}	
			}
		} catch (Exception e2) {
			// TODO: handle exception
		}
		
		
	}
}

