package dateandtime;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.Chronology;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;
import java.util.TimeZone;

public class DateTest
{
   @SuppressWarnings("unused")
   public static void main(String[] args) {
      LocalDate date = LocalDate.of(2014, 3, 18);
      System.out.println(date.getYear());
      System.out.println(date.getMonth());
      System.out.println(date.getDayOfMonth());
      System.out.println(date.getDayOfWeek());
      System.out.println(date.lengthOfMonth());
      System.out.println(date.isLeapYear());

      System.out.println(date.get(ChronoField.YEAR));

      //Get current date
      LocalDate today = LocalDate.now();
      System.out.println(today);

      LocalTime time = LocalTime.of(13, 45, 20);
      int hour = time.getHour();
      int minute = time.getMinute();
      int second = time.getSecond();
      System.out.println(hour + ":" + minute + ":" + second);

      LocalDate parsedDate = LocalDate.parse("2014-03-18");
      LocalTime parsedTime = LocalTime.parse("13:45:20");

      LocalDateTime dt1 = LocalDateTime.of(2014, Month.MARCH, 18, 13, 45, 20);
      LocalDateTime dt2 = LocalDateTime.of(date, time);
      LocalDateTime dt3 = date.atTime(13, 45, 20);
      LocalDateTime dt4 = date.atTime(time);
      LocalDateTime dt5 = time.atDate(date);

      LocalDate date1 = dt1.toLocalDate();
      LocalTime time1 = dt1.toLocalTime();

      Duration d1 = Duration.between(time1, time);
      Duration d2 = Duration.between(dt1, dt4);
      Duration d3 = Duration.between(Instant.ofEpochMilli(132131), Instant.ofEpochMilli(1313134124));

      Period tenDays = Period.between(LocalDate.of(2014, 3, 8), LocalDate.of(2014, 3, 18));

      Duration threeMinutes = Duration.ofMinutes(3);
      Duration threeMinutes2 = Duration.of(3, ChronoUnit.MINUTES);
      Period tenDays2 = Period.ofDays(10);
      Period threeWeeks = Period.ofWeeks(3);
      Period twoYearsSixMonthsOneDay = Period.of(2, 6, 1);

      LocalDate someDate = LocalDate.of(2017, 5, 19);
      LocalDate newDate1 = someDate.withYear(2018);
      LocalDate newDate2 = someDate.withDayOfMonth(24);
      LocalDate newDate3 = someDate.with(ChronoField.MONTH_OF_YEAR, 9);

      LocalDate newDate4 = someDate.plusWeeks(1);
      LocalDate newDate5 = someDate.minusYears(3);
      LocalDate newDate6 = someDate.plus(6, ChronoUnit.MONTHS);

      LocalDate newDate7 = someDate.with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY));
      LocalDate newDate8 = someDate.with(TemporalAdjusters.lastDayOfMonth());

      System.out.println(someDate + " " + someDate.getDayOfWeek().toString());
      LocalDate resultDate = someDate.with(new NextWorkingDay());
      System.out.println(resultDate + " " + resultDate.getDayOfWeek().toString());

      System.out.println(someDate.format(DateTimeFormatter.BASIC_ISO_DATE));
      System.out.println(someDate.format(DateTimeFormatter.ISO_LOCAL_DATE));

      LocalDate parsedDate1 = LocalDate.parse("20140318", DateTimeFormatter.BASIC_ISO_DATE);

      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
      LocalDate date2 = LocalDate.of(2014, 3, 18);
      String formattedDate = date2.format(formatter);
      LocalDate date3 = LocalDate.parse(formattedDate, formatter);

      DateTimeFormatter italianFormatter = new DateTimeFormatterBuilder()
      .appendText(ChronoField.DAY_OF_MONTH)
      .appendLiteral(". ")
      .appendText(ChronoField.MONTH_OF_YEAR)
      .appendLiteral(" ")
      .appendText(ChronoField.YEAR)
      .parseCaseInsensitive()
      .toFormatter(Locale.ENGLISH);
      LocalDate date4 = LocalDate.of(2014, 3, 18);
      String formattedDate1 = date4.format(italianFormatter); // 18. marzo 2014
      System.out.println(formattedDate1);
      LocalDate date5 = LocalDate.parse(formattedDate1, italianFormatter);
      System.out.println(date5.toString());

      ZoneId zone = TimeZone.getDefault().toZoneId();
      ZoneId romeZone = ZoneId.of("Europe/Rome");

      LocalDate testDate = LocalDate.of(2014, Month.MARCH, 18);
      ZonedDateTime zdt1 = date.atStartOfDay(romeZone);
      LocalDateTime dateTime = LocalDateTime.of(2014, Month.MARCH, 18, 13, 45);
      ZonedDateTime zdt2 = dateTime.atZone(romeZone);
      Instant instant = Instant.now();
      ZonedDateTime zdt3 = instant.atZone(romeZone);

      Instant instant2 = Instant.now();
      LocalDateTime timeFromInstant = LocalDateTime.ofInstant(instant2, romeZone);

      ZoneOffset newYorkOffset = ZoneOffset.of("-05:00");
      LocalDateTime dateTime2 = LocalDateTime.of(2014, Month.MARCH, 18, 13, 45);
      OffsetDateTime dateTimeInNewYork = OffsetDateTime.of(dateTime2, newYorkOffset);

      Chronology japaneseChronology = Chronology.ofLocale(Locale.JAPAN);
      ChronoLocalDate now = japaneseChronology.dateNow();
   }
}