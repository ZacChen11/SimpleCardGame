
//start the game and allow different games running at the same time
public class Main {

	public static void main(String[] args) {
		//initialize game with 3 players
		GameTest game1 = new GameTest(3);
		//initialize game with 4 players
		GameTest game2 = new GameTest(4);
		//initialize game with 5 players
		GameTest game3 = new GameTest(5);
		//start the game
		game1.run();
		game2.run();
		game3.run();
		
	
	}

}
