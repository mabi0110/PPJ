package cw7;

import java.util.Arrays;

public class Cwiczenia7 {

    public static void main(String[] args) {
//        System.out.println(zadanie1());
//        zadanie2();
//        zadanie3();
//        zadanie4();
//        zadanie5();
//        zadanie6();
        zadanie7();
//        zadanie8();
//        zadanie9();
//        zadanie10();
//        zadanie11();
//        zadanie12();


    }

    private static void zadanie12() {
        int[] tab1 = new int[1 + (int) (Math.random() * ((9 - 1) + 1))];
        int[] tab2 = new int[1 + (int) (Math.random() * ((9 - 1) + 1))];
        addRandomValuesToTab(tab1);
        addRandomValuesToTab(tab2);
        printTab(tab1);
        printTab(tab2);
        System.out.println(Arrays.toString(arrayMethod(tab1, tab2, -3)));
        System.out.println(Arrays.toString(arrayMethod(tab1, tab2, 5)));
    }

    private static int[] arrayMethod(int[] tab1, int[] tab2, int value) {
        int[] newIntArr = new int[0];

        int[] minLengthArr = tab1;
        int minLength = tab1.length;

        if (tab2.length < minLength) {
            minLength = tab2.length;
            minLengthArr = tab2;
        }

        int maxLength = tab1.length;
        int[] maxLengthArr = tab1;

        if (tab2.length > maxLength) {
            maxLength = tab2.length;
            maxLengthArr = tab2;
        }

        int differenceBetweenLengths = maxLength - minLength;


        if (tab1.length != tab2.length) {
            if (value < 0) {
                newIntArr = new int[minLength];
                for (int i = 0; i < newIntArr.length; i++) {
                    newIntArr[i] = tab1[i] + tab2[i];
                }
            }

            if (value >= 0) {
                newIntArr = new int[differenceBetweenLengths];
                for (int i = 0; i < differenceBetweenLengths; i++) {
                    newIntArr[i] = maxLengthArr[minLength + i];
                }
            }

        }
        return newIntArr;
    }

    private static void zadanie11() {
        char[] charArr = {'A', 'l', 'a', 'm', 'a', 'k', 'o', 't', 'a'};
        countLetters(charArr);
    }

    private static void countLetters(char[] charArr) {
        for (int i = 0; i < charArr.length; i++) {
            int counter = 0;
            for (int j = 0; j < charArr.length; j++) {
                if (charArr[i] == charArr[j]) {
                    counter++;
                }
            }
            System.out.println(charArr[i] + ": " + counter);
        }
    }

    private static void zadanie10() {
        findMax(8, 5, 7);
    }

