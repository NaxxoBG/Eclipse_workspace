package Chapter_7;

import java.util.ArrayList;
import java.util.List;

public class Exercise_16
{
   public static List<Integer> findPrimes(int limit) {
      List<Integer> list = new ArrayList<>();

      boolean[] isComposite = new boolean[limit + 1]; // limit + 1 because we won't use '0'th index of the array
      isComposite[1] = true;

      // Mark all composite numbers
      for (int i = 2; i <= limit; i++) {
         if (!isComposite[i]) {
            // 'i' is a prime number
            list.add(i);
            int multiple = 2;
            while (i * multiple <= limit) {
               isComposite[i * multiple] = true;
               multiple++;
            }
         }
      }
      return list;
   }

   public static void main(String[] args) {
      System.out.println(findPrimes(10000));
   }
}