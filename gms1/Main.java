package gms1;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료")) {
			case "0" :
				JOptionPane.showMessageDialog(null, "종료합니다.");
				return;
			}
		}
	}
}
