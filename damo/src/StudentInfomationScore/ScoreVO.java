package StudentInfomationScore;

import java.io.Serializable;

public class ScoreVO implements Serializable {
	
	
	private static final long serialVersionUID = 2663276651634611111L;
	private String name;
	private int score;
	private String brith;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getBrith() {
		return brith;
	}
	public void setBrith(String brith) {
		this.brith = brith;
	}
	@Override
	public String toString() {
		String str;
		str = String.format("%5s %4d %6s",name,score,brith);
		return str;
	}
}
