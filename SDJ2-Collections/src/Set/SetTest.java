package Set;

import java.util.Iterator;

public class SetTest
{
   public static void main(String[] args) {
      Set<Integer> set = new Set<Integer>();

      set.add(1);
      set.size();
      set.add(2);     
      set.add(3);
      set.add(4);
      set.size();
      set.add(5);
      set.add(5);
      set.add(5);
      set.size();
      set.add(5);
      
      System.out.println();
      System.out.println("Searching" + " -> " +  1);
      System.out.println(set.search(1));
      System.out.println();
      
      set.getHeadData();
      set.getTailData();
      
      Iterator<Integer> iter = set.iterator();
      System.out.println();
      System.out.println("Set");
      while (iter.hasNext()) {
         int element = iter.next();
         System.out.print(element + "|");
      }
   }
}