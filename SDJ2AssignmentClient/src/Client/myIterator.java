package Client;

import java.util.ArrayList;
import java.util.Iterator;

public class myIterator <T> implements Iterator<T>{

   int index;
   ArrayList<T> list;
   
   public myIterator(ArrayList<T> list){
     index=0;
     this.list=list;
   }
  
   @Override
   public boolean hasNext()
   {
    if(index<list.size()){
       return true;
    }else 
      return false;
   }

   @Override
   public T next()
   {
      if(this.hasNext()){
         return list.get(index++);
      }
      return null;
   } 
}