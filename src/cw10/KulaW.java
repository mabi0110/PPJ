package cw10;

public class KulaW {
    Walec walec;
    Kwadrat kwadrat;
    private double promienKuli;

    public KulaW(Walec walec) {
        this.walec = walec;
        promienKuli = walec.getPromien() < walec.getWysokosc() ?
                walec.getPromien() : walec.getWysokosc() / 2;
    }

    public KulaW(Kwadrat kwadrat) {
        this.kwadrat = kwadrat;
        setPromienKuli(kwadrat.getBok() / 2);
    }

    public double getPromienKuli() {
        return promienKuli;
    }

    public void setPromienKuli(double promienKuli) {
        this.promienKuli = promienKuli;
    }

}
