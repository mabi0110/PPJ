package cw4;

import jdk.swing.interop.SwingInterOpUtils;

public class Cwiczenia4 {
    public static void main(String[] args) {
//        zadanie1();
//        zadanie2();
//        zadanie3();

    }

    private static void zadanie3(){
        char c = 'g';
        if((c & 0b0001) == 1){
            System.out.println("parzysta");
        } else {
            System.out.println("nieparzysta");
        }

        System.out.println((char) 0b1100111);

        int numerBitu = 0;

        while(c != 0){
            if ((c & 0b0001) == 0b0001){
                System.out.println("bit" + numerBitu + " = 1");
                numerBitu += 3;
            } else {
                System.out.println("bit" + numerBitu + " = 0");
                numerBitu += 3;
            }
            c = (char) ((byte) c >> (byte) 3);
        }
    }

    private static void zadanie2() {
        int var1 = 218;
        int var2a = 13;
        int var2b = 12;
        int var2c = 9;
        int var2d = 8;

        printResultAnd(var1, var2a);
        printResultAnd(var1, var2b);
        printResultAnd(var1, var2c);
        printResultAnd(var1, var2d);


    }

    private static void printResultAnd(int var1, int var2) {
        System.out.print(var1 + " & " + var2 + " = ");
        System.out.print(var1 & var2);
        System.out.println();
    }

    private static void zadanie1() {
        System.out.println(0b10100101111);
        System.out.println(02457);
        System.out.println(0x52F);

    }

}
