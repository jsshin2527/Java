package Array;

public class Rect_Example_Main {//정석은 클래스는 하나의 파일에 하나의 클래스를 만든다
	                //편의상 여러개의 클래스를 만들수 도 있다

	public static void main(String[] args) {
		
		Rect_Example r = new Rect_Example();
		
		r.input();
		int a = r.area();
		int l = r.length();
		r.print(a, l);
	}
}
