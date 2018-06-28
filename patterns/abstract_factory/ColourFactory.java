package abstract_factory;

public class ColourFactory extends AbstractFactory {

	@Override
	Shape getShape(String shapeType) {
		return null;
	}
	
	@Override
	Colour getColour(String colour) {

		if(colour == null){
			return null;
		}
		
		if(colour.equalsIgnoreCase("RED")){
			return new Red();
		}
		else if(colour.equalsIgnoreCase("BLUE")){
			return new Blue();
		}
		else if(colour.equalsIgnoreCase("GREEN")){
			return new Green();
		}
		return null;
	}





}
