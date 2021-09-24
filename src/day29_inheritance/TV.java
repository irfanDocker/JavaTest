package day29_inheritance;

public class TV extends Device{
	
	
	public TV () {}
	
	public TV (String deviceName, String brand, String model, String madeIn, double price, boolean hasBattery,
			boolean hasPowerButton) {
		
		super(deviceName,brand,model,madeIn,price,hasBattery,hasPowerButton);// super class's parameterized constructor
	}
	
	public void channelUp() {
		System.out.println("Channel Up "+ brand+" "+model);
	}
	
	public void channelDown() {
		System.out.println("Channel down "+ brand+" "+model);
	}
	
	
}
