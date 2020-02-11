public class Rectangle extends TwoDimensionalShape
{
   private double height;
   private double width;
   public Rectangle(double x, double y, double height, double width)
   {
      super(x, y);
      this.height = height;
      this.width = width;
   }
   public double getHeight()
   {
      return height;
   }
   public double getWidth()
   {
      return width;
   }

   public void setSides(double width, double height) {
      this.height = height;
      this.width = width;
   }

   public double getArea() {
      return height * width;
   }

   public String toString() {
      return String.format("\nA rectagle with an area equal to %s", getArea());
   }

   public boolean equals(Object o) {
      if (!(o instanceof Rectangle)) {
         return false;
      } else {
         Rectangle other = (Rectangle) o;
         return super.equals(other) && height == other.height && width == other.width;
      }
   }
}