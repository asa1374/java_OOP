package bank2;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		Account account = null;
		Member member = null;
		while(true) {
			String num = JOptionPane.showInputDialog("0.end\n1.회원가입\n2.계좌생성\n3.계좌확인");
			switch(num) {
			case "0" : 
				JOptionPane.showMessageDialog(null, "종료합네다");
				return;
			case "1" : 
				String id = JOptionPane.showInputDialog("ID 입력");
				String pass = JOptionPane.showInputDialog("비번 입력");
				String name = JOptionPane.showInputDialog("이름 입력");
				String ssn = JOptionPane.showInputDialog("주민번호 입력");
				member = new Member(id, pass, name, ssn);
				String res = member.info();
				JOptionPane.showMessageDialog(null, res);
				break;
			case "2" : 
				account = new Account(0);
				break;
			case "3" :
				 String res1= account.open(member.name);
				JOptionPane.showMessageDialog(null, res1);
				break;
			}
		}
	}
}
