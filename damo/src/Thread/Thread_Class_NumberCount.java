package Thread;

/*
 * Thread �� ��� 
 * 
 */
 							   //�������̽� ��� 
class MyThread1 extends Thread /*implements Runnable*/ {
	
	private int num;
	private String name;
	
	public MyThread1(int num ,String name) {
		this.num = num;
		this.name = name;
	}
	
	//main �� �����̰� run�� �����δ� 
	@Override 
	public void run() {
		
		int i = 0;
		while (i<num) {
			System.out.println(this.getName() + " : " +name + i);
			i++;
		
		try {
			//sleep ������ ��� �۾� ���� 
			sleep(100); //1000�� 1�� 100�� 0.1�� 
		} catch (Exception e) {	
			}
		}
	}
}
public class Thread_Class_NumberCount {

	public static void main(String[] args) {

		System.out.println("main ���� ....");
		
		MyThread1 t1 = new MyThread1(100 ,"ù��° :" /*�������� ���ڰ��� �޾� �ʱ�ȭ �մϴ�.*/);
		MyThread1 t2 = new MyThread1(200 ,"�ι�° :");
		
		t1.start();
		t2.start();
		
		System.out.println("main ���� ... ");
	}

}
