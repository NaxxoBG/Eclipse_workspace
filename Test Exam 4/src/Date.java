public class Date
{
   private int day;
   private int month;
   private int year;

   public Date(int day, int month, int year)
   {
      super();
      this.day = day;
      this.month = month;
      this.year = year;
   }

   public int getDay()
   {
      return day;
   }

   public int getMonth()
   {
      return month;
   }

   public int getYear()
   {
      return year;
   }

   public Date copy() {
      return new Date(day, month, year);
   }

   public String toString()
   {
      return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
   }

   public boolean equals(Object o) {
      if (!(o instanceof Date)) {
         return false;
      } else {
         Date other = (Date) o;
         return other.day == day && other. month == month && other.year == year;
      }
   }
}