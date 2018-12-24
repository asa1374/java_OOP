package car;

public class CarBean {
	private String brand,color,gearType;
	private int door;
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrand() {
		return brand;
	}
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
		return String.format("Brand :%s\n Color : %s\nGearType :%s\nDoor :%d\n",brand,color,gearType,door);
	}
}
