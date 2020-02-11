public abstract class TwoDimensionalShape
{
   private double x;
   private double y;

   public TwoDimensionalShape(double x, double y) {
      this.x = x;
      this.y = y;
   }

   public double getX()
   {
      return x;
   }

   public double getY()
   {
      return y;
   }

   public void moveTo(double x, double y) {
      this.x += x;
      this.y += y;
   }
   
   public boolean equals(Object o) {
      if (!(o instanceof TwoDimensionalShape)) {
         return false;
      } else {
         TwoDimensionalShape other = (TwoDimensionalShape) o;
         return x == other.x && y == other.y;
      }
   }

   public abstract double getArea();
}