package ArrayList;
public class Main
{
   public static void main(String[] args)
   {
      int[] numbers = {4, 45, 6, 67, 90};
      //int[] numbers = new int[5];

      ArrayList newArr = new ArrayList(numbers);

      newArr.print();
      newArr.add(5);
      newArr.remove(3);
      newArr.size();
      newArr.print();
      newArr.isEmpty();
      newArr.remove(4);
      newArr.print();
      newArr.isEmpty();
      newArr.clear();     
      newArr.isEmpty();
      newArr.add(4);
      newArr.print();
      newArr.remove(1);
      newArr.print();
      newArr.size();
   }
}