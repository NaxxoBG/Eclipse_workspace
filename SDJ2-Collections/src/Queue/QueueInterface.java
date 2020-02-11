package Queue;
public interface QueueInterface<T>
{
   /**
    * Insert in tail and return true if it was successful
    */
   public void enqueue(T data);

   /**Return the head of the queue
    * @return
    */
   public T peek();

   /**Get and remove the head
    * @return
    */
   public T dequeue();

   /**Add a node between nodes
    * @param t
    * @param afterThisPos
    */
   public void addBetween(T t, int afterThisPos);

   /**See the tail
    * @return
    */
   public T getLast();

   /**Return the size of the queue
    * @return
    */
   public int size();
}