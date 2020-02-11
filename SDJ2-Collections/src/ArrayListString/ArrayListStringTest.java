package ArrayListString;

public class ArrayListStringTest
{

   public static void main(String[] args) {
      Integer[] nums = new Integer[0];
      ArrayListString<Integer> stringList = new ArrayListString<Integer>(nums);
      
      stringList.print();
      stringList.add(5);
      stringList.print();
      stringList.add(6);
      stringList.print();
      stringList.remove(1);
      stringList.print();
      System.out.println("\n" + stringList.size());
      System.out.println("\n" + stringList.size());

   }

}
