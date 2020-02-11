package java8;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

//Different strategies for behaviour parameterization (Strategy design pattern)
interface FancyApplePrinter {
   public String toString(Apple apple);
}

@FunctionalInterface
interface TriFunction<G, V, S> {
   S apply(G g, V v);
}

class PrintAppleWeight implements FancyApplePrinter{
   @Override
   public String toString(Apple apple) {
      return Integer.toString(apple.getWeight());
   }
}

class PrintAppleColor implements FancyApplePrinter{
   @Override
   public String toString(Apple apple) {
      return apple.getColor();
   }
}
//


public class Apple
{
   private String color;
   private int weight;

   public Apple() {}

   public Apple(int weight) {
      this.weight = weight;
   }

   public Apple(String color, int weight) {
      this.color = color;
      this.weight = weight;
   }

   public static Apple newInstance(String color, int weight) {
      return new Apple(color, weight);
   }

   public String getColor() {
      return color;
   }

   public int getWeight() {
      return weight;
   }

   public void setColor(String color) {
      this.color = color;
   }

   public void setWeight(int weight) {
      this.weight = weight;
   }

   @Override
   public String toString() {
      return "Apple Color: " + color + ", Weight: " + weight + "\n";
   }

   public static void prettyPrintApple(List<Apple> inventory, FancyApplePrinter p) {
      for (Apple apple : inventory) {
         String output = p.toString(apple);
         System.out.println(output);
      }
   }

   //Comparison methods used with Predicate

   public static boolean isGreenApple(Apple apple) {
      return "green".equals(apple.getColor());
   }

   public static boolean isRedApple(Apple apple) {
      return "red".equals(apple.getColor());
   }

   public static boolean isHeavyApple(Apple apple) {
      return apple.getWeight() > 150;
   }

