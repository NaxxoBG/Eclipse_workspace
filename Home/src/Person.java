public class Person
{
   private String name;
   private Home home;

   public Person(String name, Home home) {
      this.name = name;
      this.home = home;
   }

   public String toString() {
      return String.format("%s is living in %s ", name, home.getInfo());
   }

   public String getHomeInfo() {
      return String.format("Home is %s", home.getInfo());
   }
}