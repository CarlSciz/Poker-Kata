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

	@Test
	public void playerHands() {
		
		Player[] players = DeltCards.dealCards();
		
		assertFalse(players[0].getHand() == players[1].getHand());
		assertFalse(players[0].getHand() == players[2].getHand());
		assertFalse(players[0].getHand() == players[3].getHand());
		assertFalse(players[0].getHand() == players[4].getHand());
	}
	
	@Test
	public void RoyalFlushHand() {
		
		Player mockPlayer = new Player();
		
		Card cardA = new Card(Suit.Heart, Value.Ace);
		Card cardB = new Card(Suit.Heart, Value.King);
		Card cardC = new Card(Suit.Heart, Value.Queen);
		Card cardD = new Card(Suit.Heart, Value.Jack);
		Card cardE = new Card(Suit.Heart, Value.Ten);
		Card[] mockHand = {cardA, cardB, cardC, cardD, cardE};
				
		mockPlayer.setHand(mockHand);
		
		assertEquals(DeltCards.checkRoyalFlush(mockPlayer), true);
		}
	}
	
		
	

