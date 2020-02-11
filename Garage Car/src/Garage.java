public class Garage
{
   private Car[] cars;

   public Garage(int capacity) {
      cars = new Car[capacity];
   }

   public boolean isParkingAreaTaken(int position) {
      if (cars[position]  )
      }

      public void park(Car car, int position) {
         if(!isParkingAreaTaken(position)) {
            cars[position] = null;
         }
      }


      public Car takeACarRide(int position) {
         Car result = cars[position];
         cars[position] = null;
         return result;
      }


      public String toString() {
         return "Garage [car1=" + car1 + ", car2=" + car2 + "]";
      }


   }