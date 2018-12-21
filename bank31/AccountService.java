package bank31;
public interface AccountService {
	// 서비스 로직에는 멤버변수를 두지 않는다.
	//계좌생성
	public String generatorAccountNum();
	//오늘날짜 구하기
	public String today();
	//계좌정보보여주기
	public String info(String accountNum,String name,String today,int money);
	//입금하기
	public String deposit(int m);
	//출금하기
	public String withdraw(int in);
}
