
public class Main {

	public static void main(String[] Args) {
		
		Player[] gamePlayers = DeltCards.dealCards();
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Player " + (i+1) + ": " + gamePlayers[i].toString());
		}
		
		
	}
}
