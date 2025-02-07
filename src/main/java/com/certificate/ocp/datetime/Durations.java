package com.certificate.ocp.datetime;

import java.time.*;
import java.time.temporal.ChronoUnit;
public class Durations {

    public static void durationsChronoUnit(){
        System.out.println("=====================================Durations with ChronoUnit => return unit of time");
        Duration durationD = Duration.of(3, ChronoUnit.HALF_DAYS);
        System.out.println("Duration of 3 days: " + durationD); //PT36H

        Duration durationH = Duration.of(4, ChronoUnit.HOURS);
        System.out.println("Duration of 4 hours: " + durationH); //PT4H

        Duration durationM = Duration.of(5, ChronoUnit.MINUTES);
        System.out.println("Duration of 5 minutes: " + durationM); //PT5M

        Duration durationS = Duration.of(6, ChronoUnit.SECONDS);
        System.out.println("Duration of 6 seconds: " + durationS); //PT6S
    }

    public static void chronoUnitHowFarTwoTimes(){
        System.out.println("=====================================ChronoUnit: How far two times");
        LocalTime time1 = LocalTime.of(8, 3, 20);
        LocalTime time2 = LocalTime.of(17, 01, 30);

        long hours = ChronoUnit.HOURS.between(time1, time2);
        System.out.println("Hours between time1 and time2: " + hours); //9
    }

    public static void durationPlusMinus(){
        System.out.println("=====================================Duration: plus/minus");
        LocalTime localTime = LocalTime.of(8,7, 20);
        System.out.println("LocalTime: " + localTime);

        Duration duration = Duration.ofMinutes(55);
        localTime = localTime.plus(duration);
        System.out.println("LocalTime plus 55M: " + localTime);

    }

    public static void instant() throws InterruptedException {
        System.out.println("==========Instant are used to record time-stamps in the application");
        Instant insBefore = Instant.now();
        System.out.println("Instant: " + insBefore); //Instant: 2021-08-29T08:07:20.123456Z

        //process
        Duration duration = Duration.ofMillis(2000);
        Thread.sleep(duration.toMillis());
        //end process

        Instant insAfter = Instant.now();
        System.out.println("Instant after: " + insAfter); //Instant after: 2021-08-29T08:07:22.123456Z

        Duration durationBetween = Duration.between(insBefore, insAfter);
        System.out.println("Duration between two instants: " + durationBetween.toMillis()); //Duration between two instants: PT2S
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Durations: can be used only with LocalTime and LocalDateTime => return unit of time");
        Duration duration = Duration.ofDays(3);
        System.out.println("Duration of 3 days: " + duration); //PT72H

        Duration durationH = Duration.ofHours(3);
        System.out.println("Duration of 3 hours: " + durationH); //PT3H

        Duration durationM = Duration.ofMinutes(45);
        System.out.println("Duration of 3 minutes: " + durationM); //PT3M

        Duration durationS = Duration.ofSeconds(10);
        System.out.println("Duration of 3 seconds: " + durationS); //PT3S

        Duration durationN = Duration.ofNanos(2503);
        System.out.println("Duration of 3 nanos: " + durationN); //PT0.000000003S

        durationsChronoUnit();
        chronoUnitHowFarTwoTimes();
        durationPlusMinus();
        instant();
    }
}
