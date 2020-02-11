public class CPU
{
   private String brand;
   private String model;
   private double ClockFrequency;
   private int cores;

   public CPU(String brand, String model, double ClockFrequency, int cores) {
      this.brand = brand;
      this.model = model;
      this.ClockFrequency = ClockFrequency;
      this.cores = cores;
   }

   public String getBrand() {
      return brand;
   }

   public String getModel() {
      return model;
   }

   public double getClockFrequency() {
      return ClockFrequency;
   }

   public int getCores() {
      return cores;
   }

   public String toString() {
      return String.format("----CPU-Info----\nBrand: %s\nModel: %s\nClockFrequency: %s GHz\nCores: %s", brand, model, ClockFrequency, cores);
   }
}