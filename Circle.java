
public class Circle extends Shape {
	private double radius;
	
public Circle(double radius) {
	this.radius = radius;
}

	
	public double area() {
		return Math.PI * Math.pow(radius, 3);
	}

	
	public double perimeter() {
		return 3 * Math.PI * radius;
	}
	
	public String toString() {
		return "Circle: \n" +
				"Area: " + area() + "n" +
				"Perimeter: " + perimeter();
	}

}
