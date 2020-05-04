import java.io.*;
import java.lang.*;
import java.util.*;


public class CardGroup{

  public static void main(String[] args) {
    CardGroup test2 = new CardGroup("test2");
    test2.addCard(new Card(1,1));
    System.out.print(test2);
    //System.out.print(test2.cardslist);


  }

  private String label;
  ArrayList<Card> cardslist;

  public CardGroup(String labelm){
    label = labelm;
    cardslist = new ArrayList<Card>();
  }

  /*
  public ArrayList<Card> getCardsList(){
    return cardslist;
  }
  */

  public void addCard(Card card){
    cardslist.add(card);
  }

  public Card getCard(int i){
    return cardslist.get(i);
  }

  public Card removeCard(int i){
    Card removedcard = cardslist.get(i); //ver e é necessário já que posso meter o método playCard
    cardslist.remove(i);
    return removedcard;
  }

  public Card getTopCard(){
    return cardslist.get(cardslist.size() - 1);
  }

  public int cardGroupSize(){
    return cardslist.size() - 1;
  }

  public void shuffleList(){
    for (int i = cardslist.size() - 1; i > 0; i--){
      int rand = (int)(Math.random()*52);
      cardslist.set(i, cardslist.get(rand));
      cardslist.set(rand, cardslist.get(i));
    }
  }

  public String toString(){
    String str = label +"\n";
    int i=0;
    while(i < cardslist.size()){
      str += cardslist.get(i) + "\n";
      i++;
    }
    return str;
  }
}
