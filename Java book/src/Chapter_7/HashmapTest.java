package Chapter_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class HashmapTest
{
   public static void main(String[] args) {
      //*******************************************Testing insertion of entries in a HashMap**************************************
      HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

      ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1,4,1,2,56,6));

      ArrayList<Integer> arr1 = new ArrayList<Integer>(Arrays.asList(4,53,1,6,9,2,3));

      ArrayList<Integer> arr2 = new ArrayList<Integer>(Arrays.asList(34,62,125,8,34));

      ArrayList<ArrayList<Integer>> listOfLists = new ArrayList<ArrayList<Integer>>(Arrays.asList(arr, arr1, arr2));

      for (int i = 0; i < 3; i++) {
         map.put(i, listOfLists.get(i));
      }

      System.out.println(map);
      //*******************************************Getting streaks of numbers in ascending order**********************************
      int[] array = {0, 0, 2, 5, 12, 4, 6, 3, 3, 2, 54, 65, 87, 98, 100, 4, 5, 6, 7, 0, 45, 23, 4, 64, 78, 9};
      int key = 1;
      ArrayList<Integer> list = new ArrayList<Integer>();
      HashMap<Integer, ArrayList<Integer>> listWithStreaks = new HashMap<Integer, ArrayList<Integer>>();
      for (int i = 0, j = 1; i <= array.length - 2; i++, j=i+1) {
         if (array[i] > array[j]) {
            list.add(array[i]);
            listWithStreaks.put(key++, list);
            list = new ArrayList<>(); 
         } else {
            list.add(array[i]);
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
      System.out.println(listWithStreaks);
   }
}