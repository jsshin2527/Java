package Class_Object2;

public class StarcraftMarin {

	private static int marinmaxhelth = 50;
	int marinhelth = 0;
	
	public StarcraftMarin(){
		System.out.println("ü���� "+marinmaxhelth+"�� marin 1���� �����Ͽ����ϴ�. ");
		this.marinhelth = marinmaxhelth;
	}
	
	public int stamppack(int helthresult) {
		System.out.println("�������� ����ϰڽ��ϴ�");
		helthresult = marinmaxhelth-10;
		return marinhelth;
	}
	public int damage(int helthresult) {
		System.out.println("������ ���ظ� �Ծ����ϴ�.");
		helthresult = marinmaxhelth-15;
		return marinhelth;
	}
	public int clincmedic(int helthresult) {
		System.out.println("�޵��� ġ�Ḧ �޾ҽ��ϴ�.");
		if( helthresult >=45) {
			System.out.println("������ ü���� �ִ�ġ �Դϴ�.");
			return helthresult;
		}else{
			return helthresult+5;
			}
		}
	
	
/*
	public void marindis(int helthresult) {
		System.out.println("���� ������ ü���� "+helthresult+"�Դϴ�.");
	}
	
	public static void main(String[] args) {
		
		StarcraftMarin.marinmaxhelth;
		
		System.out.println("������ �����ϰڽ��ϴ�.");
		
		StarcraftMarin marin1 = new StarcraftMarin();
		helthresult = marin1.stamppack(helthresult);
		marin1.marindis(helthresult);
		helthresult = marin1.stamppack(helthresult);
		marin1.marindis(helthresult);
		
		StarcraftMarin marin2 = new StarcraftMarin();
		helthresult =marin2.damage(helthresult);
		marin2.marindis(helthresult);
		
		StarcraftMarin marin3 = new StarcraftMarin();
		helthresult = marin3.stamppack(helthresult);
		marin3.marindis(helthresult);
		helthresult = marin3.clincmedic(helthresult);
		marin3.marindis(helthresult);
		marin3.clincmedic(helthresult);
		marin3.marindis(helthresult);
		helthresult=marin3.clincmedic(helthresult);
		marin3.marindis(helthresult);		
	*/
	}

