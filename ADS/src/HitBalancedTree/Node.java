package HitBalancedTree;

public class Node
{
   private Node left;
   private Node right;
   private int key;
   private int hitCount;

   public Node(int key) {
      this.key = key;
      this.hitCount = 0;
   }

   public Node(int key, int hit) {
      this.key = key;
      this.hitCount = hit;
   }

   public Node getLeft() {
      return left;
   }

   public Node getRight() {
      return right;
   }

   public int getKey() {
      return key;
   }

   public int getHitCount() {
      return hitCount;
   }

   public void setLeft(Node left) {
      this.left = left;
   }

   public void setRight(Node right) {
      this.right = right;
   }

   public void setKey(int key) {
      this.key = key;
   }

   public void setHitCount(int hitCount) {
      this.hitCount = hitCount;
   }

   public void incHitCount() {
      setHitCount(++hitCount);
   }

   public String toString() {
      return "[Node key: " + key + ", hitCount:" + hitCount + ", left:" + left + ", right:" + right + "]";
   }
}