package com.certificate.ocp.datetime;

import org.springframework.cglib.core.Local;

import java.time.*;
public class MethodDatesAndTimes {

    public static void methodLocalDate(){
        System.out.println("LocalDate: plusYears(), plusMonths(), plusWeeks(), plusDays()/minusYears(), minusMonths(), minusWeeks(), minusDays()");
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate); //LocalDate: 2025-02-04

        localDate = localDate.plusDays(1);
        System.out.println("plusDays +1: " + localDate);

        localDate = localDate.plusMonths(1);
        System.out.println("plusMonths +1: " + localDate);

        localDate = localDate.plusWeeks(1);
        System.out.println("plusWeeks +1: " + localDate);

        localDate = localDate.plusYears(1);
        System.out.println("plusYears +1: " + localDate);
    }

    public static void methodLocalTime(){
        System.out.println("LocalTime: plusHours(), plusMinutes(), plusSeconds(), plusNanos()/minusHours(), minusMinutes(), minusSeconds(), minusNanos()");
        LocalTime localTime = LocalTime.of(10,20, 30, 1000); //nanos: 1s -> 1_000_000_000 = 10^9
        System.out.println(localTime); //LocalTime: 10:20:30.000010
        localTime = localTime.plusHours(1);
        System.out.println("plusHours +1: " + localTime);
        localTime = localTime.plusMinutes(1);
        System.out.println("plusMinutes +1: " + localTime);
        localTime = localTime.plusSeconds(1);
        System.out.println("plusSeconds +1: " + localTime);
        localTime = localTime.plusNanos(1);
        System.out.println("plusNanos +1: " + localTime);
    }

    public static void methodLocalDateTime(){
        System.out.println("LocalDateTime: Methods plus(), minus() of LocalDate and LocalTime");
        LocalDate localDate = LocalDate.of(2025, 2, 4);
        LocalTime localTime = LocalTime.of(10,20);
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        System.out.println("LocalDateTime: " + localDateTime); //LocalDateTime: 2025-02-04T10:20
        localDateTime = localDateTime.plusDays(1);
        System.out.println("plusDays +1: " + localDateTime);
        localDateTime = localDateTime.plusHours(1);
        System.out.println("plusHours +1: " + localDateTime);
    }

    public static void chainingMethod(){
        System.out.println("Chaining Method");
        LocalDate localDate = LocalDate.of(2025, 2, 4);
        LocalTime localTime = LocalTime.of(10,20);
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        localDateTime = localDateTime.minusDays(2).minusHours(3).minusSeconds(4);
        System.out.println("LocalDateTime: " + localDateTime); //LocalDateTime: 2025-02-02T07:19:56

    }

    public static void main(String[] args){
        methodLocalDate();
        methodLocalTime();
        methodLocalDateTime();
        chainingMethod();

        System.out.println("LocalDate, LocalTime, LocalDateTime: isBefore(), isAfter(), isEqual()");
        LocalDate date1 = LocalDate.of(2025, 2, 3);
        LocalDate date2 = LocalDate.of(2025, 2, 4);
        System.out.println(date1.isBefore(date2)); //true
        System.out.println(date1.isAfter(date2)); //false
    }
}
