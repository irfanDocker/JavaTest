package day28_encapsulation;

public class Car {
	/*
	Car class:
			Attributes: instance variables
				brand, model, color, price, year....
				
			actions: instance methods
				driver(), stop()....
	 */
	
	String brand;
	String model;
	String color;
	double price;
	int year;
	
	public Car(String brand, String model, String color, double price, int year) {
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.price = price;
		this.year = year;
	}
	
	public void drive() {
		System.out.println("The " + brand + " " + model + " is driving fast.");
	}
	
	public void stop() {
		System.out.println("The " + brand + " " + model + " has stopped.");
	}
	
	public void getInfo() {
		System.out.println("**********************");
		System.out.println("Brand: " + brand);
		System.out.println("Model: " + model);
		System.out.println("Color: " + color);
		System.out.println("Price: $" + price);
		System.out.println("Year: " + year);
		System.out.println("**********************");
	}
	
	
	
}
