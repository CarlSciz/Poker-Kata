
public class Main {

	public static void main(String[] Args) {
		
		Player[] gamePlayers = DeltCards.dealCards();
		String playerResult = "";
		for(int i = 0; i < 5; i++) {
			System.out.println("Player " + (i+1) + "Hand: " + gamePlayers[i].toString());
			
			if(DeltCards.checkRoyalFlush(gamePlayers[i]) == true) {
				playerResult = "Royal Flush!";
			}else if(DeltCards.checkFlush(gamePlayers[i]) == true) {
				playerResult = "Flush!";
			}
			else if(DeltCards.checkThreeOfAKind(gamePlayers[i]) == true) {
				playerResult = "Three of a Kind!";
			}else if(DeltCards.checkPair(gamePlayers[i]) == true) {
				playerResult = "Pair!";
			}else {
				playerResult = "Nothing";
			}
			
			
			System.out.println("Player " + (i+1) + "Results " + playerResult);
		}
	
	
	}
}
