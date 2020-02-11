package java8;

import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.averagingDouble;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.reducing;
import static java.util.stream.Collectors.summarizingInt;
import static java.util.stream.Collectors.summingInt;
import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import static java.util.stream.Collectors.*;

public class Dish
{
   private final String name;
   private final boolean vegetarian;
   private final int calories;
   private final Type type;

   public Dish(String name, boolean vegetarian, int calories, Type type) {
      this.name = name;
      this.vegetarian = vegetarian;
      this.calories = calories;
      this.type = type;
   }

   public enum Type {
      MEAT, FISH, OTHER
   }

   public String getName() {
      return name;
   }

   public boolean isVegetarian() {
      return vegetarian;
   }

   public int getCalories() {
      return calories;
   }

   public Type getType() {
      return type;
   }

   @Override
   public String toString() {
      return name;
   }

   public enum CaloricLevel {
      DIET, NORMAL, FAT
   }

   public static void main(String[] args) {
      List<Dish> menu = Arrays.asList(
            new Dish("pork", false, 800, Dish.Type.MEAT),
            new Dish("beef", false, 700, Dish.Type.MEAT),
            new Dish("chicken", false, 400, Dish.Type.MEAT),
            new Dish("french fries", true, 530, Dish.Type.OTHER),
            new Dish("rice", true, 350, Dish.Type.OTHER),
            new Dish("season fruit", true, 120, Dish.Type.OTHER),
            new Dish("pizza", true, 550, Dish.Type.OTHER),
            new Dish("prawns", false, 300, Dish.Type.FISH),
            new Dish("salmon", false, 450, Dish.Type.FISH));

      List<String> threeHighCaloricDishNames = menu.stream()
            .filter(e -> e.calories > 300)
            .map(Dish::getName)
            .limit(3)
            .collect(toList());
      System.out.println(threeHighCaloricDishNames);

      List<Dish> vegetarianMeals = menu.stream()
            .filter(Dish::isVegetarian)
            .collect(toList());
      System.out.println(vegetarianMeals);

      List<Dish> firstTwoMeatDishes = menu.stream()
            .filter(e -> e.getType() == Dish.Type.MEAT)
            .limit(2)
            .collect(toList());
      System.out.println(firstTwoMeatDishes);

      List<Integer> lengthOfDishNames = menu.stream()
            .map(Dish::getName)
            .map(String::length)
            .collect(toList());
      System.out.println(lengthOfDishNames);

      if (menu.stream().anyMatch(Dish::isVegetarian)) {
         System.out.println("The menu is somewhat vegetarian friendly!");
      }

      if (menu.stream().allMatch(e -> e.calories < 1000)) {
         System.out.println("The menu is healthy");
      }

      menu.stream().filter(e -> e.calories > 500 && e.vegetarian).findAny().ifPresent(System.out::println);

      menu.stream().mapToInt(d -> 1).reduce(Integer::sum).ifPresent(System.out::println);

      long howManyDishes = menu.stream().collect(counting());
      System.out.println(howManyDishes);

      Dish highestCalorieDish = menu.parallelStream()
            .max((e, f) -> new Integer(e.getCalories()).compareTo(f.getCalories())).orElse(null);
      Optional<Dish> highestCalDish = menu.stream().collect(maxBy(Comparator.comparing(Dish::getCalories)));
      Optional<Dish> highestCaloriesDish = menu.stream()
            .collect(reducing((f, g) -> f.getCalories() > g.getCalories() ? f : g));
      System.out.println(highestCalorieDish);
      System.out.println(highestCalDish);
      System.out.println(highestCaloriesDish);

      int totalCalories = menu.stream().collect(summingInt(Dish::getCalories));
      int totalCals = menu.stream().collect(reducing(0, Dish::getCalories, Integer::sum));
      System.out.println(totalCalories);
      System.out.println(totalCals);

      double averageCalories = menu.stream().collect(averagingDouble(Dish::getCalories));
      System.out.println(averageCalories);

      IntSummaryStatistics menuStats = menu.stream().collect(summarizingInt(Dish::getCalories));
      System.out.println(menuStats);

      String shortmenu = menu.stream().map(Dish::getName).collect(joining());
      System.out.println(shortmenu);

      String shortMenuProper = menu.stream().map(Dish::getName).collect(joining(", "));
      System.out.println(shortMenuProper);

      Map<Dish.Type, List<Dish>> dishesByType = menu.stream().collect(groupingBy(Dish::getType));
      System.out.println(dishesByType);

      Map<CaloricLevel, List<Dish>> dishesByCaloricLevel = menu.stream().collect(groupingBy(dish -> {
         if (dish.getCalories() <= 400) {
            return CaloricLevel.DIET;
         } else if (dish.getCalories() <= 700) {
            return CaloricLevel.NORMAL;
         } else {
            return CaloricLevel.FAT;
         }
      }));

      System.out.println(dishesByCaloricLevel);

      Map<Dish.Type, Map<CaloricLevel, List<Dish>>> dishesByTypeCaloricLevel = menu.stream()
            .collect(groupingBy(Dish::getType, groupingBy(dish -> {
               if (((Dish) dish).getCalories() <= 400) {
                  return CaloricLevel.DIET;
               } else if (((Dish) dish).getCalories() <= 700) {
                  return CaloricLevel.NORMAL;
               } else {
                  return CaloricLevel.FAT;
               }
            })));

      System.out.println(dishesByTypeCaloricLevel);

      Map<Dish.Type, Long> typesCount = menu.stream().collect(groupingBy(Dish::getType, counting()));
      System.out.println(typesCount);

      Map<Dish.Type, Optional<Dish>> mostCaloricByType = menu.stream()
            .collect(groupingBy(Dish::getType,
                  maxBy(Comparator.comparingInt(Dish::getCalories))));

      System.out.println(mostCaloricByType);

      Map<Dish.Type, Dish> mostCaloricDishByType = menu.stream()
            .collect(groupingBy(Dish::getType, 
                  collectingAndThen(
                        maxBy(comparingInt(Dish::getCalories)), Optional::get)));

      System.out.println(mostCaloricDishByType);

      Map<Dish.Type, Integer> totalCaloriesByType = menu.stream()
            .collect(groupingBy(Dish::getType,
                  summingInt(Dish::getCalories)));
      System.out.println(totalCaloriesByType);

      Map<Dish.Type, Set<CaloricLevel>> caloricLevelsByType = menu.stream()
            .collect(groupingBy(Dish::getType,
                  mapping(
                        dish -> {
                           if (dish.getCalories() <= 400) {
                              return CaloricLevel.DIET;
                           } else if(dish.getCalories() <= 700) {
                              return CaloricLevel.NORMAL;
                           } else {
                              return CaloricLevel.FAT;
                           }
                        }, toCollection(HashSet::new))));

      System.out.println(caloricLevelsByType);

      Map<Boolean, List<Dish>> partitionedMenu = menu.stream().collect(partitioningBy(Dish::isVegetarian));
      System.out.println(partitionedMenu);
      List<Dish> vegetarianDishes = partitionedMenu.get(true);
      System.out.println(vegetarianDishes);

      Map<Boolean, Map<Dish.Type, List<Dish>>> vegetarianDishesByType = menu.stream()
            .collect(partitioningBy(Dish::isVegetarian, groupingBy(Dish::getType)));
      System.out.println(vegetarianDishesByType);

      System.out.println();

      Map<Boolean, Dish> mostCaloricPartitionedByVegetarian = menu.stream()
            .collect(partitioningBy(Dish::isVegetarian, 
                  collectingAndThen(maxBy(comparingInt(Dish::getCalories)), Optional::get)));
      System.out.println(mostCaloricPartitionedByVegetarian);

      System.out.println(menu.stream().collect(collectingAndThen(toList(), List::size)));

      System.out.println(menu.stream().collect(new ToListCollector<>()));

   }
}