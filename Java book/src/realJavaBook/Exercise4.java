package realJavaBook;

public class Exercise4 {
   public static void main(String[] args) {
      int num = 1560;
      int bit = 3;
      int result = (num >> (bit - 1)) & 1;
      System.out.println(result);
   }
}