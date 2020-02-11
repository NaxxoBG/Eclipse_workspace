package DoublyLinkedList;
import java.util.Iterator;

public class DoublyLinkedListTest
{
   public static void main(String[] args) {
      DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();

      list.add(1);
      list.add(4);
      list.add(3);
      list.add(7);
      list.add(5);
      list.add(8);
      list.add(6);
      list.add(14);  //-> top of LinkedList.
      list.search(1);
      list.get(7);
      list.size();
      list.remove(3);
      list.size();
      list.search(4);
      list.size();
      list.remove(1);
      list.remove(6);
      list.size();

      Iterator<Integer> it = list.iterator();
      while(it.hasNext()) {
         int element = it.next();
         System.out.print(element + " ");
      }
      System.out.println();
      System.out.println();
   }
}