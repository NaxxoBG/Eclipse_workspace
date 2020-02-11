package Stack;
import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayStackTest
{
   ArrayStack<Integer> stack = new ArrayStack<Integer>(5);
   
   @Test
   public void test() {
      
      stack.push(3);
      int res = stack.peek();
      assertEquals(res, 3);
   }
   
   @Test
   public void test2(){
      
      stack.push(3);
      stack.push(4);
      int res = stack.peek();
      assertEquals(res, 4);
   }
   
   @Test
   public void test3(){
      
      stack.push(3);
      stack.push(4);
      stack.push(9);
      int res = stack.peek();
      assertEquals(res, 9);
   }
   
   @Test
   public void test4(){
      stack.push(3);
      stack.push(4);
      stack.push(9);
      stack.pop();
      int res = stack.size();
      assertEquals(res, 2);
   }
   
}