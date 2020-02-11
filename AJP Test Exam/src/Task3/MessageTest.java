package Task3;

public class MessageTest
{
   public static void main(String[] args) {
      CircularArray array1 = new CircularArray(10);
      CircularArray array2 = new CircularArray(5);

      Port port1 = new Port(1, array1);
      Port port2 = new Port(2, array2);

      Sender sender1 = new Sender(port1, 1);
      Sender sender2 = new Sender(port2, 2);
      Sender sender3 = new Sender(port1, 3);
      Sender sender4 = new Sender(port2, 4);
      Sender sender5 = new Sender(port1, 5);
      Sender sender6 = new Sender(port2, 6);

      Receiver receiver1 = new Receiver(1, port1);
      Receiver receiver2 = new Receiver(2, port2);

      receiver1.start();
      receiver2.start();
      try {
         Thread.sleep(2000);
      } catch (InterruptedException e) {}

      sender1.start();
      sender2.start();
      try {
         Thread.sleep(2000);
      } catch (InterruptedException e) {}

      sender3.start();
      sender4.start();
      try {
         Thread.sleep(2000);
      } catch (InterruptedException e) {}

      sender5.start();
      sender6.start();
   }
}