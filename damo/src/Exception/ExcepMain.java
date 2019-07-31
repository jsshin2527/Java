package Exception;

public class ExcepMain {
	
	private int value ;
	public void setValue(int value) throws MyException{
		if(value<0) {
			// 강제 error 발생 
			throw new MyException("수는 0보다 작을수 없다 ");	
		}else {
			this.value = value;
		}
	}
	
	public int getValue(){
		return value;
	}

	public static void main(String[] args) {

		ExcepMain ob = new ExcepMain();
		
		try {
			ob.setValue(-20);
		}catch (Exception e){
			System.out.println(e.toString());
		}
		System.out.println(ob.getValue());
	}

}
