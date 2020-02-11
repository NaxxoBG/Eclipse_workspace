import java.util.Arrays;

public class Shape_Test
{
   public static void main(String[] args)
   {
      TwoDimensionalShape[] shapes = new TwoDimensionalShape[3];

      shapes[0] = new Circle(1,4,2);
      shapes[1] = new Rectangle(2,5,3,6);
      shapes[2] = new Triangle(8, 6, 3, 4, 5);

      TwoDimensionalShape circle = new Circle(1,4,2);

      for (int i = 0; i < shapes.length; i++) {
         System.out.println(shapes[i].getArea());
      }

      System.out.println(Arrays.toString(shapes));
      System.out.println(shapes[0].equals(circle));
   }
}