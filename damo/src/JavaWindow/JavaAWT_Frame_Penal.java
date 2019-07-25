package JavaWindow;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class JavaAWT_Frame_Penal extends Frame implements ActionListener{

	private static final long serialVersionUID = 1L;
	
	private TextField tf1,tf2,tf3,tf4;
	private Button btn1,btn2,btn3,btn4;
	
	public JavaAWT_Frame_Penal() {
		setLayout(new GridLayout(4,1));
		//자동으로 내려가서 배치 해줌 
		
		tf1 = new TextField();
		add(tf1);
		
		tf2 = new TextField();
		add(tf2);
		
				
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		
		setTitle("계산기");
		setSize(200,150);
		setVisible(true);
		
		Panel p = new Panel(); //add p를 명시하면됩니다. 
		
		btn1 = new Button("+");
		btn1.addActionListener(this);
		p.add(btn1);
		
		btn2 = new Button("-");
		btn2.addActionListener(this);
		p.add(btn2);
		
		btn3 = new Button("/");
		btn3.addActionListener(this);
		p.add(btn3);
		
		btn4 = new Button("*");
		btn4.addActionListener(this);
		p.add(btn4);
		
		add(p);
		
		tf3 = new TextField();
		add(tf3);
		
	}
	
	public static void main(String[] args) {
		
		new JavaAWT_Frame_Penal();
	}

	
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
		Object ob = e.getSource();
		
		if(ob instanceof Button) {
			Button b = (Button)ob;
		try {
			int num1 = Integer.parseInt(tf1.getText());
			int num2 = Integer.parseInt(tf2.getText());
			
			String str = "";
			
			if(b==btn1) {
				str = String.format("%d+%d=%d",num1,num2,(num1+num2));
			}else if(b==btn2) {
				str = String.format("%d+%d=%d",num1,num2,(num1-num2));
			}else if(b==btn3) {
				str = String.format("%d+%d=%d",num1,num2,(num1/num2));
			}else if(b==btn4) {
				str = String.format("%d+%d=%d",num1,num2,(num1*num2));
			}
			tf3.setText(str);
			
		} catch (Exception e2) {
			tf3.setText("입력오류");		
		}
	}
		/*
		int result = 0;
		int num1 = 0;
		int num2 = 0;
		char oper = 0;
		if(ob instanceof Button) {	
			
			if(ob == btn1) {
				num1 = (Integer.parseInt(tf1.getText()));
				num2 = (Integer.parseInt(tf2.getText()));
				oper = '+';
				result = num1+num2;
			}
			if(ob == btn2) {
				num1 = (Integer.parseInt(tf1.getText()));
				num2 = (Integer.parseInt(tf2.getText()));
				oper = '-';
				result = num1-num2;
			}
			if(ob == btn3) {
				num1 = (Integer.parseInt(tf1.getText()));
				num2 = (Integer.parseInt(tf2.getText()));
				oper = '*';
				result = num1/num2;
			}
			if(ob == btn4) {
				num1 = (Integer.parseInt(tf1.getText()));
				num2 = (Integer.parseInt(tf2.getText()));
				oper = '/';
				result = num1*num2;
			}
			String strresult = Integer.toString(result);
			String strnum1 = Integer.toString(num1);
			String strnum2 = Integer.toString(num2);
			String stroper = Integer.toString(stroper);
			tf3.setText(strnum1+stroper+strnum2+strresult);
		*/
	}
}
