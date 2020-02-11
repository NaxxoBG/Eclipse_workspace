package ArrayListString;

public interface ArrayListStringInterface<T> {
   public T get(int pos);
   public void set(int pos, T val);
   public void add(T value);
   public void remove(int pos);
   public int size();
   public void clear();
   public boolean isEmpty();
   public void print();
}