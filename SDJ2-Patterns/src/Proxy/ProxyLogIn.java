package Proxy;

public class ProxyLogIn implements Authentication
{
   AccessLogIn logIn;

   public ProxyLogIn(){
      logIn = new AccessLogIn();
   }

   public boolean checkPassword(String userName, String password) {
      return logIn.checkPassword(userName, password);
   }
}