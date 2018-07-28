package template;

public abstract class Game {
	
	abstract void initialise();
	abstract void startPlay();
	abstract void endPlay();
	
	// Template method
	public final void play(){
		
		// Initialise game
		initialise();
		
		// Start game
		startPlay();
		
		// End game
		endPlay();
	}

}
