package JavaWindow;

import java.awt.Color;
import java.awt.Frame;

/*
 * 이벤트 단위에 대한 프로그램 이해를 하기 위해서 배웁니다;  
 * 안드로이드가 이벤트 단위로 만들어 집니다. 
 * awt,swing 
 * window 프로그램은 C#이 잘만들기 때문에 자바는 어떻게 구현되는지만 봄 
 * 자바로 윈도우즈 프로그램을 만드는것은 흔지 않습니다. 
 * AWT(Abstract Window Toolkit)
 * 창이 움직이는것 form 
 * java 에서는 frame 이라고 합니다. 
 * frame은 용량이 매우 큽니다. 
 */


public class JavaAWT_Frame extends Frame {
	
	private static final long serialVersionUID = 1L;
	
	//생성자가 반드시 있어야 합니다. 
	public JavaAWT_Frame() {
		
		setTitle("자바 윈도우");
		setSize(200,300);
		setBackground(new Color(100,0,0)); //모든색을 다 구현할수 있습니다. 
		setVisible(true); //
		
	}
	
	public static void main(String[] args) {
		
		new JavaAWT_Frame(); // 메모리상에 올려주면 알아서 생성됩니다. 
		//종료하려면 수동으로 코딩을 해야합니다. 
		//event : 작업의 단위라고 할수있습니다. 
		
		
	}
}
