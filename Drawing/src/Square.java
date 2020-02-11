public class Square extends Shape
{
   private double sideLength;

   public Square(double sideLength) {
      this.sideLength = sideLength;
   }

   public double getSideLength() {
      return sideLength;
   }

   public void setSideLength(double sideLength) {
      this.sideLength = sideLength;
   }

   public double getArea() {
      return Math.pow(sideLength, 2);
   }

   public String toString() {
      return "A square with a side of " + sideLength + " and an area of " + getArea();
   }
}