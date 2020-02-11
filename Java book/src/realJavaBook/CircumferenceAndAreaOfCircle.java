package realJavaBook;

public class CircumferenceAndAreaOfCircle
{
   public static void main(String[] args) {
      double radius = 2.6;
      double circatire = 2 * Math.PI * radius;
      double area = Math.PI * Math.pow(radius, 2);
      System.out.println("The circumference is " + circatire  + " and the area is " + area + "cm.");
   }
}