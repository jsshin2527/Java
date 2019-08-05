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
	
	//private List<BankVO> lists = new ArrayList<>();  //리스트로 안해도 될거같음
	
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
		
		//이름
		
		System.out.print("      ┌=========┐\n");
		System.out.print("      │  이름:  │\n");
		System.out.print("      ┗=========┘");

		
	
		
		vo.setName(sc.next());
		
		
		//계좌 비밀번호
		int pww;
		
		do{
			System.out.println(" ");
			System.out.println(" ");
			System.out.print("      ┌==========================┐\n");
			System.out.print("      │비밀번호 입력(숫자 6자리):│\n");
			System.out.print("      ┗==========================┘");


			//System.out.print("계좌 비밀번호(숫자 6자리) : ");
			pww = sc.nextInt();
		}while(pww<100000 || pww>999999);
		
		int pwww;
		do {
			
			System.out.println(" ");
			System.out.println(" ");
			System.out.print("      ┌==========================┐\n");
			System.out.print("      │      비밀번호 재입력:    │\n");
			System.out.print("      ┗==========================┘");
			
			//System.out.print("비밀번호 확인 : ");
			pwww = sc.nextInt();
		}while(pww!=pwww);
		//System.out.println("비밀번호가 일치합니다!");
		vo.setPw(pww);
		
		
		//암호화된 비번
		vo.setPw1(Integer.toString(vo.getPw()).substring(0, 2)+"****");
		//System.out.println(vo.getPw1());
		
		
		//랜덤으로 계좌번호 생성
		Random rd = new Random();
		
		int[] num = new int[10];   //10자리 계좌번호
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
		//System.out.println(vo.getName()+"님의 계좌번호는 "+vo.getAccount()+"입니다.");
		//System.out.println(vo.getName()+"님의 계좌가 생성되었습니다!");
		System.out.println(" ");
		System.out.println("           ┌===========================================┐");
		System.out.println("           │             비밀번호 일치!!!            │");
		System.out.println("           ┗===========================================┘");
		System.out.println(" ");
		System.out.println("           ┌===========================================┐");
		System.out.println("           │       판도라 은행 가입을 환영합니다.    │");
		System.out.println("           ┗===========================================┘");
		System.out.println(" ");
		System.out.println("           ┌===========================================┐");
		System.out.println("                "+vo.getName()+" 님의 계좌번호는 "+vo.getAccount()+" 입니다.   ");
		System.out.println("           ┗===========================================┘");
		System.out.println(" ");
		
		//잔액 초기화
		vo.setBalance(0);
	
		
		
		//처음 실행시
		if(customers==null) {
			customers = new ArrayList<>();
		}
		
		customers.add(vo);
		
		
		//전체고객파일로 내보내기
		
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
		
		
		//개인고객파일 생성
		String str = "d:\\doc\\bank\\"+vo.getAccount()+".txt";
		File ff = new File(str);
		
		try{
			
			FileOutputStream foss = new FileOutputStream(ff);
			//ObjectOutputStream ooss = new ObjectOutputStream(foss);
			PrintStream ps = new PrintStream(foss);
			ps.println("                                                                  ");
			ps.println("                                                                  ");
			
			ps.println("                 ┌=========================================┐");
			ps.println("                           "+vo.getName()+"님의 계좌정보!        ");
			ps.println("                 ┗=========================================┘");
			ps.println("             ┌=========┐┌=========┐┌=========┐┌=========┐");
			ps.println("             │  이름   ││ 계좌번호││ 비밀번호││  잔액   │");
			ps.println("             ┗=========┘┗=========┘┗=========┘┗=========┘");
			
			
			ps.printf("%23s %14s %12s %11s\n",vo.getName(),vo.getAccount(),vo.getPw1(),vo.getBalance());
			ps.println("                                                                  ");
			ps.println("       ┌─────────────────────────────┐");
			
			
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
		
		
		
		System.out.println("\n▷▷▷▷▷▷전체 회원 조회◁◁◁◁◁◁");
		System.out.printf("        이름     계좌번호   비밀번호\n");
		
		try {     //삭제한 회원도 나오도록
			
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
		
		//System.out.print("계좌번호 입력 :");
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
		BankVO vo=null;   //로그인한 고객 정보
		
		
		//로그인
		do{
			
			
			System.out.println(" ");
			System.out.print("      ┌===============┐\n");
			System.out.print("      │ 계좌번호 입력:│\n");
			System.out.print("      ┗===============┘");
			acc = sc.next();
			
			Iterator<BankVO> it = customers.iterator();
		
			while(it.hasNext()) {
				BankVO vo2 = it.next();
				
				if(!vo2.getAccount().equals(acc)) {
					continue;
				}
				
				//계좌번호 존재하면
				vo = vo2;
			
				break;
			}
			
			if(vo==null) {
				
				System.out.println(" ");
				System.out.println("               ┌=========================================┐");
				System.out.println("               │     존재하지 않는 계좌번호입니다.       │");
				System.out.println("               ┗=========================================┘");
			
				// 여기서 종료할지 말지 물어보면 좋을듯
			}
		
		}while(vo==null);
		
		
		while(true){
			
			System.out.println(" ");
			System.out.print("      ┌===============┐\n");
			System.out.print("      │비밀번호 입력: │\n");
			System.out.print("      ┗===============┘");
		
			p = sc.nextInt();
			
			if(p==vo.getPw()) {
				
				System.out.println(" ");
				System.out.println("               ┌=========================================┐");
				System.out.println("               │              비밀번호 일치               │");
				System.out.println("               ┗=========================================┘");
				System.out.println(" ");
				System.out.println("               ┌=========================================┐");
				System.out.println("               │            로그인 되었습니다!           │");
				System.out.println("               ┗=========================================┘");
				
				break;
			}
		}
		
		return vo;
	}
	
	
	
	@Override
	public void deposit(BankVO voo) {  //입금한도
	
		
		
		voo(); // =   //로그인한 고객 정보
		//File ff;
		
		
		String ano=voo.getAccount();
		
		
		
		//입금
		
		String record="";
		String str = null;
		try {
			
			
			//int depositAmount;


			while(true) {

				int alph =0;
				int num =0;
				
				System.out.println(" ");
				System.out.print("      ┌====================┐\n");
				System.out.print("      │  입금할 금액?(원):?│\n");
				System.out.print("      ┗====================┘");

				str= sc.next();

				//입금 금액에 문자포함 검사 
				for(int i=0;i<str.length();i++) {
					char c= str.charAt(i);
					if(c>='a'&& c<='z'|| c>='A' && c<='z')
						alph++;
					else if(c>='0'&& c<='9')
						num++;
				}

				if(alph!=0) {
					

					System.out.println(" ");
					System.out.println("                ┌=========================================┐");
					System.out.println("                │           숫자만 입력하시오!            │");
					System.out.println("                ┗=========================================┘");
					
				}
				else if(alph==0&&num!=0) {
					
					System.out.println(" ");
					System.out.println("                ┌=========================================┐");
					System.out.println("                           "+str +"원 입금되었습니다!      ");
					System.out.println("                ┗=========================================┘");

					//System.out.println(str +"원 입금되었습니다!");
					voo.setBalance(voo.getBalance() + Integer.parseInt(str));
					break;
				}
			}
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
		}
		//고객파일 업데이트
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
			ps.printf("  %1s원 입금 잔액:%1s\n",str,Integer.toString(voo.getBalance()));

			
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
				
		voo();   //로그인한 고객 정보
		
		String ano=voo.getAccount();
		
		
		//출금	
		String record="";
		String str="";
		try {
			
			
			//int depositAmount;


			while(true) {

				int alph =0;
				int num =0;
				
				
				System.out.println(" ");
				System.out.print("      ┌====================┐\n");
				System.out.print("      │  출금할 금액?(원):?│\n");
				System.out.print("      ┗====================┘");

				str= sc.next();

				//입금 금액에 문자포함 검사 
				for(int i=0;i<str.length();i++) {
					char c= str.charAt(i);
					if(c>='a'&& c<='z'|| c>='A' && c<='z')
						alph++;
					else if(c>='0'&& c<='9')
						num++;
				}

				if(alph!=0) {
					
					System.out.println(" ");
					System.out.println("           ┌=========================================┐");
					System.out.println("           │           숫자만 입력하시오!            │");
					System.out.println("           ┗=========================================┘");
					
				}
				else if(alph==0&&num!=0) {
					
					if(Integer.parseInt(str)>voo.getBalance()) {
						
						System.out.println(" ");
						System.out.println("           ┌=========================================┐");
						System.out.println("           │           앗!! 잔액이 부족해요ㅜㅜ      │");
						System.out.println("           ┗=========================================┘");
						break;
					}
					
					
					System.out.println(" ");
					System.out.println("                ┌=========================================┐");
					System.out.println("                          "+str +"원 출금되었습니다!       ");
					System.out.println("                ┗=========================================┘");

					//System.out.println(str +"원 출금되었습니다!");
					voo.setBalance(voo.getBalance() - Integer.parseInt(str));
					
					//record = String.format("%1$tF %1$tT", Calendar.getInstance())+"\t"+str+"원 출금"+"\t"+"잔액 : "+Integer.toString(voo.getBalance());
					
					break;
				}
			}
		

		} catch (Exception e) {

		}
		
		//전체파일 업데이트
		try {
			
			FileOutputStream fos = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
				
			oos.writeObject(customers);
				
			fos.close();
			oos.close();
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		
		//고객파일 업데이트
		try {
			FileOutputStream fos = new FileOutputStream("d:\\doc\\bank\\"+voo.getAccount()+".txt",true);
			PrintStream ps = new PrintStream(fos);
			
			//ps.println(record);
			ps.printf("                  ");
			ps.printf("%1$tF %1$tT",Calendar.getInstance());
			ps.printf("  %1s원 출금 잔액:%1s\n",str,Integer.toString(voo.getBalance()));

			
			ps.close();
			fos.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
		}
			
	}
	

	
	
	@Override
	public void transfer(BankVO voo) {    //계좌이체
		
		//BankVO vo = logIn();   //로그인한 고객 정보
		voo();
		String ano=voo.getAccount();
		System.out.println(" ");
		System.out.println("                ┌=========================================┐");
		System.out.println("                     출금계좌: "+ano +" 이체가능금액:"+voo.getBalance()+"원       ");
		System.out.println("                ┗=========================================┘");
		
		
		//System.out.println(ano);
		
		String record="",record1="";
	
		
		
		//이체 대상 확인	
		String acc;
		BankVO to = null; 
		
		String str="";
		do{
			
			System.out.println(" ");
			System.out.print("      ┌===============┐\n");
			System.out.print("      │ 계좌번호 입력:│\n");
			System.out.print("      ┗===============┘");

			acc = sc.next();
			
			Iterator<BankVO> it = customers.iterator();
		
			while(it.hasNext()) {
				BankVO vo2 = it.next();
				
				if(!vo2.getAccount().equals(acc)) {
					continue;
				}
				
				//계좌번호 존재하면
				to = vo2;
			
				break;
			}
			
			if(to==null) {
				
				System.out.println(" ");
				System.out.println("               ┌=========================================┐");
				System.out.println("               │       존재하지 않는 계좌번호입니다.     │");
				System.out.println("               ┗=========================================┘");
				System.out.println(" ");
				System.out.println("               ┌=========================================┐");
				System.out.println("               │       계좌번호를 다시 입력하세요        │");
				System.out.println("               ┗=========================================┘");
				
				
/*				System.out.println("계속 진행 하시겠습니까? 1.yes 2.no");
				
				int su=sc.nextInt();
				
				if(su==1) {
					continue;
					
				}else {
					
					break;
				}*/
			}
			
		
		}while(to==null);
		
		
		//이체
		
		try {
			
			
			
			while(true) {

				int alph =0;
				int num =0;
				
				System.out.println(" ");
				System.out.print("      ┌====================┐\n");
				System.out.print("      │  이체할 금액?(원):?│\n");
				System.out.print("      ┗====================┘");
				str= sc.next();

				//입금 금액에 문자포함 검사 
				for(int i=0;i<str.length();i++) {
					char c= str.charAt(i);
					if(c>='a'&& c<='z'|| c>='A' && c<='z')
						alph++;
					else if(c>='0'&& c<='9')
						num++;
				}

				if(alph!=0) {
					
					System.out.println(" ");
					System.out.println("                ┌=========================================┐");
					System.out.println("                │           숫자만 입력하시오!            │");
					System.out.println("                ┗=========================================┘");

				
				}
				else if(alph==0&&num!=0) {
					
					if(Integer.parseInt(str)>voo.getBalance()) {
						System.out.println(" ");
						System.out.println("                ┌=========================================┐");
						System.out.println("                │         앗!!! 잔액이 부족해요ㅜㅜ       │");
						System.out.println("                ┗=========================================┘");

						
						break;
					}
					
					System.out.println(" ");
					System.out.println("                ┌=========================================┐");
					System.out.println("                           "+str +"원 이체되었습니다!       ");
					System.out.println("                ┗=========================================┘");

					
					voo.setBalance(voo.getBalance() - Integer.parseInt(str));
					//record = String.format("%1$tF %1$tT", Calendar.getInstance())+"\t"+str+"원 송금 (받는 사람 : "+to.getName()+")\t"+"잔액 : "+Integer.toString(voo.getBalance());
					
					to.setBalance(to.getBalance() + Integer.parseInt(str));
					//record1 = String.format("%1$tF %1$tT", Calendar.getInstance())+"\t"+str+"원 입금 (보낸 사람 : "+voo.getName()+")\t"+"잔액 : "+Integer.toString(to.getBalance());
					
					
					
					break;
				}
			}
		

		} catch (Exception e) {

		}
		
		//전체파일 업데이트
		try {
			
			FileOutputStream fos = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
				
			oos.writeObject(customers);
				
			fos.close();
			oos.close();
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		
		//고객파일 업데이트
		try {
			FileOutputStream fos = new FileOutputStream("d:\\doc\\bank\\"+voo.getAccount()+".txt",true);
			PrintStream ps = new PrintStream(fos);
			
			//ps.println(record);
			
			ps.printf("                  ");
			ps.printf("%1$tF %1$tT",Calendar.getInstance());
			ps.printf("  %2s원 송금(받는사람:%2s) 잔액:%s\n",str,to.getName(),Integer.toString(voo.getBalance()));

			
			ps.close();
			fos.close();
			
			
			
			FileOutputStream foss = new FileOutputStream("d:\\doc\\bank\\"+to.getAccount()+".txt",true);
			PrintStream pss = new PrintStream(foss);
			
			//pss.println(record1);
			pss.printf("                  ");
			pss.printf("%1$tF %1$tT",Calendar.getInstance());
			pss.printf("  %2s원 입금(보낸사람:%2s) 잔액:%s\n",str,voo.getName(),Integer.toString(to.getBalance()));

			
			
			pss.close();
			foss.close();
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
		}
		
	}
	
	//계정삭제 만들기
	
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
		System.out.print("      ┌=================┐\n");
		System.out.print("      │ 해지할 계좌번호:│\n");
		System.out.print("      ┗=================┘");

		
		acc = sc.next();
	
		Iterator<BankVO> it = customers.iterator();
		
		while(it.hasNext()) {
			BankVO vo2 = it.next();
			
			if(!vo2.getAccount().equals(acc))
				continue;
			
			//계좌번호 존재하면
			
			
			vo = vo2;
			break;
		}

		if(vo==null) {
			
			System.out.println(" ");
			System.out.println("               ┌=========================================┐");
			System.out.println("               │       존재하지 않는 계좌번호입니다.     │");
			System.out.println("               ┗=========================================┘");
			System.out.println(" ");
			System.out.println("               ┌=========================================┐");
			System.out.println("               │       계좌번호를 다시 입력하세요        │");
			System.out.println("               ┗=========================================┘");

			
			System.exit(0);
		}
		
		while(true){
			System.out.println(" ");
			System.out.print("      ┌===============┐\n");
			System.out.print("      │비밀번호 입력: │\n");
			System.out.print("      ┗===============┘");

		
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
		System.out.println("               ┌=========================================┐");
		System.out.println("               │               계좌 해지 완료            │");
		System.out.println("               ┗=========================================┘");

		System.out.println("계좌 해지 완료!");
		
		
	}


	

	
	

}
