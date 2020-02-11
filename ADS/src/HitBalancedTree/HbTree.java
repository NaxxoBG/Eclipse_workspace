package HitBalancedTree;

import java.util.function.Function;

public interface HbTree
{
   public Function<Node, Integer> lSubTreeData = e -> {
      while (e.getRight() != null) {
         e = e.getRight();
      }
      return e.getKey();
   };

   public void add(int value);

   public void remove(int key);

   public boolean contains(int key);

   public Node find(int key);

   public int findMin();

   public int findMax();

   public int height();

   public int size();

   public Node getRoot();

   public void setRoot(Node node);

   public void printPreOrder();

   public void printInOrder();

   public void print();
}