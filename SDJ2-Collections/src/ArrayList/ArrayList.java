package ArrayList;
import java.util.Arrays;

public class ArrayList implements ArrayListInterface
{
   int[] integers;
   private int arrSize;

   public ArrayList(int[] integers) {
      this.integers = integers;
      arrSize = integers.length;
   }

   public ArrayList(int size) {
      arrSize = size;
      this.integers = new int[size];
      Arrays.fill(integers, -1);
   }

   public int get(int pos) {
      if (pos > integers.length) {
         System.out.println("\nThe position is out of bounds.");
      } else {
         System.out.println("\nGET| The element at position " + pos + " is ");
         return integers[pos];
      }
      return -1; 
   }

   public void set(int pos, int val) {
      if (pos > integers.length) {
         System.out.println("\nThe position is out of bounds");
      } else {
         integers[--pos] = val;
         System.out.println("SET| " + val + " was added to the arraylist at position " + pos);
      }
   }

   public void add(int value) {
      int[] help = new int[integers.length + 1];

      for (int i = 0; i < integers.length; i++) {
         help[i] = integers[i];
      }
      help[integers.length] = value;

      integers = help;
      arrSize++;
      System.out.println("\nADD| " + value + " was added to the arraylist");
   }

   public void remove(int pos) {
      if (pos > integers.length) {
         System.out.println("\nREMOVE|The index is out of bounds");
      } else {
         int[] help = new int[integers.length - 1];
         boolean add = false;
         for (int i = 0; i < integers.length; i++) {
            if (i == (pos-1)) {
               add = true;
               continue;
            }
            if(!add) {
               help[i] = integers[i];
            } else {
               help[i-1] = integers[i];
            }
         }
         System.out.println("\nREMOVE| The element at position "+ pos + " was removed");
         arrSize--;
         integers = help;
      }
   }

   public int size() {
      System.out.print("\nSIZE| The size of the arraylist is " + arrSize);
      return integers.length;
   }

   public void clear() {
      //Arrays.fill(integers,0);
      int[] newArray = new int[0];
      this.integers = newArray;
      arrSize = 0;
      System.out.println("\nCLEAR| The arraylist is cleared");
   }

   public boolean isEmpty() {
      System.out.print("\nEMPTY| Is the arraylist empty -> " + (integers.length == 0));
      return integers.length == 0;   
   }

   public void print() {
      if (arrSize == 0 && integers.length == 0) {
         System.out.println("\nPRINT| The arraylist is empty");
      } else {
         System.out.print("\nPRINT| -> ");
         for (int i = 0; i < integers.length; i++) {
            System.out.print(integers[i] + "| ");
         }
      }
   }
}