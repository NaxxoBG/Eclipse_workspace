public class Cake_Test
{
   public static void main(String[] args)
   {
      Cake cake = new Cake("Choco", 400);
      Cake cake2 = new Cake("Vanilla", 600);
      
      System.out.println("Cake 1 name - " + cake.getName());
      System.out.println("Cake 1 weight - " + cake.getWeight());
      System.out.println("Cake 2 name - " + cake2.getName());
      System.out.println("Cake 2 weight - " + cake2.getWeight());
      System.out.println("Eating 50% of cake 1");
      cake.eatPercentageAmount(50);
      System.out.println("Cake 1 weight - " + cake.getWeight());
      System.out.println("Is Cake 1 gone - " + cake.isCakeGone());
      System.out.println("Is Cake 2 gone - " + cake2.isCakeGone());
      System.out.println("Making a rumball cake from cake and cake2");
      Cake rumCake = Cake.makeRumBall(cake, cake2);
      System.out.println("Is Cake 1 gone - " + cake.isCakeGone());
      System.out.println("Is Cake 2 gone - " + cake2.isCakeGone());
      System.out.println("Cake 1 weight - " + cake.getWeight());
      System.out.println("Rumcake weight - " + rumCake.getWeight());
      System.out.println("Cake 2 amount left - " + cake2.getAmountLeft());
   }
}