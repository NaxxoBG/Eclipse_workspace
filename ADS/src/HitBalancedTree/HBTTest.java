package HitBalancedTree;

import static org.junit.Assert.*;
import java.util.function.Consumer;
import org.junit.Test;

public class HBTTest
{
   private HitBalancedTree tester;
   private static final String SEPARATOR = "------------------------------------------------------------";

   private HitBalancedTree initTree() {
      tester = new HitBalancedTree();
      tester.add(45);
      tester.add(10);
      tester.add(12);
      tester.add(6);
      return tester;
   }

   @Test
   public void testTreeSize() throws Exception {
      System.out.println(SEPARATOR + "testTreeSize");
      System.out.println();
      tester = this.initTree();
      System.out.println(tester.size());
      tester.add(50);
      System.out.println(tester.size());
      tester.print();
      tester.remove(45);
      System.out.println(tester.size());
      tester.add(92);
      tester.add(53);
      tester.add(27);
      tester.add(19);
      tester.add(22);
      tester.add(3);
      tester.add(11);
      tester.add(27);
      tester.contains(11);
      tester.print();
      System.out.println(tester.size());
      System.out.println(tester.getRoot());
      System.out.println(SEPARATOR);
   }

   @Test
   public void incCount() throws Exception {
      System.out.println(SEPARATOR + "incCount");
      Consumer<Node> countPrinter = e -> System.out.println(e.getHitCount());
      Node node = new Node(45);
      countPrinter.accept(node);
      node.incHitCount();
      node.incHitCount();
      node.incHitCount();
      countPrinter.accept(node);
      assertEquals(node.getHitCount(), 3);
      System.out.println(SEPARATOR);
   }

   @Test
   public void addTest() throws Exception {
      System.out.println(SEPARATOR + "addTest");
      Node node = new Node(4);
      HitBalancedTree tree = new HitBalancedTree(node);

      System.out.println(tree.size());

      tree.add(2);
      tree.add(3);
      tree.add(1);
      tree.add(5);
      tree.add(6);

      System.out.println(tree.size());
      tree.add(7);
      System.out.println(tree.size());
      assertEquals(7, tree.size());
      tree.add(5);
      tree.add(5);
      tree.print();
      System.out.println(tree.getRoot());
      System.out.println(SEPARATOR);
   }

   @Test
   public void findTest() throws Exception {
      System.out.println(SEPARATOR + "findTest");
      tester = this.initTree();
      Node node = tester.find(6);
      assertEquals(tester.find(34), null);
      assertEquals(6, node.getKey());
      System.out.println(node);
      System.out.println(SEPARATOR);
   }

   @Test
   public void printNode() throws Exception {
      System.out.println(SEPARATOR + "printNode");
      tester = this.initTree();
      System.out.println(tester.find(10));
      tester.find(10);
      tester.print();
      System.out.println(SEPARATOR);
   }

   @Test
   public void testContains() throws Exception {
      System.out.println(SEPARATOR + "testContains");
      HitBalancedTree tree = this.initTree();
      assertEquals(tree.contains(6), true);
      assertEquals(tree.contains(100), false);
      tester.print();
      System.out.println(SEPARATOR);
   }

   @Test
   public void printInOrderTree() throws Exception {
      System.out.println(SEPARATOR + "printInOrder");
      tester = this.initTree();
      tester.add(50);
      tester.printInOrder();
      System.out.println(SEPARATOR);
   }

   @Test
   public void printPreOrderTest() throws Exception {
      System.out.println(SEPARATOR + "printPreOrderTest");
      tester = this.initTree();
      System.out.println(tester.getRoot());
      System.out.println(tester.getRoot().getLeft());
      System.out.println(tester.getRoot().getLeft().getLeft());
      System.out.println(tester.getRoot().getLeft().getRight());
      tester.add(50);
      System.out.println(tester.getRoot().getRight());
      System.out.println();
      tester.printPreOrder();
      System.out.println();
      tester.print();
      System.out.println(SEPARATOR);
   }

   @Test
   public void printTree() throws Exception {
      System.out.println(SEPARATOR + "printTree");
      tester = this.initTree();
      tester.print();
      tester.add(50);
      System.out.println("\nAdding 50 to the tree.\n");
      tester.print();
      tester.remove(45);
      System.out.println("\nRemoving 45 from the tree.\n");
      tester.add(92);
      tester.add(53);
      tester.add(27);
      tester.add(27);
      tester.add(19);
      tester.add(19);
      tester.add(22);
      tester.add(3);
      tester.add(11);
      tester.remove(12);
      tester.print();
      System.out.println(SEPARATOR);
   }

   // to be fixed
   @Test
   public void rebalanceTest() throws Exception {
      System.out.println(SEPARATOR + "rebalanceTest");
      tester = this.initTree();
      tester.add(50);
      tester.remove(45);
      tester.add(92);
      tester.add(53);

      tester.add(27);

      tester.add(19);
      tester.add(22);
      tester.add(3);
      tester.add(11);

      tester.add(27);

      tester.find(11);
      tester.find(11);
      tester.contains(11);
      tester.findMax();
      tester.findMax();
      tester.findMin();

      System.out.println(tester.getRoot());
      tester.print();
      System.out.println(tester.size());
      System.out.println(SEPARATOR);
   }

   @Test
   public void testSize() throws Exception {
      System.out.println(SEPARATOR + "testSize");
      int[] testerVals = { 45, 10, 12, 6, 0, 0 };
      tester = this.initTree();
      System.out.println(tester.size());
      for (int i = 0; i < testerVals.length; i++) {
         tester.remove(testerVals[i]);
         System.out.println("The size of the tree is " + tester.size());
      }
      System.out.println(SEPARATOR);
   }

   @Test
   public void testAddNode() throws Exception {
      System.out.println(SEPARATOR + "testAddNode");
      HitBalancedTree tree = new HitBalancedTree();
      tree.addNode(34, 5);
      tree.addNode(34, 5);
      tree.addNode(34, 5);
      System.out.println(tree.size());
      System.out.println(tree.getRoot());
      tree.remove(35);
      tree.remove(34);
      tree.remove(34);
      System.out.println(tree.size());
      System.out.println(SEPARATOR);
   }

   @Test
   public void removeTest() throws Exception {
      System.out.println(SEPARATOR + "removeTest");
      tester = this.initTree();
      tester.add(50);
      tester.printPreOrder();
      System.out.println();
      System.out.println("\nSize of the tree: " + tester.size());
      tester.remove(45);
      System.out.println("\nSize of the tree: " + tester.size());
      tester.printPreOrder();
      System.out.println();
      tester.remove(45);
      tester.remove(50);
      tester.remove(452);
      System.out.println("\nSize of the tree: " + tester.size());
      tester.print();
      tester.find(6);
      tester.print();
      System.out.println(SEPARATOR);
   }
}