package Stack;
/**The Stack class.
 * @author Book
 */
public class ArrayStack_Book<T> implements ArrayStackInterface<T>
{
   private final int DEFAULT_CAPACITY = 100;
   private int top = 0;
   private T[] stack;


   @SuppressWarnings("unchecked")
   public ArrayStack_Book() {
      top = 0;
      stack = (T[])(new Object[DEFAULT_CAPACITY]);
   }

   @SuppressWarnings("unchecked")
   public ArrayStack_Book(int initialCapacity) {
      top = 0;
      stack = (T[])(new Object[initialCapacity]);
   }


   public T peek()  {
      if(isEmpty()) {
         System.out.println("Stack is empty");
      } else {  
         return stack[top-1];
      }
      return null;
   }

   public T pop() {
      if (isEmpty()) {
         System.out.println("Stack is empty");
      } else {
         top--;
         T result = stack[top];
         stack[top] = null;
         return result;
      }
      return null;
   }

   public void push(T element) {
      if (size() < stack.length) {       
         stack[top] = element;
         top++;
      } else {
         expandCapacity();
      }
   }

   private void expandCapacity() {
      @SuppressWarnings("unchecked")
      T[] larger = (T[])(new Object[stack.length*2]);
      for (int i = 0; i < stack.length; i++) {
         larger[i] = stack[i];
      }
      stack = larger;
   }

   public int search(T element) {
      int index = 0;
      for (int i = 0; i < stack.length; i++) {
         if (stack[i] == element) {
            index = i;
         }
      }
      return index;
   }

   public boolean isEmpty() {
      return top == 0;
   }

   public int size() {
      return top;
   }

   public void print() {
      for (int i = 0; i < stack.length; i++) {
         System.out.println(stack[i] + ", ");
      }
   }  
}