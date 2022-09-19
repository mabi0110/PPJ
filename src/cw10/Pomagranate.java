package cw10;

public class Pomagranate extends Fruit {

    private int seedCount;

    public Pomagranate(int seedCount) {
        super("Pomagranate");
        this.seedCount = seedCount;
    }

    public int getSeedCount() {
        return seedCount;
    }

    public void setSeedCount(int seedCount) {
        this.seedCount = seedCount;
    }

    public String toString() {
        return super.toString() + ", seedCount: " + seedCount;
    }
}
