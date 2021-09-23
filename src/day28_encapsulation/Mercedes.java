package day28_encapsulation;

public class Mercedes {
	
	
	
	public static void main(String[] args) {
		Car car = new Car("Mercedes","Benz","Black",60000,2022);
		car.drive();
		car.stop();
		car.getInfo();
		
		Car tesla = new Car("Tesla","Model Y","Black",60000,2021);
		
		tesla.drive();
		tesla.stop();
		tesla.getInfo();
		
		
		
		
	}
	
	
}
