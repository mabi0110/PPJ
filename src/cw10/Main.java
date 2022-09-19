package cw10;

public class Main {
    public static void main(String[] args) {
//        zadanie1();
//        zadanie2();
//        zadanie3();
//        zadanie4();
//        zadanie5();
        zadanie6();

    }

    private static void zadanie6() {
        Fruit fruit = new Fruit("Pomarańcza");
        System.out.println(fruit);
        Fruit pomagranate = new Pomagranate(200);
        System.out.println(pomagranate);
    }

    private static void zadanie5() {
        Word word = new Word();
        word.addChar('a');
        word.addChar('b');
        word.addChar('c');
        word.addChar('d');
        word.show();
        System.out.println(word.length());
    }

    private static void zadanie4() {
        KulaNa kulaNaWalcu = new KulaNa(new Walec(4, 3));
        System.out.print("Kula o promieniu: ");
        System.out.printf("%.4f", kulaNaWalcu.getPromienKuli());
        System.out.println(" może być opisana na walcu o wysokości: "
                + kulaNaWalcu.walec.getWysokosc()
                + " i promieniu: " + kulaNaWalcu.walec.getPromien());

        KulaNa kulaNaSzescianie = new KulaNa(new Kwadrat(5));
        System.out.print("Kula o promieniu: ");
        System.out.printf("%.4f", kulaNaSzescianie.getPromienKuli());
        System.out.println(" może być opisana na szescianie o boku: "
                + kulaNaSzescianie.kwadrat.getBok());

    }

    private static void zadanie3() {
        KulaW kulaWWalcu = new KulaW(new Walec(4, 3));
        System.out.println("Kula o promieniu: " + kulaWWalcu.getPromienKuli()
                + " może być wpisana w walec o wysokości: " + kulaWWalcu.walec.getWysokosc()
                + " i promieniu: " + kulaWWalcu.walec.getPromien());

        KulaW kulaWSzescianie = new KulaW(new Kwadrat(5));
        System.out.println("Kula o promieniu: " + kulaWSzescianie.getPromienKuli()
                + " może być wpisana w szescian o boku "
                + kulaWSzescianie.kwadrat.getBok());

    }

    private static void zadanie2() {
        Walec walec = new Walec(2, 3);
        System.out.println(walec);
    }

    private static void zadanie1() {
        Kwadrat kwadrat = new Kwadrat(5);
        System.out.println(kwadrat);
    }
}
