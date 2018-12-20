package tv;

public class TvService {
	public String power(String power) {
		String res = "";
		if(power=="1") {
			res = "전원이 켜졌습니다.";
		}else {
			res = "전원이 꺼졌습니다.";
		}
		return res;
	}
	public int channerUp(int up) {
		return up++;
	}
	public int channerDown(int down) {
		return down--;
	}
}
