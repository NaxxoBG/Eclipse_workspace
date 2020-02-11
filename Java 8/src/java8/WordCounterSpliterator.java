package java8;

import java.util.Spliterator;
import java.util.function.Consumer;

public class WordCounterSpliterator implements Spliterator<Character>
{
   private final String string;
   private int currentChar = 0;

   public WordCounterSpliterator(String string) {
      this.string = string;
   }

   @Override
   public boolean tryAdvance(Consumer<? super Character> action) {
      action.accept(string.charAt(currentChar++));                   //consume the current character
      return currentChar < string.length();           // return true if there are further characters to be consumed
   }

   @Override
   public Spliterator<Character> trySplit() {
      int currentSize = string.length() - currentChar;
      if (currentSize < 10) {
         return null;        // return null to signal that the string to be parsed is smalled enough to be processed sequentially
      }
      for (int splitPos = currentSize / 2 + currentChar; splitPos < string.length(); splitPos++) { // set the candidate's split position to be half of the String to be parsed
         if (Character.isWhitespace(string.charAt(splitPos))) { // advance the split position until the next space
            Spliterator<Character> spliterator = new WordCounterSpliterator(string.substring(currentChar, splitPos)); // create a new wordcounterspliterator parsing the string from the start to the split position
            currentChar = splitPos; // set the start position of this wordcounterspliterator to the split position
            return spliterator;
         }
      }
      return null;
   }

   @Override
   public long estimateSize() {
      return string.length() - currentChar;
   }

   @Override
   public int characteristics() {
      return ORDERED + SIZED + SUBSIZED + NONNULL + IMMUTABLE;
   }
}