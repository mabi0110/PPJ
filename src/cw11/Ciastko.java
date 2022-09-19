package cw11;

public class Ciastko {
    private String producent;
    private int masa;
    private int kod;

    public Ciastko(String producent, int masa, int kod) {
        this.producent = producent;
        this.masa = masa;
        this.kod = kod;
    }

    public String getProducent() {
        return producent;
    }

    public void setProducent(String producent) {
        this.producent = producent;
    }

    public int getMasa() {
        return masa;
    }

    public void setMasa(int masa) {
        this.masa = masa;
    }

    public int getKod() {
        return kod;
    }

    public void setKod(int kod) {
        this.kod = kod;
    }

    @Override
    public String toString() {
        return "Ciastko: producent: " + producent + ", masa: " + masa + ", kod: " + kod;
    }
}
