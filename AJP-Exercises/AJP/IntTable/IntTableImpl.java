//*****************************************************************************
//File name  : IntTable.java.
//Start date : 
//Programmer : Hans So.
//Java       : Java 1.7
//Description: 
//*****************************************************************************
package IntTable;

import java.util.ArrayList;
import java.util.Arrays;

public class IntTableImpl
{
   int[] table;  // instantiated in a constructor etc.
   int index;    // index is the first free place in the table;
   // it also counts the number of integers in table

   public IntTableImpl (int length) {
      this.table = new int[length];
      this.index = 0;
   }

   /**
    * The element is inserted on the first free place in the table
    * Precondition:  The table is not full
    * Postcondition: The element has been inserted and now the table is not empty
    * @param element The element to insert 
    */
   public void insert (int element) {
      table[index++] = element;
   }

   /**
    * Other methods:
    * removeLast
    */ 
   public void removeLast() {
      int[] table2 = new int[table.length];

      for (int i = 0; i < table.length - 1; i++) {
         table2[i] = table[i];
      }
      table = table2;

      //table[index--];
   }
   /** 
    * remove (int value) // removes one element with this value
    */ 
   public void remove(int value) {
      int[] help = new int[table.length - 1];
      boolean add = false;

      for (int i = 0; i < table.length; i++) {
         if (table[i] == value) {
            add = true;
            continue;
         }
         if(!add) {
            help[i] = table[i];

         } else {
            help[i-1] = table[i];
         }
      } 
      table = help;
   }


   /** 
    * removeAll (int value) // removes all elements with this value
    * 
    */
   public void removeAll(int value) {
      ArrayList<Integer> nums = new ArrayList<Integer>();

      for (int i = 0; i < table.length; i++) {
         nums.set(i, table[i]);
      }

      nums.removeAll(Arrays.asList(value));
      int[] removed = new int[nums.size()];

      for (int i = 0; i < removed.length; i++) {
         removed[i] = nums.get(i);
      }
      table = removed;

      //second try
      for (int i = 0; i < size(); i++) {
         if (table[i] == value) {
            table[i] = table[size()];
         }
      }
   }



   /** findIndex (int value)
    * 
    */

   public int findIndex (int value) {
      int index = 0;
      for (int i = 0; i < table.length; i++) {
         if (table[i] == value) {
            index = i;
            break;
         }
      }
      return index;
   }

   /** isEmpty
    * 
    */
   public boolean isEmpty() {
      return index == 0;
   }

   /** isFull
    * 
    */
   public boolean isFull() {
      return index == size();
   }
   /**
    * size
    * length
    * getMax
    * 
    */ 
   public int getMax() {
      int max = table[0];
      for (int i = 0; i < size(); i++) {
         if (table[i] > max) {
            max = table[i];
         }
      }
      return max;
   }

   /** getMin
    * 
    */

   public int getMin() {
      int min = table[0];
      for (int i = 0; i < size(); i++) {
         if (table[i] < min) {
            min = table[i];
         }
      }
      return min;
   }

   /** howMany (int value) // finds how many of this value
    * 
    */

   public int howMany(int value) {
      int counter = 0;

      for (int i = 0; i < size(); i++) {
         if (table[i] == value) {
            counter++;
         }
      }
      return counter;
   }

   /** 
    * sort  // sorts the table in ascending order
    */

   public void sort() {
      for (int i = 0; i < index; i++) {    
         for ( int j = i + 1; j < index; j++) {
            int temp = 0;
            if (table[i] > table[j]) {
               temp = table[i];
               temp = table[i];
               table[i] = table[j];
               table[j] = temp;
            }
         }
      }
      // Swap a[i] and a[min_j] 
   }

   /** 
    * mean  (also called the average) returns the sum of the data divided with the number of data.
    */

   public double mean() {
      double sum = 0;
      for (int i = 0; i < size(); i++) {
         sum += table[i];
      }
      double result = sum / size();
      return result;
   }

   /** median returns the middle value of the given numbers in their ascending order.
    *        If the size of the data set is even, the median is the average value of the two middle elements.
    */

   public double median() {
      sort();

      if (index % 2  == 0) {
         int median = (index) / 2;
         double res = (table[median] + table[median-1])/2.0;
         System.out.println("here");
         return res;
      } else {
         int result = table[(int) Math.ceil((size())/2)];
         //double result2 =(double) (table[--result] + table[result])/2.0;
         return result;
      }
   }

   /** standardDeviation
    *  use the formula at http://www.ajdesigner.com/phpstatistics/standard_deviation_sample.php.
    *  Also at: http://www.ltcconline.net/greenl/courses/201/descstat/mean.htm
    *
    */

   public double standartDeviation() {
      double deviation = 0;

      for (int i = 0; i < table.length; i++) {
         deviation += Math.pow(table[i] - mean(), 2);
      }
      return Math.sqrt(deviation / (table.length - 1));
   }

   /**
    * Value
    */

   int getValue (int index) {
      return table[index];
   }

   /**
    * Print
    */

   public String print(){
      String el = "; ";
      String el2 = " ";

      for (int i = 0; i < size(); i++) {
         el2 += table[i] + el;
      }
      return el2;
   }


   /**
    * size tells how many elements are in the table; 
    * - not the length of the array.
    * @return the number of elements in the table
    */

   public int size() {
      return index;
   }

   public int length() {
      return table.length;
   }
}