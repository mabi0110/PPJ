package cw5;


import java.util.Scanner;

public class Cwiczenia5 {
    public static void main(String[] args) {
//        zadanie1();
//        zadanie2();
//        zadanie3();
//        zadanie4();
//        zadanie5();
//        zadanie6();
//        zadanie7();
//        System.out.println(zadanie8());
//        zadanie9();
//        zadanie10();
//        zadanie11();

        }

    private static void zadanie11() {
        int[] tab = new int[10];
        System.out.println("Podaj 9 liczb");
        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;
        for (int i = 0; i < tab.length - 1; i++) {
            System.out.print("Podaj " + (i + 1) + " liczbe: ");
            number = scanner.nextInt();
            tab[i] = number;
            sum += number;
            tab[tab.length - 1] = sum;
            for (int elem: tab) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }


    }

    private static void zadanie10() {
        int[] tab = new int[10 + (int)(Math.random() * ((15 - 10) + 1))];
        int value = 0;
        for (int i = 0; i < tab.length ; i++) {
            tab[i] = value;
            value++;
        }
        switchValuesInTabAndPrintMap(tab);
    }

    private static void switchValuesInTabAndPrintMap(int[] tab){
        for (int i = 0; i < tab.length; i++) {
            int firstToSwitch = (int) (Math.random() * ((tab.length)));
            int secondToSwitch = (int) (Math.random() * ((tab.length)));
            int temp;
            temp = tab[firstToSwitch];
            tab[firstToSwitch] = tab[secondToSwitch];
            tab[secondToSwitch] = temp;
        }
        for (int j = 0; j < tab.length ; j++) {
            System.out.print(tab[j] + "  ");
        }
        System.out.println();
        for (int i = 0; i < tab.length; i++) {
                for (int elem:tab) {
                    if(i == elem){
                        System.out.print(" * ");
                    } else {
                        System.out.print(" . ");
                    }
                }
            System.out.println();
        }
    }

    private static void zadanie9() {
        int[] tab = {3, 2, 5, 1, -5, 2, 8, 7, 1, -2};
        int firstClosestToZero = tab[0];
        int secondClosestToZero = tab[1];
        int sumClosestToZero = Math.abs(firstClosestToZero + secondClosestToZero);
        for (int i = 0; i < tab.length; i++) {
            for (int j = i + 1; j < tab.length; j++) {
                int currentCheckingValue = Math.abs(tab[i] + tab[j]);
                if (currentCheckingValue < sumClosestToZero){
                    sumClosestToZero = currentCheckingValue;
                    firstClosestToZero = tab[i];
                    secondClosestToZero = tab[j];
                }
            }
        }
        System.out.println(firstClosestToZero);
        System.out.println(secondClosestToZero);
    }

    private static boolean zadanie8() {
        byte[] tab1 = {3, 2, 1, 8, 9, 3, 2};
        byte[] tab2 = {8, 9, 2, 1, 3, 2, 2};
        boolean takieSame = true;
        if (tab1.length != tab2.length){
            takieSame = false;
        } else {
            sortAndPrintTab(tab1);
            sortAndPrintTab(tab2);
            for (int i = 0; i < tab1.length; i++) {
                if(tab1[i] != tab2[i]){
                    takieSame = false;
                }
            }
        }
        return takieSame;
    }
    private static void sortAndPrintTab(byte[] tab){
        int temp;
        for (int i = 0; i < tab.length ; i++) {
            int min = tab[i];
            for (int j = i + 1; j < tab.length; j++) {
                if (tab[j] < min){
                    min = tab[j];
                    temp = tab[i];
                    tab[i] = (byte) min;
                    tab[j] = (byte) temp;
                }
            }
        }
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + ", ");
        }
        System.out.println();
    }

    private static void zadanie7() {
        char[] tab = new char[3];
        tab[0] = 'j';
        tab[1] = 'a';
        tab[2] = 'r';
        int min = 0;
        for (int i = 1; i < tab.length ; i++) {
            if (tab[i] < tab[min]){
                min = i;
            }
        }
        System.out.println(min);
        System.out.println(tab[min]);
    }

    private static void zadanie6() {
        System.out.print("Podaj liczbe: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int numberOfDots = size;
        int numberOfStars = 1;
        for (int i = 0; i < 2 * size + 1 ; i++) {
            for (int j = 0; j < 2 * size + 1; j++) {
                if (j < numberOfDots) {
                    System.out.print(" . ");
                } else if (j <= (numberOfDots + numberOfStars) - 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print(" . ");
                }
            }
            if (i < size) {
                numberOfDots -= 1;
                numberOfStars += 2;
                System.out.println();
            } else {
                numberOfDots += 1;
                numberOfStars -= 2;
                System.out.println();
            }
        }
    }

    private static void zadanie5() {
        for (int i = 0; i < 6; i++){
            for (int j = 0; j < 9; j++){
                if ((i % 2 == 0 && j % 2 == 0) || (i % 2 == 1 && j % 2 == 1)){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void zadanie4() {
        double wynikPotegi = 1;
        double suma = 0;
        for (int i = 0; i < 10; i++){
            if (i != 0){
                wynikPotegi *= 2;
            }
            double wyrazCiagu = 1 / wynikPotegi;
            suma += wyrazCiagu;
            System.out.println(suma);
        }

    }

    private static void zadanie3() {
        System.out.print("Pętla while: ");
        int i = 1;
        while (i < 1){
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        System.out.print("Pętla do-while: ");
        int j = 1;
        do{
            System.out.print(j + " ");
            j++;
        } while (j < 1);
    }

    private static void zadanie2() {
        int wrt = 3;
        System.out.println("zmienna = " + wrt);
        for(int i = 1; i <= 10; i++){
            System.out.print(i * wrt + " ");
        }
        System.out.println();

    }

    private static void zadanie1() {
        System.out.println("Pętla for: ");
        for(int i = 1; i <= 10; i++){
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Pętla while: ");
        int i = 1;
        while (i <= 10){
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        System.out.println("Pętla do-while");
        int j = 1;
        do{
            System.out.print(j + " ");
            j++;
        } while (j <= 10);
    }
}
