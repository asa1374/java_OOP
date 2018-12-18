package bank;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
			Account account = null;
			Member member = null;
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료\n1.회원가입\n2.계좌개설\n3.계좌보기")) {
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
			}
		}
	}
}
