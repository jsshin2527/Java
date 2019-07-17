package naver;

public class NaverVO {
	private String naverid;
	private String naverpassword1;
	private String naverpassword2;
	private String navername;
	private int navergender; //1 남자 2 여자 
	private String navergenderHangul;
	private String naveremail;
	private String navertel;
	private String naverbirth;
	
	public String getNaverbirth() {
		return naverbirth;
	}
	public void setNaverbirth(String naverbirth) {
		this.naverbirth = naverbirth;
	}
	public String getNavergenderHangul() {
		return navergenderHangul;
	}
	public void setNavergenderHangul(String navergenderHangul) {
		this.navergenderHangul = navergenderHangul;
	}	
	public String getNaverid() {
		return naverid;
	}
	public void setNaverid(String naverid) {
		this.naverid = naverid;
	}
	public String getNaverpassword1() {
		return naverpassword1;
	}
	public void setNaverpassword1(String naverpassword1) {
		this.naverpassword1 = naverpassword1;
	}
	public String getNaverpassword2() {
		return naverpassword2;
	}
	public void setNaverpassword2(String naverpassword2) {
		this.naverpassword2 = naverpassword2;
	}
	public String getNavername() {
		return navername;
	}
	public void setNavername(String navername) {
		this.navername = navername;
	}
	public int getNavergender() {
		return navergender;
	}
	public void setNavergender(int navergender) {
		this.navergender = navergender;
	}
	public String getNaveremail() {
		return naveremail;
	}
	public void setNaveremail(String naveremail) {
		this.naveremail = naveremail;
	}
	public String getNavertel() {
		return navertel;
	}
	public void setNavertel(String navertel) {
		this.navertel = navertel;
	}
	@Override
	public String toString() {
		String str;
		str =String.format("%7s %6s %6s %4s %4s %4s",naverid,navername,navergenderHangul,naveremail,naverbirth,navertel);
		return str;
	}	
}
