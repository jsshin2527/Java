package com.project3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class BoardImpl extends BoardVO {

	private static final long serialVersionUID = 1L;

	ArrayList<BoardVO> lists = null;
	
	File f = new File("C:\\Users\\stu\\Desktop\\board.txt");

	@SuppressWarnings("unchecked")
	public BoardImpl() {
		try {
			if(!f.getParentFile().exists()) {
				f.getParentFile().mkdirs();
			}

			if (f.exists()) {
				FileInputStream fis = new FileInputStream(f);
				ObjectInputStream ois = new ObjectInputStream(fis);
				lists = (ArrayList<BoardVO>) ois.readObject();
				
				fis.close();
				ois.close();
			}

		} catch (Exception e) {

		}
	}

	public int input(String id) {

		Scanner sc = new Scanner(System.in);

		BoardVO vo = new BoardVO();

		int result = 0;
		
		vo.setId(id);

		System.out.print("�Խù� ����: ");
		vo.setName(sc.nextLine());
		//nextLine�� ���� ���� ��� ���ڿ��� �о�´�

		System.out.print("�Խù� ����: ");
		vo.setContent(sc.nextLine());

		if(lists==null) {
			lists = new ArrayList<BoardVO>();
		}
		lists.add(vo);

		return result;
	}

	public void print() {
		
		System.out.println("  ��ȣ             �Խù�(����)       �ۼ���    ");
		System.out.println("------------------------------------------------------");

		try {
			Iterator<BoardVO> it = lists.iterator();
			
			int i = 0;

			while(it.hasNext()) {
				BoardVO vo = it.next();
				System.out.println(vo.toString(i));
				i++;
				vo.setNum(i);
			}
			
		} catch (Exception e) {
			System.out.println("�Խù��� �����ϴ�");
		}
	}
	
	public void save() {

		try {
			if(lists!=null) {
				FileOutputStream fos = new FileOutputStream(f);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				oos.writeObject(lists);
				fos.close();
				oos.close();
			}

		} catch (Exception e) {

		}
	}
	
	public void findBoard() {
		
		Scanner sc = new Scanner(System.in);
		
		Iterator<BoardVO>  it = lists.iterator();

		System.out.print("�ñ��� �Խù�(��ȣ): ");
		int a = sc.nextInt();
		//String findBoard = sc.next();
		
		System.out.println();
		
		while(it.hasNext()) {
			
			BoardVO vo = it.next();
			
			if(/*vo.getName().equals(findBoard) || */a==vo.getNum()) {
				System.out.println(vo.toString());
			}
		}
	}
}
