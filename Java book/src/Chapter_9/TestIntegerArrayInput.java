package Chapter_9;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import org.junit.Test;

public class TestIntegerArrayInput
{
   @Test
   public void testStream() {
      //(Arrays.stream(numbers)).sum() // a way to get the sum of all elements of an array
      Scanner in = new Scanner(System.in);
      Integer[] inputNums = new Integer[0];
      System.out.println("Enter a set of numbers:");
      boolean checker = true;
      while (checker) {
         try {
            inputNums = (Integer[]) Arrays.stream(in.nextLine().split(", ")).map(Integer::parseInt).collect(Collectors.toList()).toArray(new Integer[0]);
            checker = false;
         } catch (NumberFormatException e){
            System.out.println("Please enter a valid set of numbers");
         } 
      }
      System.out.println("The set is " + Arrays.toString(inputNums));
      in.close();
   }
}