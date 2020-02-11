package DoublyLinkedList;
public class DoublyNode<T>
{
   T data;
   DoublyNode<T> next = null;
   DoublyNode<T> prev = null;

   public DoublyNode(T data, DoublyNode<T> next, DoublyNode<T> prev) {
      this.data = data;
      this.next = next;
      this.prev = prev;
   }

   public DoublyNode(T data) {
      this.data = data;
   }

   public String toString() {
      return data + "";
   }

   public T getData() {
      return data;
   }
}