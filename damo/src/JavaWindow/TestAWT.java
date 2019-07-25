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

public class TestAWT extends Frame implements ActionListener{
	
	private TextField tf1,tf2,tf3,tf4;
	private Button btn1,btn2,btn3,btn4;
	
	public TestAWT() {
		
		setTitle("계산기");
		setLayout(new GridLayout(4,1));
		setSize(300,300);
		setVisible(true);
		setResizable(false);
		
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
		
		Panel p = new Panel();
		
		btn1 = new Button("+");
		btn1.addActionListener(this);
		p.add(btn1);
		
		btn2 = new Button("-");
		btn2.addActionListener(this);
		p.add(btn2);	
		
		btn3 = new Button("*");
		btn3.addActionListener(this);
		p.add(btn3);	
		
		btn4 = new Button("/");
		btn4.addActionListener(this);
		p.add(btn4);
		
		add(p);
		
		tf3 = new TextField();
		add(tf3);
		
	}
	
	public static void main(String[] args) {
		
		new TestAWT();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object ob = e.getSource();
		if(ob instanceof Button) {
			
			Button b = (Button)ob;
			try{
				int num1 = Integer.parseInt(tf1.getText());
				int num2 = Integer.parseInt(tf2.getText());
				String str = "";
				
				if(b==btn1) {
					str = String.format("%d+%d=%d",num1,num2,num1+num2);
				}else if(b==btn2) {
					str = String.format("%d+%d=%d",num1,num2,num1-num2);
				}else if(b==btn3) {
					str = String.format("%d+%d=%d",num1,num2,num1*num2);
				}else if(b==btn4) {
					str = String.format("%d+%d=%d",num1,num2,num1/num2);
				}
				tf3.setText(str);
			}catch (Exception e2) {
			
				tf3.setText("입력오류");
			
			}	
		}
	
	}
		
}
	

			

