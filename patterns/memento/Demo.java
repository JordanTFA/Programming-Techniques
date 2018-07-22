package memento;

/* https://www.tutorialspoint.com/design_pattern/memento_pattern.htm
 * 
 * Memento pattern is used to restore state of an object to a 
 * previous state. Memento pattern falls under behavioral pattern category.
 */

public class Demo {

	public static void main(String[] args) {
		
		Originator originator = new Originator();
		CareTaker careTaker = new CareTaker();
		
		originator.setState("State #1");
		originator.setState("State #2");
		careTaker.add(originator.saveStateToMemento());
		
		originator.setState("State #3");
		careTaker.add(originator.saveStateToMemento());
		
		originator.setState("State #4");
		System.out.println("Current State: " + originator.getState());
		
		originator.getStateFromMememnto(careTaker.get(0));
		System.out.println("First saved State: " + originator.getState());
		originator.getStateFromMememnto(careTaker.get(1));
		System.out.println("Second saved State: " + originator.getState());

	}

}
