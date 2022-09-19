package cw11;

import cw10.KulaW;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        zadanie1();
//        zadanie2();
//        zadanie3();
//        zadanie4();
//        zadanie5();
//        zadanie6();
        zadanie7();
    }


    private static void zadanie7() {
        Telefon telefon = new Telefon("VoIP", "szary");
        Komorka komorka = new Komorka("3G", "biały");
        Smartfon smartfon = new Smartfon("LTE", "niebieski");
        smartfon.dodajZnajomego(new Osoba("ala", "n", "444-444-444"));
        smartfon.dodajZnajomego(new Osoba("ewa", "k", "333-444-111"));
        smartfon.dodajZnajomego(new Osoba("ola", "m", "111-222-000"));
        smartfon.dodajZnajomego(new Osoba("ula", "b", "222-444-000"));
        smartfon.dodajZnajomego(new Osoba("ela", "r", "333-444-000"));

        Telefon[] telefons = new Telefon[3];
        telefons[0] = telefon;
        telefons[1] = komorka;
        telefons[2] = smartfon;

        int zadzwonDoZnajomegoNr = 0;
        for (Telefon tele : telefons) {
            for (int i = 0; i < 10; i++) {
                if (tele instanceof Smartfon){
                    Smartfon otherSmartfon = (Smartfon) tele;
                    if (i % 2 == 0){
                        tele.zadzwon(otherSmartfon.znajomi[zadzwonDoZnajomegoNr].getNumer());
                        zadzwonDoZnajomegoNr++;
                    } else {
                        tele.zadzwon("111-222-00" + i);
                    }
                }
                if (!(tele instanceof Smartfon)){
                    tele.zadzwon("111-222-00" + i);
                }
            }
        }

        for (Telefon tele : telefons) {
            tele.wyswietlHistoriePolaczen();
        }

    }

    private static void zadanie6() {
        Telefon telefon = new Telefon("VoIP", "szary");
        telefon.zadzwon("123-456-789");
        telefon.wyswietlHistoriePolaczen();

        Komorka komorka = new Komorka("3G", "biały");
        komorka.zadzwon("111-111-111");
        komorka.zadzwon("222-222-333");
        komorka.zadzwon("444-222-333");
        komorka.wyswietlHistoriePolaczen();

        Smartfon smartfon = new Smartfon("LTE", "niebieski");
        smartfon.dodajZnajomego(new Osoba("ala", "nowak", "444-444-444"));
        smartfon.dodajZnajomego(new Osoba("ewa", "kowalewska", "333-444-444"));
        smartfon.dodajZnajomego(new Osoba("ola", "manna", "444-444-000"));
        smartfon.wyswietlListeKontaktow();
        smartfon.zadzwon("444-444-445");
        smartfon.zadzwon("444-444-444");
        smartfon.zadzwon("443-444-444");
        smartfon.zadzwon("333-444-444");
        smartfon.zadzwon("000-111-222");
        smartfon.zadzwon("444-444-222");
        smartfon.zadzwon("444-444-000");
        smartfon.wyswietlHistoriePolaczen();

    }

    private static void zadanie5() {
        Smartfon smartfon = new Smartfon("LTE", "niebieski");
        System.out.println(smartfon);
        smartfon.dodajZnajomego(new Osoba("ala", "nowak", "444-444-444"));
        smartfon.dodajZnajomego(new Osoba("ewa", "kowalewska", "333-444-444"));
        smartfon.dodajZnajomego(new Osoba("ola", "manna", "444-444-000"));
        smartfon.wyswietlListeKontaktow();
        smartfon.zadzwon("444-444-445");
        smartfon.zadzwon("444-444-444");
        smartfon.zadzwon("443-444-444");
        smartfon.zadzwon("333-444-444");
        smartfon.zadzwon("000-111-222");
        smartfon.zadzwon("444-444-222");
        smartfon.zadzwon("444-444-000");
    }

    private static void zadanie4() {
        Komorka komorka = new Komorka("3G", "biały");
        System.out.println(komorka);
        komorka.zadzwon("111-111-111");
        komorka.zadzwon("222-222-333");

    }

    private static void zadanie3() {
        Telefon telefon = new Telefon("VoIP", "szary");
        System.out.println(telefon);
        telefon.zadzwon("123-456-789");

    }

    private static void zadanie2() {
        Punkt2D punkt2D = new Punkt2D(3, 2);
        System.out.println(punkt2D.odleglosc(new Punkt2D(6, 6)));

        Punkt3D punkt3D = new Punkt3D(0, 0, 0);
        System.out.println(punkt3D.odleglosc(new Punkt3D(1, 1, 1)));
    }

    private static void zadanie1() {
        Ciastko ciastko = new Ciastko("milka", 200, 3456897);
        System.out.println(ciastko);
    }
}
