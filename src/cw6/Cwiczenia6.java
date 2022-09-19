package cw6;

import java.util.Scanner;

public class Cwiczenia6 {
    public static void main(String[] args) {
//        zadanie1();
//        zadanie2();
//        zadanie3();
    }

    private static void zadanie3() {
        int[] arr = {10, 3, 12, 5, 15, 8};
        int[] fibonacciArr = new int[2 * arr.length];
        for (int i = 0; i < fibonacciArr.length; i++) {
            if(i == 0){
                fibonacciArr[i] = 0;
            }
            if (i == 1){
                fibonacciArr[i] = 1;
            }
            if (i > 1){
                fibonacciArr[i] = fibonacciArr[i - 1] + fibonacciArr[i - 2];
            }
        }
        for (int elem: fibonacciArr) {
            System.out.print(elem + " ");
        }
        System.out.println();

        System.out.print("Liczby Fibonacciego z tablicy [ ");
        for (int elem: arr) {
            System.out.print(elem + " ");
        }
        System.out.print("] to: \n");

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < fibonacciArr.length; j++) {
                if(arr[i] == fibonacciArr[j]){
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }

    private static void zadanie2() {
        System.out.print("Podaj liczbe: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int counterOfFirstNumbers = 0;
        int actualNumber = 2;

        while (counterOfFirstNumbers < number){
//            System.out.println("Checking " + actualNumber);
            if (giveAnotherFirstNumber(actualNumber) != -1){
                System.out.println(giveAnotherFirstNumber(actualNumber));
                counterOfFirstNumbers++;
            }
            actualNumber++;
        }
    }
    private static int giveAnotherFirstNumber(int n){
        int divideCounter = 0;
        for (int i = 1; i <= n ; i++) {
            if(n % i == 0){
                divideCounter++;
            }
        }
        if (divideCounter == 2){
            return n;
        }
        return -1;
    }


    private static void zadanie1() {
        System.out.print("Podaj numer indeksu: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String binary = "";
        int resztaZDzielenia;
        while (number >= 1){
            resztaZDzielenia = number % 2;
            binary += resztaZDzielenia;
            number = number / 2;
        }
        String reversedBinary = "";
        for (int i = binary.length() - 1; i >= 0; i--) {
            reversedBinary += binary.charAt(i);
        }
        System.out.println(reversedBinary);
    }
}
