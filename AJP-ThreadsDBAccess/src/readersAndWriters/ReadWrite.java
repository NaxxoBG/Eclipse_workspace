package readersAndWriters;

@SuppressWarnings("unused")
public class ReadWrite implements IReadWrite
{
   private int activeReaders = 0;
   private int activeWriters = 0;
   private int waitingReaders = 0;
   private int waitingWriters = 0;

   public ReadWrite() {}

   public synchronized void acquireRead() {
      waitingReaders++;
      while (activeWriters > 0 || waitingWriters > 0) {
         try {
            wait();
         } catch (InterruptedException e) {}
      }
      waitingReaders--;
      activeReaders++;
   }

   public synchronized void releaseRead() {
      activeReaders--;
      if (activeReaders == 0) {
         notifyAll();
      }
   }

   public synchronized void acquireWrite() {
      waitingWriters++;
      while (activeReaders > 0 || activeWriters > 0) {
         try {
            wait();
         } catch (InterruptedException e) {}
      }
      waitingWriters--;
      activeWriters++;
   }

   public synchronized void releaseWrite() {
      activeWriters--;
      if (activeWriters == 0) {
         notifyAll();
      }
   }
}