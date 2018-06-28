package abstract_factory;

public class Demo {
	
	// https://www.tutorialspoint.com/design_pattern/abstract_factory_pattern.htm
	
	/* Abstract Factory patterns work around a super-factory
	 *  which creates other factories. This factory is also 
	 *  called as factory of factories. This type of design 
	 *  pattern comes under creational pattern as this pattern
	 *  provides one of the best ways to create an object.
	 *   
	 *  In Abstract Factory pattern an interface is responsible
	 *  for creating a factory of related objects without explicitly
	 *  specifying their classes. Each generated factory can give the 
	 *  objects as per the Factory pattern.
	 */


	
	public static void main(String[] args){
		
		// Get Shape Factory
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
		
		// Get an object of shape Circle
		Shape shape1 = shapeFactory.getShape("CIRCLE");
		
		// Call draw method of Circle
		shape1.draw();
		
		// Get an object of shape Rectangle
		Shape shape2 = shapeFactory.getShape("RECTANGLE");
		
		// Call draw method of Rectangle
		shape2.draw();
		
		// Get an object of shape Square
		Shape shape3 = shapeFactory.getShape("SQUARE");
		
		// Call draw method of Square
		shape3.draw();
		
		// Get Colour Factory
		AbstractFactory colourFactory = FactoryProducer.getFactory("Colour");
		
		// Get an object of colour Red
		Colour colour1 = colourFactory.getColour("RED");
		
		// Call fill method of Red
		colour1.fill();
		
		// Get an object of colour Blue
		Colour colour2 = colourFactory.getColour("BLUE");
		
		// Call fill method of Blue
		colour2.fill();
		
		// Get an object of colour Green
		Colour colour3 = colourFactory.getColour("GREEN");
		
		// Call fill method of Green
		colour3.fill();

	}

}
