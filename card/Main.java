package card;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		CardBean bean = null;
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료\n1.카드선택\n2.카드정보보기")) {
			case "0" : 
				JOptionPane.showMessageDialog(null, String.format("종료..."));
				return;
			case "1" :
				/*카드 종류 
				 * 카드 번호
				 * */
				bean = new CardBean();
				String kind = JOptionPane.showInputDialog("카드의 종류");
				String number = JOptionPane.showInputDialog("카드 번호");
				bean.setKind(kind);
				bean.setNumber(Integer.parseInt(number));
				break;
			case "2" :
				//제출한 카드의 스펙
				JOptionPane.showMessageDialog(null, bean.toString());
				break;
			}
		}
	}
}
