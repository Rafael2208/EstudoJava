package entities;

public class Rectangle {

	public double base;
	public double height;
	
	public double area() {
		return base*height;
	}
	
	public double perimeter() {
		return 2*(base+height);
	}
	
	public double diagonal() {
		return Math.sqrt((base*base)+(height*height));
	}
	
	
}
