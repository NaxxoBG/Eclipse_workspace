package Threads.CarLane;

import java.util.Random;

public class RandomGenerator
{
   static Random random = new Random();

   /**Generating a number from 1000 to the number inputted by the user multiplied by 1000<br>
    * Input: 5 - possible values(1000 - 2000 - 3000 - 4000 - 5000)
    * @param number
    * @return int
    * @version 1.0
    * @author Naxxo
    */
   public static int randomGenerator(int number) {
      return (random.nextInt(number) + 1) * 1000;
   }
}