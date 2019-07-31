package Class_Object2;

public class StarcraftMarin {

	private static int marinmaxhelth = 50;
	int marinhelth = 0;
	
	public StarcraftMarin(){
		System.out.println("체력이 "+marinmaxhelth+"인 marin 1개를 생산하였습니다. ");
		this.marinhelth = marinmaxhelth;
	}
	
	public int stamppack(int helthresult) {
		System.out.println("스팀팩을 사용하겠습니다");
		helthresult = marinmaxhelth-10;
		return marinhelth;
	}
	public int damage(int helthresult) {
		System.out.println("마린이 피해를 입었습니다.");
		helthresult = marinmaxhelth-15;
		return marinhelth;
	}
	public int clincmedic(int helthresult) {
		System.out.println("메딕의 치료를 받았습니다.");
		if( helthresult >=45) {
			System.out.println("마린의 체력이 최대치 입니다.");
			return helthresult;
		}else{
			return helthresult+5;
			}
		}
	
	
/*
	public void marindis(int helthresult) {
		System.out.println("현재 마린의 체력은 "+helthresult+"입니다.");
	}
	
	public static void main(String[] args) {
		
		StarcraftMarin.marinmaxhelth;
		
		System.out.println("마린을 생산하겠습니다.");
		
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

