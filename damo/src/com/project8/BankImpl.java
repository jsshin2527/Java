package com.project8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class BankImpl implements Bank{
	
	//private List<BankVO> lists = new ArrayList<>();  //����Ʈ�� ���ص� �ɰŰ���
	
	Scanner sc = new Scanner(System.in);
	
	private List<BankVO> customers = null;
	private File f = new File("d:\\doc\\bank\\customers.txt");
	
	public BankImpl() {
		
		try {
			if(!f.getParentFile().exists())
				f.getParentFile().mkdirs();
			
			if(f.exists()) {
				FileInputStream fis = new FileInputStream(f);
				ObjectInputStream ois = new ObjectInputStream(fis);
				
				customers = (ArrayList<BankVO>)ois.readObject();
				
				fis.close();
				ois.close();
			}
			
			
		}catch (Exception e) {
			// TODO: handle exception
		}
	}


	@Override
	public BankVO input() {
		
		BankVO vo = new BankVO();
		
		int result = 0;
		
		//�̸�
		
		System.out.print("      ��=========��\n");
		System.out.print("      ��  �̸�:  ��\n");
		System.out.print("      ��=========��");

		
	
		
		vo.setName(sc.next());
		
		
		//���� ��й�ȣ
		int pww;
		
		do{
			System.out.println(" ");
			System.out.println(" ");
			System.out.print("      ��==========================��\n");
			System.out.print("      ����й�ȣ �Է�(���� 6�ڸ�):��\n");
			System.out.print("      ��==========================��");


			//System.out.print("���� ��й�ȣ(���� 6�ڸ�) : ");
			pww = sc.nextInt();
		}while(pww<100000 || pww>999999);
		
		int pwww;
		do {
			
			System.out.println(" ");
			System.out.println(" ");
			System.out.print("      ��==========================��\n");
			System.out.print("      ��      ��й�ȣ ���Է�:    ��\n");
			System.out.print("      ��==========================��");
			
			//System.out.print("��й�ȣ Ȯ�� : ");
			pwww = sc.nextInt();
		}while(pww!=pwww);
		//System.out.println("��й�ȣ�� ��ġ�մϴ�!");
		vo.setPw(pww);
		
		
		//��ȣȭ�� ���
		vo.setPw1(Integer.toString(vo.getPw()).substring(0, 2)+"****");
		//System.out.println(vo.getPw1());
		
		
		//�������� ���¹�ȣ ����
		Random rd = new Random();
		
		int[] num = new int[10];   //10�ڸ� ���¹�ȣ
		String s;
		
		do{
			num[0] = rd.nextInt(9)+1;
		
			s = Integer.toString(num[0]);
		
			for(int i=1;i<10;i++) {
				num[i] = rd.nextInt(10);
				s += Integer.toString(num[i]);
			}
		}while(checkAcc(s)==true);
		
		vo.setAccount(s);
		//System.out.println(vo.getName()+"���� ���¹�ȣ�� "+vo.getAccount()+"�Դϴ�.");
		//System.out.println(vo.getName()+"���� ���°� �����Ǿ����ϴ�!");
		System.out.println(" ");
		System.out.println("           ��===========================================��");
		System.out.println("           ��             ��й�ȣ ��ġ!!!            ��");
		System.out.println("           ��===========================================��");
		System.out.println(" ");
		System.out.println("           ��===========================================��");
		System.out.println("           ��       �ǵ��� ���� ������ ȯ���մϴ�.    ��");
		System.out.println("           ��===========================================��");
		System.out.println(" ");
		System.out.println("           ��===========================================��");
		System.out.println("                "+vo.getName()+" ���� ���¹�ȣ�� "+vo.getAccount()+" �Դϴ�.   ");
		System.out.println("           ��===========================================��");
		System.out.println(" ");
		
		//�ܾ� �ʱ�ȭ
		vo.setBalance(0);
	
		
		
		//ó�� �����
		if(customers==null) {
			customers = new ArrayList<>();
		}
		
		customers.add(vo);
		
		
		//��ü�����Ϸ� ��������
		
		try {
			if(customers!=null) {
				
				FileOutputStream fos = new FileOutputStream(f);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				
				oos.writeObject(customers);
				
				fos.close();
				oos.close();
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		
		//���ΰ����� ����
		String str = "d:\\doc\\bank\\"+vo.getAccount()+".txt";
		File ff = new File(str);
		
		try{
			
			FileOutputStream foss = new FileOutputStream(ff);
			//ObjectOutputStream ooss = new ObjectOutputStream(foss);
			PrintStream ps = new PrintStream(foss);
			ps.println("                                                                  ");
			ps.println("                                                                  ");
			
			ps.println("                 ��=========================================��");
			ps.println("                           "+vo.getName()+"���� ��������!        ");
			ps.println("                 ��=========================================��");
			ps.println("             ��=========����=========����=========����=========��");
			ps.println("             ��  �̸�   ���� ���¹�ȣ���� ��й�ȣ����  �ܾ�   ��");
			ps.println("             ��=========����=========����=========����=========��");
			
			
			ps.printf("%23s %14s %12s %11s\n",vo.getName(),vo.getAccount(),vo.getPw1(),vo.getBalance());
			ps.println("                                                                  ");
			ps.println("       ��������������������������������������������������������������");
			
			
			//ps.println(vo.toString()+"\n"); 
			
			//ooss.writeObject(vo.toString());
				
			ps.close();
			foss.close();
			
			//ooss.close();
			
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		return vo;
	}

	
	public boolean checkAcc(String s) {
		
		boolean b = false;
		
		try {
		
			Iterator<BankVO> it = customers.iterator();
		
			while(it.hasNext()) {
				String s1 = it.next().getAccount();
				if(s.equals(s1)) {
					b=true;
					break;
				}
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		return b;	
	}
	
	
	
	
	@Override
	public void print() throws IOException{
		
		
		
		System.out.println("\n��������������ü ȸ�� ��ȸ������������");
		System.out.printf("        �̸�     ���¹�ȣ   ��й�ȣ\n");
		
		try {     //������ ȸ���� ��������
			
			Iterator<BankVO> it = customers.iterator();
			while(it.hasNext()) {
				BankVO vo = it.next();
				System.out.println(vo.toString1());
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	

	
	@Override
	public void searchbal(BankVO voo) {
		
		voo();
		
		String ano=voo.getAccount();
		String st;
		
		//System.out.print("���¹�ȣ �Է� :");
		//st = sc.next();
		
		try {
			/*
			FileInputStream fis = new FileInputStream("d:\\doc\\bank\\"+st+".txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			String ob=null;
			
			while(true) {
				ob = (String)ois.readObject();
				
				if(ob==null)
					break;
				
				System.out.println(ob);
			}
			*/
			
			FileInputStream fis = new FileInputStream("d:\\doc\\bank\\"+ano+".txt");
			
			int data;
			
			while((data=fis.read())!=-1) {
				
				System.out.write(data);
				System.out.flush();
			}
		
				
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
		}
		
	}

	
	
	public BankVO logIn() {
		
		String acc;
		int p = 0;
		BankVO vo=null;   //�α����� �� ����
		
		
		//�α���
		do{
			
			
			System.out.println(" ");
			System.out.print("      ��===============��\n");
			System.out.print("      �� ���¹�ȣ �Է�:��\n");
			System.out.print("      ��===============��");
			acc = sc.next();
			
			Iterator<BankVO> it = customers.iterator();
		
			while(it.hasNext()) {
				BankVO vo2 = it.next();
				
				if(!vo2.getAccount().equals(acc)) {
					continue;
				}
				
				//���¹�ȣ �����ϸ�
				vo = vo2;
			
				break;
			}
			
			if(vo==null) {
				
				System.out.println(" ");
				System.out.println("               ��=========================================��");
				System.out.println("               ��     �������� �ʴ� ���¹�ȣ�Դϴ�.       ��");
				System.out.println("               ��=========================================��");
			
				// ���⼭ �������� ���� ����� ������
			}
		
		}while(vo==null);
		
		
		while(true){
			
			System.out.println(" ");
			System.out.print("      ��===============��\n");
			System.out.print("      ����й�ȣ �Է�: ��\n");
			System.out.print("      ��===============��");
		
			p = sc.nextInt();
			
			if(p==vo.getPw()) {
				
				System.out.println(" ");
				System.out.println("               ��=========================================��");
				System.out.println("               ��              ��й�ȣ ��ġ               ��");
				System.out.println("               ��=========================================��");
				System.out.println(" ");
				System.out.println("               ��=========================================��");
				System.out.println("               ��            �α��� �Ǿ����ϴ�!           ��");
				System.out.println("               ��=========================================��");
				
				break;
			}
		}
		
		return vo;
	}
	
	
	
	@Override
	public void deposit(BankVO voo) {  //�Ա��ѵ�
	
		
		
		voo(); // =   //�α����� �� ����
		//File ff;
		
		
		String ano=voo.getAccount();
		
		
		
		//�Ա�
		
		String record="";
		String str = null;
		try {
			
			
			//int depositAmount;


			while(true) {

				int alph =0;
				int num =0;
				
				System.out.println(" ");
				System.out.print("      ��====================��\n");
				System.out.print("      ��  �Ա��� �ݾ�?(��):?��\n");
				System.out.print("      ��====================��");

				str= sc.next();

				//�Ա� �ݾ׿� �������� �˻� 
				for(int i=0;i<str.length();i++) {
					char c= str.charAt(i);
					if(c>='a'&& c<='z'|| c>='A' && c<='z')
						alph++;
					else if(c>='0'&& c<='9')
						num++;
				}

				if(alph!=0) {
					

					System.out.println(" ");
					System.out.println("                ��=========================================��");
					System.out.println("                ��           ���ڸ� �Է��Ͻÿ�!            ��");
					System.out.println("                ��=========================================��");
					
				}
				else if(alph==0&&num!=0) {
					
					System.out.println(" ");
					System.out.println("                ��=========================================��");
					System.out.println("                           "+str +"�� �ԱݵǾ����ϴ�!      ");
					System.out.println("                ��=========================================��");

					//System.out.println(str +"�� �ԱݵǾ����ϴ�!");
					voo.setBalance(voo.getBalance() + Integer.parseInt(str));
					break;
				}
			}
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
		}
		//������ ������Ʈ
		try {
			
			FileOutputStream fos = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
				
			oos.writeObject(customers);
				
			fos.close();
			oos.close();
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		
		try {
			FileOutputStream fos = new FileOutputStream("d:\\doc\\bank\\"+voo.getAccount()+".txt",true);
			//ObjectOutputStream oos = new ObjectOutputStream(fos);
			PrintStream ps = new PrintStream(fos);
			
			//oos.writeObject(record);
			
			 
			//oos.writeObject(vo.toString());
			//ps.println(record);
			ps.printf("                  ");
			ps.printf("%1$tF %1$tT",Calendar.getInstance());
			ps.printf("  %1s�� �Ա� �ܾ�:%1s\n",str,Integer.toString(voo.getBalance()));

			
			ps.close();
			fos.close();
			//oos.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
		}
		
	}
		
	


	private void voo() {
	}


	@Override
	public void withdraw(BankVO voo) {
				
		voo();   //�α����� �� ����
		
		String ano=voo.getAccount();
		
		
		//���	
		String record="";
		String str="";
		try {
			
			
			//int depositAmount;


			while(true) {

				int alph =0;
				int num =0;
				
				
				System.out.println(" ");
				System.out.print("      ��====================��\n");
				System.out.print("      ��  ����� �ݾ�?(��):?��\n");
				System.out.print("      ��====================��");

				str= sc.next();

				//�Ա� �ݾ׿� �������� �˻� 
				for(int i=0;i<str.length();i++) {
					char c= str.charAt(i);
					if(c>='a'&& c<='z'|| c>='A' && c<='z')
						alph++;
					else if(c>='0'&& c<='9')
						num++;
				}

				if(alph!=0) {
					
					System.out.println(" ");
					System.out.println("           ��=========================================��");
					System.out.println("           ��           ���ڸ� �Է��Ͻÿ�!            ��");
					System.out.println("           ��=========================================��");
					
				}
				else if(alph==0&&num!=0) {
					
					if(Integer.parseInt(str)>voo.getBalance()) {
						
						System.out.println(" ");
						System.out.println("           ��=========================================��");
						System.out.println("           ��           ��!! �ܾ��� �����ؿ�̤�      ��");
						System.out.println("           ��=========================================��");
						break;
					}
					
					
					System.out.println(" ");
					System.out.println("                ��=========================================��");
					System.out.println("                          "+str +"�� ��ݵǾ����ϴ�!       ");
					System.out.println("                ��=========================================��");

					//System.out.println(str +"�� ��ݵǾ����ϴ�!");
					voo.setBalance(voo.getBalance() - Integer.parseInt(str));
					
					//record = String.format("%1$tF %1$tT", Calendar.getInstance())+"\t"+str+"�� ���"+"\t"+"�ܾ� : "+Integer.toString(voo.getBalance());
					
					break;
				}
			}
		

		} catch (Exception e) {

		}
		
		//��ü���� ������Ʈ
		try {
			
			FileOutputStream fos = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
				
			oos.writeObject(customers);
				
			fos.close();
			oos.close();
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		
		//������ ������Ʈ
		try {
			FileOutputStream fos = new FileOutputStream("d:\\doc\\bank\\"+voo.getAccount()+".txt",true);
			PrintStream ps = new PrintStream(fos);
			
			//ps.println(record);
			ps.printf("                  ");
			ps.printf("%1$tF %1$tT",Calendar.getInstance());
			ps.printf("  %1s�� ��� �ܾ�:%1s\n",str,Integer.toString(voo.getBalance()));

			
			ps.close();
			fos.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
		}
			
	}
	

	
	
	@Override
	public void transfer(BankVO voo) {    //������ü
		
		//BankVO vo = logIn();   //�α����� �� ����
		voo();
		String ano=voo.getAccount();
		System.out.println(" ");
		System.out.println("                ��=========================================��");
		System.out.println("                     ��ݰ���: "+ano +" ��ü���ɱݾ�:"+voo.getBalance()+"��       ");
		System.out.println("                ��=========================================��");
		
		
		//System.out.println(ano);
		
		String record="",record1="";
	
		
		
		//��ü ��� Ȯ��	
		String acc;
		BankVO to = null; 
		
		String str="";
		do{
			
			System.out.println(" ");
			System.out.print("      ��===============��\n");
			System.out.print("      �� ���¹�ȣ �Է�:��\n");
			System.out.print("      ��===============��");

			acc = sc.next();
			
			Iterator<BankVO> it = customers.iterator();
		
			while(it.hasNext()) {
				BankVO vo2 = it.next();
				
				if(!vo2.getAccount().equals(acc)) {
					continue;
				}
				
				//���¹�ȣ �����ϸ�
				to = vo2;
			
				break;
			}
			
			if(to==null) {
				
				System.out.println(" ");
				System.out.println("               ��=========================================��");
				System.out.println("               ��       �������� �ʴ� ���¹�ȣ�Դϴ�.     ��");
				System.out.println("               ��=========================================��");
				System.out.println(" ");
				System.out.println("               ��=========================================��");
				System.out.println("               ��       ���¹�ȣ�� �ٽ� �Է��ϼ���        ��");
				System.out.println("               ��=========================================��");
				
				
/*				System.out.println("��� ���� �Ͻðڽ��ϱ�? 1.yes 2.no");
				
				int su=sc.nextInt();
				
				if(su==1) {
					continue;
					
				}else {
					
					break;
				}*/
			}
			
		
		}while(to==null);
		
		
		//��ü
		
		try {
			
			
			
			while(true) {

				int alph =0;
				int num =0;
				
				System.out.println(" ");
				System.out.print("      ��====================��\n");
				System.out.print("      ��  ��ü�� �ݾ�?(��):?��\n");
				System.out.print("      ��====================��");
				str= sc.next();

				//�Ա� �ݾ׿� �������� �˻� 
				for(int i=0;i<str.length();i++) {
					char c= str.charAt(i);
					if(c>='a'&& c<='z'|| c>='A' && c<='z')
						alph++;
					else if(c>='0'&& c<='9')
						num++;
				}

				if(alph!=0) {
					
					System.out.println(" ");
					System.out.println("                ��=========================================��");
					System.out.println("                ��           ���ڸ� �Է��Ͻÿ�!            ��");
					System.out.println("                ��=========================================��");

				
				}
				else if(alph==0&&num!=0) {
					
					if(Integer.parseInt(str)>voo.getBalance()) {
						System.out.println(" ");
						System.out.println("                ��=========================================��");
						System.out.println("                ��         ��!!! �ܾ��� �����ؿ�̤�       ��");
						System.out.println("                ��=========================================��");

						
						break;
					}
					
					System.out.println(" ");
					System.out.println("                ��=========================================��");
					System.out.println("                           "+str +"�� ��ü�Ǿ����ϴ�!       ");
					System.out.println("                ��=========================================��");

					
					voo.setBalance(voo.getBalance() - Integer.parseInt(str));
					//record = String.format("%1$tF %1$tT", Calendar.getInstance())+"\t"+str+"�� �۱� (�޴� ��� : "+to.getName()+")\t"+"�ܾ� : "+Integer.toString(voo.getBalance());
					
					to.setBalance(to.getBalance() + Integer.parseInt(str));
					//record1 = String.format("%1$tF %1$tT", Calendar.getInstance())+"\t"+str+"�� �Ա� (���� ��� : "+voo.getName()+")\t"+"�ܾ� : "+Integer.toString(to.getBalance());
					
					
					
					break;
				}
			}
		

		} catch (Exception e) {

		}
		
		//��ü���� ������Ʈ
		try {
			
			FileOutputStream fos = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
				
			oos.writeObject(customers);
				
			fos.close();
			oos.close();
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		
		//������ ������Ʈ
		try {
			FileOutputStream fos = new FileOutputStream("d:\\doc\\bank\\"+voo.getAccount()+".txt",true);
			PrintStream ps = new PrintStream(fos);
			
			//ps.println(record);
			
			ps.printf("                  ");
			ps.printf("%1$tF %1$tT",Calendar.getInstance());
			ps.printf("  %2s�� �۱�(�޴»��:%2s) �ܾ�:%s\n",str,to.getName(),Integer.toString(voo.getBalance()));

			
			ps.close();
			fos.close();
			
			
			
			FileOutputStream foss = new FileOutputStream("d:\\doc\\bank\\"+to.getAccount()+".txt",true);
			PrintStream pss = new PrintStream(foss);
			
			//pss.println(record1);
			pss.printf("                  ");
			pss.printf("%1$tF %1$tT",Calendar.getInstance());
			pss.printf("  %2s�� �Ա�(�������:%2s) �ܾ�:%s\n",str,voo.getName(),Integer.toString(to.getBalance()));

			
			
			pss.close();
			foss.close();
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
		}
		
	}
	
	//�������� �����
	
	@Override
	public void savings() {
	}

	@Override
	public void estimate() {
	}
	
   public void delete() {
		
		String acc;
		int p;
		BankVO vo = null; 
		
		System.out.println(" ");
		System.out.print("      ��=================��\n");
		System.out.print("      �� ������ ���¹�ȣ:��\n");
		System.out.print("      ��=================��");

		
		acc = sc.next();
	
		Iterator<BankVO> it = customers.iterator();
		
		while(it.hasNext()) {
			BankVO vo2 = it.next();
			
			if(!vo2.getAccount().equals(acc))
				continue;
			
			//���¹�ȣ �����ϸ�
			
			
			vo = vo2;
			break;
		}

		if(vo==null) {
			
			System.out.println(" ");
			System.out.println("               ��=========================================��");
			System.out.println("               ��       �������� �ʴ� ���¹�ȣ�Դϴ�.     ��");
			System.out.println("               ��=========================================��");
			System.out.println(" ");
			System.out.println("               ��=========================================��");
			System.out.println("               ��       ���¹�ȣ�� �ٽ� �Է��ϼ���        ��");
			System.out.println("               ��=========================================��");

			
			System.exit(0);
		}
		
		while(true){
			System.out.println(" ");
			System.out.print("      ��===============��\n");
			System.out.print("      ����й�ȣ �Է�: ��\n");
			System.out.print("      ��===============��");

		
			p = sc.nextInt();
			
			if(p==vo.getPw()) {
				break;
			}
		}
		
		int a = customers.indexOf(vo);
		customers.remove(a);
		
		try {
			
			FileOutputStream fos = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
				
			oos.writeObject(customers);
				
			fos.close();
			oos.close();
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		File ff = new File("d:\\doc\\bank\\"+vo.getAccount()+".txt");
		ff.delete();

		System.out.println(" ");
		System.out.println("               ��=========================================��");
		System.out.println("               ��               ���� ���� �Ϸ�            ��");
		System.out.println("               ��=========================================��");

		System.out.println("���� ���� �Ϸ�!");
		
		
	}


	

	
	

}
