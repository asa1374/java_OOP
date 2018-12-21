package bank31;

public class MemberServiceImpl implements MemberService{
	@Override
	public MemberBean join(String id, String name, String ssn, String pass) {
		MemberBean member = new MemberBean();
		member.setId(id);
		member.setName(name);
		member.setSsn(ssn);
		member.setPass(pass);
		return member;
	}
	@Override
	public void login() {
		// TODO Auto-generated method stub
		
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
