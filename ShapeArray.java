
public class ShapeArray {

	public static void main(String[] args) {

		Rectangle rectangle = new Rectangle(3,10);
		Circle circle = new Circle(10);
		Triangle triangle = new Triangle(3, 6, 9);
		
		Shape[] shapeArray = {rectangle, circle, triangle
	};
		
		for (Shape shape : shapeArray) {
			System.out.println(shape.toString());
			System.out.println();
			
	}
	}
	}
