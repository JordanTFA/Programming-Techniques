package proxy;

/* https://www.tutorialspoint.com/design_pattern/proxy_pattern.htm
 * 
 * In proxy pattern, a class represents functionality of 
 * another class. This type of design pattern comes under 
 * structural pattern.
 * 
 * In proxy pattern, we create object having original object 
 * to interface its functionality to outer world.
 */

public class Demo {

	public static void main(String[] args) {
		
		Image image = new ProxyImage("test_10mb.jpg");
		
		// Image will be loaded from disk
		image.display();
		System.out.println("");
		
		// Image will not be loaded from disk
		image.display();
		System.out.println("");

	}

}
