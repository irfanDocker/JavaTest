package day29_inheritance;

public class Device {

	String deviceName, brand, model, madeIn;
	
	double price;
	
	boolean hasBattery, hasPowerButton;
	
	public Device() {}

	public Device(String deviceName, String brand, String model, String madeIn, double price, boolean hasBattery,
			boolean hasPowerButton) {
	
		this.deviceName = deviceName;
		this.brand = brand;
		this.model = model;
		this.madeIn = madeIn;
		this.price = price;
		this.hasBattery = hasBattery;
		this.hasPowerButton = hasPowerButton;
	}
	
	public void setInfo(String deviceName, String brand, String model, String madeIn, double price, boolean hasBattery,
			boolean hasPowerButton) {
		
		this.deviceName = deviceName;
		this.brand = brand;
		this.model = model;
		this.madeIn = madeIn;
		this.price = price;
		this.hasBattery = hasBattery;
		this.hasPowerButton = hasPowerButton;
		
	}

	@Override
	public String toString() {
		return "Device [deviceName=" + deviceName + ", brand=" + brand + ", model=" + model + ", madeIn=" + madeIn
				+ ", price=" + price + ", hasBattery=" + hasBattery + ", hasPowerButton=" + hasPowerButton + "]";
	}
	
	public void turnOn() {
		System.out.println("Turning on "+brand+" "+model);
	}
	
	public void turnOff() {
		System.out.println("Turning off "+brand+" "+model);
	}


	
	
	
	
	
	
	
	
	
}
