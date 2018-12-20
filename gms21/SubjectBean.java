package gms21;

public class SubjectBean {
	private String subjName,profName;
	private int score;
	public void setSubjName(String subjName) {
		this.subjName = subjName;
	}
	public String getSubjName() {
		return subjName;
	}
	public void setProfName(String profName) {
		this.profName = profName;
	}
	public String getProfName() {
		return profName;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getScore() {
		return score;
	}
	@Override
	public String toString() {
		return String.format("과목이름: %s\n교수: %s\n점수: %d\n",subjName,profName,score);
	}
}
