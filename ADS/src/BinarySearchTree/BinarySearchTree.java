package BinarySearchTree;

public class BinarySearchTree
{
   private Node root;

   public BinarySearchTree() {
      super();
   }

   public BinarySearchTree(int data) {
      this.setRoot(new Node(data));
   }

   public void setRoot(Node root) {
      this.root = root;
   }

   public void printPreOrder() {
      this.printPreOrder(this.getRoot());
      System.out.println();
   }

   private void printPreOrder(Node node) {
      System.out.print(node.getElement() + " ");
      if (node.getLeft() != null) {
         this.printPreOrder(node.getLeft());
      }
      if (node.getRight() != null) {
         this.printPreOrder(node.getRight());
      }
   }

   public void add(int i) {
      this.setRoot(add(i, this.getRoot()));
   }

   private Node add(int i, Node n) {
      if (n == null) {
         return new Node(i);
      }
      if (i < n.getElement() ) {
         n.setLeft(add(i, n.getLeft())); 
      } else if (i > n.getElement()) {
         n.setRight(add(i, n.getRight())); 
      }
      return n;
   }

   public boolean contains(int i) {
      return this.contains(i, this.getRoot());
   }

   private boolean contains(int x, Node node) {
      if (node == null) {
         return false;
      }

      if (x < node.getElement()) {
         return contains(x, node.getLeft());
      } else if ( x > node.getElement()) {
         return contains(x, node.getRight());
      } else {
         return true;    
      }
   }

   public int findMax() {
      return this.findMax(this.getRoot());
   }

   private int findMax(Node node) {
      if (node != null) {
         while (node.getRight() != null) {
            node = node.getRight();
         }
      }
      return node.getElement();
   }

   public int findMin() {
      return this.findMin(this.getRoot());
   }

   private int findMin(Node node) {
      if (node.getLeft() == null) {
         return node.getElement();
      }
      return findMin(node.getLeft());
   }

   public int height() {
      return this.height(this.getRoot());
   }

   private int height(Node node) {
      if (node == null) {
         return -1;
      } else {
         return 1 + Math.max(this.height(node.getLeft()), this.height(node.getRight()));
      }
   }

   public Node getRoot() {
      return this.root;
   }
}