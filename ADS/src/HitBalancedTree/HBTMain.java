package HitBalancedTree;

public class HBTMain
{
   public static void main(String[] args) {
      HitBalancedTree tree = new HitBalancedTree();
      System.out.println(tree.getRoot());

      tree.add(5);
      tree.add(15);
      tree.add(252);
      tree.add(1);

      tree.find(1);
      tree.contains(1);
      tree.find(15);
      tree.find(15);
      tree.find(123);

      tree.print();
      tree.find(1);
      tree.find(252);
      tree.find(252);
      tree.find(252);
      tree.find(252);
      tree.find(15);
      tree.find(1);
      tree.add(15);
      tree.contains(1);
      tree.findMax();
      tree.findMin();

      tree.contains(5);
      tree.find(5);
      tree.contains(5);
      tree.find(5);
      tree.contains(5);
      tree.find(5);
      tree.remove(16);
      tree.findMax();
      tree.remove(252);
      tree.print();
      tree.findMax();
      System.out.println();
      tree.findMin();
      tree.print();
      System.out.println(tree.size());
   }
}