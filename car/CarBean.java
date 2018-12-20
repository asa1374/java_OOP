package car;

public class CarBean {
	private String color,gearType;
	private int door;
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public void setgearType(String gearType) {
		this.gearType = gearType;
	}
	public String getgearType() {
		return gearType;
	}
	public void setdoor(int door) {
		this.door = door;
	}
	public int getdoor() {
		return door;
	}
	@Override
	public String toString() {
		return String.format("color : %s\ngearType :%s\ndoor :%d\n", color,gearType,door);
	}
}
