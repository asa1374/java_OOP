package gms;
import java.util.Random;
public class Lotto {
	public String randomNum() {
		String res ="";
		Random random = new Random();
		int[] lotto = new int[6];
		for(int i=0;i<lotto.length;i++) {
			lotto[i]= random.nextInt(45)+1;
		}
		for(int i=0;i<lotto.length;i++) {
			if(i<lotto.length-1) {
				res += lotto[i]+",";
			}else {
				res += lotto[i];
			}
		}
		return res;
	}
}
