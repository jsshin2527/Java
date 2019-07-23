package JavaWindow;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class MyWindowAdapter extends WindowAdapter{

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}	
	
}

public class JavaAWT_Window extends Frame {
	
	public JavaAWT_Window() {
		
		addWindowListener(new MyWindowAdapter());
		setTitle("À©µµ¿ì");
		setSize(200,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new JavaAWT_Window();
	}
}
