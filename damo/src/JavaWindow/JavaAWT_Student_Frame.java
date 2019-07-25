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

	//���� ���� ������ ����� �迭 ����� 
	private TextField[] tf = new TextField[4];
	//������ ��� 
	private Label result = new Label("",Label.LEFT);
	private Button btn1 ,btn2;
	private JavaAWT_Student_Frame() {
		String[] title = {"�̸�","����","����","����","����"};
		setTitle("����ó��");
		setLayout(null); //���̾ƿ� �ʱ�ȭ (������ġ) Layout�� ���ִ� 
		
		
		for (int i = 0; i < 5 ;i++) {
			//���̺� 
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
		//��ư 
		btn1 = new Button("���");
		btn1.setBounds(180, 30, 60, 20);
		add(btn1);
		btn1.addActionListener(this);
		btn1.addKeyListener(new KeyHandler());
		
		//
		btn2 = new Button("����");
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
	
	//�̺�Ʈ�� �߻������� �����̴� �޼ҵ� 
	//keyborad�� �����ϴ� ����� 
	//Ŭ���� �ȿ� Ŭ������ ���������� 
	//�������� Ŭ������ �ν��� �˴ϴ�. 
	
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
			
			result.setText("�Է� ����");
		}
	}
	
	@Override //upcasting �� �Ǿ��� 
	public void actionPerformed(ActionEvent e) {
		//e �ȿ� ����� �޾Ƴ��� �Ѵ� 
		Object ob = e.getSource();
		
		//Button �� �������� ���� 
		//keyborad�� enter�� �����Ѵ� 
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
					
					result.setText("�Է� ����");
				}
				*/
			}else if(b==btn2){
				System.exit(0);
			}
		}
		
	}

}
