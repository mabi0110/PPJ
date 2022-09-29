package cw12;

public class DrzewoOwocowe extends DrzewoLisciaste{
    private String nazwaOwoca;


    public DrzewoOwocowe(boolean wiecznieZielone, int wysokosc, int przekrojDrzewa, String ksztaltLiscia,
                         String nazwaOwoca) {
        super(wiecznieZielone, wysokosc, przekrojDrzewa, ksztaltLiscia);
        this.nazwaOwoca = nazwaOwoca;
    }

    @Override
    public String zerwijOwoc() throws DrzewoBezOwocoweException {
        return nazwaOwoca + " została zerwana";
    }

    @Override
    public String toString() {
        return "drzewo owocowe, " + super.toString() + ", nazwa owoca: " + nazwaOwoca;
    }
}
