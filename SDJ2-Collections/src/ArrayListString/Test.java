package ArrayListString;

import static org.junit.Assert.*;

public class Test
{

   ArrayListString<String> strings = new ArrayListString<String>(new String[5]);

   @org.junit.Test
   public void test() {
      strings.add("one");
      assertEquals(strings.size(), 6);
   }

   @org.junit.Test
   public void test1() throws Exception {
      strings.add("two");
   }

   @org.junit.Test
   public void test2() throws Exception {
      strings.size();
   }

   @org.junit.Test
   public void test3() throws Exception {
      strings.add("nine");
   }

   @org.junit.Test
   public void test4() throws Exception {
      strings.add("ten");
   }

   @org.junit.Test
   public void test5() throws Exception {
      strings.get(4);
   }

   @org.junit.Test
   public void test6() throws Exception {
      strings.set(5,"thirteen");
   }

   @org.junit.Test
   public void test7() throws Exception {
      strings.get(3);
   }

}