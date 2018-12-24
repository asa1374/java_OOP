package card;

import javax.swing.JOptionPane;

public class CardController {
	public static void main(String[] args) {
		CardBean card = null;
		CardService cardService = new CardServiceImpl();
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료\n1.카드선택\n")) {
			case "0" : 
				JOptionPane.showMessageDialog(null, String.format("종료..."));
				return;
			case "1" :
				/*카드 종류 
				 * 카드 번호
				 * */
				card = cardService.bet(JOptionPane.showInputDialog("card kind :"),
						Integer.parseInt(JOptionPane.showInputDialog("card number :")));
				break;
		
			}
		}
	}
}
