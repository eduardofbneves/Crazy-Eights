

public class Player{

  public static void main(String[] args) {
    Player p = new Player("coiso");
    
    p.display();

  }

  private String name;
  private CardGroup hand;

  public Player(String name){
    this.name = name;
    hand = new CardGroup(""); // Dá print a isto portanto num programa mais detalhado convém criar a classe hand
  }

  public void drawCard(int times, PillingDeck piledeck){
    for (int i = 0; i < times; i++){
      Card topcard = piledeck.removeCard(piledeck.cardGroupSize());
      hand.addCard(topcard);
    }
  }

  public void display(){
    System.out.print(name);
    System.out.println(hand);
  }
}
