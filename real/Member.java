package real;
public class Member {
	String name; //멤버변수
	public String bmi(double t,double w) {
		double bm = w/(t*t)*10000;
		String bmi = ""; //지역변수 로컬변수
		if(bm>=40) {
			bmi = "고도 비만";
		}else if(bm>=35) {
			bmi = "중등도 비만";
		}else if(bm>=30) {
			bmi = "경도비만";
		}else if(bm>=25) {
			bmi = "과체중";
		}else if(bm>=18.5) {
			bmi = "정상";
		}else {
			bmi ="저체중";
		}
		return bmi;
	} // bmi end
	/*
		 국영수사과 과목점수 입력 받고 평균
		 100~90 A,B,C,D,E,F를 내는 것
	 * */
	public String grade(int kor,int eng,int su,int sa,int cin) {
		String grade = "";
		int sum = kor+eng+su+sa+cin;
		int ave = (sum/5)/10;
		switch(ave) {
		case 9 : grade = "A"; break;
		case 8 : grade = "B"; break;
		case 7 : grade = "C"; break;
		case 6 : grade = "D"; break;
		case 5 : grade = "E"; break;
		case 4 : grade = "F"; break;
		}
		return grade;
	}
	public String genderChecker(String ssn) {
		String checker = "";
		char ch = ssn.charAt(7);
		switch(ch) {
		case '1' : case '3' : checker = "남자"; break;
		case '2' : case '4' : checker = "여자"; break;
		case '5' : case '6' : checker = "외국인"; break;
		default : checker = "잘못 입력하셨습니다."; break;
		}
		return checker;
	}
}
