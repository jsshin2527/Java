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

//정보가 저장이 되어있는 경로 : c:\\score\\score.txt

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
				System.out.println("불러올 파일이 없습니다. ");
				
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
		
		System.out.print("이름을 입력하세요: ");
		vo.setName(sc.next());
		System.out.print("생일을 입력하세요: ");
		vo.setBrith(sc.next());
		System.out.print("점수을 입력하세요: ");
		vo.setScore(sc.nextInt());
		
		
		//처음 시작후 데이터 입력시 객체 생성 

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
		System.out.println("저장 성공 !! ");
		*/
		
	}
}
