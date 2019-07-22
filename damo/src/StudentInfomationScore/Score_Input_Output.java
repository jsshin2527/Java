package StudentInfomationScore;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.plaf.synth.SynthSplitPaneUI;

public class Score_Input_Output {
	

	public void outputtxt(ScoreVO vo) {
		
		try {
			
			FileOutputStream fos = new FileOutputStream("d:\\score\\score.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(vo);
			fos.close();
			oos.close();

		} catch (Exception e) {
			//System.out.println(e.toString());
		}
	}
	public void inputtxt(ScoreVO vo) {
	
		try {	
			FileInputStream fis = new FileInputStream("d:\\score\\score.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);			
			//ScoreVO v1 = null;
			while(true) {
				vo = (ScoreVO)ois.readObject();
				
				if(vo == null) {
					break;
				}	
			}
			System.out.println(vo.toString());	
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
}
