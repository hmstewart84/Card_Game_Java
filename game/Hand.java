package game;
import java.util.*;

public class Hand {

  private ArrayList<Card> hand;
  private Card card;
  private Deck deck;

  public Hand() {
    this.hand = new ArrayList<Card>();
    this.deck = deck;
  }

  public void takeCard(Card card) {
    hand.add(card);
  }

  public int cardCount() {
    return hand.size();
  }

  public int getHandsValue(){
      int counter = 0;
      for (Card card : hand){
        counter += card.getRank().getValue();
      }
      return counter;
    } 



}