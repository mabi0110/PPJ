package cw10;

public class Kwadrat {
    private double bok;

    public Kwadrat(double bok) {
        this.bok = bok;
    }

    public double getBok() {
        return bok;
    }

    public void setBok(double bok) {
        this.bok = bok;
    }

    double poleKwadratu() {
        return bok * bok;
    }

    double poleSzescianu() {
        return poleKwadratu() * bok;
    }

    @Override
    public String toString() {
        return "Kwadrat o boku: " + bok +
                ", pole powierzchni: " + poleKwadratu() +
                ", pole sześcianu: " + poleSzescianu();
    }
}
