package bank2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Account {
	final static String BANK_NAME = "국민은행";
	String accounNum,day;
	int money;
	Account(int money){
		this.accounNum = this.generatorAccountNum();
		this.money = money;
		this.day = this.today();
	}
	public String generatorAccountNum() {
		Random random = new Random();
		return random.nextInt(8999)+1001+"-"+(random.nextInt(8999)+1001);
	}
	
	public String today() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(date);
	}
	public String open(String name) {
		return String.format("%s님의정보 [%s]\n계좌번호%s\n잔액 %d\n날짜:%s",name, BANK_NAME,accounNum,money,day);
	}
}
