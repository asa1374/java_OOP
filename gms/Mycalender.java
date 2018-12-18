package gms;
public class Mycalender {
	public String leepYear(int y) {
		String res = "";
		System.out.printf("년도를 입력하세요");
		
		if(y%4==0 && y%100!=0 || y%400==0) {
			res = "윤년";
		}else {
			res = "평년";
		}
		return res;
	}
}
