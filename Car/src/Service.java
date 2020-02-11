public class Service
{
   private int mileage;
   private Date date;

   public Service(int mileage, Date date) {
      this.mileage = mileage;
      this.date = date;
   }

   public int getMileage() {
      return mileage;
   }

   public Date getDate() {
      return date;
   }

   public boolean equals(Object obj) {
      if(!(obj instanceof Service)) {
         return false;
      } else {
         Service other = (Service) obj;
         return mileage == other.mileage && date.equals(other.date);
      }
   }

   public String toString() {
      return "\nService: \nmileage: " + mileage + "\nDate: " + date;
   }
}