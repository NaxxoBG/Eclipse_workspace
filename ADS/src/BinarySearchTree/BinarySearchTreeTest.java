package BinarySearchTree;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinarySearchTreeTest
{
   private BinarySearchTree getPremadeTree() {
      Node root = new Node(10);
      Node left = new Node(5);
      Node right = new Node(15);
      Node leftToLeft = new Node(3);
      Node rightToLeft = new Node(7);
      Node rightToRight = new Node(20);

      left.setLeft(leftToLeft);
      left.setRight(rightToLeft);
      right.setRight(rightToRight);
      root.setLeft(left);
      root.setRight(right);

      BinarySearchTree tree = new BinarySearchTree();
      tree.setRoot(root);
      return tree;
   }

   @Test
   public void testNodeConstruction() {
      Node root = new Node(10);
      Node left = new Node(5);
      Node right = new Node(15);
      Node leftToLeft = new Node(3);
      Node rightToLeft = new Node(7);
      Node rightToRight = new Node(20);

      root.setLeft(left);
      root.setRight(right);
      left.setLeft(leftToLeft);
      left.setRight(rightToLeft);
      right.setRight(rightToRight);
   }

   @Test
   public void testPreOrder() throws Exception {
      BinarySearchTree tree = this.getPremadeTree();
      tree.printPreOrder();
   }

   @Test
   public void testAdd() throws Exception {
      BinarySearchTree tree = new BinarySearchTree();
      tree.add(10);
      tree.add(5);
      tree.add(1);
      tree.add(2);
      tree.add(15);
      tree.add(5);
      tree.add(3);
      tree.add(11);
      tree.printPreOrder();
   }

   @Test
   public void testAdd2() throws Exception {
      BinarySearchTree tree = new BinarySearchTree();
      tree.add(10);
      tree.add(15);
      tree.add(5);
      tree.add(11);
      tree.add(7);
      tree.add(3);
      tree.add(1);
      tree.add(2);
      tree.printPreOrder();
   }

   @Test
   public void testContains() throws Exception {
      BinarySearchTree tree = this.getPremadeTree();
      assertFalse(tree.contains(8));
      assertTrue(tree.contains(7));
   }

   @Test
   public void testMinAndMax() throws Exception {
      BinarySearchTree tree = this.getPremadeTree();
      tree.printPreOrder();
      System.out.println();
      System.out.println("Min is " + tree.findMin());
      System.out.println("Max is " + tree.findMax());
      assertEquals(tree.findMax(), 20);
      assertEquals(tree.findMin(), 3);
   }

   @Test
   public void testHeight() throws Exception {
      BinarySearchTree tree = this.getPremadeTree();
      System.out.println(tree.height());
      assertEquals(tree.height(), 2);
   }
}