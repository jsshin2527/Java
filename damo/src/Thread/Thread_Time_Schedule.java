package Thread;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

//schedule (task) 
//������ �ð� ���� Ư�� �۾��� �ҷ��� �Ҷ� 

public class Thread_Time_Schedule extends Thread{

	private int num=1;
	
	public Thread_Time_Schedule() {
		TimerTask task = new TimerTask() {
			@Override
			public void run() {
				//�ݺ��Ͽ� ����� �۾��� �ڵ�� �ۼ��մϴ�. 
				num=0;
			}
		};
		Timer t = new Timer();
		
		Calendar d = Calendar.getInstance();
		/*
		 * ���� 0�� 0�� 0�� ���� �Ϸ翡 �ѹ��� �ݺ��ϴ� �۾��� �ϰڽ��ϴ�. 
		 * d.add(Calendar.DATE.1);
		 * d.add(Calendar.HOUR.0); //���� 1��: 13
		 * d.add(Calendar.MINUTE.0); 
		 * d.add(Calendar.SECOUND.0);
		 * d.add(Calendar.MILLISECOUND.0);
		 * t_schedule(task,d.getTime(),1000*60*60*24)
		 *                         �и����� �� �� �� 
		 * �� 12�ÿ� ���� �۾��� �����մϴ�. 
		 *  
		 * 
		 */
		
		t.schedule(task,d.getTime(),1000); // ������ �ð��� �Ǹ� �� �۾��� �����ض� ���� 
	}
	
	@Override
	public void run() {
		while(true) {
			System.out.println(num++);
			try {
				sleep(100);	
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	public static void main(String[] args) {
		//Test10 ob = new Test10();
		//ob.start();
		new Thread_Time_Schedule().start(); // �͸��� �޼ҵ�= �޸� �� �÷��θ� �˾Ƽ� ������ �˴ϴ�. 
							  // ���������� �ҷ����ڸ� �⺻�����ڿ��� �� ������ �ǰ� 
							  // ���� ���� ��ų �޼ҵ尡 ���� ������ ������ ���� �͸� Ŭ������ ���Ǹ� ���־ �������ϴ�. 

	}

}
