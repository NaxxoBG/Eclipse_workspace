package SortedSet;

import java.util.Iterator;

public class SortedSet<T extends Comparable<T>> implements SortedSetInterface<T>, Iterable<T>
{
   SortedSetNode<T> head;
   SortedSetNode<T> tail;
   int size = 0;

   public SortedSet() {
      head = tail = null;
      size = 0;
   }

   public SortedSet(SortedSetNode<T> node) {
      head = tail = node;
      size = 1;
   }

   public T first() {
      return head.data;
   }

   public T last() {
      return tail.data;
   }

   public boolean add(T t) {
      if (contains(t)) {
         return false;
      } else {
         if (size == 0) {
            SortedSetNode<T> node = new SortedSetNode<T>(t, null);
            head = node;
            tail = node;
         } else {
            putIntoRightPosition(t);
         }
         size++;
         return true;
      }
   }

   public boolean contains(T t) {
      SortedSetNode<T> node = head;
      for(int i = 0; i < size ; i++){
         if (node.data.compareTo(t) == 0)
            return true;
         node = node.next;
      }
      return false;
   }

   public void putIntoRightPosition(T t) {
      SortedSetNode<T> newNode = head;
      SortedSetNode<T> node = new SortedSetNode<T>(t,null);

      if (head.data.compareTo(t) > 0) {
         node.next=head;
         head = node;
         return;
      }

      while (newNode.next != null && newNode.next.data.compareTo(t) < 0) {
         newNode = newNode.next;     
      }
      node.next = newNode.next;
      newNode.next = node;  
      if (node.data.compareTo(tail.data) > 0)
         tail = node;
   }

   public void remove(T data) {
      SortedSetNode<T> node = head;
      while (node != null) {
         if (node.data.compareTo(data) == 0) {
            node.next = node.next.next;
            size--;
            break;
         }
         node = node.next;
      }
   }

   public int size() {
      return size;
   }

   public SortedSet<T> headset(T t)
   {
      SortedSet<T> set = new SortedSet<T>();
      SortedSetNode<T> newNode = head;
      while (newNode.data.compareTo(t) <= 0) {
         set.add(newNode.data);
         newNode = newNode.next;
      }
      return set;
   }


   public SortedSet<T> tailset(T t) {
      SortedSet<T> set = new SortedSet<T>();
      SortedSetNode<T> newNode = getNodeBefore(t).next;
      while (newNode.next!= null) {
         set.add(newNode.data);
         newNode=newNode.next;
      }
      return set;
   }

   public SortedSetNode<T> getNodeBefore(T t) {
      if (!contains(t)) {
         return null;
      } else {
         SortedSetNode<T> newNode = head;
         if (newNode.data.compareTo(t) == 0)
            return newNode;
         for (int i = 0; i < size - 1; i++) {
            if (newNode.next.data.compareTo(t) == 0)
               return newNode;
            newNode = newNode.next;
         }
         return null;
      }
   }

   public Iterator<T> iterator() {
      Iterator<T> it = new Iterator<T>() {

         SortedSetNode<T> newNode = new SortedSetNode<T>(null, head);

         public boolean hasNext() {
            return newNode.next!=null;
         }

         public T next() {
            newNode=newNode.next;
            return newNode.data;
         }
      };
      return it;
   }
}