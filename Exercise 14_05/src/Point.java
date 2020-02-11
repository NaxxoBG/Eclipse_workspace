
public class Point
{
   private double x;
   private double y;

   public Point(double x, double y) {
      this.x = x;
      this.y = y;
   }

   public double getX() {
      return x;
   }

   public double getY() {
      return y;
   }

   public void moveTo(double newX, double newY) {
      x = newX;
      y = newY;
   }

   public void move(double xDistance, double yDistance) {
      x += xDistance;
      y += yDistance;    
   }

   public Point copy() {
      return new Point(x, y);
   }

   public String toString() {
      return "(" + x + ", " + y + ")";
   }

   public boolean equals(Point obj) {
      if (!(obj instanceof Point)) {
         return false;
      } else {
         Point other = (Point) obj;
         return x == other.getX() && y == other.getY();
      }
   }
}