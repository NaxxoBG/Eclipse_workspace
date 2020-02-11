
public class Values
{
   private int value;
   private int count;

   public Values(int value, int count)
   {
      this.value = value;
      this.count = count;
   }

   public int getValue()
   {
      return value;
   }

   public int getCount()
   {
      return count;
   }

   public void setValue(int value)
   {
      this.value = value;
   }

   public void setCount(int count)
   {
      this.count = count;
   }
}