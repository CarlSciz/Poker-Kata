
public class DeltCards {
	
	private static Player playerOne = new Player();
	private static Player playerTwo = new Player();
	private static Player playerThree = new Player();
	private static Player playerFour = new Player();
	private static Player playerFive = new Player();
	
	public static Player [] dealCards() {
	
	Player[] players = new Player[5];
		
	Deck deck = new Deck();
	deck.shuffleDeck();
	Card[] shuffleDecks = deck.getCards();
	
	Card[] playerOneHand = {shuffleDecks[0],shuffleDecks[5],shuffleDecks[10],shuffleDecks[15],shuffleDecks[20]};
	playerOne.setHand(playerOneHand);
	
	Card[] playerTwoHand = {shuffleDecks[1],shuffleDecks[6],shuffleDecks[11],shuffleDecks[16],shuffleDecks[21]};
	playerTwo.setHand(playerTwoHand);
	
	Card[] playerThreeHand = {shuffleDecks[2],shuffleDecks[7],shuffleDecks[12],shuffleDecks[17],shuffleDecks[22]};
	playerThree.setHand(playerThreeHand);
	
	Card[] playerFourHand = {shuffleDecks[3],shuffleDecks[8],shuffleDecks[13],shuffleDecks[18],shuffleDecks[23]};
	playerFour.setHand(playerFourHand);
	
	Card[] playerFiveHand = {shuffleDecks[4],shuffleDecks[9],shuffleDecks[14],shuffleDecks[19],shuffleDecks[24]};
	playerFive.setHand(playerFiveHand);
	
	
	players[0] = playerOne;
	players[1] = playerTwo;
	players[2] = playerThree;
	players[3] = playerFour;
	players[4] = playerFive;
	
	return players;
}
	
	public static boolean checkRoyalFlush(Player player) {
		Card[] playerHand = player.getHand();
		
		if(playerHand[0].getSuit() == playerHand[1].getSuit() && playerHand[0].getSuit() == playerHand[2].getSuit()
				&& playerHand[0].getSuit() == playerHand[3].getSuit()
				&& playerHand[0].getSuit() == playerHand[4].getSuit()) {
			return true;
		} else {
			return false;
		}
}
	
	public static boolean checkFlush(Player player) {
		Card[] playerHand = player.getHand();
		
		if(playerHand[0].getSuit() == playerHand[1].getSuit() && playerHand[0].getSuit() == playerHand[2].getSuit()
				&& playerHand[0].getSuit() == playerHand[3].getSuit()
				&& playerHand[0].getSuit() == playerHand[4].getSuit()) {
			return true;
		} else {
			return false;
		}
}
	public static boolean checkPair(Player player) {
		Card[] playerHand = player.getHand();
		
		for (int i = 0; i <= 4; i++) {
			for(int j =4; j >=0; j--) {
				if (j !=i && playerHand[i].getValue() == playerHand[j].getValue()) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static boolean checkThreeOfAKind(Player player) {
		Card[] playerHand = player.getHand();
		
		for (int i = 0; i <= 4; i++) {
			for(int j =4; j >=0; j--) {
				for(int k = 0; k <=4; k++) {
			if (j !=i && k != i && k != j && playerHand[i].getValue() == playerHand[j].getValue() 
					&& playerHand[i].getValue() == playerHand[k].getValue() 
					&& playerHand[k].getValue() == playerHand[j].getValue()) {
					return true;
				}
			}
		}
	}
		return false;
}
	public static boolean checkFullHouse(Player player) {
		Card[] playerHand = player.getHand();
		
		for (int i = 0; i <= 4; i++) {
			for(int j =4; j >=0; j--) {
				for(int k = 0; k <=4; k++) {
					for(int l = 4; l >=0; l--) {
						for(int m = 0; m <=0; m++) {
					if (m != i && m != j && m != k && m != l &&
						l != k && l != j && l != i &&	
						j !=i && k != i && k != j && 
						playerHand[l].getValue() == playerHand[m].getValue()
					&& playerHand[i].getValue() == playerHand[j].getValue() 
					&& playerHand[i].getValue() == playerHand[k].getValue() 
					&& playerHand[k].getValue() == playerHand[j].getValue()) {
					return true;
				}
			}
		}
	}
			}
		}
		return false;
}
}