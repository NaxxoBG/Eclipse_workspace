public class BBufferMain
{
   public static void main(String[] args) {
      IBoundedBuffer buffer = new BoundedBuffer(5);

      
      Producer producer = new Producer(buffer);
      Producer producer1 = new Producer(buffer);
      
      Consumer consumer = new Consumer(buffer);
      Consumer consumer1 = new Consumer(buffer);
      Consumer consumer2 = new Consumer(buffer);
      
      producer.start();
      producer1.start();
      
      consumer.start();
      consumer1.start();
      consumer2.start();
   }
}