/*
 * 가장 중요 이미 만들어져있는 것 
 * 메모리에 이미 올려놓기는 하는데 찾을수가 없다는것이 특징 
 */

package InnerClass;

public class InnerClass_Anonymous {

	public Object getTitle() { //UpCasting  -> Object 가 나왔다면 UpCasting 을 생각을 합니다. 
		
		
		//coding
	
		return new Object() {
			//anonymous 의 끝에서는 항상 ; 있어야 한다 
			//anonymous 는 주소값이 없기 때문에 그냥 실행이 된다 
			@Override
			public String toString() {
				return "익명의 클래스"; //어차피 마지막에 나온 값이 Object 입니다. 			
			}
		};
	}
	
	public static void main(String[] args) {
		
		InnerClass_Anonymous ob = new InnerClass_Anonymous();
		
		//String str = (String)ob.getTitle(); // DownCasting 
		
		//System.out.println(str);
		System.out.println(ob.getTitle());
		

	}

}
