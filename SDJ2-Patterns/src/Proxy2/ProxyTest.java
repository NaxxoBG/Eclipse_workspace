package Proxy2;

public class ProxyTest
{

   public static void main(String[] args) {
      Player player = new Player();

      player.move(2,6);
      player.getExp(10);
      player.move(1,8);

   }
}