package Thread;

import java.util.Calendar;

//���� 
//Ķ������ ����ؼ� 1�ʸ��� �ð��� �о� �ü� �ֵ��� ���� �ϼ��� 

class MyThread3 implements Runnable{
	
	//Calendar cal1 = Calendar.getInstance();
	
	private int secondtime;
	
	public MyThread3(int secondtime){
		
		this.secondtime = secondtime;
	}
	
	@Override
	public void run() {
		int i = 0;
		
		while(true) {
		
			System.out.printf("%1$tF %1$tT \n",Calendar.getInstance());
		
			try {
			
			Thread.sleep(1000);
			
		} catch (Exception e) {

			}
		}	
	}
}

public class Thread_Runnable_Calendar {

	public static void main(String[] args) {
	
		System.out.println("�ð��� ����ϰڽ��ϴ�. ");
		
		Thread t1 = new Thread(new MyThread3(1000)); 
		
		t1.start();
		
		System.out.println("�ð� ���� ");

	}

}
