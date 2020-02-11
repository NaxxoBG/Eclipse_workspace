import java.util.*;

public class DataChain
{
   public static void main(String[] args)
   {
      List<Integer> num = Arrays.asList(2, 3, 4, 6346, 5, 9, 11, 56856, 2, 6);num.stream().filter(j -> j % 2 == 0 ).forEach(m -> System.out.println("Numbers " + m + " is even."));
   }
}