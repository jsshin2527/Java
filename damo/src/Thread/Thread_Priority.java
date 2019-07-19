package Thread;

/*
 * Thread 우선 순위 
 * 
 */

class MyThread4 extends Thread{
	
	private String name;
	
	public MyThread4(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		
		for (int i = 1; i <=30; i++) {
			System.out.println(name + ":" +i);
		}
	}
}

public class Thread_Priority {

	public static void main(String[] args) {
	
		MyThread4 ob1 = new MyThread4("A");
		MyThread4 ob2 = new MyThread4("B");
		MyThread4 ob3 = new MyThread4("C");
		
		//우선 순위 종류 
		System.out.println("MIN: " + Thread.MIN_PRIORITY); //1
		System.out.println("NOR: " + Thread.NORM_PRIORITY);//5(기본)
		System.out.println("MAX: " + Thread.MAX_PRIORITY);//10 
		
		//쓰레드 우선순위 
		
		System.out.println(ob1.getPriority()); //5
		System.out.println(ob2.getPriority()); //5
		System.out.println(ob3.getPriority()); //5
		
		//우선순위 변경 
		ob1.setPriority(Thread.MIN_PRIORITY); //1
		ob2.setPriority(Thread.NORM_PRIORITY);//5
		ob3.setPriority(Thread.MAX_PRIORITY); //10
		
		ob1.start();
		ob2.start();
		ob3.start();	
	}
}
