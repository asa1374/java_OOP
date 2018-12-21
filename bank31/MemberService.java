package bank31;
public interface MemberService {
	//회원가입
	public MemberBean join(String id,String name,String ssn,String pass);
	// 로그인
	public void login();
	//정보수정
	public void update();
	//회원탈퇴
	public void delete();
}
