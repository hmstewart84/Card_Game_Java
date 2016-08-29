import static org.junit.Assert.*;
import org.junit.*;
import game.*;

public class GameTest{

  Game game;
  ArrayList<Player> players;
  Deck deck;
  Player player;
  Player player2;
  Card card;
  Card card1;
  Card card2;
  
  @Before
  public void before(){
    players = new ArrayList<Player>();
    player = new Player("Hannah");
    player2 = new Player("Charley");
    deck = new Deck();
    game = new Game (deck);
    card = new Card(SuitType.HEARTS, RankType.NINE);
    card1 = new Card(SuitType.CLUBS, RankType.FOUR);
    card2 = new Card(SuitType.DIAMONDS, RankType.JACK);
    
  }

}