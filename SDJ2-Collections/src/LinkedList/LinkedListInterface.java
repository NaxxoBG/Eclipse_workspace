package LinkedList;
public interface LinkedListInterface<T>
{

   /**add to the head a node with the given data. <br>List is HEAD -> NODE -> NODE -> TAIL
    * @param data
    */

   public void add(T data);

   /**add to head a node. <br>List is HEAD -> NODE -> NODE -> TAIL
    * @param node
    */
   public void add(Node<T> node);
   /**get element on position
    * @param index
    * @return
    */
   public T get(int pos);

   /**remove element on position
    * @param index
    */

   public void remove(int pos);

   /**is the list empty
    * @return
    */

   public boolean isEmpty();

   /**return the position of the first match
    * @param t
    * @return
    */

   public int search(T t);

   /**return the size of the array
    * @return
    */

   public int size();

   /**return an object array of the element
    * @return
    */

   public Object[] toArray();

   /**clear the list
    * @return
    */

   public void clear();
}