package car;
import javax.swing.JOptionPane;
public class Main {
	public static void main(String[] args) {
		CarBean bean = null;
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료\n1.car구입\n2.car정보보기\n3.door개수")) {
			case "0" : 
				JOptionPane.showMessageDialog(null, String.format("종료..."));
				return;
			case "1" :
				bean = new CarBean();
				String color = JOptionPane.showInputDialog("color :");
				String gearType = JOptionPane.showInputDialog("gearType :");
				String door = JOptionPane.showInputDialog("door :");
				bean.setColor(color);
				bean.setgearType(gearType);
				bean.setdoor(Integer.parseInt(door));
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

