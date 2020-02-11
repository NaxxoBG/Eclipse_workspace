/**
 * ServUtilsSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.4  Built on : Oct 21, 2016 (10:47:34 BST)
 */
package naxxo.skeleton;

import java.time.Year;
import java.util.stream.DoubleStream;

import naxxo.AverageOfThreeResponse;
import naxxo.AverageOfTwoResponse;
import naxxo.IsLeapYearResponse;
import naxxo.ReverseResponse;

/**
 *  ServUtilsSkeleton java skeleton for the axisService
 */
public class ServUtilsSkeleton implements ServUtilsSkeletonInterface {
   /**
    * Auto generated method signature
    *
    * @param averageOfThree0
    * @return averageOfThreeResponse1
    */
   public naxxo.AverageOfThreeResponse averageOfThree(naxxo.AverageOfThree averageOfThree0) {
      System.out.println("averageOfThree called");

      AverageOfThreeResponse res = new AverageOfThreeResponse();
      res.set_return(DoubleStream.of(averageOfThree0.getArgs0(), averageOfThree0.getArgs1(), averageOfThree0.getArgs2()).average().getAsDouble());
      return res;
   }

   /**
    * Auto generated method signature
    *
    * @param reverse2
    * @return reverseResponse3
    */
   public naxxo.ReverseResponse reverse(naxxo.Reverse reverse2) {
      System.out.println("reverse called");

      ReverseResponse res = new ReverseResponse();
      res.set_return(new StringBuilder(reverse2.getArgs0()).reverse().toString());
      return res;
   }

   /**
    * Auto generated method signature
    *
    * @param averageOfTwo4
    * @return averageOfTwoResponse5
    */
   public naxxo.AverageOfTwoResponse averageOfTwo(naxxo.AverageOfTwo averageOfTwo4) {
      System.out.println("averageOfTwo called");

      AverageOfTwoResponse res = new AverageOfTwoResponse();
      res.set_return(DoubleStream.of(averageOfTwo4.getArgs0(), averageOfTwo4.getArgs1()).average().getAsDouble());
      return res;
   }

   /**
    * Auto generated method signature
    *
    * @param isLeapYear6
    * @return isLeapYearResponse7
    */
   public naxxo.IsLeapYearResponse isLeapYear(naxxo.IsLeapYear isLeapYear6) {
      System.out.println("isLeapYear called");

      IsLeapYearResponse res = new IsLeapYearResponse();
      res.set_return(Year.of(isLeapYear6.getArgs0()).isLeap());
      return res;
   }
}