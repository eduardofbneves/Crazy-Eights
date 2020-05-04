import java.io.*;
import java.lang.*;
import java.util.*;

public class Main{

  public static void main(String[] args) {

  }

  //private static Card cardplayed;
  private CardGroup one;
  private CardGroup two;
  private Scanner inp;
  private static CardGroup playdeck= new CardGroup("Played Cards");

  public void startGame(int nmrplayers){
    PillingDeck pillingdeck = new PillingDeck("Pilling Deck");
    pillingdeck.shuffleList();
    one = new Player("Player1");
    two = new Player("Player2");
    one.drawCard(5, pillingdeck);
    two.drawCard(5, pillingdeck);
    playdeck.addCard(playdeck.getTopCard());
  }

  //
  private boolean validCard(Card cardp){
    boolean valid;
    if (cardp.rank == 1 ){
      playdeck.add(cardp);
      vlid = true;
    }
    else if (cardp > playdeck.get(playdeck.size() - 1)) {
      playdeck.add(cardp);
      valid = true;
    }
    else {
      valid = false;
    }
    return valid;
  }

  /*
  public boolean searchPossiblePlay(CardGroup hand){
    boolean possible = true;
    for (int i = 0; i < hand.cardslist.size() - 1){
      if ()
    }
  }
  */
}
