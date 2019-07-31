package Abstract_UpCasting_DownCasting;

interface Score{
	
	public int total();
	public void write();	
}

class ScoreImpl implements Score{

	private String hak,name;
	private int kor,eng;
	
	//�⺻ ������ -> �ν��Ͻ����� �ʱ�ȭ �Ϸ��� �ʱ�ȭ �޼ҵ� �̿� 
	public ScoreImpl() {
		
	}
	//�ʱ�ȭ ������ �߰� 
	public ScoreImpl(String hak,String name,int kor,int eng) {
		this.hak=hak;
		this.name=name;
		this.kor=kor;
		this.eng=eng;
	}
	//�ʱ�ȭ �ϱ� ���� �޼ҵ� �߰� 
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
		System.out.println(hak+","+name+","+total() + "��");
	}
	
	//UPCAST 
	public boolean equals(Object ob/*������ UPCAST Example */) {
		
		boolean flag = false;
		// �ſ� �߿� 
		//instanceof ob �� ScoreImpl �� ����  
		// DownCast �� ���� �ڷ��� �� �ڷ��� üũ �뵵�ε� ��� �����մϴ�. 
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
			System.out.println("ob1 �� ob2�� ���� �ι�! ");
		}else {
			System.out.println("ob1 �� ob2�� ���� �ι��� �ƴմϴ�. "
					+ "! ");
		}
		ob1.write();
		ob2.write();	
	}
}
