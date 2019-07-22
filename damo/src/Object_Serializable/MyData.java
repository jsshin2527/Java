package Object_Serializable;

import java.io.Serializable;

public class MyData implements Serializable {
	

	private static final long serialVersionUID = 1L;
	private String name;
	private int score;
	private transient String password;
	
	
	//��ü�� �����Ҷ� ������ ���� �����ڷ� �ʱ�ȭ�� �մϴ�. 
	
	public MyData(String name,int score,String password) {
		this.name = name;
		this.score = score;
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
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
	@Override
	public String toString() {
		
		//String str = String.format("%3s : %4d  %3s",name,score,password);
		//return str;
		return name+" : "+score+" : "+password; 
	}
	
}
