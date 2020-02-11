
public class Cellphone_Test
{
   public static void main(String[] args)
   {
      //No-arg constructor(User sets parameter values)
      CellPhone phone1 = new CellPhone(); 
      //Constructor(Direct parameter setting on declaration)  
      CellPhone phone2 = new CellPhone("Sony", "Xperia", 500);

      System.out.println(phone1.getRetailPrice());

      System.out.println(phone2.getModel());
   }
}