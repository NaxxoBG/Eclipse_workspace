public abstract class Person
{
   private String name;
   private String work;

   public Person(String name, String work) {
      this.name = name;
      this.work = work;
   }
   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }
   public String getWork() {
      return work;
   }
   public void setWork(String work) {
      this.work = work;
   }

   public boolean equals(Object arg) {
      if (!(arg instanceof Person)) {
         return false;
      } else {
         Person other = (Person) arg;
         return name.equals(other.name) && work.equals(other.work);
      }
   }

   public String toString() {
      return String.format("\nName: %s\nWork: %s", name, work);
   }
}