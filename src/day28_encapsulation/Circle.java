package day28_encapsulation;

public class Circle {
	
//	instance variable
	//radius, diamater, area, perimeter
	
	private double radius;
	private double diameter;
	private double area;
	private double perimeter;
	
	final double PI = 3.14;
	
	
	public double getRadius() {
		return this.radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getDiameter() {
		return this.diameter;
	}
	
	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}
	
	public double getArea() {
		return this.area;
	}
	
	public void setArea(double area) {
		this.area = area;
	}
	
	
	public Circle(double radius) {
		
		this.radius = radius;
		this.diameter = radius * 2;
		this.area = calculateArea(radius);
		
		
	}
	
	public double calculateArea(double radius) {
		return radius * radius * PI;
	}
	
	
	
	
	
	
	
	
	
}
