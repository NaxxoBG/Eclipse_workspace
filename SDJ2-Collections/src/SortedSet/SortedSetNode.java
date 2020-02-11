package SortedSet;

public class SortedSetNode<T>
{
   T data;
   SortedSetNode<T> next;

   public SortedSetNode(T data, SortedSetNode<T> next) {
      this.data = data;
      this.next = next;
   }

   public SortedSetNode(T data) {
      this.data = data;
      next = null;
   }

   public T getData() {
      return data;
   }
}