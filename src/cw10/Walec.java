package cw10;

public class Walec {

    private static final double PI = 3.14;
    private double promien;
    private double wysokosc;
    private double srednica;

    public Walec(double promien, double wysokosc) {
        this.promien = promien;
        this.wysokosc = wysokosc;
        srednica = this.promien * 2;
    }

    public double getPromien() {
        return promien;
    }

    public void setPromien(double promien) {
        this.promien = promien;
    }

    public double getWysokosc() {
        return wysokosc;
    }

    public void setWysokosc(double wysokosc) {
        this.wysokosc = wysokosc;
    }

    public double getSrednica() {
        return srednica;
    }

    public void setSrednica(double srednica) {
        this.srednica = srednica;
    }

    double polePodstawyWalca(){
        return PI * promien * promien;
    }

    double objetoscWalca(){
        return polePodstawyWalca() * wysokosc;
    }

    @Override
    public String toString() {
        return "Promień walca: "  + promien +
                ", wysokość walca: " + wysokosc +
                ", pole podstawy: " + polePodstawyWalca() +
                ", objętość: " + objetoscWalca();
    }
}
