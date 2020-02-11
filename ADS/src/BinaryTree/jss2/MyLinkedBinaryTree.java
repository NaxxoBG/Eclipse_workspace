/*
 * 16.02.2015 Original version
 */

package BinaryTree.jss2;

public class MyLinkedBinaryTree<T> extends LinkedBinaryTree<T>
{
   public MyLinkedBinaryTree() {
      super();
   }

   public MyLinkedBinaryTree(T element) {
      super(element);
   }

   public MyLinkedBinaryTree(T element, MyLinkedBinaryTree<T> leftSubTree, MyLinkedBinaryTree<T> rightSubTree) {
      super(element);

      if (leftSubTree != null) {
         count += leftSubTree.size();
         root.left = leftSubTree.root;
      }

      if (rightSubTree != null) {
         count += rightSubTree.size();
         root.right = rightSubTree.root;
      }
   }
}