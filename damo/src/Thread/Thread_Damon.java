package Thread;
/*Main Thread 가 죽으면 같이 죽는 Thread */
//데몬 쓰레드 
//다른 스레드에 도움을 주는 스레드로 다른 스레드가 종료되면 
//데몬스레드가 종료하지 않아도 프로세스가 종료된다 

class MyThread5 implements Runnable{
	
	public MyThread5() {
		
	}

	@Override
	public void run() {
		
		for (int i = 1; i < 20; i++) {
			System.out.println(i);
		
		try {
			Thread.sleep(100);		
		} catch (Exception e) {
			// TODO: handle exception
		}
		}		
	}
	
	
}
public class Thread_Damon {

	public static void main(String[] args) {
		
		System.out.println("main 시작 ..");
		Thread t1 = new Thread(new MyThread5());
		Thread t2 = new Thread(new MyThread5());
		Thread t3 = new Thread(new MyThread5());
	
		//데몬 스레드로 만들기
		//메인 스레드가 죽으면 스레드도 죽습니다. 
		t1.setDaemon(true);
		t2.setDaemon(true);
		t3.setDaemon(true);
		
		t1.start();
		t2.start();
		t3.start();
		
		//스레드의 경우 main이 죽어도 실행이 되는데 데몬 스레드는 main 스레드가 죽으면 같이 죽습니다. 
		
		try {
			//main 메소드를 쉬어라 
			Thread.sleep(1000);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		try {
			t1.join();
			t2.join();
			t3.join();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("main 종료 ... ");
	}

}
