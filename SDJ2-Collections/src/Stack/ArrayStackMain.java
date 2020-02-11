package Stack;
public class ArrayStackMain
{
   public static void main(String[] args) throws Exception
   {
      ArrayStack<Integer> nums = new ArrayStack<Integer>(5);
      nums.print();
      nums.isEmpty();
      nums.push(5);
      nums.push(3);
      nums.isEmpty();
      nums.print();
      nums.search(5);
      nums.search(3);
      nums.peek();
      nums.pop();
      nums.print();
      nums.size();
   }
}