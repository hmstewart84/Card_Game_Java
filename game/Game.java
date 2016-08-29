package game;
import java.util.*;

public class Game{

  private ArrayList<Player> players;
  private Deck deck;
  private int currentPlayerIndex;

  public Game(Deck deck){
    this.players = new ArrayList<Player>();
    this.deck = new Deck();
    currentPlayerIndex = 0;
   }

   public void addAPlayer(Player player){
       players.add(player);
     }

  public int changeCurrentPlayer(){
    currentPlayerIndex = (currentPlayerIndex + 1) % players.size();
      return currentPlayerIndex;
  }

  public Deck getDeck(){
     return this.deck;
   }


}
