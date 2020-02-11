public class Test_Computer
{
   public static void main(String[] args)
   {
      int counter = 1;
      int coreSum = 0;
      double totalfrequency = 0;
      double avgclock = 0;

      // Creating CPU objects
      CPU dellcpu = new CPU("AMD", "FX", 4, 8); //CPU 1
      CPU asuscpu = new CPU("Intel", "CoreI7", 3, 4); //CPU 2

      //Creating a Computer object and setting a CPU
      Computer computer1 = new Computer("Dell","XPS");
      computer1.setCPU(dellcpu);

      //Creating a Computer object and a setting a CPU
      Computer computer2 = new Computer("Asus","K560");
      computer2.setCPU(asuscpu);

      //Creating Computer objects
      Computer computer3 = new Computer("Alienware","Aura");
      Computer computer4 = new Computer("CyberPower","Pro");

      //Creating an array of Computer objects
      Computer[] Store = {computer1, computer2, computer3, computer4};

      //Iterating over the array of Computer objects
      for(Object Computer : Store) {
         System.out.print("\n********** Computer " + counter++ + " **********");
         System.out.println(Computer);
      }

      System.out.println("=============================\nNumber of cores for each PC");
      int PCcount = 0; // = Store.length;

      for (int i = 0; i < Store.length; i++) {
         if (Store[i].getCPU() != null) {
            System.out.println(Store[i].getCPU().getCores());
            coreSum += Store[i].getCPU().getCores();
            totalfrequency += Store[i].getCPU().getClockFrequency() * Store[i].getCPU().getCores();
            PCcount++;
         }
      }

      avgclock = totalfrequency / coreSum;
      System.out.println("\nTotal cores across all PCs: " + coreSum);
      System.out.println("The average clock is " + avgclock + " GHz");
      System.out.println("Number of PCs with CPUs is " + PCcount);
   }
}