package bank31;
public class AccountBean {
	public final static String BANK_NAME ="국민은행";   //상수
	private String accountNum,today;
	private int money;
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	public String getAccountNum() {   // read 읽어 오는 것.
		return accountNum;
	}
	public void setToday(String today) {
		this.today = today;
	}
	public String getToday() {
		return today;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getMoney() {
		return money;
	}
	public String toString() {
		return String.format("계좌번호는 %s \n날짜 :%s\n잔액은 %d원입니다.",accountNum,today, money);
	}
}
