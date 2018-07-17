package flyweight;

import java.util.HashMap;

public class ShapeFactory {
	
	private static final HashMap<String, Circle> circleMap = new HashMap<String, Circle>();
	
	public static Shape getCircle(String colour){
		
		Circle circle = (Circle)circleMap.get(colour);
		
		if(circle==null){
			circle = new Circle(colour);
			circleMap.put(colour, circle);
			System.out.println("Create circle of colour: " + colour);
		}
		
		return circle;
		
	}

}
