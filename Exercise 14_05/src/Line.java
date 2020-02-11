public class Line
{
   private String colour;
   private Point pointA;
   private Point pointB;

   public Line(String colour, Point pointA, Point pointB)
   {
      this.colour = colour;
      this.pointA = pointA;
      this.pointB = pointB;
   }

   public Line(Point pointA, Point pointB) {
      this.pointA = pointA;
      this.pointB = pointB;
      colour = "Not defined";
   }

   public void setColour(String colour) {
      this.colour = colour;
   }

   public String getColour() {
      return String.format("The colour is %s" ,colour);
   }

   public void setPointA(Point point) {
      this.pointA = point;
   }

   public void setPointB(Point point) {
      this.pointB = point;
   }

   public Point getPointA() {
      return pointA;
   }

   public Point getPointB() {
      return pointB;
   }

   public double getLength() {

      double length = Math.sqrt(Math.pow(pointB.getX() - pointA.getX(), 2) + (Math.pow(pointB.getY() - pointA.getY(), 2)));
      return length;
   }

   public String toString() {
      return "A " + colour + " line from " + pointA + " to " + pointB + " with length equal to " + getLength();
   }

   public boolean equals(Object obj) {
      if (!(obj instanceof Line)) {
         return false;
      } else {
         Line other = (Line) obj;
         return colour.equals(other.getColour()) && pointA == other.getPointA() && pointB == other.getPointB();
      }
   }

   public double getSlope() {
      double m = (pointB.getY() - pointA.getY())/(pointB.getX() - pointA.getX());
      return m;
   }

   public double getYIntercept() {
      double result = pointA.getY() - getSlope() * pointA.getX();
      return result;
   }

   public String getSlopeIntercept() {
      double result = pointA.getY() - (getSlope() * pointA.getX());
      return pointA.getY() + " = " + getSlope() + " * " + pointA.getX() + " + " + result;
   }

   public boolean equalSlopeIntercept(Line obj) {
      if (!(obj instanceof Line)) {
         return false;
      } else {
         Line other = (Line) obj;
         return getSlope() == other.getSlope() && pointA.getY() == other.pointA.getY() && getSlope() == other.getSlope() && pointA.getX() == other.pointA.getX();
      }
   }
}