package template;

public class Football extends Game {

	@Override
	void initialise() {
		System.out.println("Football Game Initialised! Start playing.");
	}

	@Override
	void startPlay() {
		System.out.println("Football Game Started! Enjoy the game!");
	}

	@Override
	void endPlay() {
		System.out.println("Football Game Finished!");
	}

}
