package Exception;

public class ExcepMain {
	
	private int value ;
	public void setValue(int value) throws MyException{
		if(value<0) {
			// ���� error �߻� 
			throw new MyException("���� 0���� ������ ���� ");	
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
