public class Circle extends Shape
{
   private double radius;

   public Circle(double radius) {
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
      return "A circle with a radius of " + radius + " and an area of " + getArea();
   }
}