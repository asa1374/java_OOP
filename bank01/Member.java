package bank01;
public class Member {
	String id ,name,ssn,pass;
	Member(String id,String name, String ssn, String pass){
		this.id = id;
		this.name = name;
		this.ssn = ssn;
		this.pass = pass;
	}
	public String info() {
		return String.format("[회원정보]\nID: %s\n이름 : %s\n주민번호: %s\n비밀번호 : %s", id,name,ssn,pass);
	}
}
