import java.util.Scanner;
public class Rectangle
{
   Scanner input = new Scanner(System.in);
   public double length;
   public double width;
   public double area;
   public int count = 1,count2 = 1;
   
   public Rectangle(double length, double width, double area) 
   {
      this.length = length;
      this.width = width;
      this.area = getArea();
   }
   public void setLength(double length) 
   {
      length = input.nextDouble();
   }
   public void setWidth(double width) 
   {
      width = input.nextDouble();
   }
   public void setArea() 
   {
      area = width * length;
   }

   public double getArea()
   {
      double area = length * width;
      return area;
   }
   public double getLength()
   {
      System.out.println(count++ + ". Please enter length:");
      double length = input.nextDouble();
      return length;
   }
   public double getWidth()
   {
      System.out.println(count++ +". Please enter width:\n-------------------------------------");
      double width = input.nextDouble();
      return width;
   }
}