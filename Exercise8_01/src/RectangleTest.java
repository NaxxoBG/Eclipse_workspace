public class RectangleTest
{
   public static void main(String[] args)
   {
      
      Rectangle rec1 = new Rectangle(0,0,0);
      Rectangle rec2 = new Rectangle(6,5,0);   
          
      rec1.length = rec1.getLength();
      rec1.width = rec1.getWidth();
          
        
      System.out.println("The area of the first rectangle is " + rec1.getArea() + " and the area of the second rectangle is " + rec2.area + ".");
   }
}