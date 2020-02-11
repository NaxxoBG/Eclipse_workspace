package java8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFromFile
{
   @FunctionalInterface
   public interface BufferedReaderProcessor {
      String process(BufferedReader p) throws IOException; 
   }

   public static String processFile(BufferedReaderProcessor p) throws IOException {
      try (BufferedReader br = new BufferedReader(new FileReader("C:/Users/Naxxo/Desktop/data.txt"))) {
         return p.process(br);
      }
   }

   public static void main(String[] args) throws IOException {
      String oneLine = processFile(BufferedReader::readLine);
      String oneLine2 = processFile(br -> br.readLine());
      String twoLines = processFile(br -> br.readLine() + "\n" + br.readLine());

      System.out.println(oneLine);
      System.out.println("-----------------------");
      System.out.println(oneLine2);
      System.out.println("-----------------------");
      System.out.println(twoLines);
   }
}