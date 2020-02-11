package Queue;
public class Qnode<T>
{
   Qnode<T> next;
   T data;

   public Qnode(T data, Qnode<T> next) {
      this.data = data;
      this.next = next;
   }

   public Qnode(T data) {
      this.data = data;
      next = null;
   }

   public String toString() {
      return data + "";
   }

   public T getData() {
      return data;
   }
}