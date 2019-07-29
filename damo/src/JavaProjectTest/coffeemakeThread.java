package JavaProjectTest;

class MakeCoffee1 extends Thread{
	@Override
	public void run() {
		System.out.println();
		System.out.println();
		try {
			System.out.println();
			System.out.println();
			/*
			 * »¡´ë º° 
			 */
			for (int i = 0; i < 8; i++) {				
				for (int j = 0; j <i;j++) {
					System.out.print(" ");
				}
				for (int j = 0; j <3;j++) {
					System.out.print("#");
					sleep(50);
				}
				System.out.println();
			}
			/*
			 * ¶Ñ°Ï º° 
			 */
			for (int i = 0; i < 8; i++) {
				System.out.print(" ");
			}
			for (int i = 0; i <17;  i++) {
				System.out.print("$");
				sleep(30);
			}
			System.out.println();
			for (int i = 0; i < 7; i++) {
				System.out.print(" ");
			}
			System.out.print("$");
			for (int i = 0; i <17;  i++) {
				System.out.print(" ");
				sleep(30);
			}
			System.out.print("$");
			System.out.println();
			for (int i = 0; i <6; i++) {
				System.out.print(" ");
			}
			System.out.print("$");
			for (int i = 0; i <19;  i++) {
				System.out.print(" ");
				sleep(30);
			}
			System.out.print("$");
			System.out.println();
			for (int i = 0; i < 5; i++) {
				System.out.print(" ");
			}
			System.out.print("$");
			for (int i = 0; i <21;  i++) {
				System.out.print(" ");
				sleep(50);
			}
			System.out.print("$");
			System.out.println();
			for (int i = 0; i < 4; i++) {
				System.out.print(" ");
			}
			System.out.print("$");
			for (int i = 0; i < 23; i++) {
				System.out.print(" ");
				sleep(50);
			}
			System.out.print("$");
			System.out.println();
			/*
			 * ¾ç¿· ÄÉÀÌ½º 
			 */
			System.out.print(" ");
			for (int j = 0; j <= 1; j++) {
				System.out.print(" ");
				sleep(30);
			}
			//System.out.print("*");
			for (int j = 0; j <27; j++) {
				System.out.print("$");
				sleep(30);
			}
			//System.out.print("*");
			System.out.println();
			for (int i = 0; i < 4; i++) {
				System.out.print(" ");
			}
			System.out.print("$");
			for (int i = 0; i < 23; i++) {
				System.out.print(" ");
				sleep(30);
			}
			System.out.print("$");
			System.out.println();
		}catch (Exception e) {
			System.out.println(e.toString());
		}

	}
		
}


class MakeCoffee2 extends Thread{

	@Override
	public void run() {

		try {
		
			for (int i = 0; i < 20; i++) {
				for (int j = 0; j < 5; j++) {
					System.out.print(" ");
				}
				System.out.print("$");
				
				for (int j = 0; j <= 20; j++) {
					System.out.print("*");
				}
				System.out.print("$");	
				sleep(50);
				System.out.println();
			}
			
		}catch (Exception e) {
			
			System.out.println(e.toString());
		}
	}
}
class MakeCoffee3 extends Thread{
	@Override
	public void run() {
		
		try {
			for (int i = 0; i < 5; i++) {
				System.out.print(" ");
			}
			for (int i = 0; i < 23; i++) {
			System.out.print("$");
			sleep(50);
			}
			System.out.println();
		}catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
class BodyThread extends Thread{
	
	@Override
	public void run() {
		
		try {
			for (int i = 0; i < 15; i++) {
				sleep(50);
				System.out.print("*");
			}
			System.out.println();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	
	}
}
public class coffeemakeThread {

	public static void main(String[] args) {
		
		MakeCoffee1 mc1= new MakeCoffee1();
		MakeCoffee2 mc2= new MakeCoffee2();
		MakeCoffee3 mc3= new MakeCoffee3();
		BodyThread bt1 = new BodyThread();
		
		
		try {
			mc1.start();
			mc1.join();
			
			mc2.start();
			mc2.join();
			
			mc3.start();
			mc3.join();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
