package Thread;

import java.util.Calendar;

//문제 
//캘린더를 사용해서 1초마다 시간을 읽어 올수 있도록 구현 하세요 

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
	
		System.out.println("시간을 출력하겠습니다. ");
		
		Thread t1 = new Thread(new MyThread3(1000)); 
		
		t1.start();
		
		System.out.println("시간 종료 ");

	}

}
