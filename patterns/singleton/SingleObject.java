package singleton;

public class SingleObject {
	
	// Create an object of SingleObject
	private static SingleObject instance = new SingleObject();
	
	// This is private so that a new instance cannot be created
	private SingleObject(){}
	
	// Get the only object available
	public static SingleObject getInstance(){
		return instance;
	}
	
	// Display message
	public static void showMessage(){
		System.out.println("Hello World!");
	}

}
