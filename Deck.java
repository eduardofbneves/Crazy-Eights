import java.io.*;
import java.lang.*;
import java.util.*;

public class Deck{

  public static void main(String[] args) {
    Deck test1 = new Deck();
    ArrayList<Card> test1li = test1.toList();
    for (int i = 0; i<52; i++){
      System.out.println(test1li.get(i));
    }
  }

  private static Card[] cards;

  public Deck(){
    cards = new Card[52];
    int index = 0;
    for (int suit = 0; suit <= 3; suit++){
      for (int rank = 1; rank <= 13; rank++){
        cards[index] = new Card(rank, suit);
        index++;
      }
    }
  }

  public static ArrayList<Card> toList(){
    ArrayList<Card> decklist = new ArrayList<>(Arrays.asList(cards)); // forma mais direta emque se tme de criar uma nova lista
    return decklist;
  }

  public String toString(){ //converter tudo para uma string para não ser chamado um loop quando se dá print
    String str="";          //capaz de ser mais seguro já que uma string é algo não muito complicado
    for (int i = 1; i < 52; i++){
      str += cards[i] + "\n";
    }
    return str;
  }


    //int numcards;
    /*
    public Deck(int decklength){
      Card[] cards = new Card[decklength];
    }

    public static void print(Deck deck){
      for (int i = 0; i <= 52; i++ ){
        System.out.println(deck.fulldeck);
      }
    }

    public static void print() {
      for (int i = 0; i < this.cards.length; i++) {
            System.out.println(this.cards[i]);
      }
    }

    public String toString(){ //chama o to String do Card mas não dá para mexer como se quer apresentar a array
      return Arrays.toString(cards);
    }
  */
}
