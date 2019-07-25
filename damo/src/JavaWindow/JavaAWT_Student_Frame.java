package JavaWindow;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class JavaAWT_Student_Frame extends Frame implements ActionListener {

	//국어 영어 수학을 만드는 배열 만들기 
	private TextField[] tf = new TextField[4];
	//총점을 출력 
	private Label result = new Label("",Label.LEFT);
	private Button btn1 ,btn2;
	private JavaAWT_Student_Frame() {
		String[] title = {"이름","국어","영어","수학","총점"};
		setTitle("성적처리");
		setLayout(null); //레이아웃 초기화 (수동배치) Layout을 없애다 
		
		
		for (int i = 0; i < 5 ;i++) {
			//레이블 
			Label lbl = new Label();
			lbl.setText(title[i]);
			lbl.setBounds(15,(i+1)*30,50,20);
			add(lbl);
			
			if(i!=4) {				
				tf[i] = new TextField();
				//rec[i] = new Record();
				tf[i].setBounds(80, (i+1)*30, 70,20);
				tf[i].addKeyListener(new KeyHandler());
				//
				add(tf[i]);
			}else {
				result.setBounds(80,(i+1)*30,70,20);
				add(result);
			}
			
		}
		//버튼 
		btn1 = new Button("결과");
		btn1.setBounds(180, 30, 60, 20);
		add(btn1);
		btn1.addActionListener(this);
		btn1.addKeyListener(new KeyHandler());
		
		//
		btn2 = new Button("종료");
		btn2.setBounds(180, 60, 60, 20);
		add(btn2);
		btn2.addActionListener(this);		
		btn2.addKeyListener(new KeyHandler());
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		setSize(260,180);
		setResizable(false);
		setVisible(true);
	}	
	public static void main(String[] args) {
		new JavaAWT_Student_Frame();
	}
	
	//이벤트가 발생했을때 움직이는 메소드 
	//keyborad를 관리하는 어댑터 
	//클래스 안에 클래스를 선언했지만 
	//독립적인 클래스로 인식이 됩니다. 
	
	class KeyHandler extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {
			Object ob = e.getSource();
			
			if(e.getKeyCode()!= KeyEvent.VK_ENTER) {
				return;
			}
			if(ob instanceof Button) {
				Button b = (Button)ob;
				
				if(b==btn1) {
					execute();
				}
				return;
			}
			if(ob instanceof TextField) {
				TextField t = (TextField)ob;
				for (int i = 0; i < tf.length; i++) {
					if(i!=3 && tf[i]==t) {
						tf[i+1].requestFocus();
						return;
					}else if(tf[3]==t) {
						btn1.requestFocus();
						return;
					}
				}
			}
		}		
	}
	private void execute() {
		
		int tot = 0;
		
		try {
			for (int i = 1; i<=3; i++) {
				tot += Integer.parseInt(tf[i].getText());
			}			
			result.setText(Integer.toString(tot));
		} catch (Exception e2) {
			
			result.setText("입력 오류");
		}
	}
	
	@Override //upcasting 이 되었음 
	public void actionPerformed(ActionEvent e) {
		//e 안에 어떤것을 받아내야 한다 
		Object ob = e.getSource();
		
		//Button 이 왔을때만 반응 
		//keyborad의 enter를 감지한다 
		if(ob instanceof Button ) {		
			Button b= (Button)ob;
			if(b == btn1) {
				execute();
				/*
				int tot = 0;
				try {
					for (int i = 1; i<=3; i++) {
						tot += Integer.parseInt(tf[i].getText());
					}			
					result.setText(Integer.toString(tot));
				} catch (Exception e2) {
					
					result.setText("입력 오류");
				}
				*/
			}else if(b==btn2){
				System.exit(0);
			}
		}
		
	}

}
