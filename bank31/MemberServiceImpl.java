package bank31;

public class MemberServiceImpl implements MemberService{
	private MemberBean[] members;
	private int count;
	MemberServiceImpl(){
		members = new MemberBean[10];
	}
	@Override
	public void join(String id, String name, String ssn, String pass) {
		MemberBean member = new MemberBean();
		member.setId(id);
		member.setName(name);
		member.setSsn(ssn);
		member.setPass(pass);
		members[count] = member;
		count++;
	}
	@Override
	public MemberBean[] list() {
		return members;
	}

	@Override
	public MemberBean find(String id) {
		MemberBean member = new MemberBean();
		for(int i=0;i<count;i++) {
			if(members[i].getId().equals(id)) {
				member = members[i];
				break;
			}
		}
		return member;
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
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
	}
	
}
