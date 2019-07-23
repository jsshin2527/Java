package JavaWindow;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/*
 * windowListener = window frame �� event�� ���� 
 */

public class JavaAWT_Exit_Event extends Frame implements WindowListener{
	
	
	private static final long serialVersionUID = 1L;

	public JavaAWT_Exit_Event() {
		setTitle("������");
		setSize(200,300);
		setVisible(true);	
		addWindowListener(this);
		//Listener = ������ 
		//this �� �ڽ� 
	}
	// ����Ǿ����� ������ �����Ұ��� ��� 
	@Override
	public void windowOpened(WindowEvent e) {
	
	}
	//����Ǿ����� � �̺�Ʈ�� ����Ұ��ΰ� ? 
	@Override
	public void windowClosing(WindowEvent e) {
		//frame���� �����ϴ� event 
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	//�ּ�ȭ �Ǿ����� 
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	//�ִ�ȭ �Ǿ����� 
	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		
		new JavaAWT_Exit_Event();

	}

}
