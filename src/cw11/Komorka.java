package cw11;

public class Komorka extends Telefon{

    String[] ostatniePolaczenia = new String[10];
    private int iloscPolaczen = 0;

    public Komorka(String interfejsKomunikacyjny, String color) {
        super(interfejsKomunikacyjny, color);
    }

    public void zadzwon(String numer){
        System.out.println(numer);
        ostatniePolaczenia[iloscPolaczen] = numer;
        iloscPolaczen++;

    }

    public void wyswietlHistoriePolaczen(){
        System.out.println("Historia połączeń: ");
        String[] temp = new String[iloscPolaczen];

        for (int i = 0; i < temp.length; i++) {
            temp[i] = ostatniePolaczenia[i];
        }

        ostatniePolaczenia = temp;

        for (String s : ostatniePolaczenia) {
            System.out.println(s);
        }
    }

    @Override
    public String toString() {
        return interfejsKomunikacyjny + " " + color;
    }
}
