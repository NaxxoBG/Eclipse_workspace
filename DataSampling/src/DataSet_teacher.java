public class DataSet_teacher
{
   private int lightValue;
   private int distanceValue;

   public DataSet_teacher(int l, int d) {
      lightValue = l;
      distanceValue = d;
   }

   public int getLight() {
      return lightValue;
   }

   public int getDistance() {
      return distanceValue;
   }
}