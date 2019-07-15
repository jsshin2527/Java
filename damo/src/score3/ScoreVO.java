package score3;

public class ScoreVO { //Value Object  : Data 를 저장하는 저장 공간 
					   //DTO : Data Transfer Object 
					   //file 에 저장을 하는 방법 
	private String hak;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int tot;
	
	
// private 변수 초기화 하는 방법 
// 1. 생성자 
// 2. 메소드 
// private를 변수를 만들면 반드시 getter 와 setter를 정의해 주어야 합니다. 
// 우회도로를 만드는 것이 getter 와 setter 입니다. 
	
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
	

	
	//getter setter  메소드 정의 값을 정의하고 가져오는 폼 
	
	

}
