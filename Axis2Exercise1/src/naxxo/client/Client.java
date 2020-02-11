package naxxo.client;

import java.rmi.RemoteException;
import java.text.DecimalFormat;

import org.apache.axis2.AxisFault;

import naxxo.stub.ServUtilsStub;

public class Client
{
   private static ServUtilsStub stub;
   private static final String URL = "http://localhost:8080/axis2/services/ServUtils";

   public static double averageOfThree(double a, double b, double c) throws RemoteException {
      setStub();
      ServUtilsStub.AverageOfThree average = new ServUtilsStub.AverageOfThree();
      average.setArgs0(a);
      average.setArgs1(b);
      average.setArgs2(c);
      ServUtilsStub.AverageOfThreeResponse aotRes = stub.averageOfThree(average);
      return round(aotRes.get_return());
   }

   public static double averageOfTwo(double a, double b) throws RemoteException {
      setStub();
      ServUtilsStub.AverageOfTwo average = new ServUtilsStub.AverageOfTwo();
      average.setArgs0(a);
      average.setArgs1(b);
      ServUtilsStub.AverageOfTwoResponse aotRes = stub.averageOfTwo(average);
      return round(aotRes.get_return());
   }

   public static String reverse(String stringToReverse) throws RemoteException {
      setStub();
      ServUtilsStub.Reverse average = new ServUtilsStub.Reverse();
      average.setArgs0(stringToReverse);
      ServUtilsStub.ReverseResponse aotRev = stub.reverse(average);
      return aotRev.get_return();
   }

   public static boolean isLeapYear(int year) throws RemoteException {
      setStub();
      ServUtilsStub.IsLeapYear isLeap = new ServUtilsStub.IsLeapYear();
      isLeap.setArgs0(year);
      ServUtilsStub.IsLeapYearResponse isLeapRes = stub.isLeapYear(isLeap);
      return isLeapRes.get_return();
   }

   private static void setStub() throws AxisFault {
      if (stub == null) {
         stub = new ServUtilsStub(URL);
      }
   }

   private static double round(double num) {
      return Double.parseDouble(new DecimalFormat("0.00").format(num));
   }

   public static void main(String[] args) throws RemoteException {
      System.out.println("AverageOfThree: " + averageOfThree(2, 2.5, 2));
      System.out.println("AverageOfTwo: " + averageOfTwo(21, 75.3));
      System.out.println("Reverse: " + reverse("Is this reversed"));
      System.out.println("IsLeapYear: " + isLeapYear(2012));
   }
}