package BinTreeTesterFinal;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;

public class Junitest
{
   BinaryTree hbt = new BinaryTree();
   Node node1 = new Node(5);
   Node node2 = new Node(7);
   Node node3 = new Node(25);
   Node node4 = new Node(125);
   Node node5 = new Node(75);
   Node node6 = new Node(95);

   @Test
   public void test() {
      hbt.addNode(node1);
      hbt.addNode(node2);
      hbt.addNode(node3);
      hbt.addNode(node4);
      hbt.addNode(node5);
      hbt.addNode(node6);
      assertEquals(6, hbt.getNodes().size());
   }

   @Test
   public void test1() throws CloneNotSupportedException {
      BinaryTree tree = new BinaryTree();
      tree.addNode(new Node(12));
      tree.addNode(new Node(15));
      tree.addNode(new Node(3));
      tree.addNode(new Node(8));
      tree.addNode(new Node(2));
      System.out.println(tree.getNodes());
      tree.findNode(3);
      System.out.println(tree.getNodes());
   }

   @Test
   public void test4() {
      hbt.preOrderTraverse(node1);
   }

   @Test
   public void test7() throws CloneNotSupportedException {
      hbt.balance();
   }
   
   @Test
   public void testName() throws Exception {
      ArrayList<Node> nodes = new ArrayList<Node>();
      Node node1 = new Node(1, 3);
      Node node2 = new Node(1, 4);
      Node node3 = new Node(2, 3);
      Node node4 = new Node(5, 43);
      Node node5 = new Node(6, 43);
      nodes.add(node1);
      nodes.add(node2);
      nodes.add(node3);
      nodes.add(node4);
      nodes.add(node5);
      System.out.println(nodes);
      System.out.println("------------------------------------------------");
      Collections.sort(nodes, new NodeComparator());
      System.out.println(nodes);
      
   }
   
   @Test
   public void testTree() throws Exception {
      BinaryTree tree = new BinaryTree();
      
      Node node1 = new Node(4, 3);
      Node node2 = new Node(1, 4);
      Node node3 = new Node(12, 3);
      Node node4 = new Node(5, 43);
      Node node5 = new Node(6, 43);
      
      tree.addNode(node1);
      tree.addNode(node2);
      tree.addNode(node3);
      tree.addNode(node4);
      tree.addNode(node5);
      
      
      System.out.println("------------------------------------------------");
      tree.preOrderTraverse(tree.getRoot());
      tree.findNode(5);
      System.out.println("------------------------------------------------");
      System.out.println(tree.getNodes());
   }

}