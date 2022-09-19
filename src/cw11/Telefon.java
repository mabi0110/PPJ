package cw11;

import java.util.Scanner;

public class Telefon {
    String interfejsKomunikacyjny;
    String color;

    public Telefon(String interfejsKomunikacyjny, String color) {
        this.interfejsKomunikacyjny = interfejsKomunikacyjny;
        this.color = color;
    }

    public void zadzwon(String numer){
        System.out.println(numer);
    }

    public void wyswietlHistoriePolaczen(){
        System.out.println("Brak historii połączeń");
    }

    @Override
    public String toString() {
        return  interfejsKomunikacyjny + " " + color;
    }
}
