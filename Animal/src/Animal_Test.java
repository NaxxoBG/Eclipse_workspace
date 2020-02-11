public class Animal_Test
{
   public static void main(String[] args)
   {
      Pet cat = new Cat();
      Animal bee = new Bee();
      Animal frog = new Frog();
      Animal dog = new Dog();

      Animal[] animals = {cat, bee, frog, dog};

      for (Animal animal : animals) {
         System.out.println(animal.speak());
      }
   }
}