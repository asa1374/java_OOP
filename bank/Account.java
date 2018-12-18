package bank;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
public class Account {
	final static String BANK_NAME ="국민은행";   //상수
	String accountNum,today;
	int money;
	
	Account(int money){
		this.accountNum = this.generatorAccountNum();
		this.money = money;
		this.today = this.today();
	}
	public String generatorAccountNum() {
		String accountNum = "";
		Random random = new Random();
		accountNum = random.nextInt(8999)+1001+"-"+(random.nextInt(8999)+1001);
		return accountNum;
	}
	public String today() {
		String today = "";
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		today = sdf.format(date);
		return today;
	}
	public String open(String name) {
		return String.format("은행이름은 %s \n계좌번호는 %s \n이름 : %s\n날짜 :%s\n잔액은 %d입니다.",  BANK_NAME,accountNum, name,today, money);
	}
}
