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
import java.net.InetSocketAddress;
import java.net.Socket;

public class Personal_Client_Chat extends Frame implements ActionListener{

	private static final long serialVersionUID = 1L;
	
	private TextField tf2;
	private TextArea ta;
	
	private Button btn;
	private String user = "Client";
	
	private final int SERVER_PORT = 8880;
	private final String SERVER_IP = "127.0.0.1"; 
	String strnet;
	Socket socket = null;

	public void socketClient() {
		
		try {			
			strnet = "[연결을 요청]";
			socket = new Socket(SERVER_IP,SERVER_PORT);
			ta.setText(strnet);
			//System.out.println("[연결을 요청]");
			//Socket socket = new Socket(new InetSocketAddress(SERVER_IP,SERVER_PORT));
			//socket.connect(new InetSocketAddress(SERVER_IP,SERVER_PORT));		
			//System.out.println("[연결 성공]");
			strnet = "[서버에 접속하였습니다.]";
			ta.setText(strnet);	
			
		} catch (Exception e) {
			e.printStackTrace();
		}//InputStream stream = socket.getInputStream();
			//BufferedReader br = new BufferedReader(new InputStreamReader(stream));
			
			//String respone = br.readLine();
			
			//socket.close();
			//System.exit(0);
			
			if(!socket.isClosed()) {
				try {
					socket.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}		
	}
	
	public Personal_Client_Chat() {
		
		ta = new TextArea();
		//tf1 = new TextField();
		tf2 = new TextField();
		
		btn = new Button("전송");
		
		setLayout(null);
		setSize(400,300);
		setTitle("채팅 프로그램");
		setVisible(true);
		setResizable(false);
		
		
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
	
		socketClient();
	}	


	public static void main(String[] args) {
		new Personal_Client_Chat();
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

