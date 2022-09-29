package cw12;

public class Drzewo {
    private boolean wiecznieZielone;
    private int wysokosc;
    private int przekrojDrzewa;

    public Drzewo(boolean wiecznieZielone, int wysokosc, int przekrojDrzewa) {
        this.wiecznieZielone = wiecznieZielone;
        this.wysokosc = wysokosc;
        this.przekrojDrzewa = przekrojDrzewa;
    }

    public String zerwijOwoc() throws DrzewoBezOwocoweException {
        throw new DrzewoBezOwocoweException();
    }

    @Override
    public String toString() {
        return  "drzewo wiecznie zielone: " + wiecznieZielone +
                ", wysokosc: " + wysokosc +
                ", przekroj drzewa: " + przekrojDrzewa;
    }
}
