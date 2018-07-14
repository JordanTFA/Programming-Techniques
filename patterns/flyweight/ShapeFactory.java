package flyweight;

import java.util.HashMap;

public class ShapeFactory {
	
	private static final HashMap circleMap = new HashMap();
	
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
