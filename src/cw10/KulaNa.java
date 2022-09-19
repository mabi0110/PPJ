package cw10;

public class KulaNa {
    Walec walec;
    Kwadrat kwadrat;
    private double promienKuli;
    private double srednicaKuli;

    public KulaNa(Walec walec) {
        this.walec = walec;
        srednicaKuli = Math.sqrt(walec.getSrednica() * walec.getSrednica()
                + walec.getWysokosc() * walec.getWysokosc());
        setPromienKuli(srednicaKuli / 2);
    }

    public KulaNa(Kwadrat kwadrat) {
        this.kwadrat = kwadrat;
        setPromienKuli((kwadrat.getBok() * Math.pow(3, 0.5)) / 2);
    }

    public double getPromienKuli() {
        return promienKuli;
    }

    public void setPromienKuli(double promienKuli) {
        this.promienKuli = promienKuli;
    }

    public double getSrednicaKuli() {
        return srednicaKuli;
    }

    public void setSrednicaKuli(double srednicaKuli) {
        this.srednicaKuli = srednicaKuli;
    }
}
