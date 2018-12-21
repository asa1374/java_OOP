package bank31;
public class MemberBean {
	private String id ,name,ssn,pass;
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {				//getter 게터
		return name;						//read
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
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
	@Override
	public String toString() {
		return String.format("[회원정보]\nID: %s\n이름 : %s\n주민번호: %s\n비밀번호 : %s", id,name,ssn,pass);
	}
}
