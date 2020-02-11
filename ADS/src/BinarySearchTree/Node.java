package BinarySearchTree;

public class Node
{  
   private Node left;
   private Node right;
   private int element;

   public Node(int element) {
      this.element = element;
   }

   public Node getLeft() {
      return left;
   }

   public Node getRight() {
      return right;
   }

   public int getElement() {
      return element;
   }

   public void setLeft(Node left) {
      this.left = left;
   }

   public void setRight(Node right) {
      this.right = right;
   }

   public void setElement(int element) {
      this.element = element;
   }
}