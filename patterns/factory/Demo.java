package factory;

public class Demo {
	
	// https://www.tutorialspoint.com/design_pattern/factory_pattern.htm
	
	/* Factory pattern is one of the most used design patterns in Java. 
	 * This type of design pattern comes under creational pattern as 
	 * this pattern provides one of the best ways to create an object.
	 * 
	 * In Factory pattern, we create object without exposing the creation 
	 * logic to the client and refer to newly created object using a common interface.
	 */

	public static void main(String[] args) {
		
		ShapeFactory shapeFactory = new ShapeFactory();
		
		// Get an object of Circle and call its draw method
		Shape shape1 = shapeFactory.getShape("CIRCLE");
		shape1.draw();
		
		// Get an object of Rectangle and call its draw method
		Shape shape2 = shapeFactory.getShape("RECTANGLE");
		shape2.draw();
		
		// Get an object of Square and call its draw method
		Shape shape3 = shapeFactory.getShape("SQUARE");
		shape3.draw();

	}

}
