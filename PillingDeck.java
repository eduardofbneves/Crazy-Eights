import java.io.*;
import java.lang.*;
import java.util.*;


public class PillingDeck extends CardGroup{

  public static void main(String[] args) {
    PillingDeck test = new PillingDeck("test1");
    //System.out.print(test);
    test.shuffleList();
    System.out.print(test);
  }

  public PillingDeck(String label){
    super(label);
    Deck pillingfulldeck = new Deck();
    cardslist = pillingfulldeck.toList();
  }

  public boolean emptyPileDeck(){
    return cardslist.isEmpty();
  }

}
