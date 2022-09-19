package cw9;

public class Corn {
    public int cornCount;

    public Corn(int cornCount) {
        this.cornCount = cornCount;
    }

    public Popcorn[] makePopcorn(){
        Popcorn[] popcorns = new Popcorn[(int)(Math.random()*(cornCount+1))];
        for (int i = 0; i < popcorns.length; i++)
            popcorns[i] = new Popcorn();
        return popcorns;
    }
}
