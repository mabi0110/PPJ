package cw12;

import cw11.DetektorDymu;
import cw11.NotEnoughFuelException;
import cw11.Rakieta;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        Drzewo[] drzewa = new Drzewo[6];
//
//        DrzewoIglaste sosna = new DrzewoIglaste(
//                true, 4, 1, 200000, 0.1);
//        DrzewoIglaste modrzew = new DrzewoIglaste(
//                true, 5, 2, 30000, 0.05);
//        DrzewoLisciaste dab = new DrzewoLisciaste(
//                false, 7, 2, "sercowate");
//        DrzewoLisciaste osika = new DrzewoLisciaste(
//                false, 2, 1, "okragle");
//        DrzewoOwocowe morela = new DrzewoOwocowe(
//                true, 2,1,"okrągłe", "morela");
//        DrzewoOwocowe sliwa = new DrzewoOwocowe(
//                false, 2,1,"trojkatne", "śliwka");
//
//        drzewa[0] = sosna;
//        drzewa[1] = modrzew;
//        drzewa[2] = dab;
//        drzewa[3] = osika;
//        drzewa[4] = morela;
//        drzewa[5] = sliwa;
//
//        for (Drzewo drzewo : drzewa) {
//            System.out.println(drzewo);
//        }
//
//        for (Drzewo drzewo : drzewa) {
//            try {
//                System.out.println(drzewo.zerwijOwoc());
//            } catch (DrzewoBezOwocoweException exception){
//                exception.printStackTrace();
//            }
//        }

//        zadanie4();
//        zadanie5();
        zadanie6();
    }

    private static void zadanie6() {
        String fileName = "ala.txt";
        writeData(fileName);
        int size = countCharsInFile(fileName);
        char[] charsArray = readData(fileName, size);
        System.out.println(Arrays.toString(charsArray));

        // dodatkowy check
//        for (char c : charsArray) {
//            countChars(charsArray, c);
//        }

        char[] uniqueLetters = findUniqueLetters(charsArray);
        System.out.println(Arrays.toString(uniqueLetters));

        int[] lettersCounter = countLetters(charsArray, uniqueLetters);
        System.out.println(Arrays.toString(lettersCounter));

    }

    private static int[] countLetters(char[] charsArray, char[] uniqueLetters) {
        int[] lettersCounter = new int[uniqueLetters.length];
        int index = 0;

        for (char uniqueLetter : uniqueLetters) {
            int counter = 0;
            for (char c : charsArray) {
                if (uniqueLetter == c) {
                    counter++;
                }
            }
            lettersCounter[index] = counter;
            index++;
        }
        return lettersCounter;
    }

    private static char[] findUniqueLetters(char[] charsArrayWithDuplicates) {
        int index = 0;
        char[] uniqueLetters = new char[0];

        for (int i = 0; i < charsArrayWithDuplicates.length; i++) {
            int flag = 0;
            for (int j = 0; j < i; j++) {
                if (charsArrayWithDuplicates[i] == charsArrayWithDuplicates[j]) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0){
                uniqueLetters = extendArray(uniqueLetters, index);
                uniqueLetters[index] = charsArrayWithDuplicates[i];
                index++;
            }
        }
        return uniqueLetters;
    }

    private static char[] extendArray(char[] uniqueLetters, int index) {
        char[] temp = new char[uniqueLetters.length + 1];
        if (index >= 0) System.arraycopy(uniqueLetters, 0, temp, 0, index);
        uniqueLetters = temp;
        return uniqueLetters;
    }

    private static void countChars(char[] charsArray, char c) {
        int counter = 0;
        for (int i = 0; i < charsArray.length; i++) {
            if (charsArray[i] == c) {
                counter++;
            }
        }
        System.out.println(c + " wystąpiła " + counter + " razy");
    }

    private static char[] readData(String fileName, int size) {
        char[] charsArray = new char[size];
        try (
                FileInputStream fis = new FileInputStream(fileName);
        ) {
            int index = 0;
            int i = 0;
            while ((i = fis.read()) != -1) {
                charsArray[index] = (char) i;
                index++;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return charsArray;
    }

    private static int countCharsInFile(String fileName) {
        int counter = 0;
        try (
                FileInputStream fis = new FileInputStream(fileName);
        ) {
            int i = 0;
            while ((i = fis.read()) != -1) {
                counter++;
            }
            return counter;

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void writeData(String fileName) {
        try (
                FileWriter fileWriter = new FileWriter(fileName);
                BufferedWriter writer = new BufferedWriter(fileWriter);
        ) {
            writer.write("Ala ma kota, a kot ma Ale");
            System.out.println("Zapisano obiekt do pliku");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void zadanie5() {
        Rakieta rakieta = new Rakieta("Apollo11", 200);

        rakieta.zatankuj();

        try {
            rakieta.start();

        } catch (NotEnoughFuelException e) {
            System.err.println(e.getMessage());
        }

    }

    private static void zadanie4() {
        DetektorDymu detektor1 = new DetektorDymu();
        DetektorDymu detektor2 = new DetektorDymu();
        detektor2.setSmoke();
        try {
            detektor1.check();
            detektor2.check();
        } catch (Alarm e) {
            System.out.println(e.getMessage());
        }
    }
}
