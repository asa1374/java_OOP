package bank22;

public class MemberBean {
	private String id,pass,name,ssn;
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getPass() {
		return pass;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getSsn() {
		return ssn;
	}
	@Override
	public String toString() {
		return String.format("ID : %s\n"
				+ "PASS : %s\n"
				+ "NAME : %s\n"
				+ "SSN : %s", id,pass,name,ssn);
	}
}
