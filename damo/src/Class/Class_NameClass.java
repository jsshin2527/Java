package Class;

/*
 * Class 클래스 
 * 특정 클래스나 인터페이스 관한 정보를 검색하는 메소드 
 *  
 */
class Test{
	public void write() {
		System.out.println("테스트 ....");
	}
}


public class Class_NameClass {

	public static void main(String[] args) {
		
		try {
			
			Class c = Class.forName("Class.Test"); //메모리 상에 존재합니다  
			Object o = c.newInstance(); //Test의 객체를 생성 
			Test t = (Test)o;
			t.write();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
}
