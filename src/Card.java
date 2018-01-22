
public class Card {
	
	public static final int COLOR_RED = 0;
	public static final int COLOR_YELLOW = 1;
	public static final int COLOR_BLUE = 2;
	public static final int COLOR_GREEN = 3;
	public static final int COLOR_BLACK = 4;
	private int color;
	
	public Card(int color) {
		this.color = color;
	}
	
	public void printCard(){
		switch(color){
		case COLOR_RED: 
			System.out.println("Red Card"); break;
		case COLOR_YELLOW: 
			System.out.println("Yellow Card"); break;
		case COLOR_BLUE: 
			System.out.println("Blue Card"); break;
		case COLOR_GREEN: 
			System.out.println("Green Card"); break;
		case COLOR_BLACK: 
			System.out.println("Black Card"); break;
		default: 
			System.out.println("Invalid card color"); 
		}
	}
	
}
