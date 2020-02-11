import java.util.Arrays;

public class Computer
{
   private String cpu;
   private String gpu;
   private int[] memory;

   public Computer(String cpu, String gpu, int memorySize) {
      this.cpu = cpu;
      this.gpu = gpu;
      memory = new int[memorySize];
   }

   public void setCPU(String CPU) {
      this.cpu = CPU;
   }

   public void setGPU(String GPU) {
      this.gpu = GPU;
   }

   public String getCPU() {
      return cpu;
   }

   public String getGpu() {
      return gpu;
   }

   public void setMemory(int pos, int value) {
      memory[--pos] = value;
   }

   public boolean equals(Object obj) {
      if (!(obj instanceof Computer)) {
         return false;
      } else {
         Computer other = (Computer) obj;
         return cpu == other.cpu && gpu == other.gpu && Arrays.equals(memory, other.memory);
      }
   }

   public String toString() {
      return "Computer [CPU=" + cpu + ", GPU=" + gpu + ", memory=" +
            Arrays.toString(memory) + "]";
   }
}