package readersAndWriters;

public interface IReadWrite
{
   public void acquireRead();
   public void releaseRead();
   public void acquireWrite();
   public void releaseWrite();
}