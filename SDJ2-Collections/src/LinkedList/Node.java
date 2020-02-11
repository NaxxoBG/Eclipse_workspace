package LinkedList;

public class Node<T>
{
   T data;
   Node<T> next;

   public Node(T data, Node<T> next) {
      this.data = data;
      this.next = next;
   }

   public Node(T data) {
      this.data = data;
   }

   public String toString() {
      return data + "";
   }

   public T getData() {
      return data;
   }
}