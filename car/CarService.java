package car;

public interface CarService {
	/**
	 * 판매할 차량을 입고시킨다.
	 * */
	public CarBean add(String brand, String color, String gearType, int door);
	/**
	 * 판매할 차량 목록을 보여준다.
	 * */
	public void list();
	/**
	 * 판매할 차량을 검색한다.
	 * */
	public void find();
	/**
	 * 판매할 차량을 판매한다.
	 * */
	public void sell();
	
}
