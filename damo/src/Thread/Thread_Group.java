package Thread;

public class Thread_Group {

	
	public static void main(String[] args) {
		
		System.out.println("메인 스레드 그룹 :" + Thread.currentThread().getThreadGroup());
		
		System.out.println("메인 ." + Thread.currentThread());
		
		Thread t1 = new Thread();
		
		System.out.println("t1 스레드 그룹  :");
		
		System.out.println("t1 스레드 그룹 : "+Thread.currentThread().getThreadGroup());
		
		System.out.println("t1: " + t1); //스레드 이름 , 우선순위 , 그룹명 
		
		ThreadGroup tg = new ThreadGroup("sg");
		
		Thread t2 = new Thread(tg,"t2");
		Thread t3 = new Thread(tg,"t3");
		
		System.out.println("t2 : +"+t2);
		System.out.println("t3 : +"+t3);
	}
}
