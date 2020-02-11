package Algorithms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class BibleExercise
{
   public static String[] readFileWithBufferedReader(String fileName) throws IOException {
      File file = new File(fileName);
      BufferedReader reader = new BufferedReader(new FileReader(file));
      String text = null;
      ArrayList<String> tokens = new ArrayList<String>();
      String[] line;
      String regex = "([^a-zA-Z']+)'*\\1*";
      //String regex = " ";
      while ((text = reader.readLine()) != null) {
         //originally with regex
         line = text.trim().split(regex);
         for (int i = 0; i < line.length; i++) {
            tokens.add(line[i]);
         }
      }
      reader.close();
      String[] resArr = new String[tokens.size()];
      resArr = tokens.toArray(resArr);
      return resArr;
   }

   public static String[] readFileWithScanner(String fileName) throws IOException {
      Scanner input = new Scanner(new File(fileName)); 
      ArrayList<String> tokens = new ArrayList<String>();
      input.useDelimiter("([^a-zA-Z']+)'*\\1*");
      //input.useDelimiter(" ");
      while (input.hasNext()) { 
         String word = input.next();
         tokens.add(word);
      }
      input.close();
      String[] resArr = new String[tokens.size()];
      resArr = tokens.toArray(resArr);
      return resArr;
   }
}