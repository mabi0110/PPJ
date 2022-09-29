package cw12;

public class DrzewoIglaste extends Drzewo{
    private int iloscIgiel;
    private double dlugoscSzyszki;


    public DrzewoIglaste(boolean wiecznieZielone, int wysokosc, int przekrojDrzewa,
                         int iloscIgiel, double dlugoscSzyszki) {
        super(wiecznieZielone, wysokosc, przekrojDrzewa);
        this.iloscIgiel = iloscIgiel;
        this.dlugoscSzyszki = dlugoscSzyszki;
    }

    @Override
    public String zerwijOwoc() throws DrzewoBezOwocoweException {
        return super.zerwijOwoc();
    }

    @Override
    public String toString() {
        return "drzewo iglaste, " + super.toString() + ", ilosc igiel: " + iloscIgiel +
                ", dlugosc szyszki: " + dlugoscSzyszki;
    }
}
