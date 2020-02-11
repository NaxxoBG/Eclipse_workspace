/**
 * HelloSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.4  Built on : Oct 21, 2016 (10:47:34 BST)
 */
package naxxo.bg.skeleton;

import naxxo.bg.GetHelloTextResponse;

/**
 *  HelloSkeleton java skeleton for the axisService
 */
public class HelloSkeleton implements HelloSkeletonInterface {
   /**
    * Auto generated method signature
    *
    * @param getHelloText0
    * @return getHelloTextResponse1
    */
   public naxxo.bg.GetHelloTextResponse getHelloText(naxxo.bg.GetHelloText getHelloText0) {
      //TODO : fill this with the necessary business logic
      //throw new java.lang.UnsupportedOperationException("Please implement " +
      //    this.getClass().getName() + "#getHelloText");

      System.out.println("getHelloText called");
      GetHelloTextResponse res = new GetHelloTextResponse();
      res.set_return("Goodbye World");
      return res;
   }
}