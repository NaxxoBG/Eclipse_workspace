
public class TestLine
{
   public static void main(String[] args)
   {
      Point lpoint1 = new Point(3,1);
      Point lpoint2 = new Point(7,4);

      Line line1 = new Line("red", lpoint1, lpoint2);
      Line line2 = new Line("red", lpoint1, lpoint2);

      System.out.println(line1);
      System.out.println(line2);

      System.out.println();

      System.out.println(line1.getSlopeIntercept());
      System.out.println(line2.getSlopeIntercept());
      System.out.println("-------------------------");
      System.out.println(line1.getSlope());
      System.out.println("-------------------------");
      System.out.println(line1.getYIntercept());
      System.out.println();

      System.out.println(line1.equalSlopeIntercept(line2));

      System.out.println();

      System.out.println(line1.equals(line2));

      line1.setColour("blue");
      lpoint1.moveTo(10,19);
      System.out.println(line1);
      System.out.println(line1.getSlopeIntercept());
      System.out.println(line1.getSlope());
      System.out.println(line1.getColour());
   }
}