package bank3;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		Member member = null;
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료\n1.회원가입\n2.회원정보")) {
			case "0" :
				JOptionPane.showMessageDialog(null, "종료합니다.");
				return;
			case "1" :
				String id = JOptionPane.showInputDialog("ID 입력:");
				String pass = JOptionPane.showInputDialog("비밀번호 입력:");
				String name = JOptionPane.showInputDialog("이름 입력:");
				String ssn = JOptionPane.showInputDialog("주민번호 입력:");
				member =new Member(id, pass, name, ssn);
				break;
			case "2" :
				JOptionPane.showMessageDialog(null, member.info());
				break;
			}
		}
	}
}
