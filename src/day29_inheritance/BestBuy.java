package day29_inheritance;

public class BestBuy {

	public static void main(String[] args) {
		
		TV tv = new TV("DDH234SDFS", "Sumsang","XL75","Korea",899,false,true);
		
//		tv.toString();
		
		System.out.println(tv.toString());
		
		tv.turnOn();
		
		tv.turnOff();
		
		tv.channelDown();
		
		tv.channelUp();
		
		System.out.println("-------------------------------------------------");
		
		Phone phone = new Phone("Iphone","Apple","13","USA",999,true,true);
		
		phone.turnOn();
		
		phone.call("7039820343");
		
		phone.text("7039820343");
		
		
		phone.turnOff();
		
		phone.toString();
		
		
		
		
		
		
		

	}

}
