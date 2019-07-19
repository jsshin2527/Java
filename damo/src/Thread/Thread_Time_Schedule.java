package Thread;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

//schedule (task) 
//정해진 시간 마다 특정 작업을 할려고 할때 

public class Thread_Time_Schedule extends Thread{

	private int num=1;
	
	public Thread_Time_Schedule() {
		TimerTask task = new TimerTask() {
			@Override
			public void run() {
				//반복하여 사용할 작업을 코드로 작성합니다. 
				num=0;
			}
		};
		Timer t = new Timer();
		
		Calendar d = Calendar.getInstance();
		/*
		 * 내일 0시 0분 0초 부터 하루에 한번씩 반복하는 작업을 하겠습니다. 
		 * d.add(Calendar.DATE.1);
		 * d.add(Calendar.HOUR.0); //오후 1시: 13
		 * d.add(Calendar.MINUTE.0); 
		 * d.add(Calendar.SECOUND.0);
		 * d.add(Calendar.MILLISECOUND.0);
		 * t_schedule(task,d.getTime(),1000*60*60*24)
		 *                         밀리세컨 초 분 시 
		 * 밤 12시에 다음 작업을 실행합니다. 
		 *  
		 * 
		 */
		
		t.schedule(task,d.getTime(),1000); // 정해진 시간이 되면 이 작업을 실행해라 ㅎㅎ 
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
		new Thread_Time_Schedule().start(); // 익명의 메소드= 메모리 상에 올려두면 알아서 실행이 됩니다. 
							  // 참조변수를 불러왔자만 기본생성자에서 다 실행이 되고 
							  // 따로 실행 시킬 메소드가 없기 때문에 다음과 같이 익명 클래스로 정의를 해주어도 괜찮습니다. 

	}

}
