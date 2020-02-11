// *****************************************************************************
// File name  : LinkedList.java
// Start date : 
// Programmer : Hans So.
// Java       : Java 1.7
// Description: Recursive implementations on a singly linked list
//
// *****************************************************************************

package RecursiveLinkedList;

public class LinkedList<T> implements IList<T>
{
   private Node head = null;

   private class Node {
      T elem;
      Node next;

      public Node (T elem, Node next) {
         this.elem = elem;
         this.next = next;
      }
   }

   public void addFirst (T element) {
      head = new Node(element, head);
   }

   public void addLast (T element) {
      if (head == null) {
         head = new Node(element,null);
      }
      else {
         Node node = getTailNode(head);
         node.next = new Node(element, null);
      }
   }

   private Node getTailNode(Node node) {
      if (node.next==null) {
         return node;
      } else {
         return getTailNode(node.next);
      }
   }

   public T removeFirst () {
      T element;
      if (head == null) {
         return null;
      } else {
         element = head.elem;
         head = head.next;
      }
      return element;
   }

   public T removeLast () {
      T element;
      if (head == null) {
         element = null;
      } else if (head.next == null) {
         element = head.elem;
         head = null;
      } else {
         Node node = getNodeBeforeTail(head);
         element = node.next.elem;
         node.next = null;
      }
      return element;
   }

   private Node getNodeBeforeTail(Node list) {
      if (list.next.next == null) {
         return list;
      } else {
         return getNodeBeforeTail(list.next);
      }
   }

   public int size () {
      return recSize (head);
   }

   public void print () {
      recPrint (head);
   }

   public void printReverse () {
      recPrintReverse (head);
   }

   // recursive help methods:

   private int recSize (Node list) {
      if (list == null) {
         return 0;
      }
      return 1 + recSize(list.next);
   }

   private void recPrint (Node list) {
      if (list == null) {
         printEmpty();
      }
      printNode(list);
      recPrint(list.next);
   }

   private void recPrintReverse (Node list) {
      if (list == null) {
         printEmpty();
      }
      recPrintReverse(list.next);
      printNode(list);
   }

   private void printNode(Node list) {
      System.out.println(" " + list.elem + " ");
   }

   private void printEmpty() {
      System.out.println(".");
   }
}