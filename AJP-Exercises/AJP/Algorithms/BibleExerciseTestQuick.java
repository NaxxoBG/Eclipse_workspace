package Algorithms;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;

public class BibleExerciseTestQuick
{
   public static void main(String[] args) {
      try {
         PrintStream out = new PrintStream(new FileOutputStream("C:/Users/Naxxo/Desktop/Folders/AJP Exercises/Bible exercise/Console.txt"));
         System.setOut(out);

         String[] bibleText = BibleExercise.readFileWithScanner("C:/Users/Naxxo/Desktop/Folders/AJP Exercises/Bible exercise/Bible.txt");
         long a, b;

         a = System.currentTimeMillis();
         QuickSort.quickSort(bibleText, 0, bibleText.length-1);
         b = System.currentTimeMillis();
         System.out.println("Bible quick sort result: " + Arrays.toString(bibleText));
         double tQuick = (b - a) / 1000.0;
         System.out.println("Bible quick sort time: " + tQuick + " sec");
      }
      catch (IOException e) {
         e.printStackTrace();
      }
   }
}