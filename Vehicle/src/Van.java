public class Van extends Car
{
   private int maxLoad;

   public Van(String owner, double price, String regNo, int maxLoad) {
      super(owner, price, regNo);
      this.maxLoad = maxLoad;
   }

   public int getMaxLoad() {
      return maxLoad;
   }

   public String toString() {
      return "\n" + super.toString() + "\nMax load: " + maxLoad;
   }
   
   public boolean equals(Object arg) {
      if(!(arg instanceof Van)) {
         return false;
      } else {
         Van other = (Van) arg;
         return super.equals(other) && maxLoad == other.maxLoad;
      }
   }


}
