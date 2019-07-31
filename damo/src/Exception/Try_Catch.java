
package Exception;

import java.util.Scanner;

public class Try_Catch {

	public static void main(String[] args) {

		int num1,num2,result;
		String oper;
		
		Scanner sc = new Scanner(System.in);
		
		try {
			//��𼭵� ������ ���ٸ� catch �� ���ϴ�. 
			
			System.out.print("�ΰ��� �� ? : "); //30 20 
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			
			System.out.print("������ ");
			oper = sc.next();
			
			result = 0;
			
			if(oper.equals("+")) {
				result=num1+num2;
			}else if(oper.equals("-")){
				result=num1-num2;
			}else if(oper.equals("*")){
				result=num1*num2;
			}else if(oper.equals("/")){
				result=num1/num2;
			}
			System.out.printf("%d %s %d = %d",num1,oper,num2,result);
		}catch (NumberFormatException e){
			System.out.println("������ �Է��ϼ���");
		}catch (Exception e) {
			//System.out.println(e.toString());
			//e.printStackTrace();
			System.out.println("���ڸ� �Է��ϼ���");
		}finally{
			//�׻� ���� 
			System.out.println("\n�� �׻� ���δ� ");
		}
	}	
}
