package ADS.src.BinarySearchTree;

public class Main
{
   static Node node1;
   static Node node2;
   static Node node3;
   static Node node4;
   static Node node5;
   static Node node6;

   public static void main(String[] args) {

      BinaryTree tree = new BinaryTree();
      node1 = new Node(13);
      tree.addNode(node1);

      node2 = new Node(26);
      tree.addNode(node2);

      node3 = new Node(43);
      tree.addNode(node3);

      node4 = new Node(56);
      tree.addNode(node4);

      node5 = new Node(84);
      tree.addNode(node5);

      node6 = new Node(44);
      tree.addNode(node6);

      tree.postOrderTraverse(tree.getRoot());

      Main.printNodeStats();

      System.out.println("\nNode with key 43");

      System.out.println(tree.findNode(43));

      Main.printNodeStats();
   }

   private static void printNodeStats() {
      System.out.println(node1.getHit());
      System.out.println(node2.getHit());
      System.out.println(node3.getHit());
      System.out.println(node4.getHit());
      System.out.println(node5.getHit());
      System.out.println(node6.getHit());
   }
}