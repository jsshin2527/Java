package JavaWindow;

import java.awt.Color;
import java.awt.Frame;

/*
 * �̺�Ʈ ������ ���� ���α׷� ���ظ� �ϱ� ���ؼ� ���ϴ�;  
 * �ȵ���̵尡 �̺�Ʈ ������ ����� ���ϴ�. 
 * awt,swing 
 * window ���α׷��� C#�� �߸���� ������ �ڹٴ� ��� �����Ǵ����� �� 
 * �ڹٷ� �������� ���α׷��� ����°��� ���� �ʽ��ϴ�. 
 * AWT(Abstract Window Toolkit)
 * â�� �����̴°� form 
 * java ������ frame �̶�� �մϴ�. 
 * frame�� �뷮�� �ſ� Ů�ϴ�. 
 */


public class JavaAWT_Frame extends Frame {
	
	private static final long serialVersionUID = 1L;
	
	//�����ڰ� �ݵ�� �־�� �մϴ�. 
	public JavaAWT_Frame() {
		
		setTitle("�ڹ� ������");
		setSize(200,300);
		setBackground(new Color(100,0,0)); //������ �� �����Ҽ� �ֽ��ϴ�. 
		setVisible(true); //
		
	}
	
	public static void main(String[] args) {
		
		new JavaAWT_Frame(); // �޸𸮻� �÷��ָ� �˾Ƽ� �����˴ϴ�. 
		//�����Ϸ��� �������� �ڵ��� �ؾ��մϴ�. 
		//event : �۾��� ������� �Ҽ��ֽ��ϴ�. 
		
		
	}
}
