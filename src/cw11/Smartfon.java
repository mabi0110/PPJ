package cw11;

import java.util.Arrays;

public class Smartfon extends Komorka {

    Osoba[] znajomi = new Osoba[0];
    private int liczbaZnajomych = 0;
    String[] ostatniePolaczenia = new String[10];
    private int iloscPolaczen = 0;


    public Smartfon(String interfejsKomunikacyjny, String color) {
        super(interfejsKomunikacyjny, color);
    }

    public void zadzwon(String numer) {
        System.out.println(numer);
        ostatniePolaczenia[iloscPolaczen] = numer;
        iloscPolaczen++;

    }

    public void wyswietlHistoriePolaczen() {
        System.out.println("Historia połączeń: ");
        String[] temp = new String[iloscPolaczen];

        for (int i = 0; i < temp.length; i++) {
            temp[i] = ostatniePolaczenia[i];
        }

        ostatniePolaczenia = temp;

        int counterZnajomych = 0;
        for (String s : ostatniePolaczenia) {
            for (Osoba osoba : znajomi) {
                if (s.equals(osoba.getNumer())) {
                    counterZnajomych++;
                    if (counterZnajomych == 1) {
                        System.out.println(osoba);
                    }
                }
            }
            if (counterZnajomych == 0) {
                System.out.println(s);
            }
            counterZnajomych = 0;
        }

    }


    public void dodajZnajomego(Osoba osoba) {
        extendArray();
        znajomi[liczbaZnajomych] = osoba;
        liczbaZnajomych++;
    }

    public void wyswietlListeKontaktow() {
        System.out.println("Lista kontaktów: ");
        for (Osoba o : znajomi) {
            System.out.println(o);
        }
    }

    private void extendArray() {
        Osoba[] temp = new Osoba[liczbaZnajomych + 1];

        for (int i = 0; i < liczbaZnajomych; i++) {
            temp[i] = znajomi[i];
        }
        znajomi = temp;
    }

    @Override
    public String toString() {
        return interfejsKomunikacyjny + " " + color;
    }
}
