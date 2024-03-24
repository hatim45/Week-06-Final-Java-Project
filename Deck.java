package week06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	//fields 
	private ArrayList <Card> cards;
	//Constructors
	public  Deck() {
		cards = new ArrayList <Card> ();
		for (int i = 0; i < 52; i++) {
			cards.add(new Card(i));
			//sysout(cards.get(i).describe());
		}
	}
	
	//Methods
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public Card draw() {
		Card currentCard = cards.get(0);
		cards.remove(0);
		return currentCard;
	}

	@Override
	public String toString() {
		for (Card card : cards) {
				System.out.println(card.describe());
			}
		return " ";
		}
	}
	
	














