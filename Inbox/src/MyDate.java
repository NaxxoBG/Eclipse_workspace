public class MyDate
{
   private int day;
   private int month;
   private int year;

   public MyDate(int day, int month, int year) {
      this.day = day;
      this.month = month;
      this.year = year;
   }

   public String toString() {
      return "MyDate [day=" + day + ", month=" + month + ", year=" + year + "]";
   }

   public boolean equals(Object o) {
      if (!(o instanceof MyDate)) {
         return false;
      } else {
         MyDate other = (MyDate) o;
         return day == other.day && month == other.month && year == other.year;
      }
   }
}