package com.certificate.ocp.practices;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class PracticeDateTime {
    public static void ocpPage290_5(){
        LocalDate localDate = LocalDate.of(2017, 3, 12);
        LocalTime localTime = LocalTime.of(1,0);
        ZoneId zoneId = ZoneId.of("America/New_York");
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDate, localTime, zoneId);
        System.out.println("zonedDateTime: " + zonedDateTime);
        Duration duration = Duration.ofHours(3);
        System.out.println("Duration: " + duration.toHours());
        ZonedDateTime later = zonedDateTime.plus(duration);
        //System.out.println("Time later: " + later);
        System.out.println("Time later: " + later.getHour());
    }

    public static void ocpPage290_7(){
        LocalDate localDate = LocalDate.of(2017, Month.JANUARY, 15);
        DateTimeFormatter f = DateTimeFormatter.ISO_DATE;
        System.out.println(f.format(localDate));
    }

    public static void ocpPage290_12(){
        LocalDate pieDay = LocalDate.of(2017, Month.JANUARY, 23);
        LocalTime midnight = LocalTime.of(0,0);
        LocalDateTime pieTime = LocalDateTime.of(pieDay, midnight);
        System.out.println("pieTime: " + pieTime);

        DateTimeFormatter f = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println("pieDay: " + f.format(pieDay));
        System.out.println("pieTime: " + f.format(pieTime));
        //System.out.println("midnight: " + f.format(midnight));  //throws exception

    }

    public static void ocpPage290_30(){
        LocalDate date = LocalDate.of(2017, 2, 27);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("Holiday: yyyy dd MMM"); //throws exception
        System.out.println(date.format(formatter));
    }

    public static void ocpPage290_37(){
        LocalDate date = LocalDate.of(2017, Month.MARCH, 3);
        LocalDate localDate = date.plusDays(2).minusDays(1).minusDays(1);
        System.out.println(localDate);
    }

    public static void main(String[] args) {
        System.out.println("===PracticeDateTime: page 290-5");
        ocpPage290_5();
        System.out.println("===PracticeDateTime: page 290-7");
        ocpPage290_7();
        System.out.println("===PracticeDateTime: page 290-12");
        ocpPage290_12();
        System.out.println("===PracticeDateTime: page 290-30");
        //ocpPage290_30();//throws exception
        System.out.println("===PracticeDateTime: page 290-37");
        ocpPage290_37();
    }
}
