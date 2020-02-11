public class Computer
{
   private String brand;
   private String model;
   private CPU cpu;
   
   public Computer(String brand, String model)
   {
      this.brand = brand;
      this.model = model;
      this.cpu = null;
   }

   public void setCPU(CPU cpu) {
      this.cpu = cpu;
   }

   public CPU getCPU() {
      return cpu;
   }

   public String getBrand() {
      return brand;
   }

   public String getModel() {
      return model;
   }

   public String getCPUBrand() {
      return cpu.getBrand();
   }

   public String toString() {
      return String.format("\n----Computer-Info----\nBrand: %s\nModel: %s\n%s", brand, model, cpu);
   }
}