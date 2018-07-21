package mediator;

/* https://www.tutorialspoint.com/design_pattern/mediator_pattern.htm
 * 
 * Mediator pattern is used to reduce communication complexity between 
 * multiple objects or classes. This pattern provides a mediator class 
 * which normally handles all the communications between different 
 * classes and supports easy maintenance of the code by loose coupling. 
 * Mediator pattern falls under behavioral pattern category.
 */

public class Demo {

	public static void main(String[] args) {
		
		User robert = new User("Robert");
		User julia = new User("Julia");
		
		robert.sendMessage("Hi Julia!");
		julia.sendMessage("Hi Robert!");

	}

}
