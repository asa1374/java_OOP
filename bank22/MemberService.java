package bank22;

public interface MemberService {
	//회원가입
	public void join(String id,String pass,String name,String ssn);
	//목록보기
	public MemberBean[] list();
	//개인정보 검색
	public MemberBean find(String id);
	// 로그인
	public boolean login(String id, String pw);
	//회원수
	public int count();
	//정보수정
	public void update(String id, String pw,String newpw);
	//회원탈퇴
	public void delete(String id,String pw);
}
