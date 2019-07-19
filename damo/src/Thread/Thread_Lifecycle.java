package Thread;

//스레드 생명 주기 


class MyThread6 extends Thread {
	
	@Override
	public void run() {
		
		try {
			System.out.println("스레드 시작 .. ");
			System.out.println("우선순위 : " + getPriority());
			System.out.println("스레드 이름 : " + this.getName());
			//0.5초 
			sleep(500);	
			//우선순위 변경 
			setPriority(2);
			System.out.println("변경된 우선 순위 : "+getPriority());
			System.out.println("스레드 종료 ... ");
		} catch (Exception e) {
				
		}
	}
}

public class Thread_Lifecycle {

	public static void main(String[] args) {
		
		Thread t1 = Thread.currentThread();
		Thread t2 = new MyThread6();
		
		System.out.println("메인 스레드 우선순위 :" + t1.getPriority());
		System.out.println("메인 스레드 이름 : " + t1.getName());
		System.out.println("t2 시작전 isAlive : "+ t2.isAlive()); //스레드 생존 여부 
		
		t2.start();
		//t2의 우선순위  
		System.out.println("t2 우선순위 변경 전" + t2.getPriority());
		
		//t2의 우선변경 
		t2.setPriority(1);
		
		System.out.println("t2 우선순위 변경 후 :" + t2.getPriority());
		
		
		try {
			
			Thread.sleep(100);; //main thread는 쉬고 있습니다. 
			System.out.println("t2 살아 있나요 ? " + t2.isAlive());
			
			//Thread.sleep(100);
			System.out.println("0.1초후 t2 살아 있나요 ? " + t2.isAlive());
			
			//t2.join();
			//System.out.println("join을 하지 않을때 t2 살아 있나요 ? " + t2.isAlive());	
			System.out.println("join후 t2 살아 있나요 ? " + t2.isAlive());
					
		} catch (Exception e) {
			
			
		}
		
	}
	
}
