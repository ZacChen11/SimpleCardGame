import java.util.LinkedList;

public class Player {
	
	private LinkedList<Card> cardsInHand;
	
	public Player(){
		cardsInHand = new LinkedList<Card>();
	}
	
	public void addCard(Card card){
		cardsInHand.add(card);
	}
	
	public LinkedList<Card> getCards(){
		return cardsInHand;
	}
	
	public int getNumOfCards(){
		return cardsInHand.size();
	}
	
	
}
