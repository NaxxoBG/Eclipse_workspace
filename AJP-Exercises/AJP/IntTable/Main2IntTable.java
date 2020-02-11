// *****************************************************************************
// File name  : Main2IntTable.java
// Start date : 
// Programmer : Hans So.
// Java       : Java 
// Description: 
// *****************************************************************************

package IntTable;

import IntTable.Cin;

public class Main2IntTable
{
   public static void main (String[] args)
   {
      int choice;

      IntTableImpl intTable = null;
      int n;
      int value;

      do
      {
         menu();
         choice = Cin.readInt();
         switch (choice)
         {
            case 1 :  // create table
               System.out.print("Create table; type length: ");
               n = Cin.readInt();
               intTable = new IntTableImpl (n);
               System.out.println("Table of length " + intTable.length() + " is created");
               break;
            case 2 :  // insert value
               System.out.print("Insert: type value: ");
               value = Cin.readInt();
               intTable.insert (value);
               System.out.println("Table has " + intTable.size() + " values");
               break;
            case 3 :  // remove value
               System.out.print("Remove: type value: ");
               value = Cin.readInt();
               (intTable).remove (value);
               System.out.println("Table has " + intTable.size() + " values");
               break;
            case 4 :  // print table            
               System.out.println("Table: " + intTable.print());
               break;
            case 5: // removeLast
               intTable.removeLast();
               System.out.println(intTable.print());
               break;
            case 6: // removeAll
               System.out.println("Insert value:");
               value = Cin.readInt();
               intTable.removeAll(value);
               intTable.print();
               break;
            case 7: // findIndex
               System.out.println("Insert value:");
               value = Cin.readInt();
               System.out.println(intTable.findIndex(value));            
               break;
            case 8: // isEmpty
               System.out.println("Empty? " + intTable.isEmpty());             
               break;
            case 9: // isFull
               System.out.println("Full? " + intTable.isFull());        
               break;
            case 10: // getMax
               System.out.println("Max is " + intTable.getMax());               
               break;
            case 11: // getMin
               System.out.println("Min is " + intTable.getMin());
               break;
            case 12: // howMany
               System.out.println("Insert value:");
               value = Cin.readInt();
               System.out.println("No: " + intTable.howMany(value));
               break;
            case 13: // sort
               intTable.sort();
               System.out.println(intTable.print());
               break;
            case 14: // mean
               System.out.println(intTable.mean());
               break;
            case 15: // median
               System.out.println(intTable.median());
               break;
            case 16: // standartDeviation
               System.out.println("The deviation is " + intTable.standartDeviation());
               break;
            case 17: // getValue
               System.out.println("Insert value: ");
               int num = Cin.readInt();
               System.out.println(intTable.getValue(num));
            case 18: //size of table
               System.out.println(intTable.size());
               break;
            case 19: // lenth of table
               System.out.println(intTable.length());
               break;
            default :
               break;
         }
      }
      while (choice > 0);
      System.out.println("** End **");
   }

   private static void menu()
   {
      System.out.println(" MENU");
      System.out.println(" 1) create table");
      System.out.println(" 2) insert element");
      System.out.println(" 3) remove element");
      System.out.println(" 4) print table");
      System.out.println(" 5) remove last element");
      System.out.println(" 6) remove all elements");
      System.out.println(" 7) find index");
      System.out.println(" 8) is it empty");
      System.out.println(" 9) is it full");
      System.out.println(" 10) max value");
      System.out.println(" 11) min value");
      System.out.println(" 12) occurences of a value");
      System.out.println(" 13) sort table");
      System.out.println(" 14) mean");
      System.out.println(" 15) median");
      System.out.println(" 16) standart deviation");
      System.out.println(" 17) get value");
      System.out.println(" 18) size of table");
      System.out.println(" 19) length of table");
      System.out.println(" 0)  Quit");
      System.out.print(" Type your choice: ");
   }
}