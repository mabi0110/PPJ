package cw3;

import java.util.Random;
import java.util.Scanner;

public class Cwiczenia3 {
    public static void main(String[] args) {
//        zadanie1();
//        zadanie2();
//        zadanie3();
//        zadanie4();
//        zadanie5();
//        zadanie6();
//        zadanie7();
//        zadanie8();
//        zadanie9();
//        zadanie10();
//        zadanie11();
        zadanie12();
    }

    private static void zadanie12() {
        boolean czyPada = false;
        boolean czySwieciSlonce = false;

        Random random = new Random();
        double zmienna1 = random.nextDouble();
        double zmienna2 = random.nextDouble();

        if (zmienna1 < 0.5){
            czyPada = true;
        }

        if (zmienna2 < 0.5){
            czySwieciSlonce= true;
        }

        System.out.println("Czy pada: " + czyPada);
        System.out.println("Czy swieci slonce: " + czySwieciSlonce);

        byte stan;

        if (czyPada && czySwieciSlonce) {
            stan = 0b0011;
        } else if (czyPada && !czySwieciSlonce) {
            stan = 0b0010;
        } else if (!czyPada && czySwieciSlonce) {
            stan = 0b0001;
        } else {
            stan = 0b0000;
        }

        switch (stan) {
            case 0b0011 -> System.out.println("tęcza");
            case 0b0010 -> System.out.println("plucha");
            case 0b0001 -> System.out.println("słonecznie");
            case 0b0000 -> System.out.println("pochmurno");
            default -> System.out.println("Inna pogoda");
        }
    }

    private static void zadanie11() {
        boolean czyPada = false;
        boolean czySwieciSlonce = false;

        if (czyPada && czySwieciSlonce) {
            System.out.println("tęcza");
        } else if (czyPada && !czySwieciSlonce) {
            System.out.println("plucha");
        } else if (!czyPada && czySwieciSlonce) {
            System.out.println("słonecznie");
        } else {
            System.out.println("pochmurno");
        }
    }

    private static void zadanie10() {
        boolean czyPada = true;
        int zmienna;
        if (czyPada){
            zmienna = 5;
        } else{
            zmienna = 8;
        }
        System.out.println(zmienna);
    }

    private static void zadanie9(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj 1 liczbę: ");
        int number1 = scanner.nextInt();
        System.out.print("Podaj 2 liczbę: ");
        int number2 = scanner.nextInt();
        int result = number1 / number2;
        int restOfDivision = number1 % number2;
        System.out.println(number1 + " / " + number2 + " = " + result + " reszty " + restOfDivision);
    }

    private static void zadanie8(){
        System.out.print("Podaj numer indeksu: ");
        java . util . Scanner in = new java . util . Scanner ( System . in ) ;
        int studentId = in . nextInt ( ) ;
        System.out.println("Hello s" + studentId);
    }

    private static void zadanie7(){
        int x = 2 * (((5 + 3) * 4) - 8);
        System.out.println(x);
    }

    private static void zadanie6(){
        boolean boolean1 = true;
        boolean boolean2 = true;
        System.out.println((boolean1 && !boolean2) || (boolean2 && !boolean1));
    }

    private static void zadanie5(){
        char charValue = 'a';
        char charvalue = 'b';
        System.out.println(charValue);
        System.out.println(charvalue);
    }

    private static void zadanie4(){
        int l123 = 3;
        //int 1abc = 3;
        //int @abc = 3;
        //int public = 3;
        //int null = 3;
    }

    private static void zadanie3(){
        int number = 3;
        System.out.println(number);
    }

    private static void zadanie2() {
        System.out.println(170 & 174);
    }

    private static void zadanie1() {
        System.out.println(17 >> 4);
        System.out.println(17 & 1);
        System.out.println(0b1000001);
        int number = 31;
        if  ((number & 17) == 17) {
            System.out.println("Liczba " + number + " ma 1 na bicie0 i bicie5");
        }
        if (((number >> 4) & 1) == 1 && (number & 1) == 1) {
            System.out.println("Liczba " + number + " ma 1 na bicie0 i bicie5");
        }
    }

}
