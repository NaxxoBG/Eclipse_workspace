package Chapter_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import org.apache.commons.lang3.ArrayUtils;

public class Exercise_5V2
{
   public static HashMap<Integer, ArrayList<Integer>> streaksOfNums(int[] array) {
      int key = 1;
      HashMap<Integer, ArrayList<Integer>> listWithStreaks = new HashMap<Integer, ArrayList<Integer>>();
      ArrayList<Integer> list = new ArrayList<>();
      int count = 1, max = 1;

      for (int i = 0; i < array.length - 1; i++) {
         for (int j = i + 1; j < array.length; j++) {
            if (array[i] > array[j]) {
               list.add(array[i]);
               listWithStreaks.put(key++, list);
               list = new ArrayList<>();
               break;
            } else {
               list.add(array[i]);
               i++;
               count++;
            }
         }
         if (count > max) {
            max = count;
            count = 1;
         }
      }
      int index = array.length - 1;
      if (array[index] >= array[index - 1]) {
         list.add(array[index]);
         listWithStreaks.put(key, list);
      } else if (array[index] < array[index - 1]) {
         ArrayList<Integer> lister = new ArrayList<Integer>();
         lister.add(array[index]);
         listWithStreaks.put(key, lister);
      }
      return listWithStreaks;
   }

   public static HashMap<Integer, ArrayList<Integer>> streaksOfNumsV2(int[] array) {
      int key = 1;
      HashMap<Integer, ArrayList<Integer>> listWithStreaks = new HashMap<Integer, ArrayList<Integer>>();
      ArrayList<Integer> list = new ArrayList<>();
      int count = 1, max = 1;

      for (int i = 0, j = 1; i <= array.length - 2; i++, j = i + 1) {
         if (array[i] > array[j]) {
            list.add(array[i]);
            listWithStreaks.put(key++, list);
            list = new ArrayList<>(); 
         } else {
            list.add(array[i]);
            count++;
         }
         if (count > max) {
            max = count;
            count = 1;
         }
      }
      int index = array.length - 1;
      if (array[index] >= array[index - 1]) {
         list.add(array[index]);
         listWithStreaks.put(key, list);
      } else if (array[index] < array[index - 1]) {
         ArrayList<Integer> lister = new ArrayList<Integer>();
         lister.add(array[index]);
         listWithStreaks.put(key, lister);
      }
      return listWithStreaks;
   }

   public static <K, V> void printEntries(Map<K, V> map) {
      for (Entry<K, V> keyset : map.entrySet()) {
         System.out.println(keyset);
      }
   }

   public static LinkedHashMap<Integer, ArrayList<Integer>> sortMapValues(HashMap<Integer, ArrayList<Integer>> map) {
      Comparator<Entry<Integer, ArrayList<Integer>>> valueComparator = new Comparator<Entry<Integer,ArrayList<Integer>>>() {

         public int compare(Entry<Integer, ArrayList<Integer>> o1, Entry<Integer, ArrayList<Integer>> o2) {
            Integer size1 = o1.getValue().size();
            Integer size2 = o2.getValue().size();
            return size2.compareTo(size1);
         }
      };

      ArrayList<Entry<Integer, ArrayList<Integer>>> listOfEntries = new ArrayList<Entry<Integer, ArrayList<Integer>>>(map.entrySet());
      Collections.sort(listOfEntries, valueComparator);
      LinkedHashMap<Integer, ArrayList<Integer>> sorted = new LinkedHashMap<Integer, ArrayList<Integer>>(listOfEntries.size());

      for (Entry<Integer, ArrayList<Integer>> entry : listOfEntries) {
         sorted.put(entry.getKey(), entry.getValue());
      }

      return sorted;
   }

   public static double nanoToDouble(double time) {
      return time / 1000000;
   }

   public static ArrayList<Integer> generateRandomList(int size) {
      ArrayList<Integer> list = new ArrayList<Integer>();
      for (int i = 0; i < size; i++) {
         list.add(i);
      }
      Collections.shuffle(list);
      return list;
   }

   public static int[] randomIntArray(int size) {
      return ArrayUtils.toPrimitive(generateRandomList(size).toArray(new Integer[generateRandomList(size).size()]));
   }

   public static <V, K> Optional<Entry<V, K>> getMaxEntry(Map<V, K> map) {
      return map.entrySet().stream().findFirst();
   }

   public static <V, K extends List<V>> int getLengthOfMaxEntry(Map<V, K> map) {
      return map.entrySet().stream().findFirst().get().getValue().size();
   }

   public static <V,K extends List<V>> void printLongestValues(Map<V, K> map) {
      Optional<String> test = map.entrySet().stream().filter(e -> e.getValue().size() == getLengthOfMaxEntry(map)).map(e -> e.toString()).reduce((t, g) -> t + " <--AND--> " + g);
      test.ifPresent(System.out::println);
   }

   public static void main(String[] args) {
      int[] array = randomIntArray(50);
      System.out.println("Array is ".concat(Arrays.toString(array)));
      System.out.println("\nA map with all number streaks:\n");

      long a = System.nanoTime();
      streaksOfNums(array);
      long b = System.nanoTime();
      double elapsedTime = b - a;
      double mseconds = nanoToDouble(elapsedTime);

      long c = System.nanoTime();
      streaksOfNumsV2(array);
      long d = System.nanoTime();
      double elapsedTimeV2 = d - c;
      double msecondsV2 = nanoToDouble(elapsedTimeV2);

      System.out.println("Execution Time streakOfNums(): " + mseconds + " ms");
      System.out.println("Execution Time streakOfNumsV2(): " + msecondsV2 + " ms");
      System.out.println();
      System.out.println("The entries are: " + streaksOfNums(array));
      System.out.println();
      printEntries(streaksOfNums(array));

      LinkedHashMap<Integer, ArrayList<Integer>> sortedMap = sortMapValues(streaksOfNums(array));
      System.out.println("-------------And sorted-------------");
      printEntries(sortedMap);
      System.out.println();
      System.out.println("Longest streak is " + getMaxEntry(sortedMap) + " with a length of " + getLengthOfMaxEntry(sortedMap));
      printLongestValues(sortedMap);
   }
}