   /**Filters and returns a list of apples based on the provided predicates. In the end
    * the list will contain only the Apple objects that satifty all the passed predicates
    * @param inventory
    * @param p
    * @return {@code List<Apple>}
    * @author Naxxo
    */
   @SafeVarargs
   public static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple>... p) {
      boolean checker;
      List<Apple> result = new ArrayList<>();
      for (Apple apple : inventory) {
         for (int i = 0; i < p.length; i++) {
            checker = p[i].test(apple);
            if (!checker && i == p.length - 1 || !checker) {
               break;
            } else if (i == p.length - 1) {
               result.add(apple);
            }
         }
      }
      return result;
   }

   /**This method applies the passed function {@code BiFunction<String, Integer, Apple>} with the {@code List<Entry<String, Integer>>}
    * and returns a new list.
    * @param numList
    * @param f
    * @return {@code List<Apple>}
    */
   public static List<Apple> map(List<Entry<String, Integer>> weightsAndColors, BiFunction<String, Integer, Apple> f) {
      List<Apple> modifiedList = new ArrayList<>();
      for (Entry<String, Integer> num : weightsAndColors) {
         modifiedList.add(f.apply(num.getKey(), num.getValue()));
      }
      return modifiedList;
   }

   public static void main(String[] args) {
      List<Apple> apples = new ArrayList<>();
      apples.add(Apple.newInstance("red", 70));
      apples.add(Apple.newInstance("green", 157));
      apples.add(Apple.newInstance("yellow", 84));
      apples.add(Apple.newInstance("green", 50));
      apples.add(Apple.newInstance("red", 170));
      apples.add(Apple.newInstance("green", 160));

      //testing the strategy design pattern
      prettyPrintApple(apples, new FancyApplePrinter() {
         @Override
         public String toString(Apple apple) {
            return apple.getWeight() + ", " + apple.getColor();
         }
      });
      prettyPrintApple(apples, new PrintAppleColor());
      prettyPrintApple(apples, new PrintAppleWeight());

      //All Apples
      System.out.println("--------------------All Apples--------------------");
      System.out.println(apples);

      //Only green apples
      System.out.println("--------------------Green Apples--------------------");
      System.out.println(filterApples(apples, Apple::isGreenApple));

      //Only heavy apples
      System.out.println("--------------------Heavy Apples--------------------");
      System.out.println(filterApples(apples, Apple::isHeavyApple));

      //Only red apples
      System.out.println("--------------------Red Apples--------------------");
      System.out.println(filterApples(apples, Apple::isRedApple));

      //Only red apples
      System.out.println("--------------------Red Apples--------------------");
      System.out.println(apples.parallelStream().filter(e -> e.getColor().equals("red")).collect(Collectors.toList()));

      //Only green and heavy apples
      System.out.println("--------------------Green and Heavy Apples--------------------");
      System.out.println(filterApples(apples, Apple::isGreenApple, Apple::isHeavyApple));

      //Only red and heavy apples
      System.out.println("--------------------Red and Heavy Apples--------------------");
      System.out.println(filterApples(apples, Apple::isRedApple, Apple::isHeavyApple));

      //Only red and heavy apples
      System.out.println("--------------------Red and Heavy Apples--------------------");
      System.out.println(apples.parallelStream().filter(e -> "red".equals(e.getColor()) && e.getWeight() > 150).collect(Collectors.toList()));

      //Sorting a collection using an anonymous class
      apples.sort(new Comparator<Apple>() {
         @Override
         public int compare(Apple o1, Apple o2) {
            return new Integer(o1.getWeight()).compareTo(o2.getWeight());
         }
      });

      //Sorting a collection using lambda
      apples.sort((Apple a, Apple b) -> new Integer(a.getWeight()).compareTo(b.getWeight()));

      //Sorting a collection with a method reference
      apples.sort(Comparator.comparing(Apple::getWeight).reversed());
      System.out.println(apples);

      //Sorting with Comparator.comparing()
      apples.sort(Comparator.comparing(Apple::getWeight));
      System.out.println(apples);

      //Instantiating an object with method referencing
      Supplier<Apple> supplier = Apple::new;
      System.out.println(supplier.get());

      TriFunction<String, Integer, Apple> appleCreator = Apple::new;
      System.out.println(appleCreator.apply("yellow", 175));

      //Testing the map function
      List<Integer> weights = Arrays.asList(150, 200, 90, 140);
      List<String> colors = Arrays.asList("Yellow", "Red", "Green", "Red");
      List<Entry<String, Integer>> weightsAndColors = new ArrayList<>();
      for (int i = 0; i < weights.size(); i++) {
         weightsAndColors.add(new AbstractMap.SimpleEntry<String, Integer>(colors.get(i), weights.get(i)));
      }

      System.out.println("The list of apples created using the map() method is:");
      List<Apple> newApples = map(weightsAndColors, Apple::new);
      System.out.println(newApples);

      //Creating a comparator
      Comparator<Apple> c = Comparator.comparing(Apple::getWeight);
      apples.sort(c.reversed().thenComparing(Apple::getColor));

      //Combining predicates
      Predicate<Apple> red = e -> e.getColor().equalsIgnoreCase("red");
      Predicate<Apple> redAndHeavy = red.and(e -> e.getWeight() > 150);
      Predicate<Apple> redAndHeavyOrGreen = red.and(e -> e.getWeight() > 150).or(e -> e.getColor().equalsIgnoreCase("green"));
      System.out.println("--------------------Red-and-Heavy-Apples-------------------");
      apples.parallelStream().filter(redAndHeavy).forEach(System.out::println);
      System.out.println("--------------------Red-and-Heavy-Apples-Or-Green-With-Predicate-------------------");
      apples.parallelStream().filter(redAndHeavyOrGreen).forEach(System.out::println);

      //Composing functions
      Function<Integer, Integer> inc = e -> e += 1;
      Function<Integer, Integer> mult = e -> e * 2;
      Function<Integer, Integer> incAndMult = inc.andThen(mult);
      System.out.println(incAndMult.apply(15));
      
      // peek() intermediate stream method that allows for the mutation of each element in a collection
      // apples.parallelStream().peek(e -> e.setWeight(100)).forEach(System.out::println);
      // System.out.println(apples);
   }
}