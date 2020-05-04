import java.io.*;
import java.lang.*;
import java.util.*;


public class PillingDeck extends CardGroup{

  public static void main(String[] args) {
    
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
