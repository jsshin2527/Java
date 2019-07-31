package Exception;
//전달자 클래스 

public class MyException extends Exception{ //부모의 Exception을 상속 받으므로 

	private static final long serialVersionUID = 1l; // 이클립스 코딩 없어도 되는데 노란줄 없애러고 명시 
	
	public MyException(String msg) {
		super(msg); //오버로딩된 생성자를 가지고 있습니다. 
	}
}
