import java.util.Scanner;
public class Car
{
   Scanner input = new Scanner(System.in);
   public String colour, owner, regnumber;
   
   public Car(String colour, String owner, String regnumber) 
   {
      this.colour = colour;
      this.owner = owner;
      this.regnumber = regnumber;
   }
   
   public String getColour()
   {
   System.out.println("Enter colour:");
   colour = input.nextLine();
   return colour;
   }
   public String getOwner() 
   {
      System.out.println("Enter owner:");
      owner = input.nextLine();
      return owner;
   }
   public String getRegnumber() 
   {
      System.out.println("Enter registration number:");
      regnumber = input.nextLine();
      return regnumber;
   }
}