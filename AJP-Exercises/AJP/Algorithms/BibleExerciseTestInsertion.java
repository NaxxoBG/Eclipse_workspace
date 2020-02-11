package Algorithms;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;

public class BibleExerciseTestInsertion
{
   public static void main(String[] args) {
      try {
         //PrintStream out = new PrintStream(new FileOutputStream("C:/Users/Naxxo/Desktop/Console.txt"));
         PrintStream out = new PrintStream(new FileOutputStream("C:/Users/Naxxo/Desktop/Folders/AJP Exercises/Bible exercise/Console.txt"));
         System.setOut(out);

         String[] bibleText = BibleExercise.readFileWithScanner("C:/Users/Naxxo/Desktop/Folders/AJP Exercises/Bible exercise/Bible.txt");
         long c, d;
         //It will take thousands of seconds to sort the Bible with insertion sort.
         c = System.currentTimeMillis();
         InsertionSort.insertionSortGen(bibleText);
         d = System.currentTimeMillis();
         System.out.println("Bible insertion sort result: " + Arrays.toString(bibleText));
         double tInsertion = (d - c) / 1000.0;
         System.out.println("Bible insertion sort time: " + tInsertion + " sec"); 
      }
      catch (IOException e) {
         e.printStackTrace();
      }
   }
}