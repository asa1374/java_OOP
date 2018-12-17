package real;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Main {
	public static void main(String[] args) {
		while(true) {
			String menu = JOptionPane.showInputDialog("0.종료\n1.회원관리\n2.계산기\n3.로또\n4.달력\n");
			switch(menu) {
			case "0" : 
				JOptionPane.showMessageDialog(null,"시스템 종료");
				return;
			case "1" :
				Member m = new Member();
				String name = JOptionPane.showInputDialog("이름입력");
				m.name = name;
				JOptionPane.showMessageDialog(null, String.format("환영합니다 %s 님",m.name));
				String mMenu = JOptionPane.showInputDialog("[회원관리 메뉴]\n1.bmi(키, 몸무게) 2.학점(국,영,수,사,과) 3.성별체크(SSN)");
				switch(mMenu) {
				case "1" : 
					//홍길동,180.3,60.5
					String[] arr = JOptionPane.showInputDialog(null,"키,몸무게 입력").split(",");
					m.bmi(Double.parseDouble(arr[0]),Double.parseDouble(arr[1]));
					JOptionPane.showMessageDialog(null,String.format("%s 님은 %s 입니다.", m.name,m.bmi(Double.parseDouble(arr[0]),Double.parseDouble(arr[1]))));
					break;
				case "2" : 
					String[] grade = JOptionPane.showInputDialog(null, "(국,영,수,사,과)점수를 입력해주세요").split(",");
					JOptionPane.showMessageDialog(null, String.format("%s님의 학점은 %s 입니다.", m.name,m.grade(Integer.parseInt(grade[0]), Integer.parseInt(grade[1]), Integer.parseInt(grade[2]), Integer.parseInt(grade[3]), Integer.parseInt(grade[4]))));
					break;
				case "3" : 
					String ssn = JOptionPane.showInputDialog(null,"주민번호를 입력해주세요");
					JOptionPane.showMessageDialog(null, String.format("%s님은 %s 입니다.", m.name,m.genderChecker(ssn)));
					break;
				}
				break;
			case "2" :
				Calc calc = new Calc();
				String num = JOptionPane.showInputDialog("1.계산기 2.구구단");
				switch(num) {
				case  "1" :  
					String[] su = JOptionPane.showInputDialog(null,"계산식을 입력해주세요 ex(10 + 20)").split(" ");
					switch(su[1]) {
					case "+" : 
						JOptionPane.showMessageDialog(null, String.format("계산 결과는 %s입니다.", calc.plus(Integer.parseInt(su[0]),Integer.parseInt(su[2]))));
						break;
					case "-" : 
						JOptionPane.showMessageDialog(null, String.format("계산 결과는 %s입니다.", calc.minus(Integer.parseInt(su[0]),Integer.parseInt(su[1]))));
						break;
					case "*" : 
						JOptionPane.showMessageDialog(null, String.format("계산 결과는 %s입니다.", calc.multi(Integer.parseInt(su[0]),Integer.parseInt(su[1]))));
						break;
					case "/" : 
						JOptionPane.showMessageDialog(null, String.format("계산 결과는 %s입니다.", calc.divid(Double.parseDouble(su[0]),Double.parseDouble(su[1]))));
						break;
					case "%" : 
						JOptionPane.showMessageDialog(null, String.format("계산 결과는 %s입니다.", calc.mod(Integer.parseInt(su[0]),Integer.parseInt(su[1]))));
						break;
					}
					break;
				case "2" :
					String dan = JOptionPane.showInputDialog("단을 입력하세요");
					calc.gugudan(Integer.parseInt(dan));
					break;
				}
				break;
			case "3" :
				JOptionPane.showInputDialog("");
				break;
			}
		}
		
		/*System.out.println("키, 몸무게");
		String res = m.bmi(scanner.nextDouble(),scanner.nextDouble());
		System.out.println(res);*/
	}
}
