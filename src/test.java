import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.Test;

class test {

	@Test
	public void deckSize() {
		Deck deck = new Deck();
		Card [] testDeck = deck.getCards();
		assertEquals(52, testDeck.length);
	}
	
	@Test
	public void randomCard() {
		Deck deck = new Deck();
		Random random = new Random();
		Card[] testDeck = deck.getCards();
		int cardA = random.nextInt(deck.Size);
		int cardB = random.nextInt(deck.Size);
		int cardC = random.nextInt(deck.Size);
		int cardD = random.nextInt(deck.Size);
		int cardE = random.nextInt(deck.Size);
		int cardF = random.nextInt(deck.Size);
		assertFalse(testDeck[cardA] == testDeck[cardB]);
		assertFalse(testDeck[cardC] == testDeck[cardD]);
		assertFalse(testDeck[cardE] == testDeck[cardF]);
	}
	
}
