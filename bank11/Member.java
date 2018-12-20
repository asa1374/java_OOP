package bank11;
public class Member {
	private String id ,name,ssn,pass;
	public Member(String id,String name, String ssn, String pass){
		this.id = id;
		this.name = name;
		this.ssn = ssn;
		this.pass = pass;
	}
	public String getId() {
		return id;
	}
	public String getName() {				//getter 게터
		return name;						//read
	}
	public String getSsn() {
		return ssn;
	}
	public void setPass(String pass) {  // setter  세터
		this.pass = pass;				//write
	}
	public String getPass() {
		return pass;
	}
	public String toString() {
		return String.format("[회원정보]\nID: %s\n이름 : %s\n주민번호: %s\n비밀번호 : %s", id,name,ssn,pass);
	}
}
