package BinTreeTesterFinal;

public class Main
{
   public static void main(String[] args) {
      BinaryTree tree = new BinaryTree();

      Node node1 = new Node(13);
      tree.addNode(node1);
      System.out.println(tree.getNodes());
      Node node2 = new Node(26);
      tree.addNode(node2);
      System.out.println(tree.getNodes());
      Node node3 = new Node(43);
      tree.addNode(node3);

      Node node4 = new Node(56);
      tree.addNode(node4);

      Node node5 = new Node(84);
      tree.addNode(node5);

      Node node6 = new Node(44);
      tree.addNode(node6);
      System.out.println(tree.getNodes());
      try {
      tree.findNode(13);
      System.out.println("finding node");
      System.out.println(tree.getNodes());
      tree.findNode(26);
      tree.findNode(26);
      tree.findNode(43);
      tree.findNode(56);
      tree.findNode(84);
      tree.findNode(44);

      System.out.println("Node1 has #" + node1.getHit() + " " + "Number of hits");
      System.out.println(node2.getHit());
      System.out.println(node3.getHit());
      System.out.println(node4.getHit());
      System.out.println(node5.getHit());
      System.out.println(node6.getHit());


      System.out.println("");
      System.out.println("");
      tree.preOrderTraverse(tree.getRoot());
      System.out.println("--------------------------------------------");
      System.out.println(tree.getNodes());
      System.out.println("------------BALANCING-------------------------------");
      tree.balance();
      } catch (Exception e) {
         e.printStackTrace();
      }
      System.out.println(tree.getNodes());
   }
}