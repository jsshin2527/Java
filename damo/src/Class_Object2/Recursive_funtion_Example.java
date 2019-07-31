package Class_Object2;

//�� �θ� �Լ� 
//�ҽ��� �������� 
//ó�� �ӵ��� ���� 
//stack ���￡ ������ �մϴ�. 

public class Recursive_funtion_Example {

	public void print(int n) {
		
		if(n != 1) {
			print(n-1);
		}
		System.out.printf("%5d\n",n);
	}
	//�޼ҵ带 �����Ҷ� property�� ������ Ÿ���� �ְԵȴٸ� return ���� �ֱ� ������ �������� ǥ�ð� �ȴ�.
	public int sum (int n) {
		// 1-10 ������ ���� ���ϴ� ���� 
		return n>1 ? n+sum(n-1) : n;
	}
	public int pow(int a , int b) {
	
		return b>=1 ? a*pow(a,b-1) : 1;
	}
	
	//������ �μ�  ( ����ȭ ���� �ʴ� �μ� -> �μ��� ���� ���� �����Ͽ��� ������ �ִ�)
	int sum1(int...args) {
		int s = 0;
		
		for (int n : args) {
			s+=n;
		}
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Recursive_funtion_Example ob = new Recursive_funtion_Example();
		
		ob.print(5);
		System.out.println("\n====================");
		int s = ob.sum(10);
		System.out.println(s);
		System.out.println("======================");
		System.out.println("pow(2,31) -1 : "+(ob.pow(2, 31)-1));
		//2^31�� int ���� ������ ������ ���Ѵ� . 
		
		System.out.println();
		
		int result;
		result = ob.sum1(2,4,6,8,10);
		System.out.println("result : "+ result);
		
		result = ob.sum1(2,4,6,8,10,2,5,2,7,8,3,8,4,20,60);
		System.out.println("result : "+ result);
		
	}

}
