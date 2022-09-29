package cw12;

public class DrzewoLisciaste extends Drzewo{
    private String ksztaltLiscia;

    public DrzewoLisciaste(boolean wiecznieZielone, int wysokosc, int przekrojDrzewa, String ksztaltLiscia) {
        super(wiecznieZielone, wysokosc, przekrojDrzewa);
        this.ksztaltLiscia = ksztaltLiscia;
    }

    @Override
    public String zerwijOwoc() throws DrzewoBezOwocoweException {
        return super.zerwijOwoc();
    }

    @Override
    public String toString() {
        return "drzewo lisciaste, " +  super.toString() + ", ksztalt liscia: " + ksztaltLiscia;
    }
}
