import java.util.LinkedList;

public class GameTest {
	
	private LinkedList<Player> playersList;
	private Game game;
	
	public GameTest(int numOfPlayer){
		playersList = new LinkedList<Player>();
		game = new Game();
		for(int i = 0; i < numOfPlayer; i++){
			playersList.add(new Player());
		}
	}
	
	public void run(){
		System.out.println("**********Game starts*********");
		game.initCards();
		game.distributeCards(playersList);
		game.displayCardsInHand(playersList);
		System.out.println();	
	}
	
	
}
