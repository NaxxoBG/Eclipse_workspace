import java.util.ArrayList;

public class Drawing
{
   private ArrayList<Shape> shapes;

   public Drawing() {
      shapes = new ArrayList<Shape>();
   }

   public void addShape(Shape shape) {
      shapes.add(shape);
   }

   public int getNumberOfShapes() {
      return shapes.size();
   }

   public Shape getShape(int index) {
      return shapes.get(--index);
   }

   public double getTotalArea() {
      double total = 0;
      for (Shape shape : shapes) {
         total += shape.getArea();
      }
      return total;
   }

   public Shape getLargestShape() {
      double largest = shapes.get(0).getArea();
      for (Shape shape : shapes) {
         if (shape.getArea() > largest) {
            largest = shape.getArea();
         }
         if (shape.getArea() == largest) {
            return shape;
         }
      }
      return null; 
   }
}