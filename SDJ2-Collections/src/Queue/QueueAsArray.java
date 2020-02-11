package Queue;

class QueueAsArray extends Queue<Integer>
{
   int[] a;
   int head = 0;
   int tail = 0;
   int count = 0;

   QueueAsArray(int n) {
      a = new int[n];
   }

   public boolean isEmpty() {
      return count == 0;
   }

   public int enqueue(int value) {
      if (count == a.length) {
         System.exit(-1);
      }
      count = count + 1;
      a[tail] = value;
      tail = (tail + 1) % a.length;
      return tail;
   }

   public Integer dequeue() {
      count = count - 1;
      int value = a[head];
      head = (head + 1) % a.length;
      return value;
   }

   public Integer peek() {
      return a[head];
   }
}
