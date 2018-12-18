package bank2;

public class Member {
	String id,pass,name,ssn;
	Member(String id,String pass,String name,String ssn){
		this.id = id;
		this.pass = pass;
		this.name = name;
		this.ssn = ssn;
	}
	public String info() {
		String res = "";
		return String.format("ID는 %s\n비번은 %s\n이름은%s\n주민번호는%s\n", id,pass,name,ssn);
	}
}
