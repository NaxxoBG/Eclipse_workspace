package Stack;
/**This interface contains the methods to be implemented.
 * @see <a href="https://docs.oracle.com/javase/7/docs/api/java/util/Stack.html#search(java.lang.Object)">Methods</a>
 * @author Naxxo
 */

public interface ArrayStackInterface<T> {

   /**Returns the top element in the stack. It is accepted that the top element is at distance 1 from the top.
    * @return top element of stack.
    * @author Naxxo
    * @throws Exception 
    */

   public T peek();

   /**Returns the top element and removes it from the stack.
    * @return top element of stack.
    * @author Naxxo
    * @throws Exception 
    */

   public T pop();

   /**Adds an element at the top of the stack.
    * @param element
    * @author Naxxo
    */

   public void push(T element);

   /**Searches for the first element with the given value and returns its position.
    * @return 1-based position where an object is on this stack.
    * @param element
    * @author Naxxo
    */

   public int search(T element);

   /**Checks whether the stack is empty.
    * @return true/false
    * @author Naxxo
    */

   public boolean isEmpty();

   /**Returns the size of the stack.
    * @return size of the stack.
    * @author Naxxo
    */

   public int size();

   /**Return the stack.
    * @return Stack as a String
    * @author Naxxo
    * @return 
    */
   public void print();
}