package JavaTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class OrderMain {
		
		public OrderMain() {
			
			}
		public void ordermain(String loginid) {
			
			Scanner sc = new Scanner(System.in);
			OrderImpl ob = new OrderImpl();
			
			int ch;
			
			while(true) {
				do { 
	
				  System.out.println("�뵆�������������뵱�������������뵍");
				  System.out.print("�봻�몺 二쇰Ц�븯湲� �봻 �몼 寃곗젣�븯湲겸봻");
				  System.out.println("\n�뵒�������������뵽�������������뵖");
				  System.out.print("硫붾돱�뼹�쓣 �꽑�깮�븯�꽭�슂 : ");
				 
				/*	System.out.print("1. 二쇰Ц�븯湲� \n2. 寃곗젣�븯湲� ");
					System.out.print("\n硫붾돱瑜� �꽑�깮�븯�꽭�슂  : ");
				*/	ch = sc.nextInt();
					
				}while(ch<1);
				
				switch (ch) {
				case 1:
					ob.menu();
					System.out.println();
					ob.order();break;
				case 2:
					break;
					
					
				default:
					System.exit(0);;
				}
		}

	}

}
