import static org.junit.Assert.*;
import org.junit.*;
import game.*;

public class HandTest {

  Card card;
  Card card2;
  Hand hand;
  Deck deck;

  @Before 
  public void before() {
    card = new Card(SuitType.DIAMONDS, RankType.TWO);
    card2 = new Card(SuitType.SPADES, RankType.NINE);
    hand = new Hand();
    deck = new Deck();
  }

  @Test
  public void canTakeCard() {
    hand.takeCard(card);
    int result = hand.cardCount();
    assertEquals(result, 1);
  }
  
  @Test
    public void canGetAHandsValue(){
      hand.takeCard(card);
      hand.takeCard(card2);
      int value = hand.getHandsValue();
      assertEquals(11, value);

  }
}