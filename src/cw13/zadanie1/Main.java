package cw13.zadanie1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Objects;

public class Main {

    public static String[] keywords = new String[]{"abstract", "continue", "for", "new", "switch",
            "assert", "default", "goto", "package", "synchronized", "boolean", "do", "if", "private",
            "this", "break", "double", "implements", "protected", "throw", "byte", "else", "import",
            "public", "throws", "case", "enum", "instanceof", "return", "transient", "catch", "extends",
            "int", "short", "try", "char", "final", "interface", "static", "void", "class", "finally",
            "long", "strictfp", "volatile", "const", "float", "native", "super", "while"};

    static final String fileName = "D:\\pulpit\\PPJ\\src\\cw13\\zadanie1\\Computers.java";

    public static void main(String[] args) {
        String s = readDataFromFile(fileName);
        String[] wordsFormFile = readWordsFromFile(fileName, s);
        int[] counterForKeywords = countKeywordsFromFile(wordsFormFile);

        for (int i = 0; i < keywords.length; i++) {
            System.out.println(keywords[i] + " - " + counterForKeywords[i]);
        }
    }

    private static int[] countKeywordsFromFile(String[] wordsFormFile) {
        int index = 0;
        int[] counterForKeywords = new int[keywords.length];
        for (String keyword : keywords) {
            int counter = 0;
            for (String word : wordsFormFile) {
                if (Objects.equals(keyword, word)) {
                    counter++;
                }
            }
            counterForKeywords[index] = counter;
            index++;

        }
        return counterForKeywords;
    }

    private static String[] readWordsFromFile(String fileName, String s) {
        String onlyWords = "";
        for (int i = 0; i < s.length(); i++) {

            if ((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
                    || (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
                    || s.charAt(i) == ' '){
//                System.out.println("s.charAt(i) " + s.charAt(i));
                onlyWords += s.charAt(i);
            } else {
                onlyWords += " ";
            }
        }

        onlyWords = onlyWords.replaceAll("\\s+", " ");
        String[] wordsFromFile = onlyWords.split(" ");
        return wordsFromFile;
    }

    private static String readDataFromFile(String fileName) {
        String s = "";

        try (
                FileInputStream fis = new FileInputStream(fileName)
        ) {
            int i = 0;
            while((i = fis.read()) != -1){
//                System.out.print((char) i);
                s += String.valueOf((char) i);
            }
            System.out.println("Wyczytano dane z pliku" + "\n");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return s;
    }


}
