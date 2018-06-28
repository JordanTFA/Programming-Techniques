package abstract_factory;

public abstract class AbstractFactory {
	
	abstract Colour getColour(String colour);
	abstract Shape getShape(String shape);

}
