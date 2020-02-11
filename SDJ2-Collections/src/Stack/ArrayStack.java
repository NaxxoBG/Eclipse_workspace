package Stack;
import java.util.Arrays;

public class ArrayStack<T> implements ArrayStackInterface<T>
{
   private T[] stackArr;
   private int stackSize;
   private int top = -1;

   @SuppressWarnings("unchecked")
   public ArrayStack(int size) {
      stackSize = size;
      this.stackArr = (T[]) new Object[size];
      Arrays.fill(stackArr, -1);
   }

   public T peek() {
      System.out.print("\nPEEK| At the Top of the Stack -> " + stackArr[top]);
      return stackArr[top];
   }

   @SuppressWarnings("unchecked")
   public T pop() {
      if (top >= 0) {
         System.out.print("\nPOP| " + stackArr[top] + " was removed from the stack");       
         stackArr[top] = (T) "-1";
         stackSize--;
         return stackArr[top--];

      } else {
         System.out.print("\nThe Stack is empty");
         return null;      
      }
   }

   public void push(T element) {
      if (top + 1 < stackSize) {
         top++;
         stackArr[top] = element;
         stackSize++;
      } else {
         System.out.println("The stack is full");
      }

      System.out.print("\nPUSH| " + element + " was added to the stack\n");
      stackArr.toString();
   }

   public int search(T element) {
      int pos = 0;
      for (int i = 0; i < stackArr.length; i++) {
         if (stackArr[i] == element) {
            pos = i;
            break;
         }
      }
      System.out.print("\nSEARCH| " + element + " is at position " + pos);
      return pos;
   }

   public boolean isEmpty() {
      System.out.print("EMPTY| Empty stack? -> " + (top == -1));
      return top == -1;
   }

   public int size() {
      System.out.print("\nSIZE| The size of the stack is " + (top + 1));
      return top + 1;
   }

   public void print() {
      System.out.print("\nPRINT| ");
      for (int i = 0; i < stackArr.length; i++) {
         System.out.print(stackArr[i] + "| ");
      }
      System.out.println();
   }
}