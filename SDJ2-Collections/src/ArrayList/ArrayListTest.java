package ArrayList;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayListTest
{
   int[] numbers = new int[0];
   ArrayList nums = new ArrayList(numbers);

   @Test
   public void test() {
      nums.print();
   }

   @Test
   public void test1() throws Exception {
      nums.add(4);
      nums.print();
      assertEquals(nums.size(), 1);
   }

   @Test
   public void test2() throws Exception {
      nums.remove(5);
   }
}