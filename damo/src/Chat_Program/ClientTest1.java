package Chat_Program;
import java.awt.BorderLayout;
/*
 * �����带 ��� �޴� ��� 
 * extends Thread 
 * implements Runnable (�̹� ��ӹ��� Ŭ������ �ִٸ� ��� �ڹٴ� ���߻�� ������� �ʽ��ϴ�.) 
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

public class ClientTest1 extends Frame implements ActionListener,Runnable{
	

	private static final long serialVersionUID = 1L;

	private TextArea ta = new TextArea();
	private TextField tf =new TextField();
	
	//private ServerSocket ss = null;
	private Socket sc = null;
	private int port = 7777;
	private String host = "192.168.16.12"; //127.0.0.1
	
	
	public ClientTest1() {
		add(ta,BorderLayout.CENTER);
		add(tf,BorderLayout.SOUTH);
		
		tf.addActionListener(this);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});		
		setTitle("ä�� Ŭ���̾�Ʈ ");
		setSize(300,400);
		setVisible(true);	
	}
	//������ �����ϱ����� �޼ҵ� 
	
	public void connect() {
		try {
			//������ �õ� 
			sc = new Socket(host,port);
			
			Thread th = new Thread(this);
			//run �޼ҵ带 ȣ���մϴ�. 
			th.start();
			
		} catch (Exception e) {
			System.out.println("\n\r������ ������ �Ҽ��� �����ϴ�. ");
		}
	}
	
	public static void main(String[] args) {
		new ClientTest1().connect();
	}
	//�����͸� ������ 
	@Override
	public void actionPerformed(ActionEvent e) {

		
		String str = tf.getText();
		//���� ���� ���� ������ ���ִ� 
		if(str.trim().equals(null)) {
			return;
		}
		//������ null �̶�°��� ������ �����̴ϴ�. 
		if(sc == null) {
			return;
		}
		try {
			//�����͸� �������� 
			//������ ���۰� ���� �ʾƵ� �̺�Ʈ �߻��� ������ ��� 
			//true : flush 
			PrintWriter pw = new PrintWriter(sc.getOutputStream(),true);
			//Ŭ���̾�Ʈ���� �����͸� ������ 
			pw.println("\n\r[Ŭ���̾�Ʈ]"+str);
			//��â���� �����͸� ǥ�� 
			ta.append("\n\r[Ŭ���̾�Ʈ]"+str);
			tf.setText("");
			tf.requestFocus();
			
		} catch (Exception e2) {
			ta.append("\n\r ������ ���� ����");
			sc = null;	
		}
	}
	//�����͸� ������  
	@Override
	public void run() {
		
		String str; 
		//String ip;
		
		try {
			
			//������ �������� �ʾ����� 
			if(sc==null) {
				return;
			}
			InputStream is = sc.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader (is));
			//Ŭ���̾�Ʈ�� ���� �޽����� ���� 
			//ip = sc.getInetAddress().getHostAddress();
			//ta.append("\r\n["+ip+"] �� ���� !!");
			//Ŭ���̾�Ʈ�� ���� �����͸� ����  
			while((str=br.readLine())!= null) {
				ta.append("\n\r"+str);
			}
		} catch (Exception e) {
			ta.append("\n\r ������ ���� ���� ");
			//Socket ���� �ʱ�ȭ
			sc = null;
			//ss = null;
		}	
	}
}
