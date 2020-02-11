package Set;

public class SetNode<T>
{
   T data;
   SetNode<T> next;
   
   public SetNode(T data, SetNode<T> next) {
      this.next = next;
      this.data = data;
   }

   public SetNode(T data) {
      this.data = data;
      next = null;
   }

   public T getData() {
      return data;
   }
}