public class Circle extends TwoDimensionalShape
{
   private double radius;

   public Circle(double x, double y, double radius) {
      super(x, y);
      this.radius = radius;
   }

   public double getRadius() {
      return radius;
   }

   public void setRadius(double radius) {
      this.radius = radius;
   }

   public double getArea() {
      return Math.PI * Math.pow(radius, 2);
   }
   
   public String toString() {
      return String.format("\nA circle with an area equal to %s", getArea());
   }
   
   public boolean equals(Object o) {
      if (!(o instanceof Circle)) {
         return false;
      } else {
         Circle other = (Circle) o;
         return super.equals(other) && radius == other.radius;
      }
   }
}