/*
 * 18.09.2011 Original version
 */

package BinaryTree.dk.viauc.jpe.linkedbinarytree;

import java.util.Iterator;

import BinaryTree.jss2.BinaryTreeADT;
import BinaryTree.jss2.LinkedBinaryTree;
import BinaryTree.jss2.MyLinkedBinaryTree;

public class TestLinkedBinaryTree
{
   private void run() {
      BinaryTreeADT<String> tree = buildTree();

      System.out.println( "size: " + tree.size() );

      printTraversal( "Pre:  ", tree.iteratorPreOrder() );
      printTraversal( "In:   ", tree.iteratorInOrder() );
      printTraversal( "Post: ", tree.iteratorPostOrder() );
      printTraversal( "Level:", tree.iteratorLevelOrder() );

      Iterator<String> iter = ((LinkedBinaryTree<String>) tree).iteratorFindLeaves();
      System.out.println("\nLeaf nodes:");
      this.printGenericIterator(iter);
   }

   private <T> void printGenericIterator(Iterator<T> iter) {
      System.out.println();
      while (iter.hasNext()) {
         System.out.print((String) iter.next() + " ");
      }
   }

   private MyLinkedBinaryTree<String> buildTree() {
      MyLinkedBinaryTree<String> lTree = new MyLinkedBinaryTree<String>( "L" );
      MyLinkedBinaryTree<String> mTree = new MyLinkedBinaryTree<String>( "M" );
      MyLinkedBinaryTree<String> nTree = new MyLinkedBinaryTree<String>( "N" );
      MyLinkedBinaryTree<String> oTree = new MyLinkedBinaryTree<String>( "O" );
      MyLinkedBinaryTree<String> pTree = new MyLinkedBinaryTree<String>( "P" );

      MyLinkedBinaryTree<String> gTree = new MyLinkedBinaryTree<String>( "G" );
      MyLinkedBinaryTree<String> hTree = new MyLinkedBinaryTree<String>( "H", lTree, mTree );
      MyLinkedBinaryTree<String> iTree = new MyLinkedBinaryTree<String>( "I" );
      MyLinkedBinaryTree<String> jTree = new MyLinkedBinaryTree<String>( "J", nTree, null );
      MyLinkedBinaryTree<String> kTree = new MyLinkedBinaryTree<String>( "K", oTree, pTree );

      MyLinkedBinaryTree<String> dTree = new MyLinkedBinaryTree<String>( "D", gTree, hTree );
      MyLinkedBinaryTree<String> eTree = new MyLinkedBinaryTree<String>( "E", iTree, null );
      MyLinkedBinaryTree<String> fTree = new MyLinkedBinaryTree<String>( "F", jTree, kTree );

      MyLinkedBinaryTree<String> bTree = new MyLinkedBinaryTree<String>( "B", dTree, eTree );
      MyLinkedBinaryTree<String> cTree = new MyLinkedBinaryTree<String>( "C", null, fTree );

      MyLinkedBinaryTree<String> aTree = new MyLinkedBinaryTree<String>( "A", bTree, cTree );

      return aTree;
   }

   private void printTraversal( String text, Iterator<String> iterator ) {
      System.out.print(text);

      while( iterator.hasNext() ) {
         System.out.print( " " + iterator.next() ); 
      }
      System.out.println();
   }

   public static void main( String[] args ) {
      new TestLinkedBinaryTree().run();
   }
}