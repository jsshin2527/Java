package StudyGrade;

public class Stu_ScoreVO {
	
	private String name;
	private int clang;
	private int java;
	private int linux;
	private int cpp;
	private int tot;
	
	public double getTot() {
		return clang+java+linux+cpp;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public int getLinux() {
		return linux;
	}
	public void setLinux(int linux) {
		this.linux = linux;
	}
	public int getCpp() {
		return cpp;
	}
	public void setCpp(int cpp) {
		this.cpp = cpp;
	}
	@Override
	public String toString() {
		String str;
		str = String.format("%6s %4d %4d %4d %4d %.2f %.2f",name,clang,java,linux,cpp,getTot(),getTot()/3.0);
		return str;
	}

}
