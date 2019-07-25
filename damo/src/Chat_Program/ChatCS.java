package Chat_Program;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

/*
 * UDP ����� ä�� 
 * ���ۼӵ��� �����ϴ�. 
 * �ŷڼ��� ���� 
 * DatagreanSocket : UDP�� ����Ÿ�׷� ��Ŷ(Packet)
 * ��Ŷ : �ѹ��� ������ �ִ� �������� �� 
 * DataGramPacket : UDP�� ���ؼ� ���۵ɼ� �ִµ� ������ 
 * MultiCastSocket : �ټ��� Ŭ���̾�Ʈ �� �����͸� ���� 
 * �׷���� 
 * IP : A class  B class C class 
 * D class  224:0.0.0 ~ 239.255.255.255
 * A class : 0~126
 * B class : 128~
 * C class :  
 * D class : intrnet 
 * 
 */
public class ChatCS extends Frame implements Runnable,ActionListener {

	private static final long serialVersionUID = 1L;

	private MulticastSocket ms = null;
	private InetAddress xGroup = null;
	private String host = "230.0.0.1";
	private int port = 7777;
	private String userName = "js";
	
	private TextArea ta = new TextArea();
	private TextField tf = new TextField();
	
	public ChatCS() {
		ta.setEditable(false);
		add(ta,BorderLayout.CENTER);

		add(tf,BorderLayout.SOUTH);
		tf.addActionListener(this);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			
			}
		});	
		
			setTitle("ä��");
			setSize(400,400);
			setVisible(true);
			tf.requestFocus();
			
	}
	//��Ŷ�� �����ϴ� �޼ҵ� 	
	public void setup() {
		try {
			xGroup = InetAddress.getByName(host);
			ms = new MulticastSocket(port); // ���� ��Ʈ�� ����� 
			ms.joinGroup(xGroup);
			Thread th = new Thread(this);
			th.start();
		
		} catch (Exception e) {
		
		}
	}
	//��Ŷ�� ���� �޼ҵ� 
	public void disConnection() {
		try {
			ms.leaveGroup(xGroup);
			ms.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static void main(String[] args) {
		
		new ChatCS().setup();
	}
	
	@Override
	public void run() {
		
		try {
			while(true) {
				byte[] buffer = new byte[512];
				DatagramPacket dp = new DatagramPacket(buffer,buffer.length);
				ms.receive(dp);
				String str= new String(dp.getData()).trim();
				ta.append(str+"\r\n");
			}
		} catch (Exception e) {
			
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String str = tf.getText().trim();
		if(str.equals("")) {
			return;
		}
		
		byte[] buffer = (userName+"]"+str).getBytes();
		
		try {
			DatagramPacket dp = new DatagramPacket(buffer,buffer.length,xGroup,port);
			ms.send(dp);
			tf.setText("");
			tf.requestFocus();		
		} catch (Exception e2) {
			disConnection();
		}	
	}
}