    private static void findMax(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println(a);
        } else {
            if (b > a && b > c) {
                System.out.println(b);
            } else {
                System.out.println(c);
            }
        }
    }

    private static void zadanie9() {
        int wrt = 5;
        System.out.println(wrt);
        modifyValue(wrt);
        System.out.println(wrt);
    }

    private static void modifyValue(int value) {
        int multi = 5;
        show(value);
        value *= multi;
        System.out.print("modified ");
        show(value);

    }

    private static void zadanie8() {
        show(5);
    }

    private static void show(int value) {
        System.out.println("value = " + value);
    }

    private static void zadanie7() {

//        int[][] tab = new int[6][6];
//
//        int number = 1;
//        for (int i = 0; i < tab[0].length; i++) {
//            for (int j = 0; j < tab[0].length; j++) {
//                tab[i][j] = number;
//                number++;
//            }
//        }
//
//        for (int i = 0; i < tab[0].length; i++) {
//            for (int j = 0; j < tab[0].length; j++) {
//                System.out.print(tab[i][j] + "\t");
//            }
//            System.out.println();
//        }

        int[][] tab = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int first = 0;
        int last = tab[first].length - 1;
        System.out.println(first);
        System.out.println(last);

        while (first != last){
            for (int i = first; i <= last; i++) {
                for (int j = first; j < last; j++) {
                    if (i == first) {
                        System.out.print(tab[i][j] + " ");
                    }
                }
            }

            for (int i = first; i < last; i++) {
                for (int j = first; j <= last; j++) {
                    if (j == last) {
                        System.out.print(tab[i][last] + " ");
                    }
                }
            }

            for (int i = first; i <= last; i++) {
                for (int j = last; j > first; j--) {
                    if (i == last) {
                        System.out.print(tab[last][j] + " ");
                    }
                }
            }

            for (int i = last; i > first; i--) {
                for (int j = first; j <= last; j++) {
                    if (j == first) {
                        System.out.print(tab[i][first] + " ");
                    }
                }
            }
            first++;
            last--;
        }
    }

    private static void zadanie6() {
        float[][] floatArr = new float[4][4];
        addRandomValuesAndPrintTwoDimensionalTab(floatArr);
        sumOfDiagonals(floatArr);
    }

    private static void sumOfDiagonals(float[][] tab) {
        double sumOfFirstDiagonal = 0;
        double sumOfSecondDiagonal = 0;
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                if (i == j) {
                    sumOfFirstDiagonal += tab[i][j];
                }
                if (i + j == tab.length - 1) {
                    sumOfSecondDiagonal += tab[i][j];
                }
            }
        }
        System.out.println(sumOfFirstDiagonal);
        System.out.println(sumOfSecondDiagonal);
    }

    private static void addRandomValuesAndPrintTwoDimensionalTab(float[][] tab) {
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                tab[i][j] = 1 + (int) (Math.random() * ((3 - 1) + 1));
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void zadanie5() {
        int[] tab1 = new int[1 + (int) (Math.random() * ((9 - 1) + 1))];
        int[] tab2 = new int[1 + (int) (Math.random() * ((9 - 1) + 1))];
        int[] tab3 = new int[1 + (int) (Math.random() * ((9 - 1) + 1))];

        addRandomValuesToTab(tab1);
        addRandomValuesToTab(tab2);
        addRandomValuesToTab(tab3);

        printTab(tab1);
        printTab(tab2);
        printTab(tab3);

        int len1 = tab1.length;
        int len2 = tab2.length;
        int len3 = tab3.length;


        int[] newTab = new int[len1 + len2 + len3];

        for (int i = 0; i < newTab.length; i++) {
            if (i < len1) {
                for (int j = 0; j < len1; j++) {
                    if (i - j == 0) {
                        newTab[i] = tab1[j];
                    }
                }
            }
            if (i >= len1 && i < len1 + len2) {
                for (int j = 0; j < len2; j++) {
                    if (i - j == len1) {
                        newTab[i] = tab2[j];
                    }
                }
            }
            if (i >= len1 + len2) {
                for (int j = 0; j < len3; j++) {
                    if (i - j == len1 + len2) {
                        newTab[i] = tab3[j];
                    }
                }
            }
        }
        printTab(newTab);
    }

    private static void addRandomValuesToTab(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            tab[i] = 1 + (int) (Math.random() * ((9 - 1) + 1));
        }
    }

    private static void zadanie4() {
        int[][] tab = {
                {1, 0, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 1}
        };
        int[] newTab = new int[tab[0].length + tab[1].length + tab[2].length];

        // I sposob
        int k = 0;
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                newTab[k] = tab[i][j];
                k++;
            }
        }
        printTab(newTab);

        // II sposob
        for (int i = 0; i < newTab.length; i++) {
            if (i < tab[0].length) {
                for (int j = 0; j < tab[0].length; j++) {
                    if (i - j == 0) {
                        newTab[i] = tab[0][j];
                    }
                }
            }
            int i1 = tab[0].length + tab[1].length;
            if (i >= tab[0].length && i < i1) {
                for (int j = 0; j < tab[1].length; j++) {
                    if (i - j == tab[0].length) {
                        newTab[i] = tab[1][j];
                    }
                }
            }
            if (i >= i1) {
                for (int j = 0; j < tab[2].length; j++) {
                    if (i - j == i1) {
                        newTab[i] = tab[2][j];
                    }
                }
            }
        }
        printTab(newTab);
    }


    private static void zadanie3() {
        int tabLength = 5;
        int[] tab1 = new int[tabLength];
        double[] tab2 = new double[tabLength];
        addRandomElementsToTab(tab1);
        addRandomElementsToTab(tab2);
        tabsSortedBySumOfElements(tab1, tab2);
        add(0, 3, tab1, tab2);
    }

    private static void add(int index, int value, int[] tab1, double[] tab2) {
        tab1[index] += value;
        tab2[index] += value;
        printTab(tab1);
        printTab(tab2);
    }

    private static void tabsSortedBySumOfElements(int[] tab1, double tab2[]) {
        if (tab1.length != tab2.length) {
            System.out.println("Tablice musza byc jednakowej dlugosci");
        } else {
            int tempInt;
            double tempDouble;
            for (int i = 0; i < tab1.length; i++) {
                double min_sum = tab1[i] + tab2[i];
                for (int j = i + 1; j < tab1.length; j++) {
                    if (tab1[j] + tab2[j] < min_sum) {
                        min_sum = tab1[j] + tab2[j];
                        tempInt = tab1[i];
                        tempDouble = tab2[i];
                        tab1[i] = tab1[j];
                        tab2[i] = tab2[j];
                        tab1[j] = tempInt;
                        tab2[j] = tempDouble;
                    }
                }
            }
        }
        printTab(tab1);
        printTab(tab2);
    }

    private static void addRandomElementsToTab(int tab[]) {
        for (int i = 0; i < tab.length; i++) {
            tab[i] = 1 + (int) (Math.random() * ((20 - 1) + 1));
        }
        printTab(tab);
    }

    private static void addRandomElementsToTab(double[] tab) {
        for (int i = 0; i < tab.length; i++) {
            tab[i] = 1 + (int) (Math.random() * ((20 - 1) + 1));
        }
        printTab(tab);
    }

    private static void printTab(int[] tab) {
        for (int elem : tab) {
            System.out.print(elem + "   ");
        }
        System.out.println();
    }

    private static void printTab(double[] tab) {
        for (double elem : tab) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }

    private static void zadanie2() {
        int tabLength = 10;
        int firstElem = 1;
        long[] tab = new long[tabLength];
        tab[0] = firstElem;
        for (int i = 1; i < tab.length; i++) {
            tab[i] = tab[i - 1] + 1;
        }
        for (long elem : tab) {
            System.out.print(elem + " ");
        }
        System.out.println();

        while (!checkIfOrderOfNumbersIsOk(tab)) {
            int firstToSwitch = (int) (Math.random() * ((tab.length)));
//            System.out.println("first index to switch " + firstToSwitch);
            int secondToSwitch = (int) (Math.random() * ((tab.length)));
//            System.out.println("second index to switch " + secondToSwitch);
            long temp;
            temp = tab[firstToSwitch];
            tab[firstToSwitch] = tab[secondToSwitch];
            tab[secondToSwitch] = temp;
            for (long elem : tab) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }

    private static boolean checkIfOrderOfNumbersIsOk(long[] tab) {
        for (int i = 1; i < tab.length; i++) {
//            System.out.println("checking: " + tab[i - 1] + " i " +  tab[i]);
            if (tab[i - 1] + 1 == tab[i]) {
//                System.out.println("order incorrect");
                return false;
            }
        }
        return true;
    }


    private static boolean zadanie1() {
        boolean isPalindrom = true;
        int[] tab = {1, 2, 3, 4, 4, 3, 2, 1};
        for (int i = 0; i < (tab.length / 2) + 1; i++) {
            if (tab[i] != tab[tab.length - (i + 1)]) {
                isPalindrom = false;
            }
        }
        return isPalindrom;
    }

}
