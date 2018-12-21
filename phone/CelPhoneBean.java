package phone;
public class CelPhoneBean extends PhoneBean{
	private String move;
	public void setMove(String move) {
		this.move = move;
	}
	public String getMove() {
		return move;
	}
	@Override
	public String toString() {
		return String.format("종류 : %s\n"
				+ "제조사 :%s\n"
				+ "이동성 : %s\n"
				+ "통화내용 : %s", getKind(), getCompany(),move, getCall());
	}
}
