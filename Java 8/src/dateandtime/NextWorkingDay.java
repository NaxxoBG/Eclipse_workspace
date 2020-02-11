package dateandtime;

import java.time.DayOfWeek;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class NextWorkingDay implements TemporalAdjuster
{
   @Override
   public Temporal adjustInto(Temporal temporal) {
      int dayAfterAddition = temporal.plus(1, ChronoUnit.DAYS).get(ChronoField.DAY_OF_WEEK);
      return dayAfterAddition == DayOfWeek.SATURDAY.getValue() || dayAfterAddition == DayOfWeek.SUNDAY.getValue() ? 
            temporal.with(TemporalAdjusters.next(DayOfWeek.MONDAY)) : temporal.plus(1, ChronoUnit.DAYS);
   }
}