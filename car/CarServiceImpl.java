package car;

public class CarServiceImpl implements CarService{

	@Override
	public CarBean join(String color, String gearType, int door) {
		CarBean bean = new CarBean();
		bean.setColor(color);
		bean.setgearType(gearType);
		bean.setdoor(door);
		return bean; 
	}


}
