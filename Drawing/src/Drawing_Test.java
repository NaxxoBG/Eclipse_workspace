public class Drawing_Test
{
   public static void main(String[] args)
   {
      int index = 2;
      Shape shape1 = new Circle(4);
      Shape shape2 = new Square(5);
      Shape shape3 = new Square(2);

      Drawing drawing = new Drawing();

      drawing.addShape(shape1);
      drawing.addShape(shape2);
      drawing.addShape(shape3);
      System.out.println("\n----------SHAPES----------");
      System.out.println(shape1);
      System.out.println(shape2);
      System.out.println(shape3);
      System.out.println("\n----------LARGEST SHAPE----------");
      System.out.println("The largest shape in the drawing is: " + drawing.getLargestShape());
      System.out.println("\n----------NUMBER OF SHAPES IN THE DRAWING----------");
      System.out.println("The number of shapes in the drawing is " + drawing.getNumberOfShapes());
      System.out.println("\n----------GET A SHAPE WITH AN INDEX OF " + index + "---------");
      try {
         System.out.println(drawing.getShape(index));
      }
      catch (Exception e) {
         System.out.println("\nThe index is wrong for this drawing!");
      }
      System.out.println("\n----------TOTAL AREA OF SHAPES IN THE DRAWING----------");
      System.out.println("The total area of the shapes in the drawing is " + drawing.getTotalArea());
   }
}