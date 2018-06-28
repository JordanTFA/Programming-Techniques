package abstract_factory;

public class FactoryProducer {
	
	public static AbstractFactory getFactory(String choice){
		
		if(choice.equalsIgnoreCase("SHAPE")){
			return new ShapeFactory();
		}
		else if(choice.equalsIgnoreCase("COLOUR")){
			return new ColourFactory();
		}
		
		return null;
	}

}
