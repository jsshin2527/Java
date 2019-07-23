package com.score5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Score {

	private List<ScoreVO> lists = null;
	private String path = System.getProperty("user.dir");
	private File f = new File(path,"\\data\\score.txt");
	
	//객체 생성시 초기화 
	public Score() {
		try {
			//파일이 없으면 만들어라 
			if(!f.getParentFile().exists()) {
				f.getParentFile().mkdirs();
			}
			if(f.exists()) {
				FileInputStream fis = new FileInputStream(f);
				ObjectInputStream ois = new ObjectInputStream(fis);
				
				lists = (ArrayList<ScoreVO>)ois.readObject();
				
				fis.close();
				ois.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	//파일을 저장하는 메소드 
	public void writeFile() {
		
		try {
			//리스트에 파일이 있다면 저장하지 않습니다. 
			if(lists != null) {
				FileOutputStream fos = new FileOutputStream(f);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				oos.writeObject(lists);
				
				fos.close();
				oos.close();
				System.out.println("파일 저장 성공");
			}
		} catch (Exception e) {
			
			
		}
	}
	
	public void print() {
		Iterator<ScoreVO> it = lists.iterator();
		while(it.hasNext()){
			ScoreVO vo = it.next();
			System.out.println(vo.toString());
		}
	}
	public void input() {
		
		Scanner sc = new Scanner(System.in);
		
		ScoreVO vo = new ScoreVO();
		
		System.out.print("이름 ? ");
		vo.setName(sc.next());
		
		System.out.print("생일 ? ");
		vo.setBirth(sc.next());
		
		System.out.print("점수? ");
		vo.setScore(sc.nextInt());
	
		//처음 실행시
		if(lists == null) {
			lists = new ArrayList<>();
		}
		
		lists.add(vo);
	}
}
