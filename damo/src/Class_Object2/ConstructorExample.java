/*������  = ������ ��ü�� �޸𸮸� �Ҵ��ϸ鼭 ������ �ʱ�ȭ �ϴ� ��Ȱ ��� 
1.�޸� �Ҵ� 
2.���� �ʱ�ȭ ���� 
3.������ �����ؼ� �޸𸮸� �Ҵ��ϴ� �۾��� ��� 
4.�����ڿ��� �����ڸ� ȣ���Ҽ� �ִ�.
5.�ڵ��� �� ù�ٿ����� ȣ�� ���� (�ι�° �ٿ����� ȣ�� �Ұ�) -> ����� ���� 
6.�޼ҵ�� �ʱ�ȭ �ϴ°ͺ��� �����ڷ� �ʱ�ȭ �ϴ°��� �ѹ� �� ������ �ڵ��� �������� �������� 

�ʱ�ȭ 
ȸ�翡 ����ؼ� ������ �����ϱ� ���� ���� ���� �ϴ� ���� �Ƹ� å�� ������ ���̴�. Ŀ�Ǹ� ������ ��쵵 ���� ���̰�, 
��ǻ�� ������ �����ϱ⵵ �� ���̴�. �� � ���� �����ϱ� ���� �غ� �ϰ� �Ǵµ� �̰��� �ٸ� ���� �ʱ�ȭ��� �Ѵ�.

�����ڴ� 
�����ڴ� class �̸��� ���� 
return ���� ���� ������ property�� ����
public int (property) method name (parameter) 

wiki -> property

��ü, ���, �Ǵ� ������ ������ �����ϴ� ���̴�. �Ӽ��� ���� �̵��� �ν��Ͻ��� �־��� Ư�� ���� �����ϰų� ��Ÿ���� ������ ���δ�. 
�Ӽ��� ��Ÿ�����ͷ� �����ϴ� ���� �� ��Ȯ�ϴ�. �Ӽ��� �Ϲ������� ������ �����̴�
�ߺ� ���� 

*/ 

package Class_Object2;

import java.util.Scanner;

public class ConstructorExample {

	//���������� ���� �Ұ� 
	private int x;
	
	//�⺻ �����ڴ� �������ִ� 
	public  ConstructorExample() { //�⺻ ������  -> �Ƚᵵ �����ϴ� �ٸ� �����ڸ� �����ε��� �Ѵٸ� �ش� Ŭ������ ����Ҷ� ������ �ؾ��Ѵ�. 
		
		//�⺻ �����ڿ��� �����ε�� �����ڸ� ȣ���� �Ϸ��� this �� ����ؾ��մϴ�. 
		this(100);
		System.out.println("�⺻ ������");
		x = 10;	
		System.out.println("x = " + x);
	}
	public ConstructorExample(int x) { //�����ε��� �� ������ 
		//this();
		System.out.println("�����ε��� �� ������ ");
		this.x = x;
		System.out.println(this.x);
	}
	public void set(int x) { //�޼ҵ� 
		this.x = x; //x�� ���� �ʱ�ȭ 
	}
	
	
	public static void main(String[] args) {
	
		
		ConstructorExample ob = new ConstructorExample();
		ConstructorExample ob1 = new ConstructorExample(100);
		
		//Scanner �� �⺻ �����ڸ� ������� ���� Ŭ���� �̴� . API�� ��õ� �ĸ����͸� ����ؾ� Scanner Ŭ������ ����Ҽ� �ֽ��ϴ�.  
		Scanner sc = new Scanner(System.in);
		

	}

}
