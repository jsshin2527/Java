package JavaWindow;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/*
 * windowListener = window frame 에 event를 구현 
 */

public class JavaAWT_Exit_Event extends Frame implements WindowListener{
	
	
	private static final long serialVersionUID = 1L;

	public JavaAWT_Exit_Event() {
		setTitle("윈도우");
		setSize(200,300);
		setVisible(true);	
		addWindowListener(this);
		//Listener = 감시자 
		//this 나 자신 
	}
	// 실행되었을때 무엇이 실행할건지 명시 
	@Override
	public void windowOpened(WindowEvent e) {
	
	}
	//종료되었을때 어떤 이벤트를 출력할것인가 ? 
	@Override
	public void windowClosing(WindowEvent e) {
		//frame에서 동작하는 event 
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	//최소화 되었을때 
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	//최대화 되었을때 
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
