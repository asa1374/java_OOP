package gms21;
import javax.activation.MailcapCommandMap;
import javax.swing.JOptionPane;
public class Main {
	public static void main(String[] args) {
		StudentBean bean = new StudentBean();
		StudentService service = new StudentService();
		SubjectBean bean2 = new SubjectBean();
		SubjectService service2 = new SubjectService();
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료\n1.학생부등록\n2.비번변경\n3.회원정보보기\n4.수강과목등록\n5.교수등록\n"
					+ "6.점수등록\n7.성적표\n8.수강정보")) {
			case "0" : 
				JOptionPane.showMessageDialog(null, String.format("종료..."));
				return;
			case "1" :
				String name = JOptionPane.showInputDialog("이름입력");
				String ssn = JOptionPane.showInputDialog("주민번호입력");
				String pass = JOptionPane.showInputDialog("비밀번호입력");
				bean.setHakbun(service.hakbun());
				bean.setName(name);
				bean.setSsn(ssn);
				bean.setPass(pass);
				break;
			case "2" :
				ssn = JOptionPane.showInputDialog("변경하실 비번입력");
				bean.setPass(ssn);
				break;
			case "3" :
				JOptionPane.showMessageDialog(null,bean.toString());
				break;
			case "4" :
				String subjName = JOptionPane.showInputDialog("수강하실 과목을 입력하시오");
				bean2.setSubjName(subjName);
				break;
			case "5" :
				String profName = JOptionPane.showInputDialog("교수이름 입력");
				bean2.setProfName(profName);
				break;
			case "6" :
				String score = JOptionPane.showInputDialog("점수 입력");
				bean2.setScore(Integer.parseInt(score));
				break;
				/**
				 * 성적표에 표시될 내용 : 
				 * 학번(Student)
				 * 학생이름(Student)
				 * 과목명(Subject)
				 * 점수(Subject)
				 * */ 
			case "7" :
				String res = service2.show(bean.getHakbun(),bean.getName(),bean2.getSubjName(),bean2.getScore());
				JOptionPane.showMessageDialog(null, res);
				break;
			case "8" :
				JOptionPane.showMessageDialog(null, bean2.toString());
				break;
			}
		}
	}
}