package template;

public class Cricket extends Game {

	@Override
	void initialise() {
		System.out.println("Cricket Game Initialised! Start playing.");
	}

	@Override
	void startPlay() {
		System.out.println("Cricket Game Started! Enjoy the game!");
	}

	@Override
	void endPlay() {
		System.out.println("Cricket Game Finished!");
	}

}
