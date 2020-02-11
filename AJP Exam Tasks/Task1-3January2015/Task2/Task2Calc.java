package Task2;

import java.util.Arrays;

public class Task2Calc
{
   public static double mean(double[] data) {
      double sum = 0;
      for (int i = 0; i < data.length; i++) {
         sum += data[i];
      }
      return sum / data.length;
   }

   public static double median(double[] data) {
      Arrays.sort(data);
      if (data.length % 2 == 0) {
         return (data[data.length / 2] + data[(data.length / 2) - 1]) / 2;
      } else {
         return data[(int) Math.ceil(data.length / 2)];
      }
   }

   public static double deviation(double[] data) {
      double deviation = 0;
      for (int i = 0; i < data.length; i++) {
         deviation += Math.pow(data[i] - mean(data), 2);
      }
      return Math.sqrt(deviation / (data.length - 1));
   }

   public static void main(String[] args) {
      double[] arr = {4, 5, 7, 2, 1};
      System.out.println(median(arr) + " median");
      System.out.println(mean(arr) + " mean");
      System.out.printf("%.2f deviation", deviation(arr));
   }
}