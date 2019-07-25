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
 * AWT : OS�� ������ ���� �޽��ϴ�. 
 * Swing : ��κ� J�ڸ� ���̸� Swing�� �˴ϴ�. 
 * 
 */

public class JavaSwing_Example1 extends JFrame implements ActionListener{

	
	private static final long serialVersionUID = 1L;
	
	private JLabel lbl;
	
	private JavaSwing_Example1() {
		
		lbl = new JLabel("�޽���",JLabel.CENTER);
		//�޴� �߰� 
		
		getContentPane().add(lbl);
		JMenuBar mbar = new JMenuBar();
		JMenu menu;
		JMenuItem mi;
		
		menu = new JMenu("�޽��� ��ȭ ����"); // bar ����

		mi = new JMenuItem("�޼���");
		mi.addActionListener(this);
		menu.add(mi);
		
		mi = new JMenuItem("�Է�");
		mi.addActionListener(this);
		menu.add(mi);
		
		mi = new JMenuItem("����");
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
		setTitle("��ȭ����");
		setSize(300,300);
		setVisible(true);	
	}
	
	public static void main(String[] args) {
		
		new JavaSwing_Example1();
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String str = e.getActionCommand();
	
		if(str.equals("�޼���")) {
			
			JOptionPane.showMessageDialog(this,"������ ������ ...","�˸�",JOptionPane.INFORMATION_MESSAGE);
		
		}else if(str.equals("�Է�")){
			
			String age = JOptionPane.showInputDialog(this,"����� ���̴�","����Ȯ��",JOptionPane.ERROR_MESSAGE);
			
			lbl.setText("����� ���̴� "+age+"�Դϴ�.");
			
		}else if(str.equals("����")) {
			
			int result;
			
			result = JOptionPane.showConfirmDialog(this,"���α׷��� �����ϰڽ��ϴ�.","����Ȯ��",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
			
			if(result==JOptionPane.YES_OPTION) {
				//lbl.setText(Integer.toString(result));
				System.exit(0);			
			}
			
		}
	}
}
