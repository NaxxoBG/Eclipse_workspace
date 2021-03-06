
public class TestCircle
{
   public static void main(String[] args)
   {
      //Declaring point
      Point point3 = new Point(3,7);
      Point point4 = new Point(3,7);
      //Declaring a circle with the already declared point
      Circle circle1 = new Circle(5, point3);

      System.out.println(circle1);
      System.out.println(circle1.getCenterPoint());
   
      Circle circle2 = new Circle(5, point4);
   
      System.out.println(point3.equals(point4));
      System.out.println(circle1.equals(circle2));
   }
}