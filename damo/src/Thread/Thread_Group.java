package Thread;

public class Thread_Group {

	
	public static void main(String[] args) {
		
		System.out.println("���� ������ �׷� :" + Thread.currentThread().getThreadGroup());
		
		System.out.println("���� ." + Thread.currentThread());
		
		Thread t1 = new Thread();
		
		System.out.println("t1 ������ �׷�  :");
		
		System.out.println("t1 ������ �׷� : "+Thread.currentThread().getThreadGroup());
		
		System.out.println("t1: " + t1); //������ �̸� , �켱���� , �׷�� 
		
		ThreadGroup tg = new ThreadGroup("sg");
		
		Thread t2 = new Thread(tg,"t2");
		Thread t3 = new Thread(tg,"t3");
		
		System.out.println("t2 : +"+t2);
		System.out.println("t3 : +"+t3);
	}
}
