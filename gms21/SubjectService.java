package gms21;
public class SubjectService {
	public String show(String hakbun,String name, String subjName,int score) {
		return String.format("학번 : %s\n이름 :%s\n과목명 :%s\n점수 :%d\n",hakbun,name,subjName,score);
	}
}
