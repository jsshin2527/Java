package JavaWindow;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 * Home�ȿ� �ִ� ��ü�� �̺�Ʈ�� �����ϴ� �������̽� 
 * 
 */

public class JavaAWT_Event_Object extends Frame implements ActionListener{
	
	private static final long serialVersionUID = 1L;

	private Button btn;
	private TextArea ta;
	private TextField tf;
	
	public JavaAWT_Event_Object() {
		btn = new Button("�߰�");
		ta = new TextArea();
		tf = new TextField();
		
		add(tf,BorderLayout.NORTH);
		add(ta,BorderLayout.CENTER);
		add(btn,BorderLayout.SOUTH);
		
		addWindowListener(new WindowAdapter() {
			//frame ���� �ڵ� 
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
			
		});
		//������ 
		tf.addActionListener(this);
		btn.addActionListener(this);
		
		setTitle("������");
		setSize(200,300);
		setVisible(true);
	}
	public static void main(String[] args) {	
		new JavaAWT_Event_Object();
	}
	//home �ȿ��� ��� event�� ���⼭ ������ �˴ϴ�. 
	// ���⼭ �޴� �����ʹ� Object�� 
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object ob = e.getSource();
		
		if(ob instanceof Button || ob instanceof TextField) {
			//enter�� event �Դϴ�. 
			String str = tf.getText();
			
			if(!str.equals(null)) {
				ta.append(str + "\r\n"); // \r\n �ٹٲ�+���� Ŀ�� 
			}
		tf.setText("");
		tf.requestFocus();
		}
	}
	
}
