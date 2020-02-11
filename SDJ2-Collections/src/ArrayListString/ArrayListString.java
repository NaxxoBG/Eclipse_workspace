package ArrayListString;

import java.lang.reflect.Array;

@SuppressWarnings("unchecked")
public class ArrayListString<T> implements ArrayListStringInterface<T>
{
   T[] integers = (T[]) Array.newInstance(Comparable.class, 0);

   public ArrayListString(T[] integers) {
      this.integers = integers;
   }

   public T get(int pos) {
      if (pos > integers.length) {
         System.out.println("The position is out of bounds.");
      } else {
         return integers[pos];
      }
      return null;
   }

   public void set(int pos, T val) {
      integers[--pos] = val;
   }

   public void add(T value) {
      T[] help = (T[])Array.newInstance(Comparable.class, integers.length+1);

      for (int i = 0; i < integers.length; i++) {
         help[i] = integers[i];
      }
      help[integers.length] = value;

      integers = help;
   }

   public void remove(int pos) {
      if(integers.length > 0){
         T[] array2 = (T[]) Array.newInstance(Comparable.class,(integers.length-1));
         boolean is = false;
         for (int i = 0; i < integers.length; i++) {
            if (i == (pos)) {
               is = true;
               continue;
            }
            if (!is)
               array2[i] = integers[i];
            else
               array2[i - 1] = integers[i];

         }
         integers = array2;
      }
   }

   public int size() {
      return integers.length;
   }

   public void clear() {
      //Arrays.fill(integers,0);
      T[] newArray = (T[])Array.newInstance(Comparable.class, 0);
      integers = newArray;
   }

   public boolean isEmpty() {
      return integers.length == 0;   
   }

   public void print() {
      if (integers.length == 0) {
         System.out.println("\nPRINT| The arraylist is empty");
      } else {
         System.out.print("\nPRINT| -> ");
         for (int i = 0; i < integers.length; i++) {
            System.out.print(integers[i] + "| ");
         }
      }
   }
}