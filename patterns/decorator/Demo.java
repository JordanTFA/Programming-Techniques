package decorator;

/* https://www.tutorialspoint.com/design_pattern/decorator_pattern.htm
 * 
 * Decorator pattern allows a user to add new functionality 
 * to an existing object without altering its structure. 
 * This type of design pattern comes under structural pattern 
 * as this pattern acts as a wrapper to existing class.
 * 
 * This pattern creates a decorator class which wraps the original 
 * class and provides additional functionality keeping class methods 
 * signature intact.
 * 
 * We are demonstrating the use of decorator pattern via following 
 * example in which we will decorate a shape with some color without 
 * altering shape class.
 */



public class Demo {

	public static void main(String[] args) {
		
		Shape circle = new Circle();
		
		Shape redCircle = new RedShapeDecorator(new Circle());
		
		Shape redRectangle = new RedShapeDecorator(new Rectangle());
		
		System.out.println("Circle with normal border");
		circle.draw();
		
		System.out.println("\nCircle with red border");
		redCircle.draw();
		
		System.out.println("\nRectangle with red border");
		redRectangle.draw();

	}

}
