package bank01;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
			Account account = null;
			Member member = null;
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료\n1.회원가입\n2.계좌개설\n3.계좌보기\n4.입금하기\n5.출금하기\n6.잔액확인")) {
			case "0" : 
				JOptionPane.showMessageDialog(null, String.format("종료..."));
				return;
			case "1" :
				String id = JOptionPane.showInputDialog("ID등록");
				String name = JOptionPane.showInputDialog("이름 등록");
				String ssn = JOptionPane.showInputDialog("주민번호 등록");
				String pass = JOptionPane.showInputDialog("비번등록");
				member = new Member(id, name, ssn, pass);
				String info = member.info();
				JOptionPane.showMessageDialog(null, info);
				break;
			case "2" :
				account = new Account(0);
				break;
			case "3" :
				String res = account.open(member.name);
				JOptionPane.showMessageDialog(null,res);
				break;
			case "4" :
				String m = JOptionPane.showInputDialog("입금할 금액 입력");
				String message = account.deposit(Integer.parseInt(m));
				JOptionPane.showMessageDialog(null, message);
				break;
			case "5" :
				String in = JOptionPane.showInputDialog("출금할 금액입력");
				String message1 = account.withdraw(Integer.parseInt(in));
				JOptionPane.showMessageDialog(null, message1);
				
				break;
			case "6" :
				String bal = account.balance(member.name);
				JOptionPane.showMessageDialog(null,bal);
				break;
			}
		}
	}
}
