package ADS.src.BinarySearchTree;

public class Node
{
   private Node leftchild;
   private Node rightchild;
   private int key;
   private int hit;

   public Node(int key) {
      this.key = key;
      this.hit = 0;
   }

   public String toString() {
      return "Node leftchild: " + leftchild + " Rightchild: " + rightchild
            + " Key: " + key + ", Hit: " + hit;
   }

   public int getHit() {
      return hit;
   }

   public Node getLeftchild() {
      return leftchild;
   }

   public Node getRightchild() {
      return rightchild;
   }

   public int getKey() {
      return key;
   }

   public void setLeftchild(Node leftchild) {
      this.leftchild = leftchild;
   }

   public void setRightchild(Node rightchild) {
      this.rightchild = rightchild;
   }

   public void setKey(int key) {
      this.key = key;
   }

   public void setHit(int hit) {
      this.hit = hit;
   }

   public void incHit() {
      this.hit++;
   }
}