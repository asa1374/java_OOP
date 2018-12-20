package gms21;
import java.util.Random;
public class StudentService {
	public String hakbun() {
		Random random = new Random();
		String hakbun = random.nextInt(9999)+1+"";
		return hakbun;
	}
}
