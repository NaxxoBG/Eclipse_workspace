package BinTreeTesterFinal;

import java.util.Comparator;

public class NodeComparator implements Comparator<Node>
{
   public int compare(Node o1, Node o2) {
      if (o2.getHit() - o1.getHit() == 0) {
         return o2.getKey() - o1.getKey();
      } else {
         return o2.getHit() - o1.getHit();
      }
   }
}