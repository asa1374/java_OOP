package gms;

public class Calc {
	public String plus(int a, int b) {
		return a+b+"";
	}
	public String minus(int a, int b) {
		String res = "";
		if(a>b) {
			res = a-b+"";
		}else {
			res = b-a+"";
		}
		return res;
	}
	public String multi(int a, int b) {
		return a*b+"";
	}
	public String divid(double a, double b) {
		String res ="";
		if(a>b) {
			res = a/b+"";
		}else {
			res = b/a+"";
		}
		return res;
	}
	public String mod(int a, int b) {
		String res = "";
		if(a>b) {
			res = a%b+"";
		}else {
			res = b%a+"";
		}
		return res;
	}
	public String gugudan(int dan) {
		String res ="";
		int sum =0;
		for(int i=1;i<10;i++) {
			sum=dan*i;
			res += dan+"*"+i+"="+sum+"\n";
		}
		return res;
	}
}
