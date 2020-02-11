package BinTreeTesterFinal;

import java.util.ArrayList;
import java.util.Collections;

public class BinaryTree
{
   private Node root;
   private ArrayList<Node> nodes;

   public BinaryTree() {
      this.root = null;
      this.nodes = new ArrayList<>();
   }

   public BinaryTree(Node root, ArrayList<Node> nodes) {
      this.root = root;
      this.nodes = nodes;
   }

   public void setRoot(Node root) {
      this.root = root;
   }

   public void addNode(Node node) {
      if (root == null) {
         root = node;
         nodes.add(node);
      } else {
         Node focusNode = root;
         Node parent;
         while (true) {
            parent = focusNode;
            if (node.getKey() < focusNode.getKey()) {
               focusNode = focusNode.getLeftchild();
               if (focusNode == null) {
                  parent.setLeftchild(node);
                  nodes.add(node);
                  return;
               }
            } else if (node.getKey() == focusNode.getKey()) {
               return;
            } else {
               focusNode = focusNode.getRightchild();
               if (focusNode == null) {
                  parent.setRightchild(node);
                  nodes.add(node);
                  return;
               }
            }
         }
      }
   }

   public Node findNode(int key) throws CloneNotSupportedException {
      Node focusNode = root;
      while (focusNode != null) {
         if (key < focusNode.getKey()) {
            focusNode = focusNode.getLeftchild();
         } else if (key > focusNode.getKey()) {
            focusNode = focusNode.getRightchild();
         } else {
            focusNode.incHit();
            this.balance();
            break;
         }
      }
      return focusNode;

   }

   public void preOrderTraverse(Node focusNode) {
      if (focusNode != null) {
         System.out.println(focusNode);
         preOrderTraverse(focusNode.getLeftchild());
         preOrderTraverse(focusNode.getRightchild());
      }
   }

   public Node getRoot() {
      return root;
   }

   /*public Node highestHit() {
      return getMaxHitRec(root, root);
   }

   private Node getMaxHitRec(Node root, Node newNode) {
      if (root == null)

         return null;

      Node max;
      if (root.getHit() > newNode.getHit()) {
         max = root;
      } else {
         max = newNode;
      }

      if (root.getLeftchild() != null) {
         max = getMaxHitRec(root.getLeftchild(), max);

      }
      if (root.getRightchild() != null) {
         max = getMaxHitRec(root.getRightchild(), max);
      }

      setRoot(max);
      return max;
   }*/

   public void balance() throws CloneNotSupportedException {
      Collections.sort(nodes, new NodeComparator());
      ArrayList<Node> newTreeNodes = new ArrayList<>(nodes.size());

      for (Node node : nodes) {
         newTreeNodes.add((Node) node.clone());
      }
      this.root = null;
      nodes.clear();
      for (int i = 0; i < newTreeNodes.size(); i++) {
         this.addNode(newTreeNodes.get(i));
      }
   }

   public Node getMax(Node root) throws CloneNotSupportedException {
      if (root.getRightchild() == null) {
         root.incHit();
         this.balance();
         return root;
      } else {
         return getMax(root.getRightchild());
      }
   }

   public Node getMin(Node n) throws CloneNotSupportedException {
      if (n.getLeftchild() == null) {
         n.incHit();
         this.balance();
         return n;
      }
      return getMin(n.getLeftchild());
   }

   public ArrayList<Node> getNodes() {
      return nodes;
   }

   public void setNodes(ArrayList<Node> nodes) {
      this.nodes = nodes;
   }
}