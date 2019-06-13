import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.Test;

class test {
	
	Deck deck = new Deck();
	Random random = new Random();
	Card[] testDeckA = deck.getCards();

	
	@Test
	public void deckSize() {
		assertEquals(52, testDeckA.length);
	}
	
	@Test
	public void randomCard() {
		int cardA = random.nextInt(deck.Size);
		int cardB = random.nextInt(deck.Size);
		int cardC = random.nextInt(deck.Size);
		int cardD = random.nextInt(deck.Size);
		int cardE = random.nextInt(deck.Size);
		int cardF = random.nextInt(deck.Size);
		assertFalse(testDeckA[cardA] == testDeckA[cardB]);
		assertFalse(testDeckA[cardC] == testDeckA[cardD]);
		assertFalse(testDeckA[cardE] == testDeckA[cardF]);
	}
	
	@Test
	public void shuffleDecks() {
		Deck deckB = new Deck();
		deckB.shuffleDeck();
		Card[] shuffledDeck = deckB.getCards();
		assertFalse(testDeckA == shuffledDeck);
		
	
		
	}
	
}
