package week06;

public class Week06JavaProject {


	public static void main(String[] args) {
		//Instantiating New Deck
		Deck playDeck = new Deck();
		//Instantiating Two new players
		Player p1 = new Player ("Johnathan");
		Player p2 = new Player ("Carlos");
		
		System.out.println(playDeck.toString());
		playDeck.shuffle();
		System.out.println(playDeck.toString());
		System.out.println("-----------------------------------");
		
		
		
		for(int i = 0; i < 26; i++) {
			p1.draw(playDeck);
			p2.draw(playDeck);
		}
		// Testing method to show cards
		p1.describe();
		p2.describe();

	int p1Value, p2Value;
	for (int i = 0; i < 26;i++) {
		
		p1Value = p1.flip().getValue();
		p2Value = p2.flip().getValue();
		
		if (p1Value > p2Value) {
			p1.incrementScore();
			System.out.println(p1.getName() + " wins the round ");
		}
		else if (p2Value > p1Value) {
			p2.incrementScore();
			System.out.println(p2.getName() + " wins the round ");
			
		}	 else{
			System.out.println("Draw");

			
		}

	}
	
	// Displaying the Game Winner
	System.out.println("-----------------------------------");
	System.out.println("Final Score --" + p1.getName() + ": " + p1.getScore() + " " + p2.getName() + ": " + p2.getScore() + "\n");
	if (p1.getScore() > p2.getScore()) {
		System.out.println(p1.getName() + " is the Winner! ");
	}
	else if(p1.getScore() < p2.getScore()) {
		System.out.println(p2.getName() + " is the Winner! ");

	}
	else {
		System.out.println("The game is a draw");
	}
	
	
	
	}
}
