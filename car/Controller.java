package car;
import javax.swing.JOptionPane;
public class Controller {
	public static void main(String[] args) {
		CarBean bean = null;
		CarService carService = new CarServiceImpl();
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료\n1.car구입\n2.car정보보기\n3.door개수")) {
			case "0" : 
				JOptionPane.showMessageDialog(null, String.format("종료..."));
				return;
			case "1" :
				bean = carService.join(JOptionPane.showInputDialog("color :"),
						JOptionPane.showInputDialog("gearType :"),
						Integer.parseInt(JOptionPane.showInputDialog("door :")));
				/*brand, color, price 입력함
				 * car 브랜드
				 * car 색상
				 * 가격
				 * */
				break;
			case "2" :
				//구입한 car 스펙
				JOptionPane.showMessageDialog(null,bean.toString());
				break;
			case "3" :
				break;
			}
		}
	}
}

