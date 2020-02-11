package HitBalancedTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class HitBalancedTree implements HbTree
{
   private Node root;
   private int size;

   public HitBalancedTree() {
      super();
      root = null;
      size = 0;
   }

   public HitBalancedTree(int key) {
      this.setRoot(new Node(key));
      size = 1;
   }

   public HitBalancedTree(Node root) {
      this.root = root;
      size = 1;
   }

   public void add(int value) {
      Node node = this.findNotInc(value);
      if (node != null) {
         System.out.println("The specified key is already in the tree");
      } else { 
         this.root = add(value, this.getRoot());
         this.incSize();
      }
   }

   private Node add(int value, Node node) {
      if (node == null) {
         node = new Node(value);
      } else {
         if (value < node.getKey()) {
            node.setLeft(add(value, node.getLeft()));
         }
         else if (value > node.getKey()) {
            node.setRight(add(value, node.getRight()));
         }
      }
      return node;
   }

   public void addNode(int key, int hitCount) {
      Node node = this.findNotInc(key);
      if (node != null) {
         System.out.println("The specified key is already in the tree");
      } else { 
         root = addNode(root, new Node(key, hitCount));
         this.incSize();
      }
   }

   private Node addNode(Node currentParent, Node newNode) {
      if (currentParent == null) {
         return newNode;
      } else if (newNode.getKey() > currentParent.getKey()) {
         currentParent.setRight(addNode(currentParent.getRight(), newNode));
      } else if (newNode.getKey() < currentParent.getKey()) {
         currentParent.setLeft(addNode(currentParent.getLeft(), newNode));
      }

      return currentParent;
   }

   public void remove(int key) {
      Node node = this.findNotInc(key);
      if (node == null) {
         System.out.println("The specified key is not in the tree");
         return;
      } else {
         this.root = remove(this.getRoot(), key);
         this.decSize();
      }
   }

   private Node remove(Node node, int key) {
      if (node == null) {
         return null;
      } else if (key < node.getKey()) {
         node.setLeft(remove(node.getLeft(), key));
      } else if (key > node.getKey()) {
         node.setRight(remove(node.getRight(), key));
      } else {
         if (node.getLeft() == null) {
            return node.getRight();
         } else if (node.getRight() == null) {
            return node.getLeft();
         } else {//if node to be del is root replace with predecessor of the root(rightmost node of left subtree)
            node.setKey(lSubTreeData.apply(node.getLeft()));
            node.setLeft(remove(node.getLeft(), node.getKey()));
         }
      }
      return node;
   }

   public boolean contains(int key) {
      return this.find(key) != null;
   }

   public Node find(int key) {
      Node node = this.getRoot();
      while (node != null) {
         if (key < node.getKey()) {
            node = node.getLeft();
         } else if (key > node.getKey()) {
            node = node.getRight();
         } else {
            node.incHitCount();
            this.rebalance();
            break;
         }
      }
      return node;
   }

   private Node findNotInc(int key) {
      Node node = this.getRoot();
      while (node != null) {
         if (key < node.getKey()) {
            node = node.getLeft();
         } else if (key > node.getKey()) {
            node = node.getRight();
         } else {
            break;
         }
      }
      return node;
   }

   public int findMin() {
      return this.findMin(this.getRoot());
   }

   private int findMin(Node node) {
      if (node.getLeft() == null) {
         node.incHitCount();
         this.rebalance(this.root);
         return node.getKey();
      }
      return findMin(node.getLeft());
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
      node.incHitCount();
      this.rebalance(this.root);
      return node.getKey();
   }

   public int height() {
      return height(this.getRoot());
   }

   private int height(Node node) {
      if (node == null) {
         return -1;
      }
      else {
         return 1 + Math.max(height(node.getLeft()), height(node.getRight()));
      }
   }

   public int size() {
      return size;
   }

   private void incSize() {
      this.size++;
   }

   private void decSize() {
      this.size--;
   }

   private void clear() {
      this.root = null; 
      this.size = 0;
   }

   public Node getRoot() {
      return this.root;
   }

   public void setRoot(Node node) {
      this.root = node;
   }

   public void printPreOrder() {
      printPreOrder(this.getRoot());
      System.out.println();
   }

   private void printPreOrder(Node node) {
      System.out.print(node.getKey() + " ");
      if (node.getLeft() != null) {
         printPreOrder(node.getLeft());
      }
      if (node.getRight() != null) {
         printPreOrder(node.getRight());
      }
   }

   public void printInOrder() {
      this.printInOrder(this.getRoot());
      System.out.println();
   }

   private void printInOrder(Node node) {
      if (node == null) {
         return;
      }

      printInOrder(node.getLeft());
      System.out.print(node.getKey() + " ");
      printInOrder(node.getRight());
   }

   private void rebalance() {
      this.rebalance(this.getRoot());
   } 

   private void rebalance(Node node) {
      ArrayList<Node> allNodes = this.getAllNodes(node);
      Collections.sort(allNodes, Comparator.comparing(Node::getHitCount).thenComparing(Node::getKey).reversed());
      this.clear();
      allNodes.stream().forEach(e -> this.addNode(e.getKey(), e.getHitCount()));
   }

   private ArrayList<Node> getAllNodes(Node root) {
      ArrayList<Node> nodes = new ArrayList<Node>();
      if (root != null) {
         nodes.addAll(getAllNodes(root.getLeft()));
         nodes.add(root);
         nodes.addAll(getAllNodes(root.getRight()));
      }
      return nodes;
   }

   public void print() {
      List<List<String>> lines = new ArrayList<List<String>>();

      List<Node> level = new ArrayList<Node>();
      List<Node> next = new ArrayList<Node>();

      level.add(this.root);
      int nn = 1;

      int widest = 0;

      while (nn != 0) {
         List<String> line = new ArrayList<String>();

         nn = 0;

         for (Node n : level) {
            if (n == null) {
               line.add(null);

               next.add(null);
               next.add(null);
            } else {
               String aa = n.getKey() + "|" + n.getHitCount();
               line.add(aa);
               if (aa.length() > widest)
                  widest = aa.length();

               next.add(n.getLeft());
               next.add(n.getRight());

               if (n.getLeft() != null) {
                  nn++;
               }
               if (n.getRight() != null) {
                  nn++;
               }
            }
         }

         if (widest % 2 == 1) {
            widest++;
         }

         lines.add(line);

         List<Node> tmp = level;
         level = next;
         next = tmp;
         next.clear();
      }

      int perpiece = lines.get(lines.size() - 1).size() * (widest + 4);
      for (int i = 0; i < lines.size(); i++) {
         List<String> line = lines.get(i);
         int hpw = (int) Math.floor(perpiece / 2f) - 1;

         if (i > 0) {
            for (int j = 0; j < line.size(); j++) {

               // split node
               char c = ' ';
               if (j % 2 == 1) {
                  if (line.get(j - 1) != null) {
                     c = (line.get(j) != null) ? '┴' : '┘';
                  }
                  else {
                     if (j < line.size() && line.get(j) != null)
                        c = '└';
                  }
               }
               System.out.print(c);

               // lines and spaces
               if (line.get(j) == null) {
                  for (int k = 0; k < perpiece - 1; k++) {
                     System.out.print(" ");
                  }
               } else {
                  for (int k = 0; k < hpw; k++) {
                     System.out.print(j % 2 == 0 ? " " : "─");
                  }
                  System.out.print(j % 2 == 0 ? "┌" : "┐");
                  for (int k = 0; k < hpw; k++) {
                     System.out.print(j % 2 == 0 ? "─" : " ");
                  }
               }
            }
            System.out.println();
         }

         // print line of numbers
         for (int j = 0; j < line.size(); j++) {

            String f = line.get(j);
            if (f == null) {
               f = "";
            }
            int gap1 = (int) Math.ceil(perpiece / 2f - f.length() / 2f);
            int gap2 = (int) Math.floor(perpiece / 2f - f.length() / 2f);

            // a number
            for (int k = 0; k < gap1; k++) {
               System.out.print(" ");
            }
            System.out.print(f);
            for (int k = 0; k < gap2; k++) {
               System.out.print(" ");
            }
         }
         System.out.println();

         perpiece /= 2;
      }
   }
}