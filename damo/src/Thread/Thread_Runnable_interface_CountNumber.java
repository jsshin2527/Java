package Thread;

//Runnable(인터페이스) 구현 


class MyThread2 implements Runnable{

	private  int num;
	private String name;
	
	public MyThread2(int num,String name) {
		this.num = num;
		this.name = name;
	}
	
	@Override
	public void run() {
		int i =0;
		
		while(i<num) {
			System.out.println(name + " : " +i);
			i++;
		try {
			Thread.sleep(100);
		} catch (Exception e) {

			}
		}	
	}
}


public class Thread_Runnable_interface_CountNumber{
	public static void main(String[] args) {
		
		System.out.println("main 시작 .... ");
		
		Thread t1 = new Thread(new MyThread2(100,"첫번쨰 "));
		Thread t2 = new Thread(new MyThread2(200,"두번쨰 "));
		
		t1.start();
		t2.start();
		
		System.out.println("main 종료 ..... ");
		
		}

	}


