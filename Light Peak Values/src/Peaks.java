import java.util.ArrayList;
import lejos.nxt.LCD;

public class Peaks {
   
   public static void mostCommon(ArrayList<Integer> valuesList)
   {
      ArrayList<Values>values = new ArrayList<>();
      int currentValue, numberOfOccurences;
      Values maximum = new Values(-1, -1);
      boolean contains = false;

      for(int i=0; i < valuesList.size(); i++)
      {
         contains = false;
         numberOfOccurences=0;
         currentValue = valuesList.get(i);

         for(int j=0; j<values.size(); j++)
         {
            if(values.get(j).getValue() == currentValue)contains=true;
         }

         if(contains == false)
         {
            for(int k=0;k<72;k++)
            {
               if(valuesList.get(k) == currentValue)numberOfOccurences++;
            }
            values.add(new Values(currentValue, numberOfOccurences));
         }
      }

      for(int i=0; i<values.size();i++)
      {
         if(values.get(i).getCount()>maximum.getCount() && values.get(i).getValue()>maximum.getValue())
         {
            maximum.setCount(values.get(i).getCount());
            maximum.setValue(values.get(i).getValue());
         }
      }

      LCD.clear();
      LCD.drawInt(maximum.getValue(), 2, 2);
      LCD.drawInt(maximum.getCount(), 2, 3);
   }
}