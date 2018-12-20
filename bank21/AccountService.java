package bank21;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
public class AccountService {
	// 서비스 로직에는 멤버변수를 두지 않는다.
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
	public String info(String accountNum,String name,String today,int money) {
		return String.format("은행이름:%s\n계좌번호:%s\n이름:%s\n"
				+ "날짜:%s\n잔액:%d\n", AccountBean.BANK_NAME,accountNum,name,today,money);
	}
	public String deposit(int m) {
		String message = "";
		/*if(m>0) {
			this.money += m ;
			message = "거래완료";
		}else {
			message = "입금이 안됩니다.";
		}*/
		return message;
		
	}
	public String withdraw(int in) {
		String message = "";
		/*if(this.money>=in) {
			this.money -= in;
			message = "거래완료";
		}else {
			message = "출금이 안됩니다.";
		}*/
		return message;
	}
	/*public String balance(String name) {
		return String.format("%s님의 계좌번호 %s\n잔액은 %s입니다.", name,accountNum,money);
	}*/
}
