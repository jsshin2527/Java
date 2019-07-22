package StudentInfomationScore;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSplitPaneUI;

//������ ������ �Ǿ��ִ� ��� : c:\\score\\score.txt

public class ScoreImpl implements Score{

	List<ScoreVO> lists = null;
	
	Scanner sc = new Scanner(System.in);
	
	private File f;
	
	String scorefile = "d:\\score\\score.txt";
	
	
	public ScoreImpl() throws IOException, ClassNotFoundException {
		
		try {
			f = new File(scorefile);
			
			if(f.getParentFile().exists()) {
				f.getParentFile().mkdirs();
			}
			
			if(!f.exists()) {
				
				lists = new ArrayList<ScoreVO>();
				System.out.println("�ҷ��� ������ �����ϴ�. ");
				
			}else {
				
				lists = new ArrayList<ScoreVO>();
				FileInputStream fis = new FileInputStream(scorefile);
				ObjectInputStream ois = new ObjectInputStream(fis);
				
				lists =  (List<ScoreVO>)ois.readObject();
				
				fis.close();
				ois.close();
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	
	}
	
	@Override
	public int input() {
		
		int result = 0;
		ScoreVO vo = new ScoreVO();
		
		System.out.print("�̸��� �Է��ϼ���: ");
		vo.setName(sc.next());
		System.out.print("������ �Է��ϼ���: ");
		vo.setBrith(sc.next());
		System.out.print("������ �Է��ϼ���: ");
		vo.setScore(sc.nextInt());
		
		
		//ó�� ������ ������ �Է½� ��ü ���� 

		lists.add(vo);
		
		return result;
	}

	@Override
	public void output() {
	
		Iterator<ScoreVO> it =  lists.iterator();
		
		while(it.hasNext()) {	
			ScoreVO vo = it.next();
			System.out.println(vo.toString());
		}
	}
	
	@Override
	public void store() {
		try {
			
			FileOutputStream fos = new FileOutputStream(scorefile);
			ObjectOutputStream oos = new ObjectOutputStream(fos);	
			oos.writeObject(lists);
		
		} catch (Exception e) {
			// TODO: handle exception
		}
		/*
		Score_Input_Output sio = new Score_Input_Output();
		
		Iterator<ScoreVO> it =  lists.iterator();
		
		while(it.hasNext()) {
			ScoreVO vo = it.next();
			sio.outputtxt(vo);
		}
		System.out.println("���� ���� !! ");
		*/
		
	}
}
