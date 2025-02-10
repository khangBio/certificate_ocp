package com.certificate.ocp.classdesign.initialize;

public class InitializeTest {
    static int x = initializeStaticVar(); //variable static
    int xIinstance = initializeX(); //variable instance

    //static block initailize
    static {
        System.out.println("Say Hello from InitializeTest");
    }

    static int initializeStaticVar() {
        System.out.println("Khởi tạo biến static X");
        return 10;
    }

    //non-static block initailize
    {
        System.out.println("Khối khởi tạo non-static X");
    }

    int initializeX() {
        System.out.println("Khởi tạo biến intance x");
        return 5;
    }

    public static void main(String[] args) {
       InitializeTest init1 = new InitializeTest();
       //InitializeTest init2 = new InitializeTest();
    }
}
