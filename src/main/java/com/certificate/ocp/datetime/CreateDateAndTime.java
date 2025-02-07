package com.certificate.ocp.datetime;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class CreateDateAndTime {

    public static void intructionDateAndTime(){
        // there are four Date/Time types in java.time package
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        System.out.println("LocalDate: " + localDate); //LocalDate: 2025-02-04
        System.out.println("LocalTime: " + localTime); //LocalTime: 08:55:04.596076700
        System.out.println("LocalDateTime: " + localDateTime); //LocalDateTime: 2025-02-04T08:55:04.596076700
        System.out.println("ZonedDateTime: " + zonedDateTime); //ZonedDateTime: 2025-02-04T08:55:04.596076700+07:00[Asia/Saigon]
    }

    public static void CreateDate(){
        LocalDate date = LocalDate.of(2025, 2, 4); //2025-02-04
        LocalDate date2 = LocalDate.of(2025, Month.FEBRUARY, 4); //2025-02-04
        LocalDate date3 = LocalDate.ofYearDay(2025, 32); //2025-02-01
        System.out.println(date);
        System.out.println(date2);
        System.out.println(date3);
    }

    public static void createTime(){
        LocalTime localTime = LocalTime.of(9,19,30); //09:19:30
        LocalTime localTimeNanoSecond = LocalTime.of(9,19,30, 1000); //09:19:30.000001
        LocalTime localTime1 = LocalTime.parse("09:19:30", DateTimeFormatter.ISO_LOCAL_TIME); //09:19:30
        System.out.println(localTime);
        System.out.println(localTimeNanoSecond);
        System.out.println(localTime1);
    }

    public static void createDateTime(){
        LocalDateTime localDateTime = LocalDateTime.of(2025, Month.FEBRUARY,
                4, 9, 35, 20); //2025-02-04T09:35:20
        System.out.println(localDateTime);

        LocalDate localDate = LocalDate.of(2025, Month.FEBRUARY, 4);
        LocalTime localTime = LocalTime.of(9, 35, 20, 1234);
        LocalDateTime localDateTime1 = LocalDateTime.of(localDate, localTime); //2025-02-04T09:35:20.000001234
        System.out.println(localDateTime1);
    }

    public static void createZonedDateTime(){
        ZoneId zoneId = ZoneId.of("Asia/Saigon");
        ZonedDateTime zonedDateTime = ZonedDateTime.of(2025, 2, 4,
                9, 35, 20, 1234, zoneId); //2025-02-04T09:35:20.000001234+07:00[Asia/Saigon]
        System.out.println(zonedDateTime);
        //Trừ số âm là Cộng
        //2022-11-02T13:50+05:30[<zone>]
        //  => GMT 2022-11-02 7:20
        //2022-11-02T06:10-05:00[<zone>]
        //  => GMT 2022-11-02 11:20
    }

    public static void main(String[] args){
        System.out.println("=========intructionDateAndTime");
        intructionDateAndTime();
        System.out.println("=========CreateDate");
        CreateDate();
        System.out.println("=========createTime");
        createTime();
        System.out.println("=========createDateTime");
        createDateTime();
        System.out.println("=========createZonedDateTime");
        createZonedDateTime();
    }
}
