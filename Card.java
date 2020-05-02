

public class Card{

  public static void main(String[] args) {

  }

  String[] RANKS = {null, "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
  String[] SUITS = {"Spades", "Clubs", "Diamonds", "Hearts"};
  private final int rank;
  private final int suit;

  public Card(int rank, int suit){
    this.rank = rank;
    this.suit = suit;
  }

  public boolean isHigherRank(Card cd1, Card cd2){ //returns true if the first card is higer in rank
    boolean higher = false;
    if (cd1.rank > cd2.rank){
      higher = true;
    }
    return higher;
  }



  public String toString(){
    String ret = RANKS[this.rank] + " of " + SUITS[this.suit];
    return ret;
  }
}
