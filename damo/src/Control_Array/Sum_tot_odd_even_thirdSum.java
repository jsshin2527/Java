package Control_Array;

public class Sum_tot_odd_even_thirdSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int su,sum = 0;
		int n;
		for(n=1;n<=100;n++) {
			sum +=0;
		}
		System.out.println("��ü�� ��  :" +sum);
		
		sum = 0;
		//Ȧ���� �� 
		for(n=1;n<100;n+=2){
			sum +=n;
		}
		System.out.println("Ȧ���� ��  :" +sum);
		
		sum =0;
		//¦���� �� 
		for(n=2;n<100;n+=2){
			sum +=n;
		}
		System.out.println("¦���� ��  :" +sum);
		sum =0;
		//3�� ����� �� 
		for(n=3;n<100;n+=3){
			sum +=n;
		}
		System.out.println("3�� ����� ��  :" +sum);
		//3�� ����� �� 
		
		for(n=1,sum=0;n<=100;sum+=n,n+=3){
			sum +=n;
		}
		System.out.println("3�� ����� ��  :" +sum);
	}
}
