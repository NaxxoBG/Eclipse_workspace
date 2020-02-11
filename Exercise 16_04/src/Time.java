public class Time
{
   private int hour;
   private int minute;
   private int second;

   public Time(int h, int m, int s) {
      if (h < 0) {
         hour = 0;
      } else {
         hour = h;
      }
      if (m > 59 ) {
         minute = 59;
      } else if (m < 0) {
         minute = 0;
      } else
      {
         minute = m;
      }
      if (s > 59 ) {
         second = 59;
      } else if (s < 0) {
         second = 0;
      } else {
         second = s;
      }
   }

   public Time(int timeInSeconds) {
      hour = timeInSeconds / 3600;
      minute = (timeInSeconds % 3600) / 60;
      second = timeInSeconds % 60;
   }

   public int getHour() {
      return hour;
   }

   public int getMinute() {
      return minute;
   }

   public int getSecond() {
      return second;
   }

   public int getTimeInSeconds() {
      int timeInSeconds =  hour * 3600 + minute * 60 + second;
      return timeInSeconds;
   }

   public void setTime(int h, int m, int s) {
      if (h < 0) {
         hour = 0;
      } else {
         hour = h;
      }
      if (m > 59 ) {
         minute = 59;
      } else if (m < 0) {
         minute = 0;
      } else
      {
         minute = m;
      }
      if (s > 59 ) {
         second = 59;
      } else if (s < 0) {
         second = 0;
      } else {
         second = s;
      }
   }

   public String toString() {
      return String.format("%02d:%02d:%02d", hour, minute, second);
   }
}