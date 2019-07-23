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
 * Home안에 있는 객체의 이벤트를 관리하는 인터페이스 
 * 
 */

public class JavaAWT_Event_Object extends Frame implements ActionListener{
	
	private static final long serialVersionUID = 1L;

	private Button btn;
	private TextArea ta;
	private TextField tf;
	
	public JavaAWT_Event_Object() {
		btn = new Button("추가");
		ta = new TextArea();
		tf = new TextField();
		
		add(tf,BorderLayout.NORTH);
		add(ta,BorderLayout.CENTER);
		add(btn,BorderLayout.SOUTH);
		
		addWindowListener(new WindowAdapter() {
			//frame 종료 코드 
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
			
		});
		//감시자 
		tf.addActionListener(this);
		btn.addActionListener(this);
		
		setTitle("윈도우");
		setSize(200,300);
		setVisible(true);
	}
	public static void main(String[] args) {	
		new JavaAWT_Event_Object();
	}
	//home 안에서 모든 event는 여기서 관리가 됩니다. 
	// 여기서 받는 데이터는 Object로 
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object ob = e.getSource();
		
		if(ob instanceof Button || ob instanceof TextField) {
			//enter가 event 입니다. 
			String str = tf.getText();
			
			if(!str.equals(null)) {
				ta.append(str + "\r\n"); // \r\n 줄바꿈+앞줄 커서 
			}
		tf.setText("");
		tf.requestFocus();
		}
	}
	
}
