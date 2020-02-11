package java8;

import java.util.Spliterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class SpliteratorTest
{
   public static int countWordsIteratively(String s) {
      int counter = 0;
      boolean lastSpace = true;
      for (char c : s.toCharArray()) {
         if (Character.isWhitespace(c)) {
            lastSpace = true;
         }
         else {
            if (lastSpace) {
               counter++;
            }
            lastSpace = false;
         }
      }
      return counter;
   }

   public static int countWords(Stream<Character> stream) {
      WordCounter wordCounter = stream.reduce(new WordCounter(0, true), WordCounter::accumulate, WordCounter::combine);
      return wordCounter.getCounter();
   }
   
   public static void main(String[] args) {
      final String sentence = "Is this   working properly.";
      System.out.println(countWordsIteratively(sentence));
      
      Spliterator<Character> spliterator = new WordCounterSpliterator(sentence);
      Stream<Character> stream = StreamSupport.stream(spliterator, true);
      System.out.println(countWords(stream));
   }
}