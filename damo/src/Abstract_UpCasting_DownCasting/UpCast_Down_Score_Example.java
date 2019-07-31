package Abstract_UpCasting_DownCasting;

interface Score{
	
	public int total();
	public void write();	
}

class ScoreImpl implements Score{

	private String hak,name;
	private int kor,eng;
	
	//기본 생성자 -> 인스턴스변수 초기화 하려면 초기화 메소드 이용 
	public ScoreImpl() {
		
	}
	//초기화 생성자 추가 
	public ScoreImpl(String hak,String name,int kor,int eng) {
		this.hak=hak;
		this.name=name;
		this.kor=kor;
		this.eng=eng;
	}
	//초기화 하기 위한 메소드 추가 
	public void set(String hak,String name,int kor,int eng) {
		this.hak=hak;
		this.name=name;
		this.kor=kor;
		this.eng=eng;
	}
	@Override
	public int total() {
		return kor+eng;
	}
	@Override
	public void write(){
		System.out.println(hak+","+name+","+total() + "점");
	}
	
	//UPCAST 
	public boolean equals(Object ob/*참조형 UPCAST Example */) {
		
		boolean flag = false;
		// 매우 중요 
		//instanceof ob 가 ScoreImpl 과 같냐  
		// DownCast 할 참조 자료형 및 자료형 체크 용도로도 사용 가능합니다. 
		if(ob instanceof ScoreImpl) {
			ScoreImpl s = (ScoreImpl)ob; //DownCast
			if(this.hak.equals(s.hak) && this.name.equals(s.name)) {
				flag = true;
			}
		}
		return flag;
	}
}
public class UpCast_Down_Score_Example {

	public static void main(String[] args) {
		
		ScoreImpl ob1 = new ScoreImpl("111","jsshin",80,90);
		ScoreImpl ob2 = new ScoreImpl("112","jsshin",100,100);
		
		if(ob1.equals(ob2)) {
			System.out.println("ob1 과 ob2는 동일 인물! ");
		}else {
			System.out.println("ob1 과 ob2는 동일 인물이 아닙니다. "
					+ "! ");
		}
		ob1.write();
		ob2.write();	
	}
}
