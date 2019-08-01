package com.project3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static String id ="";
	
	public Main() throws IOException {
		main(null);
	}

	public Main(String id) throws IOException {
		
		//System.out.println("-------------------------------------------------");
		this.id = id;
		System.out.println(id + "�� ȯ���մϴ�\n");
		
		MyRef ob = new MyRef(id);
		ob.compare();

		main(null);
	}

	public static void main(String[] args) throws IOException {

		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		while(true)	{

			do {
				System.out.println("����������������������������������������������������������");
				System.out.println("��                                                      ��");
				System.out.println("��   ******   ������ ���忡 ���Ű� ȯ���մϴ�   ******  ��");
				System.out.println("��                                                      ��");
				System.out.println("��                                                      ��");
				System.out.println("��     1.���� �����  2.������ �˻�  3.����� ����      ��");
				System.out.println("��                                                      ��");
				System.out.println("��          4.��ٱ���  5.�Խ���  6.�α׾ƿ�            ��");
				System.out.println("��                                                      ��");
				System.out.println("����������������������������������������������������������");
				System.out.print("    => ");
				
				//System.out.println("*****������ ���忡 ���Ű� ȯ���մϴ�*****");
				//System.out.print("1.���� ����� 2.������ �˻� 3.����� ����\n" + "4.��ٱ��� 5.�Խ��� 6.�α׾ƿ� => ");
				n = sc.nextInt();
			}while(n<1||n>6);

			switch(n) {

			case 1: {
				MyRefMain ob1 = new MyRefMain(id);
				ob1.main(args); 
				break;
				}
			case 2: 
				Recipe_name.main(args);
				break;
			case 3: {
				Market m = new Market(id);
				m.main(null);				
				break;
			}
			case 4: Cart c = new Cart(id); break;
			case 5:
				BoardMain b = new BoardMain(id);
				b.main(null);
				break;
			case 6: 
				System.out.println("�α׾ƿ� �Ǿ����ϴ�!");
				System.out.println();
				Login l = new Login();
				l.main(null);
				break;
			}
		}
	}
}
