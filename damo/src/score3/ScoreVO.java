package score3;

public class ScoreVO { //Value Object  : Data �� �����ϴ� ���� ���� 
					   //DTO : Data Transfer Object 
					   //file �� ������ �ϴ� ��� 
	private String hak;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int tot;
	
	
// private ���� �ʱ�ȭ �ϴ� ��� 
// 1. ������ 
// 2. �޼ҵ� 
// private�� ������ ����� �ݵ�� getter �� setter�� ������ �־�� �մϴ�. 
// ��ȸ���θ� ����� ���� getter �� setter �Դϴ�. 
	
	public int getTot() {
		return kor+eng+mat;
	}
	public String getHak() {
		return hak;
	}
	public void setHak(String hak) {
		this.hak = hak;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	@Override
	public String toString() {
	
		if(hak == null || name == null) {
	
			return null;
		}
		String str = String.format("%6s %6s %4d %4d %4d %4d %.2f \n",hak,name,kor,eng,mat,getTot(),getTot()/3.0);
		
			return str;
		}
	

	
	//getter setter  �޼ҵ� ���� ���� �����ϰ� �������� �� 
	
	

}
