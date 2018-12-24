package car;
import javax.swing.JOptionPane;
public class CarController {
	public static void main(String[] args) {
		CarBean car = null;
		CarService carService = new CarServiceImpl();
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료\n1.차량입고\n2.차량목록\n"
					+ "3.차량검색\n4.차량판매")) {
			case "0" : 
				JOptionPane.showMessageDialog(null, String.format("종료..."));
				return;
			case "1" :
				car = carService.add(JOptionPane.showInputDialog("Brand : "),
						JOptionPane.showInputDialog("Color : "),
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
				JOptionPane.showMessageDialog(null,car.toString());
				break;
			case "3" :
				break;
			}
		}
	}
}

