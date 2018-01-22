import java.util.Collections;
import java.util.LinkedList;

public class Game {
	
	private LinkedList<Card> deck;
	private static final int DECK_SIZE = 60;
	private static final int NUMBER_EACH_COLOR = 12;
	
	public Game(){
		deck = new LinkedList<Card>();
	}
	
	//initialize 12 cards of each color and put 60 cards in the deck
	public void initCards(){
		for(int i = 0; i < NUMBER_EACH_COLOR; i++){
			deck.add(new Card(Card.COLOR_RED));
			deck.add(new Card(Card.COLOR_YELLOW));
			deck.add(new Card(Card.COLOR_BLUE));
			deck.add(new Card(Card.COLOR_GREEN));
			deck.add(new Card(Card.COLOR_BLACK));
		}
		//implement shuffle of the cards
		Collections.shuffle(deck);	
	}
	
	//distribute cards to different players based on the number of player
	public void distributeCards(LinkedList<Player> playersList){
		//when players are 3, 4, 5 or 6, distribute the random cards to each player
		if(checkPlayerNumber(playersList)){
			int numOfPlayers = playersList.size();
			int numOfCardsPerPlayer = DECK_SIZE/numOfPlayers;
			for(int i = 0; i < numOfPlayers; i++){
				//get each player
				Player player = playersList.get(i);
				for(int j = 0; j < numOfCardsPerPlayer; j++){
					//obtain the card from the deck
					Card card = deck.get(i * numOfCardsPerPlayer + j);
					//add cards to each player's hands
					player.addCard(card);
				}
			}
		}
	}
	
	//display each player's cards
	public void displayCardsInHand(LinkedList<Player> playersList){
		if(checkPlayerNumber(playersList)){
			int numOfCards = playersList.get(0).getNumOfCards();
			System.out.println("There are " + playersList.size() + " players");			
			System.out.println("Each player has " + numOfCards + " cards");
			//get each player
			for(int i = 0; i < playersList.size(); i++){
				Player player = playersList.get(i);
				System.out.println("************Player " + ( i + 1 ) + " has:*************");
				//display each card in hand
				LinkedList<Card> cardsInHand = player.getCards();
				for(int j = 0; j < cardsInHand.size(); j++){
					Card card = cardsInHand.get(j);
					card.printCard();
				}	
			}
		}
	}
	
	//check if the number of players is valid
	private boolean checkPlayerNumber(LinkedList<Player> playersList){
		if(playersList.size() < 3 || playersList.size() > 6){
			System.err.println("Wrong Number Of Players !");
			return false;
		}
		else{
			return true;
		}
	}
	
	
}
