package flyweight;

public class Circle implements Shape {
	
	private String colour;
	private int x;
	private int y;
	private int radius;
	
	public Circle(String colour){
		this.colour = colour;
	}
	
	public void setX(int x){
		this.x = x;
	}
	
	public void setY(int y){
		this.y = y;
	}
	
	public void setRadius(int radius){
		this.radius = radius;
	}

	@Override
	public void draw() {
		
		System.out.println("Circle - Colour: " + colour + ", X: " + x + ", Y: " + y + ", Radius: " + radius);
	}

}
