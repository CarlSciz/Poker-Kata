import java.util.Random;

public class Deck {
	public static final int Size = 52;
	private final Card[] cards = new Card[Size];
	
	Deck() {
		int currentCardIndex = 0;
		
		for (Suit suit : Suit.values()) {
			for (Value value : Value.values()) {
				cards[currentCardIndex++] = new Card(suit, value);
			}
		}
	}
	
	Card[] getCards() {
		return cards;
	}
	
	Card getCard(int index) {
		return cards[index];
	}


public void shuffleDeck() {
	Random rand = new Random();
	
	for (int i = 0; i < Size; i++) {
		int j = rand.nextInt(Size);
		swapCards(i, j);
		}
}
public void swapCards(int i, int j) {
	Card temp = cards[i];
	cards[i] = cards[j];
	cards[j] = temp;
}


}
	
	