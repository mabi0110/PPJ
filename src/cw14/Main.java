package cw14;

import java.io.IOException;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
//        zadanie1();
//        zadanie2();
//        zadanie3();
//        zadanie4();
    }

    private static void zadanie4() {
        Pattern pattern = Pattern.compile("[a-c]+h");
        System.out.println(pattern.matcher("aaaabbcch").matches());
        System.out.println(pattern.matcher("bbaaaacch").matches());
        System.out.println(pattern.matcher("ccaaacch").matches());
        System.out.println(pattern.matcher("bbaaaabbh").matches());
        System.out.println(pattern.matcher("abch").matches());
    }

    private static void zadanie3() {
        Pattern pattern = Pattern.compile("1[0-1]+1");
        System.out.println(pattern.matcher("111000011").matches());
        System.out.println(pattern.matcher("011100111").matches());
    }

    private static void zadanie2() {
        Pattern pattern = Pattern.compile("[0-1]+");
        System.out.println(pattern.matcher("011000011").matches());
        System.out.println(pattern.matcher("011100211").matches());
    }

    private static void zadanie1() {
        try {
            Osoba osoba = new Osoba();
            System.out.println(osoba);
        } catch (NiewlasciweDaneException e) {
            System.out.println(e.getMessage());;
        }
    }
}
