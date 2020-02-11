package Set;

public interface SetInterface<T>
{
   public void add(T data);
   public void remove(int pos);
   public void clean();
   public boolean isEmpty();
   public int search(T data);
}