package tv;
import javax.swing.JOptionPane;
public class Main {
	public static void main(String[] args) {
		TvBean tv = null;
		TvService service = null;
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료\n1.TV구입\n2.TV정보보기\n3.TV전원설정")) {
			case "0" : 
				JOptionPane.showMessageDialog(null, String.format("종료..."));
				return;
			case "1" :
				tv = new TvBean();
				String brand = JOptionPane.showInputDialog("brand :");
				String color = JOptionPane.showInputDialog("color :");
				String price = JOptionPane.showInputDialog("price :");
				tv.setBrand(brand);
				tv.setColor(color);
				tv.setPrice(Integer.parseInt(price));
				/*brand, color, price 입력함
				 * TV 브랜드
				 * TV 색상
				 * 가격
				 * */
				break;
			case "2" :
				String info = tv.toString();
				JOptionPane.showMessageDialog(null, info);
				//구입한 TV 스펙
				break;
			case "3" :
				service = new TvService();
				String power = JOptionPane.showInputDialog("1.[전원 켜기] 2.[전원끄기]");
				JOptionPane.showMessageDialog(null,service.power(power));
				break;
				
			}
		}
	}
}
