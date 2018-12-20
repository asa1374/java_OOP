package bank21;

import javax.activation.MailcapCommandMap;
import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
			AccountBean account = null;
			MemberBean member = null;
			AccountService service = new AccountService();
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료\n1.회원가입\n2.회원정보\n3.계좌개설\n4.계좌보기\n5.입금하기\n"
					+ "6.출금하기\n7.잔액확인\n8.비번변경\n")) {
			case "0" : 
				JOptionPane.showMessageDialog(null, String.format("종료..."));
				return;
			case "1" :
				String id = JOptionPane.showInputDialog("ID등록");
				String name = JOptionPane.showInputDialog("이름 등록");
				String ssn = JOptionPane.showInputDialog("주민번호 등록");
				String pass = JOptionPane.showInputDialog("비번등록");
				member = new MemberBean();
				member.setId(id);
				member.setName(name);
				member.setSsn(ssn);
				member.setPass(pass);
				break;
			case "2" :
				JOptionPane.showMessageDialog(null, member.toString());
				break;
			case "3" :
				account = new AccountBean();
				String accountNum = service.generatorAccountNum();
				account.setAccountNum(accountNum);
				String today = service.generatorAccountNum();
				account.setToday(today);
				String money = JOptionPane.showInputDialog("입금");
				int iMoney = Integer.parseInt(money);
				account.setMoney(iMoney);
				String info = service.info(account.getAccountNum(), member.getName(),account.getToday(),account.getMoney());
				break;
			case "4" :
				JOptionPane.showMessageDialog(null,account.toString());
				break;
			case "5" :
				String m = JOptionPane.showInputDialog("입금할 금액 입력");
				//JOptionPane.showMessageDialog(null, account.deposit(Integer.parseInt(m)));
				break;
			case "6" :
				String in = JOptionPane.showInputDialog("출금할 금액입력");
				//JOptionPane.showMessageDialog(null, account.withdraw(Integer.parseInt(in)));
				break;
			case "7" :
				//JOptionPane.showMessageDialog(null,account.balance(member.getName()));
				break;
			case "8" :
				String changePass = JOptionPane.showInputDialog("바꾸실 비번 입력");
				member.setPass(changePass);
				break;
			}
		}
	}
}
