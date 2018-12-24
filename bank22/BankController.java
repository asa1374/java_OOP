package bank22;

import javax.swing.JOptionPane;

public class BankController {
	public static void main(String[] args) {
		MemberBean member = null;
		MemberService memberservice = new MemberServiceImpl();
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료\n1.회원가입\n2.회원리스트 보기\n3.ID검색\n4.로그인\n5.회원수\n"
					+ "6.비번변경\n7.회원탈퇴")) {
			case "0" :
				JOptionPane.showMessageDialog(null, "종료합니다");
				return;
			case "1" :
				memberservice.join(JOptionPane.showInputDialog("id"),
						JOptionPane.showInputDialog("pass"), JOptionPane.showInputDialog("name"),
						JOptionPane.showInputDialog("ssn"));
				break;
			case "2" :
				JOptionPane.showMessageDialog(null, memberservice.list());
				break;
			case "3" :
				JOptionPane.showMessageDialog(null,memberservice.find(JOptionPane.showInputDialog("검색하실 ID")));
				break;
			case "4" :
				boolean ok = memberservice.login(JOptionPane.showInputDialog("id : "), JOptionPane.showInputDialog("pw : "));
				JOptionPane.showMessageDialog(null,(ok) ? "로그인 성공" : "로그인 실패" );
				break;
			case "5" :
				JOptionPane.showMessageDialog(null, memberservice.count()+"명");
				break;
			case "6" :
				memberservice.update(JOptionPane.showInputDialog("id :"), 
						JOptionPane.showInputDialog("pw :"), JOptionPane.showInputDialog("newpw :"));
				break;
			case "7" :
				memberservice.delete(JOptionPane.showInputDialog("ID"),JOptionPane.showInputDialog("PASS"));
				break;
			}
		}
	}
}
