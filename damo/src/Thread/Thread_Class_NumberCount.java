package Thread;

/*
 * Thread 를 상속 
 * 
 */
 							   //인터페이스 상속 
class MyThread1 extends Thread /*implements Runnable*/ {
	
	private int num;
	private String name;
	
	public MyThread1(int num ,String name) {
		this.num = num;
		this.name = name;
	}
	
	//main 도 움직이고 run도 움직인다 
	@Override 
	public void run() {
		
		int i = 0;
		while (i<num) {
			System.out.println(this.getName() + " : " +name + i);
			i++;
		
		try {
			//sleep 스레드 잠시 작업 중지 
			sleep(100); //1000이 1초 100은 0.1초 
		} catch (Exception e) {	
			}
		}
	}
}
public class Thread_Class_NumberCount {

	public static void main(String[] args) {

		System.out.println("main 시작 ....");
		
		MyThread1 t1 = new MyThread1(100 ,"첫번째 :" /*생성자의 인자값을 받아 초기화 합니다.*/);
		MyThread1 t2 = new MyThread1(200 ,"두번째 :");
		
		t1.start();
		t2.start();
		
		System.out.println("main 종료 ... ");
	}

}
