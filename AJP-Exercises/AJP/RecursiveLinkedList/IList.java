// *****************************************************************************
// File name  : IList.java
// Start date : 
// Programmer : Hans So.
// Java       : Java 1.7
// Description: 
// *****************************************************************************

package RecursiveLinkedList;

public interface IList<T>
{
  void addFirst(T element);
  void addLast(T element);
  
  T removeFirst();
  T removeLast();
  
  int size();
  
  void print();
  void printReverse();
}
