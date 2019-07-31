package Control_Array;

public class Sum_tot_odd_even_thirdSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int su,sum = 0;
		int n;
		for(n=1;n<=100;n++) {
			sum +=0;
		}
		System.out.println("전체의 합  :" +sum);
		
		sum = 0;
		//홀수의 합 
		for(n=1;n<100;n+=2){
			sum +=n;
		}
		System.out.println("홀수의 합  :" +sum);
		
		sum =0;
		//짝수의 합 
		for(n=2;n<100;n+=2){
			sum +=n;
		}
		System.out.println("짝수의 합  :" +sum);
		sum =0;
		//3의 배수의 합 
		for(n=3;n<100;n+=3){
			sum +=n;
		}
		System.out.println("3의 배수의 합  :" +sum);
		//3의 배수의 합 
		
		for(n=1,sum=0;n<=100;sum+=n,n+=3){
			sum +=n;
		}
		System.out.println("3의 배수의 합  :" +sum);
	}
}
