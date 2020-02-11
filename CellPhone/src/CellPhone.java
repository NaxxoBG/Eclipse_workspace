import java.util.Scanner;
public class CellPhone
{
   Scanner input = new Scanner(System.in);
   private String manufact;
   private String model;
   private double retailPrice;
   //Constructor with direct parameter setting on declaration
   public CellPhone(String man, String mod, double price) {
      manufact = man;
      model = mod;
      retailPrice = price;
   }
   //No-arg constructor with user input
   public CellPhone() {
      System.out.println("Adding a new phone!");
      System.out.println("Enter a manufacturer:");
      manufact = input.nextLine();
      System.out.println("Enter a model:");
      model = input.nextLine();
      System.out.println("Enter a price:");
      retailPrice = input.nextInt();
   }

   public String getModel()
   {
      return model;
   }

   public void setModel(String mod)
   {
      model = mod;
   }

   public double getRetailPrice()
   {
      return retailPrice;
   }

   public void setRetailPrice(double price)
   {
      retailPrice = price;
   }

   public String getManufact()
   {
      return manufact;
   }

   public void setManufact(String man) {

      manufact = man;
   }
}