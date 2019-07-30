package JavaTest;

class MakeCoffee1 extends Thread{


	@Override
	public void run() {


		System.out.println();
		System.out.println();
		try {
			System.out.println();
			System.out.println();
			/*
			 * 빨대 별 
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
			 * 뚜껑 별 
			 */
			for (int i = 0; i < 8; i++) {
				System.out.print(" ");
			}
			for (int i = 0; i <17;  i++) {
				System.out.print("$");
				sleep(10);
			}
			System.out.println();
			for (int i = 0; i < 7; i++) {
				System.out.print(" ");
			}
			System.out.print("$");
			for (int i = 0; i <17;  i++) {
				System.out.print(" ");
				sleep(10);
			}
			System.out.print("$");
			System.out.println();
			for (int i = 0; i <6; i++) {
				System.out.print(" ");
			}
			System.out.print("$");
			for (int i = 0; i <19;  i++) {
				System.out.print(" ");
				sleep(10);
			}
			System.out.print("$");
			System.out.println();
			for (int i = 0; i < 5; i++) {
				System.out.print(" ");
			}
			System.out.print("$");
			for (int i = 0; i <21;  i++) {
				System.out.print(" ");
				sleep(10);
			}
			System.out.print("$");
			System.out.println();
			for (int i = 0; i < 4; i++) {
				System.out.print(" ");
			}
			System.out.print("$");
			for (int i = 0; i < 23; i++) {
				System.out.print(" ");
				sleep(10);
			}
			System.out.print("$");
			System.out.println();
			/*
			 * 양옆 케이스 
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

class MakeCoffee4 extends Thread{

	@Override
	public void run() 	{
		
		System.out.print("\n\n음료 제조중");

		for(int i=0;i<=16;i++) {	
			System.out.print("*º");

			try {

				Thread.sleep(200);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}

class BodyThread extends Thread{//음료 밑에서 부터 채우기

	@Override
	public void run() 
	{

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
public class MakeCoffee {

	public static void main(String[] args) {

		MakeCoffee1 mc1= new MakeCoffee1();
		MakeCoffee2 mc2= new MakeCoffee2();
		MakeCoffee3 mc3= new MakeCoffee3();
		MakeCoffee4 mc4= new MakeCoffee4();
		BodyThread bt1 = new BodyThread();


		try {
			mc4.start();
			mc4.join();

			mc1.start();
			mc1.join();

			mc2.start();
			mc2.join();

			mc3.start();
			mc3.join();

		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("\n\n★★음료가 준비 되었습니다!★★\n\n");
	}

}
