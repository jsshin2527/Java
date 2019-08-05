package com.project9;

import java.awt.image.ImageFilter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Scanner;

public class MemberImpl implements Member, Serializable{
	
	private static final long serialVersionUID = 1L;

	Scanner sc = new Scanner(System.in);
	
	private static Hashtable<String, MemberVO> mInfo = null;
	private static String grade[]= {"�̺�","�Ϻ�","��","����"};
	private String path = System.getProperty("user.dir");
	private File f = new File("D:\\doc\\member.txt");
	
	private MemberVO mVO;
	
	
	public MemberImpl() throws IOException, ClassNotFoundException {
		
		if(!f.getParentFile().exists()) {
			f.getParentFile().mkdirs();
		}
		if(f.exists()) {
			try {

				FileInputStream fis=
						new FileInputStream("d:\\doc\\member.txt");
				
				ObjectInputStream ois = 
						new ObjectInputStream(fis);
				
				mInfo = (Hashtable<String, MemberVO>)ois.readObject();
				
				fis.close();
				ois.close();
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("member.txt ��� ����");
			}

		}
	
	}

	//ȸ������>>ID�ϰ� PW�� �Է�
	public void memJoin() throws IOException{
		if(mInfo == null) {
			mInfo = new Hashtable<>();
			//System.out.println("new HashMap ����");
		}
		String id,pw;
		System.out.print("����� ID => ");
		id = sc.next();
		if(mInfo.containsKey(id)) {
			System.out.println("�̹� ���Ǵ� ID");
		}
		else {
			System.out.print("����� PW => ");
			pw = sc.next();
			mVO = new MemberVO();
			mVO.setPw(pw);
			mVO.setPlayCount(0);
			mVO.setWinCount(0);
			mVO.setCoin(100);
			
			mInfo.put(id, mVO);
		 	
			FileOutputStream fos = new
					FileOutputStream("d://doc//member.txt");
			ObjectOutputStream oos = new 
					ObjectOutputStream(fos);

			oos.writeObject(mInfo);

			fos.close();
			oos.close();

			
		}
		
	}
	
	public void memRemove() throws IOException{
		String id, pw;
		if(mInfo == null) {
			System.out.println("ȸ�� ������ �����ϴ�.");
			return;
		}
		System.out.print("������ ���̵� �Է� =>");
		id = sc.next();
		if (mInfo.containsKey(id)) {
			System.out.print("PW =>");
			pw = sc.next();
			if(!pw.equals(mInfo.get(id).getPw())) {
				System.out.println("PW ����ġ");
				return;
			}
			
			System.out.println("���̵� �����߽��ϴ�");
			mInfo.remove(id);
			FileOutputStream fos = new FileOutputStream("d://doc//member.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(mInfo);

			fos.close();
			oos.close();
		}else {
			System.out.println("���̵� �����ϴ�");
		}
	 
	}
	
	
	public MemberVO login() {
		String id,pw;
		if(mInfo == null || mInfo.isEmpty()) {
			System.out.println("ȸ�� ���� ����");
			return null;
		}
		while(true) {
			System.out.print("ID => ");
			id = sc.next();
			if(mInfo.containsKey(id)) {
				mVO = mInfo.get(id);

				System.out.print("PW => ");
				pw = sc.next();
				if(pw.equals(mVO.getPw())) {
					//���� �� ���
					System.out.println();
					System.out.println(id+"�� �������. GOOD-LUCK!!");
					int coin = mVO.getCoin();
					if(coin <= 300) System.out.println("���: "+grade[0]);
					else if(coin <= 600) System.out.println("���: "+grade[1]);
					else if(coin <= 1200) System.out.println("���: "+grade[2]);
					else  System.out.println("���: "+grade[3]);
					System.out.println();
					return mVO;			
				}

				System.out.println("�߸��� PW");
				return null;
			}

			System.out.println("�߸��� ID");
			return null;
		}
	}
	
	
	//����ȭ + ���
	public void write() throws IOException {
		FileOutputStream fos = new
				FileOutputStream("d://doc//member.txt");
		ObjectOutputStream oos = new 
				ObjectOutputStream(fos);
		
		oos.writeObject(mInfo);
		System.out.println();
		fos.close();
		oos.close();
	}
}
