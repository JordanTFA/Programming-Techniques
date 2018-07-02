package bridge;

public class GreenCircle implements DrawAPI {

	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.println("Drawing Circle - Colour: Green, Radius: " + radius + ", at (" + x + ", " + y + ")");
	}

}
