public class Circle
{
   private double radius;
   private Point centerPoint;

   public Circle(double radius, Point centerPoint) {

      this.radius = radius;
      this.centerPoint = centerPoint;
   }

   public double getRadius() {

      return radius;
   }

   public Point getCenterPoint() {
      
      return centerPoint;
   }
   
   public double getArea() {
      
      return Math.PI * Math.pow(radius, 2);
   }
   
   public String toString() {
      
      return "The area is " + getArea() + ".";
   }
   
   public boolean equals(Circle object) {
      
      if (!(object instanceof Circle)) {
         
         return false;
      } else {
         
         Circle other = (Circle) object;
         return radius == other.getRadius() && centerPoint == other.getCenterPoint();
      } 
   }
}