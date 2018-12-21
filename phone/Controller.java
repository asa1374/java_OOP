package phone;
import javax.swing.JOptionPane;
public class Controller {
	public static void main(String[] args) {
		PhoneBean phone = null;
		CelPhoneBean celPhone = null;
		IPhoneBean iPhone = null;
		AndroidPhoneBean aPhone = null;
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료\n1.일반전화\n2.휴대폰\n3.아이폰\n4.안드로이드\n5.\n6.")) {
			case "0" : 
				JOptionPane.showMessageDialog(null, String.format("종료..."));
				return;
			case "1" :
				phone = new PhoneBean();
				String kind = JOptionPane.showInputDialog("종류입력");
				String company = JOptionPane.showInputDialog("어느회사제품");//금성
				String call = JOptionPane.showInputDialog("통화내용");//안녕
				phone.setKind(kind);
				phone.setCompany(company);
				phone.setCall(call);
				JOptionPane.showMessageDialog(null, phone.toString());
				break;
			case "2" :
				celPhone = new CelPhoneBean();
				kind = JOptionPane.showInputDialog("종류입력");//휴대폰
				company = JOptionPane.showInputDialog("어느회사제품");//모토로라
				call = JOptionPane.showInputDialog("통화내용");//안녕
				String move = JOptionPane.showInputDialog("이동가능성");//이동가능함
				celPhone.setKind(kind);
				celPhone.setCompany(company);
				celPhone.setCall(call);
				celPhone.setMove(move);
				JOptionPane.showMessageDialog(null, celPhone.toString());
				break;
			case "3" :
				iPhone = new IPhoneBean();
				kind = JOptionPane.showInputDialog("종류입력"); //아이폰
				company = JOptionPane.showInputDialog("어느회사제품");//애플
				move = JOptionPane.showInputDialog("이동가능성");//이동가능함
				String data = JOptionPane.showInputDialog("검색");//노래검색
				iPhone.setKind(kind);
				iPhone.setCompany(company);
				iPhone.setData(data);
				iPhone.setMove(move);
				JOptionPane.showMessageDialog(null, iPhone.toString());
				break;
			case "4" :
				aPhone = new AndroidPhoneBean();
				kind = JOptionPane.showInputDialog("종류입력"); //아이폰
				company = JOptionPane.showInputDialog("어느회사제품");//애플
				move = JOptionPane.showInputDialog("이동가능성");//이동가능함
				data = JOptionPane.showInputDialog("검색");//노래검색
				String display = JOptionPane.showInputDialog("몇인치");
				aPhone.setDisplay(display);
				aPhone.setKind(kind);
				aPhone.setCompany(company);
				aPhone.setData(data);
				aPhone.setMove(move);
				JOptionPane.showMessageDialog(null, aPhone.toString());
				break;
			}
		}
	}
}
