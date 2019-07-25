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
		//���� 
		setBackground(new Color(150,150,150));
		//���ڻ�
		setForeground(new Color(0,0,255));
		setTitle("���콺 �̺�Ʈ");
		setSize(400,400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JavaAWT_Mouse_Event();
	}
	
	@Override //���� ĥ�ϴ� �Լ� 
	public void paint(Graphics g) {
		String str;
		str = "{" + x + "," + y + "}";
		g.drawString(str, x, y);
	}
	@Override //���� ���⿡�ٰ� xy ��ǥ�� �����µ� ����ϴ� ���¿��� �����ϴ�. 
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
	//Ŭ������ �ʰ� �״�� ����� ���Ҷ� ����� �̺�Ʈ 
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
