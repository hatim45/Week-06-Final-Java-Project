package week06;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	//fields
	private String name;
	int score;
	private List<Card> hand;
	
	//constructor
	public Player (String firstName){
		super();
		this.name=firstName;
		this.score = 0;
		this.hand = new ArrayList <Card> ();
		
	
	}
	
	
	//Getters Setters

	public int getScore() {
		return score;
	}
	
	public String getName()
	{
		return name;
	
	}
	public void setName(String name)
	{
		this.name = name;
	}
	

	
	public Card flip() {
		Card currentCard = hand.get(0);
		hand.remove(0);
		System.out.println(name + " has "+currentCard.describe());
		return currentCard;
	}
	
	public void incrementScore() {
		this.score++;
	}
	
	
	
	public void describe() {
		System.out.println("\n" + name + " has the following cards:");
		for (Card card : hand) {
			System.out.println(card.describe());
			System.out.println("-----------------------------------");
		}
	}
	public void draw(Deck deck) {
		Card currentCard = deck.draw();
		hand.add(currentCard);
		
	}

}	


	
	
	
	
