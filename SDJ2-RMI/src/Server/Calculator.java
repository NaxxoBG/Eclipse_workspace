package Server;

import java.rmi.RemoteException;

import Client.CalculatorInterface;

public class Calculator implements CalculatorInterface
{
   public double add(double a, double b) throws RemoteException {
      return a + b;
   }

   public double multiply(double a, double b) throws RemoteException {
      return a * b;
   }

   public double divide(double a, double b) throws RemoteException {
      return a / b;
   }

   public double subtract(double a, double b) throws RemoteException {
      return a - b;
   }
}