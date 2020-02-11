package Proxy;

public class Main
{
   public static void main(String[] args) {
      ProxyLogIn logIn = new ProxyLogIn();
      System.out.println(logIn.checkPassword("atanas", "123"));
   }
}