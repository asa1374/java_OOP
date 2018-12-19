package bank3;
public class Member {
	String id,name,ssn,pass;
	Member(String id, String pass, String name, String ssn){
		this.id = id;
		this.pass = pass;
		this.name = name;
		this.ssn = ssn;
	}
	/**
	 * 회원정보 보여주기
	 * */
	public String info() {
		return String.format("ID : %s\n비밀번호 : %s\n이름 : %s\n주민번호 : %s\n",id,pass,name,ssn );
	}
}
