package abstract_factory;

public class ShapeFactory extends AbstractFactory{
	
	@Override
	public Shape getShape(String shapeType){
		
		if(shapeType == null){
			return null;
		}
		
		if(shapeType.equalsIgnoreCase("CIRCLE")){
			return new Circle();
		}
		else if(shapeType.equalsIgnoreCase("SQUARE")){
			return new Square();
		}
		else if(shapeType.equalsIgnoreCase("RECTANGLE")){
			return new Rectangle();
		}
		return null;
		
	}
	
	@Override
	Colour getColour(String colour){
		return null;
	}

}
