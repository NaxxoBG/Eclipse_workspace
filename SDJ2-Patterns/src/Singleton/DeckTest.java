package Singleton;

public class DeckTest
{
   public static void main(String[] args) {
      Singleton deck = Singleton.getInstance();
      System.out.println(deck.getCards());
      System.out.println(deck.getCards(1));
      System.out.println(deck.getCards());
   }
}