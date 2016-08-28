import static org.junit.Assert.*;
import org.junit.*;
import game.*;

public class PlayerTest {

  Player player;
  Hand hand;
  Card card;
  Card card1;

  @Before 
  public void before(){
    player = new Player("Hannah");
    hand = new Hand();
    card = new Card(SuitType.DIAMONDS, RankType.SEVEN);
    card1 = new Card(SuitType.CLUBS, RankType.TWO);
  }

  @Test
  public void hasName(){
    assertEquals( "Hannah", player.getName() ); 
  }

  @Test
    public void canGetAHand(){
      player.getHand().takeCard(card);
      player.getHand().takeCard(card1);
      assertEquals(9, player.getHand().getHandsValue());
    }

}