package testscore_Collection;

public class TestScoreVO {
	private String hak;
	private String name;
	private int linux;
	private int clang;
	private int java;
	private int tot;
	
	public int getTot() {
		return linux+clang+java;
	}
	public String getHak() {
		return hak;
	}
	public void setHak(String hak) {
		this.hak = hak;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLinux() {
		return linux;
	}
	public void setLinux(int linux) {
		this.linux = linux;
	}
	public int getClang() {
		return clang;
	}
	public void setClang(int clang) {
		this.clang = clang;
	}
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	public String toString() {
		
		if(hak == null || name == null) {
			return null;
		}else {
		String str = String.format(" %6s %6s %4d %4d %4d %4d %.2f \n",hak,name,linux,clang,java,tot,tot/3.0);
		return str;
		}
	}


}
