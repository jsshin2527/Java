package Thread;
//*중요*
//인터럽트 : 우선순위가 높은 프로그램을 먼저 실행시키고 다시 돌아오는 프로그램 
//세수 -> 밥 -> 택배 -> 밥 -> 출근 
//A -> B -> C -> D -> A
class MyThread7 extends Thread{
	
	private Thread next;
	
	private String name;
	
	public MyThread7(String name) {
		this.name = name;
	}
	
	
	public void setNext(Thread next) {
		this.next = next;
	}
	@Override
	public void run() {
	
		for (int i = 0; i < 200; i++) {
			try {
				
				sleep(1000);
				
			} catch (Exception e) {
				
			}
			System.out.println(name+ " : " +i);
			//스레드가 살아 있으면 현재 스레드를 멈춤 
			/*
			if(next.isAlive()) {
				next.interrupt(); //stop 
			}
			*/
			
		}
	}
}

public class Thread_Interrupt {

	public static void main(String[] args) {
		
		MyThread7 t1 = new MyThread7("첫번째");
		MyThread7 t2 = new MyThread7("두번째");
		MyThread7 t3 = new MyThread7("세번째");
		MyThread7 t4 = new MyThread7("네번째");
		
		//t1.setNext(t2);// 현재 스레드가 t1 스레드가 실행된다면 멈추고 t2 실행 
		//t2.setNext(t3);// 현재 스레드가 t2 스레드가 실행된다면 멈추고 t3 실행
		//t3.setNext(t1);// 현재 스레드가 t3 스레드가 실행된다면 멈추고 t1 실행
		
		t1.start();
		t2.start();
		t3.start();
		
		//t1.interrupt(); //인터럽트 : 순서가 일정하다 
		//스레드를 정해진 순서대로 계속적으로 돌아가게 하는것 
		try {
			//t1.join();
			//t2.join();
			t3.join(50000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("main 스레드가 종료 되었습니다");

	}
}
