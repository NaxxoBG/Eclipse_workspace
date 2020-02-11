package SortedSet;

public interface SortedSetInterface<T extends Comparable<T>>
{
   public T first();
   public T last();
   public boolean add(T data);
   public void remove(T data);
   public int size();
   /**Returns the elements which are lesser than the passed element
    * @param data
    * @return
    */
   public SortedSet<T> headset(T data);
   /**Return the elements which are greater than or equal to the passed element
    * @param data
    * @return
    */
   public SortedSet<T> tailset(T data);
}