package facade;

/* https://www.tutorialspoint.com/design_pattern/facade_pattern.htm
 * 
 * Facade pattern hides the complexities of the system 
 * and provides an interface to the client using which 
 * the client can access the system. This type of design 
 * pattern comes under structural pattern as this pattern 
 * adds an interface to existing system to hide its 
 * complexities.
 * 
 * This pattern involves a single class which provides 
 * simplified methods required by client and delegates 
 * calls to methods of existing system classes.
 */



public class ShapeMaker {
	
	private Shape circle;
	private Shape square;
	private Shape rectangle;
	
	public ShapeMaker(){
		circle = new Circle();
		square = new Square();
		rectangle = new Rectangle();
	}
	
	public void drawCircle(){
		circle.draw();
	}

	public void drawSquare(){
		square.draw();
	}
	
	public void drawRectangle(){
		rectangle.draw();
	}
}
