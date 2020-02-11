public class MyList_Test
{
   public static void main(String[] args)
   {
      String item1 = "Chips";
      String item2 = "Vegetables";
      String item3 = "Cheese";

      MyList list = new MyList();
      MyList emptyList = new MyList();

      list.addItem(item1);
      list.addItem(item2);
      list.addItem(item3);

      System.out.println(list);
      System.out.println(emptyList);

      System.out.println(list.removeItem(0));
      System.out.println(list);
      System.out.println(list.removeItem(item2));
      System.out.println(list);

      Brain brain = new Brain();
      Brain brain1 = new Brain(list);
      System.out.println(brain1);
      brain1.addMemory("Fish");
      brain1.addMemory("Flour");
      brain1.addMemory("Beans");
      System.out.println(brain1);
      System.out.println(brain1.forget("Fish"));
      System.out.println(brain1.forget("Beans"));
      System.out.println(brain1);
      System.out.println(brain);
      brain.addMemory("Pepper");
      System.out.println(brain);
      System.out.println(brain.remember("Pepper"));
      System.out.println(list.contains("Cheese"));
   }
}