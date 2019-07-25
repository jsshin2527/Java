package JavaWindow;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class JavaAWT_Mouse_Event extends Frame{

	private static final long serialVersionUID = 1L;

	private int x,y;
	
	private Label lbl = new Label("",Label.CENTER);
	
	
	public  JavaAWT_Mouse_Event() {
		
		addWindowListener(new WindowAdapter() {
		
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
			}
		});
		
		add(lbl,BorderLayout.SOUTH);
		addMouseListener(new MouseHandler());
		addMouseMotionListener(new MouseMotionHandler());
		//배경색 
		setBackground(new Color(150,150,150));
		//글자색
		setForeground(new Color(0,0,255));
		setTitle("마우스 이벤트");
		setSize(400,400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JavaAWT_Mouse_Event();
	}
	
	@Override //색을 칠하는 함수 
	public void paint(Graphics g) {
		String str;
		str = "{" + x + "," + y + "}";
		g.drawString(str, x, y);
	}
	@Override //내가 여기에다가 xy 좌표가 찍히는데 기억하는 상태에서 찍힙니다. 
	public void update(Graphics g) {
		paint(g);
	}

	class MouseHandler extends MouseAdapter{

		@Override
		public void mousePressed(MouseEvent e) {
			x = e.getX();
			y = e.getY();
			repaint(); //update() -> paint() 
		}
		
	}
	//클릭하지 않고 그대로 모션을 취할때 생기는 이벤트 
	class MouseMotionHandler extends MouseMotionAdapter{

		@Override
		public void mouseDragged(MouseEvent e) {
			
			x = e.getX();
			y = e.getY();
			
			repaint();
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			
			String str = String.format("(%d,%d)",e.getX(),e.getY());
			lbl.setText(str);
		}
		
	}

}
