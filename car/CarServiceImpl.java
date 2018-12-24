package car;

public class CarServiceImpl implements CarService{

	@Override
	public CarBean add(String brand, String color, String gearType, int door) {
		CarBean bean = new CarBean();
		bean.setBrand(brand);
		bean.setColor(color);
		bean.setgearType(gearType);
		bean.setdoor(door);
		return bean;
		
	}

	@Override
	public void list() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void find() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sell() {
		// TODO Auto-generated method stub
		
	}


}
