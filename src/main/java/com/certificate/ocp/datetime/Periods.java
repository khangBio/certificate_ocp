package com.certificate.ocp.datetime;

import java.time.*;
public class Periods {

    public static void periodPlus(){
        LocalDate localDate = LocalDate.of(2024, 11, 4);
        System.out.println("LocalDate: " + localDate); //LocalDate: 2024-11-04
        Period period = Period.of(1, 2, 3);
        System.out.println("Period: " + period); //Period: P1Y2M3D
        localDate = localDate.plus(period);
        System.out.println("LocalDate plus Period: " + localDate); //LocalDate plus Period: 2025-01-07
    }

    public static void periodsMinus(){
        //tương tự như plus periods
    }

    public static void main(String[] args){
        System.out.println("Periods: can be used only with LocalDate and LocalDateTime");
        Period periodY = Period.ofYears(2);
        System.out.println("Period of 2 years: " + periodY); //P2Y

        Period periodM = Period.ofMonths(2);
        System.out.println("Period of 2 months: " + periodM); //P2M

        Period periodD = Period.ofDays(2);
        System.out.println("Period of 2 days: " + periodD); //P2D

        Period periodW = Period.ofWeeks(2);
        System.out.println("Period of 2 weeks: " + periodW); //P14D

        Period p5 = Period.of(2, 0, 15);
        System.out.println("Period of 2 years and 15 days: " + p5); //P2Y15D

        System.out.println("==========Periods with plus");
        periodPlus();
    }
}
