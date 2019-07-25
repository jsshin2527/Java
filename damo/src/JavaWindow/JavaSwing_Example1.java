package JavaWindow;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

/*
 * AWT : OS의 영향을 많이 받습니다. 
 * Swing : 대부분 J자를 붙이면 Swing이 됩니다. 
 * 
 */

public class JavaSwing_Example1 extends JFrame implements ActionListener{

	
	private static final long serialVersionUID = 1L;
	
	private JLabel lbl;
	
	private JavaSwing_Example1() {
		
		lbl = new JLabel("메시지",JLabel.CENTER);
		//메뉴 추가 
		
		getContentPane().add(lbl);
		JMenuBar mbar = new JMenuBar();
		JMenu menu;
		JMenuItem mi;
		
		menu = new JMenu("메신저 대화 상자"); // bar 구조

		mi = new JMenuItem("메세지");
		mi.addActionListener(this);
		menu.add(mi);
		
		mi = new JMenuItem("입력");
		mi.addActionListener(this);
		menu.add(mi);
		
		mi = new JMenuItem("종료");
		mi.addActionListener(this);
		menu.add(mi);
		
		mbar.add(menu);
		setJMenuBar(mbar);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});	
		setTitle("대화상자");
		setSize(300,300);
		setVisible(true);	
	}
	
	public static void main(String[] args) {
		
		new JavaSwing_Example1();
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String str = e.getActionCommand();
	
		if(str.equals("메세지")) {
			
			JOptionPane.showMessageDialog(this,"오늘은 수요일 ...","알림",JOptionPane.INFORMATION_MESSAGE);
		
		}else if(str.equals("입력")){
			
			String age = JOptionPane.showInputDialog(this,"당신의 나이는","나이확인",JOptionPane.ERROR_MESSAGE);
			
			lbl.setText("당신의 나이는 "+age+"입니다.");
			
		}else if(str.equals("종료")) {
			
			int result;
			
			result = JOptionPane.showConfirmDialog(this,"프로그램을 종료하겠습니다.","종료확인",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
			
			if(result==JOptionPane.YES_OPTION) {
				//lbl.setText(Integer.toString(result));
				System.exit(0);			
			}
			
		}
	}
}
