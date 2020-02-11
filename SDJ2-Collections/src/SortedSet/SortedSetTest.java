package SortedSet;

import java.util.Iterator;

public class SortedSetTest
{
   public static void main(String[] args) {
      SortedSet<Integer> sortedSet = new SortedSet<Integer>();
      sortedSet.add(1);
      sortedSet.add(1);
      sortedSet.add(2);
      sortedSet.add(100);
      sortedSet.add(99);
      Iterator<Integer> iter = sortedSet.iterator();
      while (iter.hasNext()) {
         int element = iter.next();
         System.out.print(element + "|");
      }
   }
}