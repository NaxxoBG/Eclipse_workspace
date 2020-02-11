package Singleton;

import java.util.ArrayList;
import java.util.Collections;

public class Singleton
{
   private static Singleton firstInstance = null;

   private Singleton() {}

   private ArrayList<String> makeDeck() {
      String[] numCards = {"2", "3", "4", "5",
            "6", "7", "8", "9", "10", "J", "K",
            "Q", "A"};

      String[] paint = {"Spades", "Hearts", "Diamonds", "Clubs"};

      ArrayList<String> cards = new ArrayList<String>();

      for (String num : numCards) {
         for (String colour : paint) {
            cards.add(num + "-"+ colour);
         }
      }
      return cards;
   }

   private ArrayList<String> cards = makeDeck();

   public ArrayList<String> getCards(int howManyCards) {
      ArrayList<String> cardsToSend = new ArrayList<String>();
      for (int i = 0; i < howManyCards; i++) {
         cardsToSend.add(firstInstance.cards.get(i));
         cards.remove(cards.get(i));
      }
      return cardsToSend;
   }

   public static Singleton getInstance() {
      if (firstInstance == null) {
         firstInstance = new Singleton();
         Collections.shuffle(firstInstance.cards);
      }
      return firstInstance;
   }

   public void showMessage() {
      System.out.println(System.identityHashCode(firstInstance));
   }

   public ArrayList<String> getCards() {
      return firstInstance.cards;
   }
}