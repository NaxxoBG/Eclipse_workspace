
public class Triangle extends TwoDimensionalShape
{
   private double sideA;
   private double sideB;
   private double sideC;

   public Triangle(double x, double y, double sideA, double sideB, double sideC) {
      super(x, y);
      this.sideA = sideA;
      this.sideB = sideB;
      this.sideC = sideC;
   }

   public double getSideA() {
      return sideA;
   }

   public double getSideB() {
      return sideB;
   }

   public double getSideC() {
      return sideC;
   }

   public void setSides(double x, double y, double sideA, double sideB, double sideC) {
      this.sideA = sideA;
      this.sideB = sideB;
      this.sideC = sideC;
   }

   public double getArea() {
      double s = (sideA + sideB + sideC) / 2;
      double area = Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
      return area;
   }
   
   public String toString() {
      return String.format("\nA triangle with an area equal to %s", getArea());
   }
   
   public boolean equals(Object o) {
      if (!(o instanceof Triangle)) {
         return false;
      } else {
         Triangle other = (Triangle) o;
         return super.equals(other) && sideA == other.sideA && sideB == other.sideB && sideC == other.sideC;
      }
   }
}