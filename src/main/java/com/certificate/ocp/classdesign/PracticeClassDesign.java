package com.certificate.ocp.classdesign;

public class PracticeClassDesign    {
    void startUp() {
        System.out.print("Computer-");
    }

    public static void main(String[] args) {
        PracticeClassDesign pc = new PracticeSubClassDesgin();
        PracticeSubClassDesgin psc = new PracticeSubClassDesgin();
        pc.startUp();
        psc.startUp();
    }

}
