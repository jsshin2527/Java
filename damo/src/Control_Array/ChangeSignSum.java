package Control_Array;
/*
. 1-2+3-4+5-6+7-8+9-10
*/

public class ChangeSignSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,sum,plusnumber=0,minusnumber=0;
	
		//홀수 숫자를 담은 반복문 선언 
		for(i=1;i<=10;i=i+2){
			plusnumber += i;
		}
		//짝수 숫자를 담은 반복문 선언  
		for(i=0;i<=10;i=i+2){
			minusnumber += -i;
		}
		sum = plusnumber + minusnumber;
		System.out.printf("1-2+3-4+5-6+7-8+9-10=%d",sum);
	}
}
