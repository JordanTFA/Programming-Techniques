package command;

/* https://www.tutorialspoint.com/design_pattern/command_pattern.htm
 * 
 * Command pattern is a data driven design pattern and falls 
 * under behavioral pattern category. A request is wrapped 
 * under an object as command and passed to invoker object. 
 * Invoker object looks for the appropriate object which can 
 * handle this command and passes the command to the 
 * corresponding object which executes the command.
 */

public class Stock {
	
	private String name = "ABC";
	private int quantity = 10;
	
	public void buy(){
		
		System.out.println("Stock - Name: " + name + ", Quantity: " + quantity + " bought.");
	}
	
	public void sell(){
		System.out.println("Stock - Name: " + name + ", Quantity: " + quantity + " sold.");
	}

}
