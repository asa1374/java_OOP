package bank31;

import javax.activation.MailcapCommandMap;
import javax.swing.JOptionPane;

public class Controller {
	public static void main(String[] args) {
			AccountBean account = null;
			MemberBean member = null;
			AccountService accountService = new AccountServiceImpl();
			MemberService memberService = new MemberServiceImpl();
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료\n1.회원가입\n2.회원정보\n3.계좌개설\n4.계좌보기\n5.입금하기\n"
					+ "6.출금하기\n7.잔액확인\n8.비번변경\n9.회원목록보기\n10.회원 찾기\n11.로그인")) {
			case "0" : 
				JOptionPane.showMessageDialog(null, String.format("종료..."));
				return;
			case "1" :
				memberService.join(JOptionPane.showInputDialog("ID등록"),
						JOptionPane.showInputDialog("이름 등록"),
						JOptionPane.showInputDialog("주민번호 등록"),
						JOptionPane.showInputDialog("비번등록"));
				break;
			case "2" :
				JOptionPane.showMessageDialog(null, member.toString());
				break;
			case "3" :
				account = new AccountBean();
				String accountNum = accountService.generatorAccountNum();
				account.setAccountNum(accountNum);
				String today = accountService.generatorAccountNum();
				account.setToday(today);
				String money = JOptionPane.showInputDialog("입금");
				int iMoney = Integer.parseInt(money);
				account.setMoney(iMoney);
				String info = accountService.info(account.getAccountNum(), member.getName(),account.getToday(),account.getMoney());
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
			case "9" :
				MemberBean[] members = memberService.list();
				JOptionPane.showMessageDialog(null,members);
				break;
			case "10" :
				JOptionPane.showMessageDialog(null,memberService.find(JOptionPane.showInputDialog("아이디 입력해주세요")));
				break;
			case "11" :
				String id = JOptionPane.showInputDialog("로그인 ID");
				String pw = JOptionPane.showInputDialog("로그인 pw");
				
				if(memberService.login(id, pw)) {
					JOptionPane.showMessageDialog(null, "로그인 성공");
				}else {
					JOptionPane.showMessageDialog(null, "로그인 실패");
				}
				
				// 3항연산자  JOptionPane.showMessageDialog(null,(memberService.login(id, pw)) ? "로그인성공" : "로그인 실패" ); 
				break;
			}
		}
	}
}
