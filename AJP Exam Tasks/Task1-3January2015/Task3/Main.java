package Task3;

public class Main
{
   public static void main(String[] args) {
      PizzaMethods pizza = new PizzaMethods(8);

      Thread member1 = new Thread(new TeamMember("Bill", pizza));
      member1.start();
      Thread member2 = new Thread(new TeamMember("Louis", pizza));
      member2.start();
      Thread member3 = new Thread(new TeamMember("Francis", pizza));
      member3.start();
      Thread member4 = new Thread(new TeamMember("Nick", pizza));
      member4.start();
      Thread master = new Thread(new ScrumMaster("Coach", pizza));
      master.start();
      Thread deliveryBoy = new Thread(new PizzaGuy("Ellis", pizza));
      deliveryBoy.start();
   }
}