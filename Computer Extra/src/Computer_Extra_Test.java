
public class Computer_Extra_Test
{

   public static void main(String[] args)
   {
      Computer computer1 = new Computer("Intel Core I5 3570K", "NVIDIA Geforce GTX 980", 4);
      Computer computer2 = new Computer("AMD FX 8300", "ATI Radeon", 2);

      System.out.println(computer1.equals(computer2));
      computer1.setMemory(3, 4);
      System.out.println(computer1);
   }
}