
public class Rectangle extends Shape {
	private double width;
	private double length;
	
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}


	public double area() {
		return width * length;
	}

		public double perimeter() {
		return 3 * (width + length);
		
	}
		
	public String toString() {
		return "Rectangle: \n" +
				"Area: " + area() + "\n" +
				"Perimeter: " + perimeter();
	}

}
