package ADS.src.BinarySearchTree;

public class BinaryTree
{
   private Node root;

   public void addNode(Node node) {
      if (root == null) {
         root = node;
      }
      else {
         Node focusNode = root;
         Node parent;
         while (true) {
            parent = focusNode;
            if (node.getKey() < focusNode.getKey()) {
               focusNode = focusNode.getLeftchild();
               if (focusNode == null) {
                  parent.setLeftchild(node);
                  return;
               }
            }
            else {
               focusNode = focusNode.getRightchild();
               if (focusNode == null) {
                  parent.setRightchild(node);
                  return;
               }
            }
            focusNode.incHit();
         }
      }
   }

   public Node findNode(int key) {
      Node focusNode = root;
      while (focusNode.getKey() != key) {
         if (key < focusNode.getKey()) {
            focusNode = focusNode.getLeftchild();
         }
         else {
            focusNode = focusNode.getRightchild();
         }
         if (focusNode == null) {
            return null;
         }
         focusNode.incHit();
      }
      root.incHit();
      return focusNode;

   }

   public void preOrderTraverse(Node focusNode) {
      if (focusNode != null) {
         System.out.println(focusNode);
         root.incHit();
         preOrderTraverse(focusNode.getLeftchild());
         preOrderTraverse(focusNode.getRightchild());
      }
   }

   public void inOrderTraverse(Node focusNode) {
      if (focusNode != null) {
         inOrderTraverse(focusNode.getLeftchild());
         System.out.println(focusNode);
         root.incHit();
         inOrderTraverse(focusNode.getRightchild());

      }
   }

   public void postOrderTraverse(Node focusNode) {
      if (focusNode != null) {
         postOrderTraverse(focusNode.getLeftchild());
         root.incHit();
         postOrderTraverse(focusNode.getRightchild());
         System.out.println(focusNode);
      }
   }

   public Node getRoot() {
      return root;
   }
}