package bank22;

public class MemberServiceImpl implements MemberService{
	private MemberBean[] members;
	private int count;
	MemberServiceImpl(){
		members = new MemberBean[10];
		count = 0;
	}
	@Override
	public void join(String id, String pass, String name, String ssn) {
		MemberBean member = new MemberBean();
		member.setId(id);
		member.setName(name);
		member.setPass(pass);
		member.setSsn(ssn);
		members[count] =member;
		count ++;
	}

	@Override
	public MemberBean[] list() {
		return members;
	}
	
	@Override
	public MemberBean find(String id) {
		MemberBean bean = new MemberBean();
		for(int i=0;i<count;i++) {
			if(members[i].getId().equals(id)) {
				bean = members[i];
			}
		}
		return bean;
	}
	
	@Override
	public boolean login(String id, String pw) {
		boolean ok = false;
		for(int i=0;i<count;i++) {
			if(members[i].getId().equals(id)&&members[i].getPass().equals(pw)) {
				ok = true;
				break;
			}
		}
		return ok;
	}
	
	@Override
	public int count() {
		return count;
	}

	@Override
	public void update(String id, String pw, String newpw) {
		for(int i=0;i<count;i++) {
			if(this.login(id, pw)) {
				members[i].setPass(newpw);
				break;
			}
		}
	}

	@Override
	public void delete(String id,String pw) {
		for(int i=0;i<count;i++) {
			if(this.login(id, pw)) {
				members[i] = members[count];
				members[count] = null;
				count--;
				break;
			}
		}
		/*for(int i=0;i<count;i++) {
			if(members[i].equals(null)) {
				members[i] = members[i+1];
			}
		}*/
	}

}
